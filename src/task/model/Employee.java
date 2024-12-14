package task.model;


import task.AgeException;

public class Employee {
    private Long id;
    private String name;
    private int age;
    private String job;

    private static Long generedId = 1L;


    public Employee() {

        this.id = generedId++;
    }

    public Employee(String name, int age, String job) {


        this.id = generedId++;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {



        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", job='" + job + '\'' +
               '}'+"\n";
    }
}
