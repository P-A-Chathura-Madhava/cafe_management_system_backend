package lk.ctech.cafe_management_system_backend.dao;

import lk.ctech.cafe_management_system_backend.POJO.Product;
import lk.ctech.cafe_management_system_backend.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    List<ProductWrapper> getAllProduct();
    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status") String status, @Param("id") Integer id);
    List<ProductWrapper> getProductByCategory(@Param("id") Integer id);
    ProductWrapper getProductById(@Param("id") Integer id);
}
