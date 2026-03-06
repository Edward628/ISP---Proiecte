public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;

    Student(int x,String s,String t,String m){
        numarMatricol=x;
        prenume=s;
        nume=t;
        formatieDeStudiu=m;
    }

public String toString(){
        return("numarmatricol:"+numarMatricol+" prenume:"+prenume+" nume:"+nume+" formatieDeStudiu:"+formatieDeStudiu);
}

}
