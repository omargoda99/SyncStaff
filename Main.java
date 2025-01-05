public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> family = new ArrayList<>();
        family.add(new ArrayList<>(Arrays.asList("Ahmed", "Sherif")));
        family.add(new ArrayList<>(List.of("Habiba Ahmed")));
        family.add(new ArrayList<>(Arrays.asList("Mr. Goda", "Mrs. Goda")));
        Engineer engineer = new Engineer(false, "Male", family, 1001, 7.6, "Omar Goda", "ENGJAVAINFRA_19285710", 23, "Software Engineer", "Kareem Muhammed", 16700.99);
        System.out.println(engineer);
    }
}
/* Output -> 
Employee: [
  Name: Omar Goda,
  ID: ENGJAVAINFRA_19285710,
  Age: 23,
  Gender: Male,
  Position: Software Engineer,
  Supervisor: Kareem Muhammed,
  Salary: 16700.99$,
  Points: 1001,
  Final Salary After Raise: 16700.99$,
  Status: Single
]
Family Details: [
  [Ahmed, Sherif],
  [Habiba Ahmed],
  [Mr. Goda, Mrs. Goda],
]*/
