package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Comprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employeecomparator emp1=new  Employeecomparator("aravi",863587);
		 Employeecomparator emp2=new  Employeecomparator("agfgravi",3587);
		 ArrayList< Employeecomparator>list=new ArrayList< Employeecomparator>();
		 list.add(emp1);
		 list.add(emp2);
		 System.out.println(list);
		 System.out.println("==================================================================");
		 SalarySort s1=new SalarySort();
		 Collections.sort(list, s1);
		 for(Employeecomparator e:list)
		 {
			 System.out.println(e);
		 }
		 
		 
		 

	}

}
