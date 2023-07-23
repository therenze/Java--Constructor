
public class Employee {
    private String id;
    String name;
    private double salary;

    Employee(String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



    void setID(String id){
        this.id = id;
    }
    String getEmployeeId(){
        return id;
    }


    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }


    void setSalary(double salary){
        this.salary = salary;
    }
    double getSalary(){
        return salary;
    }


    void displayEmployeeDetails(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }

}
