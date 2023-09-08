package lk.ctech.cafe_management_system_backend.dao;

import lk.ctech.cafe_management_system_backend.POJO.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    List<Category> getAllCategory();
}
