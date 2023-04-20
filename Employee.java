class Employee {
    private double salary;
    private int workHoursPerDay;

    public void getInfo(double salary, int workHoursPerDay) {
        this.salary = salary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public void AddSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void AddWork() {
        if (workHoursPerDay > 6) {
            salary += 5;
        }
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo(400, 7);
        employee.AddSal();
        employee.AddWork();
        System.out.println("Final Salary: $" + employee.getSalary());
    }
}
