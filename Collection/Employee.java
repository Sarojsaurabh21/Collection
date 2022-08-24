package Collection;

public class Employee {
	private int eID;
	private String eName;
	private float salary;
	private  String address;
	public Employee()
	{
		
	}
	public Employee(int eID,String eName,float salary,String address)
	{
		this.eID=eID;
		this.eName=eName;
		this.salary=salary;
		this.address=address;
	}
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
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
		return "Employee [eID=" + eID + ", eName=" + eName + ", salary=" + salary + ", address=" + address + "]";
	}
	

}
