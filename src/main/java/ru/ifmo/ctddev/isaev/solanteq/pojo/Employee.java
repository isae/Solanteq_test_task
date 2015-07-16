package ru.ifmo.ctddev.isaev.solanteq.pojo;


import java.util.Calendar;
import java.util.Date;

/**
 * Created by root on 7/14/15.
 */
public class Employee implements Comparable<Employee>{
    private int employeeID;
    private String firstName;
    private String surname;
    private String patronymic;
    private Date dateOfBirth;
    private Position position;

    public Employee(int employeeID, String firstName, String surname, String patronymic, Date dateOfBirth, Position position) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeID != employee.employeeID) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return employeeID;
    }

    @Override
    public int compareTo(Employee o) {
        return employeeID-o.employeeID;
    }
}