package Collection;

public  class Employeeshort 
{
	private int eId;
	private String eName;
	private float salary;
	private String address;
	public Employeeshort() {
		super();
	}
	public Employeeshort(int eId, String eName, float salary, String address) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.address = address;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employeeshort [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	public int comapreTo(Employee o)
	{
		if(salary>o.getSalary())
		{
		return -1;
		
	}
		else
		{
			return 0;
			
		}

}
}
