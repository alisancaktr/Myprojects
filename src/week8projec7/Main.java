package week8projec7;

import week8projec7.Employee;

public class Main {
    public static void main(String args[]) {
        Employee e1 = new Employee("Ali", "Sancaktar", "Tester", 150000, 2004);


        Employee e2 = new Employee("Eray", "İnal", "Finance", 160000, 2006);

        Employee e3 = new Employee();
        e3.setName("Cankut");
        e3.setSurname("Sogancilar");
        e3.setDateOfBirth(2005);
        e3.setSalary(140000);
        e3.setDepartment("HR");

        Employee e4 = new Employee("Yaren", "Sanli", "Developer", 200000, 1999);
        Employee e5 = new Employee("Burcu Kiray", "Kaynar", "BA", 210000, 1995);

        Employee arr[] = {e1, e2, e3, e4, e5};

        for (int i = 0; i < arr.length ; i++) {
            arr[i].ageCalculator();
        }

    }
}