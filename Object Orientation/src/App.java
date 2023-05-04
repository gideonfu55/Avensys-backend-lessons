import com.java.objects.classes.Bird;
import com.java.objects.classes.Fan;
import com.java.objects.classes.Monitor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // New bird object:
        Bird tweety = new Bird("Tweety", "Canary", "Yellow");

        // Test bird methods:
        System.out.println();
        tweety.fly();

        System.out.println();
        tweety.peck("carrots");

        System.out.println();
        System.out.println(tweety);

        // New monitor object:
        Monitor samsung = new Monitor("Samsung", "rectangle", "black", 9);

        // Test monitor methods:
        System.out.println();
        samsung.brightnessUp();

        System.out.println();
        samsung.blueScreen();

        System.out.println();
        System.out.println(samsung);

        // Objects exercise:
        Fan panasonic = new Fan("Black", "Panasonic", 4);
        Fan samsungNew = new Fan("Green", "Samsung", 4);
        Fan mitsubishi = new Fan("Black", "Mitsubishi", 4);

        System.out.println();

        panasonic.rotate();
        samsungNew.stop();
        mitsubishi.blowAir();
    }
}
