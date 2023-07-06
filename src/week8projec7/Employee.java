package week8projec7;

public class Employee {
    private String name;
    private String surname;
    private String department;
    private int salary;
    private int dateOfBirth;

    public Employee(String name, String surname, String department, int salary, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee() {
        this.name = " No name ";
        this.surname = "No surname ";
        this.department = " No department ";
        this.salary = 0;
        this.dateOfBirth = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void ageCalculator() {
        if (getDateOfBirth() < 2005) {
            System.out.println("Welcome to our company " + getName() + " " + getSurname() + " You will work in " + getDepartment() +
                    "department.Your salary is " + " " + getSalary() + " USD.");
        }
       else if (getDateOfBirth() > 2005) {
            System.out.println("We appreciate your interest in our company " + getName() + " " + getSurname() + " ."
                    + " But we can't hire you as per labor laws. Please come back when you are 18.");

        }
        else if (getDateOfBirth() == 2005) {
            System.out.println("We have an internship opportunity for you " + getName() + " " + getSurname() +
                    " After 3-month internship, we will offer you a position in our " + getDepartment() + " with a salary of " + getSalary());
        }


    }
}


