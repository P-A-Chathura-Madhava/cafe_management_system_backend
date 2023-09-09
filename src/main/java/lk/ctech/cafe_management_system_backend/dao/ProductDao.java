package lk.ctech.cafe_management_system_backend.dao;

import lk.ctech.cafe_management_system_backend.POJO.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
