package sessoes;

import java.io.PrintStream;
import java.util.Scanner;

public class Condicionais {

    public void ProgramaComCondicionais() {
        String time;
        String saudacao;
        Scanner leitor = leitor = new Scanner(System.in);
        PrintStream impressor = System.out; // estou criando um "atalho"

        impressor.println("Qual seu time?");      
        time = leitor.nextLine();

        if (time.equalsIgnoreCase("sao paulo")) {
            saudacao = "Hmmmmmmmmmmmmmm";
        } else if (time.equalsIgnoreCase("corinthians")) {
            saudacao = "<Checa carteira> ah oi!!";
        } else if (time.equalsIgnoreCase("santos")) {
            saudacao = "Vossa mercê ainda vive?";
        } else {
            saudacao = "Nunca ouvi falar dessa merda de time: " + time;
        }

        impressor.println();
        impressor.println(saudacao);
        impressor.println();

        impressor.println("Fim do 'ProgramaComCondicionais'");
        impressor.println();
    }

}
