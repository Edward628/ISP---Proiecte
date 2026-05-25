import java.util.List;

public abstract class ExportStrategyDecorator implements ExportStrategy {

    // tine strategia originala
    protected ExportStrategy strategie;

    public ExportStrategyDecorator(ExportStrategy strategie) {
        this.strategie = strategie;
    }

    // implicit doar apeleaza strategia originala
    @Override
    public void executa(List<Student> studenti) {
        strategie.executa(studenti);
    }
}
