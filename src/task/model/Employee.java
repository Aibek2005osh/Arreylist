package task;


public class Employee {
    private long id;
    private String name;
    private int age;
    private String job;

    private static long generedId =1;


    public Employee() {
        this.id =generedId++;
    }
    public Employee(String name, int age, String job) {
        this.id =generedId++;
        this.name = name;
        this.age = age;
        this.job = job;
    }
}
