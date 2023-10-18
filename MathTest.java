package UNLOCKJAVA.Week1;

public class MathTest {
    public static void main (String[] args){
        double r= 68;
        double result=Math.PI*Math.pow(r,2);
        System.out.println("result = " + result);
        System.out.println(result<5000 ? "smal":"long");
    }
}
