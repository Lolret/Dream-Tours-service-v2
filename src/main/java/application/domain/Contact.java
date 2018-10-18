package application.domain;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the contact database table.
 * 
 */
@Entity
@Table(name="contact")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer id;

	@Column(nullable=false, length=300)
	private String value;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="client_id", nullable=false)
	private User user;

	public Contact() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}