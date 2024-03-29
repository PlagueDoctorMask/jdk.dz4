public class Employee {
    private int id;
    private String phone_number;
    private String name;
    private int experience;

    public Employee(int id, String phone_number, String name, int experience) {
        this.id = id;
        this.phone_number = phone_number;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return "id=" + id + ", phone_number= " + phone_number + ", name=" + name + ", experience=" + experience;
    }
}
