
package companycompositepattern;


public class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(String name , long empId,String position)
    {
       this.empId = empId; 
        this.name = name; 
        this.position = position;
    
    }
    
    @Override
    public void showEmployeeDetails() {
         System.out.println(empId+" " +name); 
    }
    
    
}
