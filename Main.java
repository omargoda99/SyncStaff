public class Main {
    public static void main(String[] args) {
        ArrayList<String> responsibilities = new ArrayList<>();
        responsibilities.add("Develop features");
        responsibilities.add("Fix bugs");

        Engineer engineer = new Engineer(
                "John Doe", true, "Male", "E123", 30, "Software Engineer", "Manager123",
                60000, 10, 1600, "Engineering", "johndoe@example.com", "password123"
        );
        System.out.println(engineer);
        System.out.println("Engineer Salary after Raise: " + engineer.calculateRaisedSalary());
        System.out.println("Engineer Role: " + engineer.getRole());
        
        ArrayList<Employee> teamMembers = new ArrayList<>();
        teamMembers.add(engineer);
        ArrayList<String> managerResponsibilities = new ArrayList<>();
        managerResponsibilities.add("Oversee team");
        managerResponsibilities.add("Coordinate projects");

        Manager manager = new Manager(
                "Omar", true, "Male", "M123", 35, "Team Manager", "Supervisor123",
                80000, 15, 1600, "Engineering", "omar@example.com", "password456",
                managerResponsibilities, teamMembers, 5
        ) {
            @Override
            public String getRole() {
                return "Manager";
            }
        };

        System.out.println(manager);
        System.out.println("Manager Salary after Raise: " + manager.calculateRaisedSalary());
        System.out.println("Manager Role: " + manager.getRole());
    }
}

/*
OUTPUT : 

Employee{name='John Doe', position='Software Engineer', department='Engineering', salary=60000.0, points=1600, ID= E123}
Engineer Salary after Raise: 66000.0
Engineer Role: Engineer

Manager Details:
Name: Omar
ID: M123
Position: Team Manager
Supervisor: Supervisor123
Department: Engineering
Email: omar@example.com
Salary: 80000.0
Raise: 15.0
Points: 1600
Team Size: 5
Responsibilities: Oversee team, Coordinate projects
Team Members: John Doe, ID of E123

Manager Salary after Raise: 92000.0
Manager Role: Manager


*/

