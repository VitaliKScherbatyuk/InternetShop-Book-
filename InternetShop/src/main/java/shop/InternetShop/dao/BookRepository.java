package shop.InternetShop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import shop.InternetShop.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer>, CrudRepository<Book, Integer>{

}
