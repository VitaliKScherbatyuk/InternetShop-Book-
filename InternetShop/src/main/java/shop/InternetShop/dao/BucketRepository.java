package shop.InternetShop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import shop.InternetShop.domain.Bucket;

public interface BucketRepository extends JpaRepository<Bucket, Integer>, CrudRepository<Bucket, Integer>{

}
