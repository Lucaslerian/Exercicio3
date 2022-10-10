import java.util.Scanner;

public class App {
        public static void main (String [] args){
           // Faça um programa que peça dois números e imprima a soma
           // Colocando os números
           double numero1;
           double numero2;
           double resultado;
            // Ação do usuário: digitar os dois números
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            numero2 = sc.nextDouble();
            sc.close();
            //Fórmula para fazer a soma
            resultado = numero1 + numero2;
            //Resposta do programa - apresentar o resultado
            System.out.print("O resultado é: ");
            System.out.print(resultado);
    
        }
    }