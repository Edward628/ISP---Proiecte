

void main() {
    List<Student> lista = new ArrayList<>();

    try {
        Scanner sc = new Scanner(new File("src/studenti_in.txt"));

        while (sc.hasNextLine()) {
            String[] p = sc.nextLine().split(",");

            lista.add(new Student(
                    Integer.parseInt(p[0]), // 1024 → int
                    p[1],                   // Ioan
                    p[2],                   // Mihalcea
                    p[3]                    // ISM141/1
            ));
        }

        sc.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    // afisare
    System.out.println("Studentii cititi:");
    for (Student s : lista) {
        System.out.println(s);
    }

    // sortare dupa nume
    lista.sort((a, b) -> a.nume.compareToIgnoreCase(b.nume));

    // scriere
    try {
        PrintWriter pw = new PrintWriter("src/studenti_out.txt");

        for (Student s : lista) {
            pw.println(s);
        }

        pw.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println("Gata!");
 }
