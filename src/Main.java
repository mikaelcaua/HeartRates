import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //poderia colocar em um loop para fazer com mais pessoas, mas é questão não pede explicitamente isso
        //porém, o outro exercicio(Agenda) eu fiz usando loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Informe seu dia de nascimento: ");
        int dia = scanner.nextInt();
        System.out.print("Informe seu mês de nacimento: ");
        int mes = scanner.nextInt();
        System.out.print("Informe seu ano de nascimento: ");
        int ano = scanner.nextInt();

        HeartRates programa = new HeartRates(nome, sobrenome, dia, mes, ano);

    }
}