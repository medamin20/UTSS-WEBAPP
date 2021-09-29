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
@Document(collection = "Categories")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Transient
	public static final String SEQUENCE_NAME = "category_sequence";

	@Id
	private long idCategory;
	@Indexed
	@Field(value = "CategoryName")
	private String nameCategory;

	private List<SubCategory> subCategories;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Category(String nameCategory) {
		super();
		this.nameCategory = nameCategory;
	}

	public long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(long idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCategory, nameCategory, subCategories);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return idCategory == other.idCategory && Objects.equals(nameCategory, other.nameCategory)
				&& Objects.equals(subCategories, other.subCategories);
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", nameCategory=" + nameCategory + ", subCategories="
				+ subCategories + "]";
	}

}
