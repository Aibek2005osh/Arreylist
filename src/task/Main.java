package task;


import task.model.Employee;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
   static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public static void main(String[] args) {


        try {
            employeeArrayList.add(new Employee(name(), age(), job()));

            for (Employee employee1 : employeeArrayList) {
                if (employee1.getName().equalsIgnoreCase("")) {
                    throw new NameException("name null bolbosh kerek");

                }
            }
            for (Employee employee2 : employeeArrayList) {
                if (employee2.getAge() < 0) {

                    throw new AgeException("0 don kem bolbosh kerek ! !");

                } else if (employee2.getAge() > 120) {
                    throw new AgeException("andai jash jok aldaba ! !");
                }
            }


        } catch (NameException | AgeException e) {

            System.out.println("error " + e.getMessage());


        } finally {
            System.out.println("bytty");
        }
        System.out.println(employeeArrayList);
    }

    public static String name() {
        System.out.print("name : ");
        return scannerStr.nextLine();
    }

    // Жашын алуу методу
    public static int age() {
        System.out.print("age : ");
        int age = scannerInt.nextInt();
        return age;
    }

    // Жумушун алуу методу
    public static String job() {
        System.out.print("jop : ");
        return scannerStr.nextLine();
    }


}
