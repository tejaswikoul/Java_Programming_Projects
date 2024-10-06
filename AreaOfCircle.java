import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();  // Use double for more precision
        
        if (r < 0) {
            System.out.println("Radius cannot be negative. Please enter a valid positive number.");
        } else {
            double area = Math.PI * r * r;  // Use Math.PI for more accurate value of π
            System.out.printf("The area of the circle with radius %.2f is %.2f%n", r, area);  // Better formatted output
        }
        
        sc.close();
    }
}
