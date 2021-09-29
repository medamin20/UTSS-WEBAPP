package tn.utss.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Stocks")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;
	@Transient
	public static final String SEQUENCE_NAME = "stock_sequence";
	@Id
	private long idStock;
	@Indexed
	@Field(value = "StockName")
	private String nameStock;

	@JsonProperty
	@Field(value = "StockType")
	private StockType stockType;

	@Field(value = "StockValidity")
	private Date validityStock;
	@Field(value = "StockComming")
	private Date commingStock;

	@Field(value = "StockGoing")
	private Date goingStock;

	@Field(value = "StockQuantity")
	private int quantityStock;
	@Field(value = "StockCost")
	private int costStock;
	@Field(value = "StockMax")
	private int maxStock;
	@Field(value = "StockMin")
	private int minStock;
	
	private List<Product> StockProducts;
	
	

	


	public Stock(String nameStock, StockType stockType, Date validityStock, Date commingStock, Date goingStock,
			int quantityStock, int costStock, int maxStock, int minStock, List<Product> stockProducts, Store store) {
		super();
		this.nameStock = nameStock;
		this.stockType = stockType;
		this.validityStock = validityStock;
		this.commingStock = commingStock;
		this.goingStock = goingStock;
		this.quantityStock = quantityStock;
		this.costStock = costStock;
		this.maxStock = maxStock;
		this.minStock = minStock;
		StockProducts = stockProducts;
		this.store = store;
	}



	public Stock(long idStock, String nameStock, StockType stockType, Date validityStock, Date commingStock,
			Date goingStock, int quantityStock, int costStock, int maxStock, int minStock, List<Product> stockProducts,
			Store store) {
		super();
		this.idStock = idStock;
		this.nameStock = nameStock;
		this.stockType = stockType;
		this.validityStock = validityStock;
		this.commingStock = commingStock;
		this.goingStock = goingStock;
		this.quantityStock = quantityStock;
		this.costStock = costStock;
		this.maxStock = maxStock;
		this.minStock = minStock;
		StockProducts = stockProducts;
		this.store = store;
	}

	private Store store;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getIdStock() {
		return idStock;
	}

	public void setIdStock(long idStock) {
		this.idStock = idStock;
	}

	public String getNameStock() {
		return nameStock;
	}

	public void setNameStock(String nameStock) {
		this.nameStock = nameStock;
	}

	public StockType getStockType() {
		return stockType;
	}

	public void setStockType(StockType stockType) {
		this.stockType = stockType;
	}

	public Date getValidityStock() {
		return validityStock;
	}

	public void setValidityStock(Date validityStock) {
		this.validityStock = validityStock;
	}

	public Date getCommingStock() {
		return commingStock;
	}

	public void setCommingStock(Date commingStock) {
		this.commingStock = commingStock;
	}

	public Date getGoingStock() {
		return goingStock;
	}

	public void setGoingStock(Date goingStock) {
		this.goingStock = goingStock;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public int getCostStock() {
		return costStock;
	}

	public void setCostStock(int costStock) {
		this.costStock = costStock;
	}

	public int getMaxStock() {
		return maxStock;
	}

	public void setMaxStock(int maxStock) {
		this.maxStock = maxStock;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	

	public List<Product> getStockProducts() {
		return StockProducts;
	}

	public void setStockProducts(List<Product> stockProducts) {
		StockProducts = stockProducts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(commingStock, costStock, goingStock, idStock, maxStock, minStock, nameStock, quantityStock,
				stockType, store, validityStock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		return Objects.equals(commingStock, other.commingStock) && costStock == other.costStock
				&& Objects.equals(goingStock, other.goingStock) && idStock == other.idStock
				&& maxStock == other.maxStock && minStock == other.minStock
				&& Objects.equals(nameStock, other.nameStock) && quantityStock == other.quantityStock
				&& stockType == other.stockType && Objects.equals(store, other.store)
				&& Objects.equals(validityStock, other.validityStock);
	}

	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", nameStock=" + nameStock + ", stockType=" + stockType
				+ ", validityStock=" + validityStock + ", commingStock=" + commingStock + ", goingStock=" + goingStock
				+ ", quantityStock=" + quantityStock + ", costStock=" + costStock + ", maxStock=" + maxStock
				+ ", minStock=" + minStock + ", store=" + store + "]";
	}

}
