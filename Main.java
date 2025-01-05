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
