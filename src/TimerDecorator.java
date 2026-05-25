import java.util.List;

public class TimerDecorator extends ExportStrategyDecorator {

    public TimerDecorator(ExportStrategy strategie) {
        super(strategie);
    }

    @Override
    public void executa(List<Student> studenti) {
        long startTime = System.currentTimeMillis();

        // apeleaza strategia originala
        super.executa(studenti);

        long endTime = System.currentTimeMillis();
        System.out.println("Timp de executie: " + (endTime - startTime) + " ms");
    }
}
