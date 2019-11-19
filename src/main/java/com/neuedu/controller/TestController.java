package com.neuedu.controller;

import com.neuedu.entity.Employee;
import com.neuedu.service.EmployeeService;
import com.neuedu.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    public EmployeeServiceImpl service;

    @RequestMapping(value="/hello")
    public String getHello(){
        List<Employee> list = service.listEmp();
        if(list.size()>0){
            Employee employee = new Employee();
            for (int i = 0; i <list.size() ; i++) {
                employee = list.get(i);
                String name = employee.getName();
                String nativePlace = employee.getNativePlace();
                String phone = employee.getPhone();
                System.out.println("name="+name+",nativePlace="+nativePlace+",phone="+phone);
            }
            System.out.println("查询完成。。。");


        }
        System.out.println(11111);
        return "success";

    }

}
