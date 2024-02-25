import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Catalog c1 = new Catalog();
        Employee e1 = new Employee(1,"123","Shisui",8);
        Employee e2 = new Employee(2,"456","Itachi",2);
        Employee e3 = new Employee(3,"789","Kakashi",2);
        c1.add(e1);
        c1.add(e2);
        c1.add(e3);
        c1.SearchByExperience(2);
        System.out.println("");
        c1.SearchByName("Itachi");
        System.out.println("");
        c1.SearchById(1);
        System.out.println("");
        c1.newEmployee(4,"000","Madara",800);
        System.out.println(c1.getLast().toString());
    }
}