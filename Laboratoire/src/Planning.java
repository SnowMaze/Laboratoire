import java.time.LocalTime;

public class Planning {
	private String sampleID;
	private String technicianID;
	private String equipementID;
	private LocalTime startTime;
	private LocalTime endTime;
	private Priority priority;
	
	public Planning(String sampleID, String technicianID, String equipementID, LocalTime startTime, LocalTime endTime,
			Priority priority) {
		super();
		this.sampleID = sampleID;
		this.technicianID = technicianID;
		this.equipementID = equipementID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.priority = priority;
	}
	
	public String getSampleID() {
		return sampleID;
	}
	public void setSampleID(String sampleID) {
		this.sampleID = sampleID;
	}
	public String getTechnicianID() {
		return technicianID;
	}
	public void setTechnicianID(String technicianID) {
		this.technicianID = technicianID;
	}
	public String getEquipementID() {
		return equipementID;
	}
	public void setEquipementID(String equipementID) {
		this.equipementID = equipementID;
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
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Planning [sampleID=" + sampleID + ", technicianID=" + technicianID + ", equipementID=" + equipementID
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", priority=" + priority + "]\n";
	}
}
