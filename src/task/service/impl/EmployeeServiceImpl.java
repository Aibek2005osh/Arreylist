package task.service.impl;

import task.db.DateBase;
import task.service.EmployeeService;

public class Employee implements EmployeeService {
    DateBase dateBase = new DateBase();

    @Override
    public void add() {
        
    }

    @Override
    public void ageMethod() {
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
