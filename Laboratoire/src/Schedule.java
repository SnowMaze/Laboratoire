import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Schedule {
	
	private ArrayList<Planning> schedule;
	private int totaltime;
	private float efficiency;
	private int conflicts;
	
	public int getTotaltime() {
		return totaltime;
	}
	public void setTotaltime(int totaltime) {
		this.totaltime = totaltime;
	}
	public float getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(float efficiency) {
		this.efficiency = efficiency;
	}
	public int getConflicts() {
		return conflicts;
	}
	public void setConflicts(int conflicts) {
		this.conflicts = conflicts;
	}
	
	public void planifyLab(ArrayList<Echantillon> Samples,
            ArrayList<Equipement> equips,
            ArrayList<Technicien> technis) {

		List<Echantillon> sorted = sortSamples(Samples);
		schedule = new ArrayList<>();
		int total = 0;
		for (Echantillon e : sorted) {
			total += e.getAnalysisTime();
			boolean assigned = false;

			for (Technicien t : technis) {

				if (!e.getType().equals(t.getSpeciality())) {
					continue;
				}
				for (Equipement eq : equips) {

					if (!e.getType().equals(eq.getType())) {
						continue;
					}
					LocalTime start = e.getArrivalTime();

					if (t.getAvailableAt().isAfter(start)) {
						start = t.getAvailableAt();
					}
					if (eq.getAvailableAt().isAfter(start)) {
						start = eq.getAvailableAt();
					}
					LocalTime end = start.plusMinutes(e.getAnalysisTime());

					Planning p = new Planning(
							e.getID(),
							t.getID(),
							eq.getID(),
							start,
							end,
							e.getPriority()
							);

					schedule.add(p);

					t.setAvailableAt(end);
					eq.setAvailableAt(end);

					assigned = true;
					break;
				}

				if (assigned)
					break;
			}
		}
		setTotaltime(total);
		calculateMetrics();
	}
	public void calculateMetrics() {

       int conflicts = 0;
       LocalTime start = schedule.get(0).getStartTime();
       LocalTime end = schedule.get(schedule.size()-1).getEndTime();
       
       float effic = getTotaltime()/Duration.between(start, end).toMinutes()*100;
       setEfficiency(effic);
        for (int i = 0; i < schedule.size(); i++) {
            for (int j = i + 1; j < schedule.size(); j++) {

                Planning p1 = schedule.get(i);
                Planning p2 = schedule.get(j);

                boolean overlap =
                        p1.getStartTime().isBefore(p2.getEndTime()) &&
                        p2.getStartTime().isBefore(p1.getEndTime());

                if (overlap) {

                    if (p1.getTechnicianID().equals(p2.getTechnicianID())) {
                        conflicts++;
                    }
                    if (p1.getEquipementID().equals(p2.getEquipementID())) {
                    	conflicts++;
                    }
                        
                }
            }
        }
        setConflicts(conflicts);
    }
	
	public ArrayList<Echantillon> sortSamples(ArrayList<Echantillon> Samples) {
			
		 List<Echantillon> sorted = new ArrayList<>();
		 
	        for (Echantillon e : Samples) {
	            if (e.getPriority()== Priority.STAT) {
	                sorted.add(e);
	            }
	        }

	        for (Echantillon e : Samples) {
	            if (e.getPriority()== Priority.URGENT) {
	                sorted.add(e);
	            }
	        }

	        for (Echantillon e : Samples) {
	            if (e.getPriority()== Priority.ROUTINE) {
	                sorted.add(e);
	            }
	        }
	        return (ArrayList<Echantillon>) sorted;
	 }
	@Override
	public String toString() {
		return "Schedule [schedule=" + schedule + ",\n totaltime=" + totaltime + ",\n efficiency=" + efficiency
				+ ",\n conflicts=" + conflicts + "]";
	}
		
}
