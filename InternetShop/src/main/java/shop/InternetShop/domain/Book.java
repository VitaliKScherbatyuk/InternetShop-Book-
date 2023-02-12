package shop.InternetShop.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String bookName;
	@Column
	private String description;
	@Column
	private Double price;
	@Column
	private String category;
	@Column
	private Integer storage;
	@Lob
	private String encodedImage;
	
	public Book() {
		super();
	}

	public Book(String bookName, String description, Double price, String category, Integer storage) {
		super();
		this.bookName = bookName;
		this.description = description;
		this.price = price;
		this.category = category;
		this.storage = storage;
	}

	public Book(Integer id, String bookName, String description, Double price, String category, Integer storage) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.description = description;
		this.price = price;
		this.category = category;
		this.storage = storage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	public String getEncodedImage() {
		return encodedImage;
	}

	public void setEncodedImage(String encodedImage) {
		this.encodedImage = encodedImage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookName, category, description, id, price, storage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookName, other.bookName) && Objects.equals(category, other.category)
				&& Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(price, other.price) && Objects.equals(storage, other.storage);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", description=" + description + ", price=" + price
				+ ", category=" + category + ", storage=" + storage + "]";
	}
	
}
