public class TimesTable {
    public static void main(String[] args) {
        int x, y;
        for(x=1; x<=9; x++){
            for(y=1; y<=9; y++){
                System.out.print(y + "*" + x + "=" + y*x + "\t");
            }
            System.out.println();
        }
    }
}
