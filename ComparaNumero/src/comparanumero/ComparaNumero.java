package comparanumero;
public class ComparaNumero {
    public void comparaNumero(double num1, double num2){
        if(num1 == num2){
            System.out.println("São iguais");
        } else{
            System.out.println(num1 > num2 ? (num1+" "+num2) : (num2+" "+ num1));
        }
    }    
    public static void main(String[] args) {
        ComparaNumero a = new ComparaNumero();
        a.comparaNumero(4,3);
        a.comparaNumero(2,3);
        a.comparaNumero(4,4);
    }
}
