
import java.time.LocalTime;

public class Technicien {
	private String ID;
	private String Name;
	private String speciality;
	private LocalTime startTime;
	private LocalTime endTime;
	private LocalTime availableAT;
	
	public Technicien(String iD, String name, String speciality, LocalTime startTime, LocalTime endTime) {
		ID = iD;
		Name = name;
		this.speciality = speciality;
		this.startTime = startTime;
		this.endTime = endTime;
		this.availableAT=startTime;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Technicien [ID=" + ID + ", Name=" + Name + ", speciality=" + speciality + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

	public LocalTime getAvailableAt() {
		
		return this.availableAT;
	}

	public void setAvailableAt(LocalTime end) {
		this.availableAT = end;
		
	}
}
