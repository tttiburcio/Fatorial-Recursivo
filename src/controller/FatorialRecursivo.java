package controller;

public class FatorialRecursivo {

    public FatorialRecursivo (){
        super();
    }

    public double calcFatorial(double n){
        if (n == 0 && n <= 12){
            return 1;
        }else{
            return n * calcFatorial(n - 1);
        }
    }
}
