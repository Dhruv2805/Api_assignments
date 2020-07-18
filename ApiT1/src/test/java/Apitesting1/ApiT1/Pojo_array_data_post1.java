//{object[array1][array2]}
package Apitesting1.ApiT1;

public class Pojo_array_data_post1
{
	String firstname;
	String lastname;
	String designation;
	String id;
	Pojo_array_data_post2[] pojar;
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
	public Pojo_array_data_post2[] getPojar() {
		return pojar;
	}
	public void setPojar(Pojo_array_data_post2[] pojar) {
		this.pojar = pojar;
	}
}
