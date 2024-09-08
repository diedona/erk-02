package sessoes;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SwitchCase {

    private InputStream _StreamDeLeitura;
    private PrintStream _StreamDeEscrita;

    public SwitchCase(
            InputStream inputStream,
            PrintStream printStream) {
        super();
        _StreamDeLeitura = inputStream;
        _StreamDeEscrita = printStream;
    }

    public void ProgramaComSwitchCase() {
        var nomeDoDia = "";
        var diaDaSemana = 0;
        var leitor = new Scanner(_StreamDeLeitura);

        _StreamDeEscrita.println("================");
        _StreamDeEscrita.println("Iniciando 'ProgramaComSwitchCase'");
        _StreamDeEscrita.println("================");
        _StreamDeEscrita.println();

        _StreamDeEscrita.println("Atenção: Domingo = 1, Sábado = 7");
        _StreamDeEscrita.println("Digite o dia da semana que deseja:");

        diaDaSemana = leitor.nextInt();

        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-Feira";
                break;

            default:
                nomeDoDia = "Não sei o que diabos é dia '" + diaDaSemana + "'";
                break;
        }

        _StreamDeEscrita.println();
        _StreamDeEscrita.println("Dia escolhido:");
        _StreamDeEscrita.println(nomeDoDia);
    }

}