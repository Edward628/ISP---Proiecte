import java.util.ArrayList;
import java.util.List;

void main() {
     List<Student> studenti = new ArrayList<>();
     studenti.add(new Student(101, "Ion", "Popescu", "TI21/1"));
     studenti.add(new Student(102, "Ana", "Ionescu", "TI21/2"));
     studenti.add(new Student(120, "Alis", "Popa", "TI21/2"));
    System.out.println("Lista de studenti:");
    for (Student s : studenti) {
        System.out.println(s);
    }

    Student student1 = new Student(120, "Alis", "Popa", "TI21/2");
    System.out.println("\nStudentul " + student1 + " este in lista? " + Student.existaStudent(studenti, student1));

    Student student2 = new Student(112, "Maria", "Popa", "TI21/1");
    System.out.println("Studentul " + student2 + " este in lista? " + Student.existaStudent(studenti, student2));


}
