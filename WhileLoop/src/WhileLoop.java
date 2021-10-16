
public class WhileLoop {
    public static void main(String[] args){
        int value = 0;
        boolean loop = value < 10;

        while(value < 10){
            System.out.println("Iteration " + value);
            value += 1;
        }
        System.out.println("We are out of the loop and the program is over");
    }
    
}
