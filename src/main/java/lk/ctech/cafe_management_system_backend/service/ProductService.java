package lk.ctech.cafe_management_system_backend.service;

import lk.ctech.cafe_management_system_backend.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ProductService {
    ResponseEntity<String> addNewProduct(Map<String, String> requestMap);
    ResponseEntity<List<ProductWrapper>> getAllProduct();
    ResponseEntity<String> updateProduct(Map<String, String> requestMap);
    ResponseEntity<String> deleteProduct(Integer id);
}
