package tn.utss.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Transient
	public static final String SEQUENCE_NAME = "product_sequence";

	@Id
	private long idProduct;

	@Field(value = "ProductTitle")
	private String titleProduct;
	@Field(value = "ProductDescription")
	private String descriptionProduct;
	@Field(value = "ProductQuantity")
	private int quantityProduct;
	@Indexed(direction = IndexDirection.ASCENDING)
	@Field(value = "ProductPrice")
	private float priceProduct;
	@Field(value = "ProductWeight")
	private float weightProduct;
	@Indexed(direction = IndexDirection.ASCENDING)
	@Field(value = "ProductBuyingPrice")
	private float buyingPriceProduct;
	@Field(value = "ProductMaxQuantity")
	private int maxQuantityProduct;
	@Field(value = "ProductImage")
	private String imageProd;
	@Field(value = "Barcodeprod")
	private String barcode;
	
	
	public Product(String titleProduct, String descriptionProduct, int quantityProduct, float priceProduct,
			float weightProduct, float buyingPriceProduct, int maxQuantityProduct, String imageProd, String barcode,
			SubCategory subCategory, Stock stock, List<Movement> productMovement) {
		super();
		this.titleProduct = titleProduct;
		this.descriptionProduct = descriptionProduct;
		this.quantityProduct = quantityProduct;
		this.priceProduct = priceProduct;
		this.weightProduct = weightProduct;
		this.buyingPriceProduct = buyingPriceProduct;
		this.maxQuantityProduct = maxQuantityProduct;
		this.imageProd = imageProd;
		this.barcode = barcode;
		this.subCategory = subCategory;
		
		this.productMovement = productMovement;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	private SubCategory subCategory;

	

	private List<Movement> productMovement;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long idProduct, String titleProduct, String descriptionProduct, int quantityProduct,
			float priceProduct, float weightProduct, float buyingPriceProduct, int maxQuantityProduct, String imageProd,
			SubCategory subCategory, Stock stock, List<Movement> productMovement) {
		super();
		this.idProduct = idProduct;
		this.titleProduct = titleProduct;
		this.descriptionProduct = descriptionProduct;
		this.quantityProduct = quantityProduct;
		this.priceProduct = priceProduct;
		this.weightProduct = weightProduct;
		this.buyingPriceProduct = buyingPriceProduct;
		this.maxQuantityProduct = maxQuantityProduct;
		this.imageProd = imageProd;
		this.subCategory = subCategory;
		
		this.productMovement = productMovement;
	}

	public Product(String titleProduct, String descriptionProduct) {
		super();
		this.titleProduct = titleProduct;
		this.descriptionProduct = descriptionProduct;
	}

	public Product(long idProduct, String titleProduct, String descriptionProduct, int quantityProduct,
			float priceProduct, float weightProduct, float buyingPriceProduct, int maxQuantityProduct) {
		super();
		this.idProduct = idProduct;
		this.titleProduct = titleProduct;
		this.descriptionProduct = descriptionProduct;
		this.quantityProduct = quantityProduct;
		this.priceProduct = priceProduct;
		this.weightProduct = weightProduct;
		this.buyingPriceProduct = buyingPriceProduct;
		this.maxQuantityProduct = maxQuantityProduct;
	}

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}

	public String getTitleProduct() {
		return titleProduct;
	}

	public void setTitleProduct(String titleProduct) {
		this.titleProduct = titleProduct;
	}

	public String getDescriptionProduct() {
		return descriptionProduct;
	}

	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}

	public int getQuantityProduct() {
		return quantityProduct;
	}

	public void setQuantityProduct(int quantityProduct) {
		this.quantityProduct = quantityProduct;
	}

	public float getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(float priceProduct) {
		this.priceProduct = priceProduct;
	}

	public float getWeightProduct() {
		return weightProduct;
	}

	public void setWeightProduct(float weightProduct) {
		this.weightProduct = weightProduct;
	}

	public float getBuyingPriceProduct() {
		return buyingPriceProduct;
	}

	public void setBuyingPriceProduct(float buyingPriceProduct) {
		this.buyingPriceProduct = buyingPriceProduct;
	}

	public int getMaxQuantityProduct() {
		return maxQuantityProduct;
	}

	public void setMaxQuantityProduct(int maxQuantityProduct) {
		this.maxQuantityProduct = maxQuantityProduct;
	}

	public String getImageProd() {
		return imageProd;
	}

	public void setImageProd(String imageProd) {
		this.imageProd = imageProd;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	

	public List<Movement> getProductMovement() {
		return productMovement;
	}

	public void setProductMovement(List<Movement> productMovement) {
		this.productMovement = productMovement;
	}

	@Override
	public int hashCode() {
		return Objects.hash(buyingPriceProduct, descriptionProduct, idProduct, imageProd, maxQuantityProduct,
				priceProduct, productMovement, quantityProduct, subCategory, titleProduct, weightProduct);
	}
	
	
	

	



	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", titleProduct=" + titleProduct + ", descriptionProduct="
				+ descriptionProduct + ", quantityProduct=" + quantityProduct + ", priceProduct=" + priceProduct
				+ ", weightProduct=" + weightProduct + ", buyingPriceProduct=" + buyingPriceProduct
				+ ", maxQuantityProduct=" + maxQuantityProduct + ", imageProd=" + imageProd + ", subCategory="
				+ subCategory + ", stock=" + ", productMovement=" + productMovement + "]";
	}

}
