
public class Manager extends Employee{


    String department;
    Manager(String id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
        //TODO Auto-generated constructor stub
    }


    void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Employee Department: "+department);
    }


    
}
