package Laborator9;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Exercitiul1 {
    public static void main(String[] args) {
        List<Integer> numere=new ArrayList<>();
        Random r=new Random();
        for(int i=0;i<10;i++){
            numere.add(r.nextInt(21)+5);
        }
        System.out.println("Lista initiala: " + numere);
        //a)
        int suma=numere.stream().reduce(0, Integer::sum);;
        System.out.println("a) Suma= " + suma);

        //b)
        int max = numere.stream().max(Integer::compare).get();
        int min = numere.stream().min(Integer::compare).get();
        System.out.println("b) Max= " + max + ", Min= " + min);

        //c)
        List<Integer> filtrata = numere.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("c) Elemente intre 10 si 20: " + filtrata);
        // d) In Double
        List<Double> listaD = numere.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());

        // e) Valoarea 12
        boolean exista = numere.stream().anyMatch(n -> n == 12);
        System.out.println("Exista 12? " + exista);


    }

}
