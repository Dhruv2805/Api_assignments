//{object{object}}=complex data
package Apitesting1.ApiT1;

public class Pojo_complex_data_post1
{
	String firstname;
	String lastname;
	String designation;
	String id;
	Pojo_complex_data_post2 pojoc2;
	
	public Pojo_complex_data_post2 getPojoc2() {
		return pojoc2;
	}
	public void setPojoc2(Pojo_complex_data_post2 pojoc2) {
		this.pojoc2 = pojoc2;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
