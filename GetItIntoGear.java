import java.util.Scanner;

public class GetItIntoGear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] gears = input.split("T");
        
        double firstTeeth = Double.parseDouble(gears[0]);
        double lastTeeth = Double.parseDouble(gears[gears.length - 1]);
        
        double revs = 10.0 * (firstTeeth / lastTeeth);
        String direction = (gears.length % 2 != 0) ? "C" : "A";
        
        if (revs == (int) revs) {
            System.out.println((int) revs + direction);
        } else {
            System.out.printf("%.2f%s\n", revs, direction);
        }
        
        scan.close();
    }
}
