package com.neuedu.mapper;

import com.neuedu.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeDao {

    List<Employee> listEmp();

}
