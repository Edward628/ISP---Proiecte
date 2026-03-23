

void main() {
    List<Student> lista = new ArrayList<>();

    // CITIRE
    try {
        Scanner sc = new Scanner(new File("src/studenti_in.txt"));

        while (sc.hasNextLine()) {
            String[] p = sc.nextLine().split(",");

            lista.add(new Student(
                    Integer.parseInt(p[0]),
                    p[1],
                    p[2],
                    p[3]
            ));
        }

        sc.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    // SORTARE dupa formatie, apoi nume (fara lambda, fara override)
    lista.sort(new Comparator<Student>() {
        public int compare(Student a, Student b) {

            int rezultat = a.formatieDeStudiu.compareToIgnoreCase(b.formatieDeStudiu);

            if (rezultat == 0) {
                return a.nume.compareToIgnoreCase(b.nume);
            }

            return rezultat;
        }
    });

    // SCRIERE
    try {
        PrintWriter pw = new PrintWriter("src/studenti_out_sorted.txt");

        for (Student s : lista) {
            pw.println(s);
        }

        pw.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println("Gata!");
 }
