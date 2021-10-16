public class IfStatements {
    public static void main(String[] args){
        int x = 1;
        int loop =0;
        if(x > 1){
            System.out.printf("X is larger than %d\n", x);
        }
        else if (x == 1) {
            System.out.printf("X is equal to %d\n", x);
        }
        else {
            System.out.printf("X is smaller than %d\n", x);
        }

        while (true){
            System.out.println("Looping " + loop);
            if (loop == 5){
                break;
            }
            loop++;
            System.out.println("Running");
        }

    }
}
