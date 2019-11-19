package com.neuedu.service;

import com.neuedu.entity.Employee;
import com.neuedu.mapper.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao ;

    @Override
    public List<Employee> listEmp() {
        return dao.listEmp();
    }
}
