import java.util.Scanner;

public class oi {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.print("Informe sua altura:  ");
        Double altura = Scanner.nextDouble();
        double fatorMutiplicadorH = 72.7;
        byte fatorSubtracaoH = 58;
        Double pesoIdealh = (fatorMutiplicadorH * altura) - fatorSubtracaoH;
        System.out.print("Seu peso ideal é Masculino: " + pesoIdealh);
        double fatorMmutiplicadorM = 62*1;
        double fatorSubtracao =44.7;
        Double pesoIdealm = (62.1 * altura) - 44.7;
        System.out.print("Seu peso ideal é feminino: " + pesoIdealm);
        Scanner.close();
    }

    }
