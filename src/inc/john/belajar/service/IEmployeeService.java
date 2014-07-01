/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.john.belajar.service;

import inc.john.belajar.bean.Employee;
import java.util.List;

/**
 *
 * @author john
 */
public interface IEmployeeService {
    Employee save(Employee employee);
    Employee delete(Employee employee);
    Employee findById(Long id);
    List<Employee> findAllData();
}
