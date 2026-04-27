import java.util.List;

public class TestAplicatieCuBursa {

    public static void main(String[] args) {
        AplicatieCuBursa app = new AplicatieCuBursa();
        List<StudentBursier> lista = app.genereaza();
        List<StudentBursier> sortata = app.sorteaza(lista);


        StudentBursier primul = sortata.get(0);

        System.out.println("--- Verdict Final ---");
        System.out.println("Primul student în listă este: " + primul.nume + " (Grupa: " + primul.formatieDeStudiu + ")");



        if (primul.nume.equals("Mihalcea")) {
            System.out.println("TEST REUSIT! Sortarea respectă regula (Grupa 1 e prima).");
        } else {
            System.out.println("TEST ESUAT: Testul se aștepta la 'Mihalcea', dar a găsit pe altcineva.");
        }

    }

}
