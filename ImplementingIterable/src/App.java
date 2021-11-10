public class App {

    public static void main(String[] args) {

        UrlLibrary urlLibray = new UrlLibrary();

        for(String html: urlLibray){
            System.out.println(html.length());
            System.out.println(html);
        }
    }
}
