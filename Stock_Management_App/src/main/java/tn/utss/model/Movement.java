package tn.utss.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Movements")
public class Movement implements Serializable {

	private static final long serialVersionUID = 1L;
	@Transient
	public static final String SEQUENCE_NAME = "movement_sequence";

	@Id
	private long idMovement;

	@Field(value = "OrderDate")
	private Date orderDate;

	@JsonProperty
	@Field(value = "MovementType")
	private MovementType movType;

	private List<Product> movProducts;

	private User movUser;

	public Movement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Movement(Date orderDate, List<Product> movProducts) {
		super();
		this.orderDate = orderDate;
		this.movProducts = movProducts;
	}
	
	public Movement(Date orderDate, MovementType movType, List<Product> movProducts, User movUser) {
		super();
		this.orderDate = orderDate;
		this.movType = movType;
		this.movProducts = movProducts;
		this.movUser = movUser;
	}

	public Movement(long idMovement, Date orderDate, MovementType movType, List<Product> movProducts, User movUser) {
		super();
		this.idMovement = idMovement;
		this.orderDate = orderDate;
		this.movType = movType;
		this.movProducts = movProducts;
		this.movUser = movUser;
	}

	public Movement(MovementType movType) {
		super();
		this.movType = movType;
	}

	public long getIdMovement() {
		return idMovement;
	}

	public void setIdMovement(long idMovement) {
		this.idMovement = idMovement;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public MovementType getMovType() {
		return movType;
	}

	public void setMovType(MovementType movType) {
		this.movType = movType;
	}

	public List<Product> getMovProducts() {
		return movProducts;
	}

	public void setMovProducts(List<Product> movProducts) {
		this.movProducts = movProducts;
	}

	public User getMovUser() {
		return movUser;
	}

	public void setMovUser(User movUser) {
		this.movUser = movUser;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMovement, movProducts, movType, movUser, orderDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movement other = (Movement) obj;
		return idMovement == other.idMovement && Objects.equals(movProducts, other.movProducts)
				&& movType == other.movType && Objects.equals(movUser, other.movUser)
				&& Objects.equals(orderDate, other.orderDate);
	}

	@Override
	public String toString() {
		return "Movement [idMovement=" + idMovement + ", orderDate=" + orderDate + ", movType=" + movType
				+ ", movProducts=" + movProducts + ", movUser=" + movUser + "]";
	}

}
