import java16.Student;
import java.util.ArrayList;

public class Main {
   public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        students.add(new Student("Elaman", 16, "java"));
        students.add(new Student("Aibek", 19, "java"));
        students.add(new Student("Baiel", 20, "javaScript"));
        students.add(new Student("Amir", 18, "javaScript"));
        students.add(new Student("Ernis", 16, "java"));
        students.add(new Student("Kanbolot", 16, "javaScript"));
        students.add(new Student("Kanchoro", 21, "java"));
        students.add(new Student("Atai", 20, "javaScript"));
        students.add(new Student("Muhamedaly ", 20, "java"));
        students.add(new Student("Aisonun ", 20, "javaScript"));

        //todo  1
        System.out.println(students);
        //todo 2
        java();
        javaScript();
        //todo 3
        age();
        //todo 4
        aA();

    }

    public static void java() {
        ArrayList<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase("java")) {
                students1.add(student);

            }
        }
        System.out.println("java");
        for (Student student : students1) {
            System.out.println(student);
        }

    }

    public static void javaScript() {
        ArrayList<Student> students2 = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase("javaScript")) {
                students2.add(student);
            }
        }
        System.out.println("javaScript :");
        for (Student studentA : students2) {
            System.out.println(studentA);
        }

    }

    public static void age() {
        ArrayList<Student> students4 = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() < 23 && student.getAge() > 18) {
                students4.add(student);
            }
            System.out.println("Жашы 19 дан 23");
            for (Student student1 : students4) {
                System.out.println(student1);
            }
        }


    }

    public static void aA() {
        ArrayList<Student> students3 = new ArrayList<>();
        for (Student student1 : students) {
            if (student1.getName().contains("A")) {
                students3.add(student1);
            }
        }
        System.out.println("A");
        for (Student student2 : students3) {
            System.out.println(student2);
        }

    }
}
// Student деген класс тузунуз (свойства: name, age, group)
//ArrayList тузуп аны 10 студент менен толтурунуз
//1) Бардык студенттердин маалыматтарын консолго чыгарыныз.
//2) Ошол ArrayList ти группасы боюнча фильтрация кылып 2 жаны листке
//салыныз(Java,JavaScript)
//3) Жашы 19 дан 23 ко чейинки студенттерди жаны листке салыныз.
//        4) Аты "A"тамгасынан башталган студенттерди жаны листке салыныз
//Ар бир иш аракет учун озунчо метод тузуп, ал методдорду main класска чакырып иштетиниз.
//Маанилер main класстан берилуусу керек.