import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Echantillion> Samples = new ArrayList<Echantillion>();
		ArrayList<Technicien> Technicians = new ArrayList<Technicien>();
		ArrayList<Equipement> Equipments = new ArrayList<Equipement>();
		
		Echantillion s1 = new Echantillion("S001","BLOOD","URGENT",30,LocalTime.of(9, 0),"P001");
		Technicien t1 = new Technicien("T001","Alice Martin","BLOOD",LocalTime.of(8, 0),LocalTime.of(17, 0));
		Equipement e1 = new Equipement("E001","Analyseur Sang A","BLOOD",true);
		
		Samples.add(s1);
		Technicians.add(t1);
		Equipments.add(e1);
		
		System.out.print(Samples.get(0).toString());
	}

}
