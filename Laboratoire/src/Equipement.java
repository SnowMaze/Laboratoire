
public class Equipement {
	private String ID;
	private String Name;
	private String type;
	private boolean available;
	
	public Equipement(String iD, String name, String type, boolean available) {
		ID = iD;
		Name = name;
		this.type = type;
		this.available = available;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Equipement [ID=" + ID + ", Name=" + Name + ", type=" + type + ", available=" + available + "]";
	}
}
