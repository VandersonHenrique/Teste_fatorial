public class main{
    public static void main(String[] args){
        int numero = 5;
        long x = fatorial.fatorial(numero);
        if(x<0){
             System.out.println("Erro: número inválido");
        }
        else{
            System.out.println(numero + "! = " + x);
        }
    }
}