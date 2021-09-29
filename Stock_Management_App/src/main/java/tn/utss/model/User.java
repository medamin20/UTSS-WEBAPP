package tn.utss.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";

	@Id
	private long id;
	@Indexed
	@Field(value = "Lastname")
	private String lastname;

	@Indexed
	@Field(value = "Firstname")
	private String firstname;

	@Field(value = "CIN")
	private long cin;

	@Field(value = "Birthdate")
	private Date birthdate;

	protected String password;
	protected String confirmPassword;

	@Field(value = "PhoneNumber")
	protected String phoneNumber;

	@Field(value = "Status")
	protected boolean status;

	@Field(value = "Email")
	protected String email;

	@JsonProperty
	private Role role;

	private List<Movement> userMovement;

	private List<Store> userStore;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String lastname, String firstname, long cin, Date birthdate, String password,
			String confirmPassword, String phoneNumber, boolean status, String email, Role role,
			List<Movement> userMovement, List<Store> userStore) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.cin = cin;
		this.birthdate = birthdate;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.email = email;
		this.role = role;
		this.userMovement = userMovement;
		this.userStore = userStore;
	}

	public User(String lastname, String firstname, long cin, Date birthdate, String password,
			String confirmPassword, String phoneNumber, boolean status, String email) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.cin = cin;
		this.birthdate = birthdate;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.email = email;
	}

	public User(String password, String email, Role role) {
		super();
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public long getCin() {
		return cin;
	}

	public void setCin(long cin) {
		this.cin = cin;
	}

	public Date getbirthdate() {
		return birthdate;
	}

	public void setbirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Movement> getUserMovement() {
		return userMovement;
	}

	public void setUserMovement(List<Movement> userMovement) {
		this.userMovement = userMovement;
	}

	public List<Store> getUserStore() {
		return userStore;
	}

	public void setUserStore(List<Store> userStore) {
		this.userStore = userStore;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthdate, cin, confirmPassword, email, firstname, id, lastname, password, phoneNumber,
				role, status, userMovement, userStore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(birthdate, other.birthdate) && cin == other.cin
				&& Objects.equals(confirmPassword, other.confirmPassword) && Objects.equals(email, other.email)
				&& Objects.equals(firstname, other.firstname) && Objects.equals(id, other.id)
				&& Objects.equals(lastname, other.lastname) && Objects.equals(password, other.password)
				&& Objects.equals(phoneNumber, other.phoneNumber) && role == other.role && status == other.status
				&& Objects.equals(userMovement, other.userMovement) && Objects.equals(userStore, other.userStore);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", cin=" + cin
				+ ", birthdate=" + birthdate + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", phoneNumber=" + phoneNumber + ", status=" + status + ", email=" + email + ", role=" + role
				+ ", userMovement=" + userMovement + ", userStore=" + userStore + "]";
	}

}
