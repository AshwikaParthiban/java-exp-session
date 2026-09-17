package Myproject.SpringBoot.Services;


import Myproject.SpringBoot.Models.Staff;
import Myproject.SpringBoot.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServices {
    @Autowired
    private StaffRepository staffrepository;

    public Staff createstaff (Staff  data)
    {
        Staff result =  staffrepository.save(data);
        return result;
    }

    public List<Staff> getallstaff (){

        return  staffrepository.findAll();
    }

    public Staff updatestaff (Staff data){

        return staffrepository.save(data);
    }

    public Staff getbyid(Long Id){
        return staffrepository.findById(Id).orElseThrow(()-> new RuntimeException("Todo not found"));
    }
}