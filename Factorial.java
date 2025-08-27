public class Factorial {
    public static int fac(int x){
        if(x==1){
            return 1;
        }
        return x*fac(x-1);
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println(fac(x));

    }
}
