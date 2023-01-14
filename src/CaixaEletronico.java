import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        System.out.println("Informe o valor que deseja sacar R$: ");
        Scanner in = new Scanner(System.in);
        int valorInformado = in.nextInt();
        int contadorDeNotasDeCem = 0;
        int contadorDeNotasDeCinquenta = 0;
        int contadorDeNotasDeVinte = 0;
        int contadorDeNotasDeDez = 0;
        int contadorDeNotasDeCinco = 0;
        int contadorDeNotasDeDois = 0;


        while (valorInformado > 0) {
            if (valorInformado >= 100) {
                valorInformado = valorInformado - 100;
                contadorDeNotasDeCem ++;
            } else if (valorInformado >= 50) {
                valorInformado = valorInformado - 50;
                contadorDeNotasDeCinquenta ++;
            } else if (valorInformado >= 20) {
                valorInformado = valorInformado - 20;
                contadorDeNotasDeVinte ++;
            } else if (valorInformado >= 10) {
                valorInformado = valorInformado - 10;
                contadorDeNotasDeDez ++;
            } else if (valorInformado >= 5) {
                valorInformado = valorInformado - 5;
                contadorDeNotasDeCinco ++;
            } else if (valorInformado >= 2) {
                valorInformado  = valorInformado - 2;
                contadorDeNotasDeDois ++;
            }
        }
        System.out.println("A quantidade de notas de 100 é " + contadorDeNotasDeCem);
        System.out.println("A quantidade de notas de 50 é " + contadorDeNotasDeCinquenta);
        System.out.println("A quantidade de notas de 20 é " + contadorDeNotasDeVinte);
        System.out.println("A quantidade de notas de 10 é " + contadorDeNotasDeDez);
        System.out.println("A quantidade de notas de 5 é " + contadorDeNotasDeCinco);
        System.out.println("A quantidade de notas de 2 é " + contadorDeNotasDeDois);
    }
}
