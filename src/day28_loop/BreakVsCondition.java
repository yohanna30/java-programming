package day28_loop;

public class BreakVsCondition {
    public static void main(String[] args) {
        //BREAK STATEMENT
        for (int n = 1; n <= 5;n++) {
            System.out.println(n);
            if (n == 4) {
                break;
            }


        }
        System.out.println();

        for (int i = 1;i <= 5;i++) {
            if (i==2 || i ==4){
                continue;
            }
            System.out.println(i);
        }
    }
}
