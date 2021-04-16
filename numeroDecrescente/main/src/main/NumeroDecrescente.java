package main;

public class NumeroDecrescente {
    public void numeroDecrescente(int num1){
        if(num1 > 0){
            for (int i = num1; i >= 0; i--) {
                System.out.println(i);
            } 
        } else {
            for (int i = num1; i <= 0; i++) {
                System.out.println(i);
            }
        }
    }
}
