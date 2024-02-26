package controller;

public class FatorialRecursivo {

    public FatorialRecursivo (){
        super();
    }

    public double calcFatorial(double n){
        if (n == 0 && n <= 12){ //Condição de parada
            return 1;
        }else{
            //Chamada função
            return n * calcFatorial(n - 1); //Termo n em função do termo anterior: Retorna n multiplicado pelo fatorial do número anterior (n-1)
        }
    }
}
