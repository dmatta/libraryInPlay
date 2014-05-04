package playlibrary.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Library {

	@Id @GeneratedValue
	public Long id;
	
    @ManyToOne(fetch = FetchType.EAGER, targetEntity=Address.class)
    @JoinColumn(name = "address_id", nullable = false )
 	public Address address;
 	
 	public String name;

	public String details;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

    
}
