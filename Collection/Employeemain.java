package Collection;

import java.util.ArrayList;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(101,"saurabh",500000,"mumbai");
		Employee emp2=new Employee(101,"saroj",5000000,"mumbaibalck");
		Employee emp3=new Employee(101,"saurabhvankauyat",50000000,"mumbaikar");
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(list);
		for(Employee e:list)//this i bs for ech statemednt which can be use in line by line print data
		{
			System.out.println(e);
	}
		System.out.println("===============================================================get mathod in array=======");
		System.out.println(list.get(0));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	

	}

}
