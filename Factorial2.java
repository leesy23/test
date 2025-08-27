public class Factorial2 {

    public static void main(String[] args) {
        int x=5;
        int sum=1;
        for(int i=x; i>=1; i--){
            sum *= i;
        }
        System.out.println(sum);
    }
}
