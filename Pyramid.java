public class Pyramid {
    public static void main(String[] args) {
        int x, y;
        for(x=0; x<5; x++){
            for(y=1; y<5-x; y++){
                System.out.print(" ");
            }
            for(y=0; y<x*2+1; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
