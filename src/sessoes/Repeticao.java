package sessoes;

import java.util.Scanner;

public class Repeticao {
    
    public void ProgramaComRepeticao() {

        Condicionais condicionais = new Condicionais();
        Scanner leitor = new Scanner(System.in);

        while (true) {
            
            condicionais.ProgramaComCondicionais();
            System.out.println("\n=========\n");

            System.out.println("Repetir? (S/N)");

            String escolha = leitor.nextLine();

            if(escolha.equalsIgnoreCase("N")) {
                break; // sai do "while" imediatamente, não executa linhas dentro do bloco
            }

            System.out.println("\n=========\n");
        }

        System.out.println("Fim do 'ProgramaComRepeticao'");

    }

}
