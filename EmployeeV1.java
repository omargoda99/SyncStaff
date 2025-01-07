import java.util.*;

interface Payable{
    double calculateRaisedSalary();
}
interface Shares{
    double calculateAnnualShares();
}
abstract class Manager extends Employee implements Shares{
    private int teamSize;
    private ArrayList<String> responsibilities;
    private ArrayList<Employee> teamMembers;
    Manager(String name, Boolean status, String gender, String id, int age, String position, String supervisor, double salary, double raise, int points, String department, String email, String password, ArrayList<String> responsibilities, ArrayList<Employee> teamMembers, int teamSize) {
        super(name, status, gender, id, age, position, supervisor, salary, raise, points, department, email, password);
        this.responsibilities=responsibilities;
        this.teamMembers=teamMembers;
        this.teamSize=teamSize;
    }

    public ArrayList<String> getResponsibilities() {
        return responsibilities;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public ArrayList<Employee> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(String name, Boolean status, String gender, String id, int age, String position, String supervisor, double salary, double raise, int points, String department, String email, String password, int teamSize, ArrayList<String> responsibilities, ArrayList<Employee> teamMembers) {
        super(name, status, gender, id, age, position, supervisor, salary, raise, points, department, email, password);
        this.teamSize = teamSize;
        this.responsibilities = responsibilities;
        this.teamMembers = teamMembers;
    }

    public void setResponsibilities(ArrayList<String> responsibilities) {
        this.responsibilities = responsibilities;
    }

    public void setTeamMembers(ArrayList<Employee> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public double calculateAnnualShares(){
        return 0.0;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Manager Details:\n");
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("ID: ").append(getId()).append("\n");
        sb.append("Position: ").append(getPosition()).append("\n");
        sb.append("Supervisor: ").append(getSupervisor()).append("\n");
        sb.append("Department: ").append(getDepartment()).append("\n");
        sb.append("Email: ").append(getEmail()).append("\n");
        sb.append("Salary: ").append(getSalary()).append("\n");
        sb.append("Raise: ").append(getRaise()).append("\n");
        sb.append("Points: ").append(getPoints()).append("\n");
        sb.append("Team Size: ").append(getTeamSize()).append("\n");
        sb.append("Responsibilities: ");
        for (String responsibility : responsibilities) {
            sb.append(responsibility).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("\n");
        sb.append("Team Members: ");
        for (Employee teamMember : teamMembers) {
            sb.append(teamMember.getName()).append(", ID of ");
            sb.append(teamMembers.getFirst().getId()).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("\n");
        return sb.toString();
    }
}
abstract class Employee implements Payable {
    String name;
     Boolean status;
     String gender;
     String id;
     int age;
     String position;
     String supervisor;
     double salary;
     double raise;
     int points;
     String department;
     String email;
     String password;

    Employee(String name, Boolean status, String gender, String id, int age, String position, String supervisor, double salary, double raise, int points, String department, String email, String password) {
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.position = position;
        this.supervisor = supervisor;
        this.salary = salary;
        this.raise = raise;
        this.points = points;
        this.department=department;
        this.email=email;
        this.password=password;
    }
    public void checkEmail(){
        //do some regex shit
    }

    public double getSalary() {
        return salary;
    }

    public double getRaise() {
        return raise;
    }

    public int getPoints() {
        return points;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setRaise(double raise) {
        this.raise = raise;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public String getPosition() {
        return position;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public double calculateRaisedSalary(){
        if(points>1500){
            double amount =  salary * (raise / 100);
            return salary + amount;
        }
        else return salary;
    }
    public abstract String getRole();
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", points=" + points +
                ", ID= " + id +
                '}';
    }
}
class Engineer extends Employee{

    Engineer(String name, Boolean status, String gender, String id, int age, String position, String supervisor, double salary, double raise, int points, String department, String email, String password) {
        super(name, status, gender, id, age, position, supervisor, salary, raise, points,department, email, password);
    }

    @Override
    public String getRole() {
        return "Engineer";
    }
}
