class Employee{
    private final int employeeId;
    private final String name;
    private double salary;
    public Employee(int employeeId,String name,double salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }
    public int getEmployeeId(){
        return employeeId;
        
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void increaseSalary(double percentage){
        if(percentage>0){
            salary+=salary*(percentage/100);
            System.out.println("Salary increased by"+percentage+"%.New salary:$"+salary);
        }else{
            System.out.println("Invalid percentage.Salary remains unchanged.");
        }
    }
}
public class EmployeeExample{
    public static void main(String[]args){
        Employee employee1=new Employee(1,"Selvamathi",50000.0);
        Employee employee2=new Employee(2,"Gripsy",60000.0);
        System.out.println("Employee 1:ID-"+employee1.getEmployeeId()+",Name-"+employee1.getName()+",Salary-$"+employee1.getSalary());
        System.out.println("Employee 2:ID-"+employee2.getEmployeeId()+",Name-"+employee2.getName()+",Salary-$"+employee2.getSalary());
        employee1.increaseSalary(10);
        employee2.increaseSalary(-5);
        System.out.println("Updated Employee 1:Salary-$"+employee1.getSalary());
        System.out.println("Updated Employee 2:Salary-$"+employee2.getSalary());
    
    }
    
}

OUTPUT:
Employee 1:ID-1,Name-Selvamathi,Salary-$50000.0
Employee 2:ID-2,Name-Gripsy,Salary-$60000.0
Salary increased by10.0%.New salary:$55000.0
Invalid percentage.Salary remains unchanged.
Updated Employee 1:Salary-$55000.0
Updated Employee 2:Salary-$60000.0
BUILD SUCCESSFUL (total time: 0 seconds)
