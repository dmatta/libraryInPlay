package playlibrary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	@Id @GeneratedValue
	public Long id;
	
	public String address1;
	public String adddress2;
	public String city;
	public String state;
	public Integer zip5;
	
}
