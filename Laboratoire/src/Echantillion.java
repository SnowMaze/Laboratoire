
import java.time.LocalTime;
public class Echantillion {
	private String ID;
	private String type;
	private String priority;
	private int analysisTime;
	private LocalTime arrivalTime;
	private String patientID;
	
	public Echantillion(String iD, String type, String priority, int analysisTime, LocalTime arrivalTime,
			String patientID) {
		super();
		ID = iD;
		this.type = type;
		this.priority = priority;
		this.analysisTime = analysisTime;
		this.arrivalTime = arrivalTime;
		this.patientID = patientID;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public int getAnalysisTime() {
		return analysisTime;
	}
	public void setAnalysisTime(int analysisTime) {
		this.analysisTime = analysisTime;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	@Override
	public String toString() {
		return "Echantillion [ID=" + ID + ", type=" + type + ", priority=" + priority + ", analysisTime=" + analysisTime
				+ ", arrivalTime=" + arrivalTime + ", patientID=" + patientID + "]";
	}
	
}
