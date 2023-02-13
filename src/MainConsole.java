import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        System.out.println("Feladat 302");
        String radiusStr = input("Sugár:  ");
        String heightStr = input("Magasság:");
        double radius = Double.parseDouble(radiusStr);
        double height = Double.parseDouble(heightStr);
        Cone cone = new Cone();
        System.out.println(cone.calcVolume(radius, height));
    }
    public String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + " ");
        String text = scanner.nextLine();
        return text;
    }

}
