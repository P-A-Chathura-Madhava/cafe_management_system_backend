package lk.ctech.cafe_management_system_backend.dao;

import lk.ctech.cafe_management_system_backend.POJO.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BillDao extends JpaRepository<Bill, Integer> {
    List<Bill> getAllBills();
    List<Bill> getBillByUserName(@Param("username") String username);
}