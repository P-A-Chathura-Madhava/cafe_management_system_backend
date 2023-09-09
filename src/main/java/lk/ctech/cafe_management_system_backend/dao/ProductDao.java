package lk.ctech.cafe_management_system_backend.dao;

import lk.ctech.cafe_management_system_backend.POJO.Product;
import lk.ctech.cafe_management_system_backend.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    List<ProductWrapper> getAllProduct();
}
