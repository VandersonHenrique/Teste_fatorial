public class fatorial{

public static long fatorial(int n ) {
    if(n<0){
        System.out.println("os numero não pode ser menor que zero");
        return -1;
    }    

    else{
        long resultado = 1;
        int i = 2;
        while(i<=n){
            resultado *= i;
            i++;
        }
        return resultado;
    }

}
}