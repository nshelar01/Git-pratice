import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> HM = new HashMap<Integer,String>();  
		HM.put(1, "Nikeeta");
		HM.put(2, "Shelar");
		//HM.put(3, "Naveen");
		HM.put(4,"Kuneta");
		//System.out.println(HM.get(2));
		for(Entry m:HM.entrySet()) {
			//System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
		HashMap<Integer, Employee> emp = new HashMap<Integer,Employee>();
        Employee e1=new Employee("TOM",34,"Dev");	
        Employee e2=new Employee("Dan",36,"QA");	
        Employee e3=new Employee("Eric",37,"SDET");	
        Employee e4=new Employee("Amber",38,"Test");	
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
		//System.out.println(emp);

		for(Entry <Integer,Employee> m: emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key + "Info");
			System.out.println(e.name+"   "+e.age+"  "+e.Department);
			
		}
		}
		
	}


