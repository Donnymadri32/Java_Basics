public class Arrays {

    public static void main(String[] args){

        int value = 7;

        int[] values;

        values = new int[3];
        values[0] = 10;
        values[1] = 25;
        values[2] = 35;

        for(int i = 0; i <values.length;i++){
            System.out.println(values[i]);
        }

        int[] numbers = {1,2,3};

        for(int i = 0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
