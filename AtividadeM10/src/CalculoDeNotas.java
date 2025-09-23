import java.util.Scanner;

public class CalculoDeNotas {
    public static void main(String[] args) {
        Scanner scanners = new Scanner(System.in);

        //Lendo as 4 notas
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanners.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanners.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanners.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanners.nextDouble();

        //Calcula a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        //Mostra a média
        System.out.println("Média do aluno: " + media);

        //Estrutura condicional
        if (media > 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanners.close();
    }
}
