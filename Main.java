
public class Main {
    public static void main(String[] args) {
        Employee Employee = new Employee("emID_1", "employeeOne", 20000);
        System.out.println("\n=====================");
        System.out.println("EMPLOYEE SUB CLASS");
        System.out.println("=====================");
        /*   GETTER */
        System.out.println("DISPLAY EMPLOYEE USING GETTER");
        Employee.getEmployeeId();
        Employee.getName();
        Employee.getSalary();
        Employee.displayEmployeeDetails();

        System.out.println("\nDISPLAY EMPLOYEE USING SETTER");
        Employee.setID("emID_02");
        Employee.setName("EmployeeTwo");
        Employee.setSalary(30000);
        Employee.displayEmployeeDetails();

        Manager Manager = new Manager("maID_1", "ManagerTwo", 50000, "Programming Department");
        System.out.println("\n=====================");
        System.out.println("MANAGER SUB CLASS");
        System.out.println("=====================");
        /*   GETTER */
        System.out.println("DISPLAY MANAGER USING GETTER");
        Manager.getEmployeeId();
        Manager.getName();
        Manager.getSalary();
        Manager.displayEmployeeDetails();


        System.out.println("\nDISPLAY MANAGER USING SETTER");
        Manager.setID("maID_02");
        Manager.setName("ManagerOne");
        Manager.setSalary(30000);
        Manager.displayEmployeeDetails();
    }
    
}
