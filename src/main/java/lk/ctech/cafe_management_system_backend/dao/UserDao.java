package lk.ctech.cafe_management_system_backend.dao;


import lk.ctech.cafe_management_system_backend.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailId(@Param("email") String email);
}
