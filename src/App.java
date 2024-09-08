import sessoes.Condicionais;
import sessoes.Repeticao;
import sessoes.SwitchCase;

public class App {
    public static void main(String[] args) throws Exception {
        
        //new Condicionais().ProgramaComCondicionais();
        //new Repeticao().ProgramaComRepeticao();
        new SwitchCase(
            System.in,
            System.out
        ).ProgramaComSwitchCase();

    }
}
