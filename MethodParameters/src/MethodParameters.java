class Robot{
    public void speak(String words){
        System.out.println(words);
    }

    public void jump(int height){
        System.out.println("You jumped " + height + " feet!");
    }

    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " in direction " + direction);
    }
}

public class MethodParameters {

    public static void main(String[] args){
        Robot sam = new Robot();
        sam.speak("Hi, I'm Sam.");
        sam.jump(7);
        sam.move("west", 12.2);

        String greeting = "Hello there";
        sam.speak(greeting);

        int value = 14;
        sam.jump(value);
    }
}
