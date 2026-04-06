import java.io.*;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        List<StudentBursier> bursieri = new ArrayList<>();

        bursieri.add(new StudentBursier(1025,"Andrei","Popa","ISM141/2", 8.70, 725.50));
        bursieri.add(new StudentBursier(1024,"Ioan","Mihalcea","ISM141/1", 9.80, 801.10));
        bursieri.add(new StudentBursier(1026,"Anamaria","Prodan","TI131/1", 8.90, 745.50));
        bursieri.add(new StudentBursier(1029,"Bianca","Popescu","TI131/1", 9.10, 780.80));


        for (StudentBursier s : bursieri) {
            System.out.println(s);
        }


        PrintWriter pw = new PrintWriter(new FileWriter("src/bursieri_out.txt"));
        for (StudentBursier s : bursieri) {
            pw.println(s);
        }
        pw.close();

        System.out.println("Lista a fost salvata in bursieri_out.txt");



    }
}


