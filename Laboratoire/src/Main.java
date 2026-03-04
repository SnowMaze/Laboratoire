import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Echantillon> Samples = new ArrayList<Echantillon>();
		ArrayList<Technicien> Technicians = new ArrayList<Technicien>();
		ArrayList<Equipement> Equipments = new ArrayList<Equipement>();
		
		Echantillon s1 = new Echantillon("S001","BLOOD",Priority.URGENT,30,LocalTime.of(9, 0),"P001");
		Echantillon s6 = new Echantillon("S006","URINE",Priority.STAT,45,LocalTime.of(9, 0),"P006");
		Echantillon s2 = new Echantillon("S002","URINE",Priority.URGENT,30,LocalTime.of(9, 15),"P002");
		Echantillon s3 = new Echantillon("S003","BLOOD",Priority.ROUTINE,45,LocalTime.of(9, 0),"P003");
		Echantillon s4 = new Echantillon("S004","BLOOD",Priority.STAT,45,LocalTime.of(9, 0),"P004");
		Echantillon s7 = new Echantillon("S007","TISSUE",Priority.URGENT,45,LocalTime.of(9, 0),"P007");
		Echantillon s5 = new Echantillon("S005","BLOOD",Priority.STAT,45,LocalTime.of(9, 0),"P005");
		Echantillon s8 = new Echantillon("S008","BLOOD",Priority.STAT,45,LocalTime.of(9, 0),"P008");
		
		Technicien t1 = new Technicien("T001","Alice Martin","BLOOD",LocalTime.of(8, 0),LocalTime.of(17, 0));
		Technicien t2 = new Technicien("T002","Alex Roger","URINE",LocalTime.of(8, 0),LocalTime.of(17, 0));
		Technicien t3 = new Technicien("T003","Sophie Gunter","TISSUE",LocalTime.of(8, 0),LocalTime.of(17, 0));
		
		Equipement e1 = new Equipement("E001","Analyseur Sang A","BLOOD",true);
		Equipement e2 = new Equipement("E002","Analyseur Urine","URINE",true);
		Equipement e3 = new Equipement("E003","Analyseur Tissue","TISSUE",true);
		
		
		Samples.add(s1);
		Samples.add(s2);
		Samples.add(s3);
		Samples.add(s4);
		Samples.add(s5);
		Samples.add(s6);
		Samples.add(s7);
		Samples.add(s8);
		
		Technicians.add(t1);
		Technicians.add(t2);
		Technicians.add(t3);
		
		Equipments.add(e1);
		Equipments.add(e2);
		Equipments.add(e3);
		
		Schedule s = new Schedule();
		s.planifyLab(Samples, Equipments, Technicians);
		System.out.println(s.toString());
	}

}
