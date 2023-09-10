package lk.ctech.cafe_management_system_backend.restImpl;

import lk.ctech.cafe_management_system_backend.POJO.Bill;
import lk.ctech.cafe_management_system_backend.constents.CafeConstants;
import lk.ctech.cafe_management_system_backend.rest.BillRest;
import lk.ctech.cafe_management_system_backend.service.BillService;
import lk.ctech.cafe_management_system_backend.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BillRestImpl implements BillRest {

    @Autowired
    BillService billService;

    @Override
    public ResponseEntity<String> generateReport(Map<String, Object> requestMap) {
        try {
            System.out.println("Working");
            return billService.generateReport(requestMap);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<List<Bill>> getBills() {
        try {
            return billService.getBills();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
