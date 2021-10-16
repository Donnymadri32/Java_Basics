import javax.crypto.Mac;

public class App {

    public static void main(String[] args){
        Machine machine1 = new Machine();

        Camera camara1 = new Camera();

        machine1.start();
        camara1.start();
        camara1.snap();

        // Upcasting
        Machine machine2 = camara1;
        machine2.start();

        // error machine2.snap();

        // Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();

        // Doesn't work --- runtime error
        Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();
    }
}
