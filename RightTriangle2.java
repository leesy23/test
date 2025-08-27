public class RightTriangle2 {
    public static void main(String[] args) {
        int x, y;
        for(x=0; x<5; x++){
            for(y=1; y<5-x; y++){
                System.out.print(" ");
            }
            for(y=0; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
