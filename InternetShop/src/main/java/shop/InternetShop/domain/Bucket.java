package shop.InternetShop.domain;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Bucket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "book_id", referencedColumnName = "id")
	private Book book;
	
	@Column
	private Date purchaseDate;

	public Bucket() {
		super();
	}

	public Bucket(Integer id) {
		super();
		this.id = id;
	}

	public Bucket(User user, Book book, Date purchaseDate) {
		super();
		this.user = user;
		this.book = book;
		this.purchaseDate = purchaseDate;
	}

	public Bucket(Integer id, User user, Book book, Date purchaseDate) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
		this.purchaseDate = purchaseDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(book, id, purchaseDate, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bucket other = (Bucket) obj;
		return Objects.equals(book, other.book) && Objects.equals(id, other.id)
				&& Objects.equals(purchaseDate, other.purchaseDate) && Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		return "Bucket [id=" + id + ", user=" + user + ", book=" + book + ", purchaseDate=" + purchaseDate + "]";
	}
	
}
