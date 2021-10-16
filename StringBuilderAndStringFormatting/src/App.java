public class App{
    public static void main(String[] args){

        // Inefficient
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        // More efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger")
        .append(" ")
        .append("I am a skydiver.");

        System.out.println(s.toString());

        // Formatting ////////////////

        System.out.println("Here is some text.\t\tThat was two tabs\nThat was a newline.");
        System.out.println("More text");

        System.out.printf("Total cost %-10d, quantity is %d", 5, 120);

        // Formating integers
        for(int i = 0;i < 20; i++){
            System.out.printf("%-2d: some text here\n", i);
        }

        for(int i = 0;i < 20; i++){
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        // Formating floating point value
        System.out.printf("Total value: %.2f\n", 5.6);
        System.out.printf("Total value: %-6.1f\n", 343.12312312);


    }
}
