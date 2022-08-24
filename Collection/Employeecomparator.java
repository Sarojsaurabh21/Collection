package Collection;

public class Employeecomparator {

	int id;
	String name;
	float salary;
	private static int idgen=101;
	Employeecomparator()
	{
	
	}
	
	Employeecomparator(String j,float k)
	{
		
		this();
		name=j;
		salary=k;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	double annualsalry()
	{
	double annualsalary=salary*12;
	return annualsalary;
	}

	@Override
	public String toString() {
		return "Employeecomparator [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	}
	

