import java.util.Scanner;

public class atividade_8_classificaçãodeTemperatura {
    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        double temperatura = tp.nextDouble();

        if (temperatura >= 30) {
            System.out.println("Quente🥵");
        } else if (temperatura < 30 && temperatura >= 15) {
            System.out.println("Agradável😲");
        } else {
            System.out.println("Frio🥶 ");
        }
    }
}
