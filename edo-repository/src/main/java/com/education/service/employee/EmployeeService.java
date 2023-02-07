package com.education.service.employee;

import com.education.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * @author Kiladze George
 * интерфейс сервиса в edo-repository
 */
public interface EmployeeService {

    void save(Employee employee);

    void moveToArchived(Long id);

    Employee findById(Long id);

    Collection<Employee> findAll();

    Collection<Employee> findAllById(Iterable<Long> ids);

    Employee findByIdAndArchivedDateNull(Long id);

    Collection<Employee> findByIdInAndArchivedDateNull(Iterable<Long> ids);

    Collection<Employee> findAllByFullName(String name);

    @Transactional(readOnly = true)
    Collection<Employee> saveCollection(Collection<Employee> toEntity);
}
