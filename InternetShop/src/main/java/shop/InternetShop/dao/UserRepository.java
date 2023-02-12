package shop.InternetShop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import shop.InternetShop.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>, CrudRepository<User, Integer>{

	List<User> findByEmail(String email);
}
