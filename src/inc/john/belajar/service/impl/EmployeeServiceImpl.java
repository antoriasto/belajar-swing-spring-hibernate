/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.john.belajar.service.impl;

import inc.john.belajar.bean.Employee;
import inc.john.belajar.dao.EmployeeDao;
import inc.john.belajar.service.IEmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author john
 */
@Service("employeeService")
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Employee delete(Employee employee) {
        return employeeDao.delete(employee);
    }

    @Override
    @Transactional
    public Employee findById(Long id) {
        return employeeDao.getById(id);
    }

    @Override
    @Transactional
    public List<Employee> findAllData() {
        return employeeDao.getAll();
    }
    
}
