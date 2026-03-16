

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
    Student student2 = new Student(112, "Maria", "Popa", "TI21/1");
    System.out.println("\nVerificare O(n) cu List:");

    System.out.println("\nStudentul " + student1 + " este in lista? " + Student.existaStudent(studenti, student1));

    System.out.println("Studentul " + student2 + " este in lista? " + Student.existaStudent(studenti, student2));

    Set<String> setStudenti = new HashSet<>();
    for (Student s : studenti) {
        setStudenti.add(s.getCheie());
    }

    System.out.println("\nVerificare O(1) cu HashSet:");

    String cheie1 = student1.getCheie();
    System.out.println("Studentul " + student1 + " este in lista? " + setStudenti.contains(cheie1));

    String cheie2 = student2.getCheie();
    System.out.println("Studentul " + student2 + " este in lista? " + setStudenti.contains(cheie2));
}
