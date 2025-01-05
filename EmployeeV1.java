import java.util.*;

class Employee {
    final private String name;
    final private Boolean status;
    final private String gender;
    final private String id;
    final private int age;
    final private String position;
    final private String supervisor;
    final private double salary;
    final private double raise;
    final private int points;

    public Employee(Boolean status, String gender,int points,double raise, String name, String id, int age, String position, String supervisor, double salary){
        this.supervisor=supervisor;
        this.age=age;
        this.id=id;
        this.position=position;
        this.salary=salary;
        this.name=name;
        this.raise=raise;
        this.points=points;
        this.gender=gender;
        this.status=status;
    }
    public Double totalSalary(double salary){
        double totalsalary;
        if(points > 1500){
            totalsalary = salary + (raise * 100);
        }
        else{
            totalsalary = salary;
        }
        return totalsalary;
    }
    public String employeeStatus(Boolean status){
        if(status){
            return "Married/Engaged";
        }
        return "Single";
    }
    @Override
    public String toString() {
        return "Employee: [\n" +
                "  Name: " + name + ",\n" +
                "  ID: " + id + ",\n" +
                "  Age: " + age + ",\n" +
                "  Gender: " + gender + ",\n" +
                "  Position: " + position + ",\n" +
                "  Supervisor: " + supervisor + ",\n" +
                "  Salary: " + salary + "$,\n" +
                "  Points: " + points + ",\n" +
                "  Final Salary After Raise: " + totalSalary(salary) + "$,\n" +
                "  Status: " + employeeStatus(status) + "\n" +
                "]";
    }
}

class Engineer extends Employee{
    final private ArrayList<ArrayList<String>> family;
    public Engineer(Boolean status, String gender, ArrayList<ArrayList<String>> family, int points, double raise, String name, String id, int age, String position, String supervisor, double salary){
        super(status, gender, points, raise, name, id, age, position, supervisor, salary);
        this.family=family;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nFamily Details: [\n");
        for (ArrayList<String> list : family) {
            sb.append("  ").append(list).append(",\n");
        }
        sb.append("]");
        return sb.toString();
    }
}

