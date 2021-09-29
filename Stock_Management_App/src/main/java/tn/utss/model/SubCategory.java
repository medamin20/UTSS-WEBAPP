package tn.utss.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Document(collection = "SubCategories")
public class SubCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Transient
	public static final String SEQUENCE_NAME = "subcategory_sequence";

	@Id
	private long idSubCategory;
	@Indexed
	@Field(value = "SubCategoryName")
	private String nameSubCategory;

	private Category category;

	private List<Product> products;

	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCategory(long idSubCategory, String nameSubCategory, Category category, List<Product> products) {
		super();
		this.idSubCategory = idSubCategory;
		this.nameSubCategory = nameSubCategory;
		this.category = category;
		this.products = products;
	}

	public SubCategory(String nameSubCategory) {
		super();
		this.nameSubCategory = nameSubCategory;
	}

	public long getIdSubCategory() {
		return idSubCategory;
	}

	public void setIdSubCategory(long idSubCategory) {
		this.idSubCategory = idSubCategory;
	}

	public String getNameSubCategory() {
		return nameSubCategory;
	}

	public void setNameSubCategory(String nameSubCategory) {
		this.nameSubCategory = nameSubCategory;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, idSubCategory, nameSubCategory, products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubCategory other = (SubCategory) obj;
		return Objects.equals(category, other.category) && idSubCategory == other.idSubCategory
				&& Objects.equals(nameSubCategory, other.nameSubCategory) && Objects.equals(products, other.products);
	}

	@Override
	public String toString() {
		return "SubCategory [idSubCategory=" + idSubCategory + ", nameSubCategory=" + nameSubCategory + ", category="
				+ category + ", products=" + products + "]";
	}

}
