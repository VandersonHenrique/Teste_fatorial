import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero para se calcular o fatorial com esse numero não podendo ser negativo");
        int numero = teclado.nextInt();
        long x = fatorial.fatorial(numero);
        if(x<0){
             System.out.println("Erro: número inválido");
        }
        else{
            System.out.println(numero + "! = " + x);
        }
    }
}