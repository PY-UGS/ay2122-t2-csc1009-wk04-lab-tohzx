import java.util.Scanner;
public class BMIInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weight = in.nextFloat();

        System.out.print("Enter height in inches: ");
        float height = in.nextFloat();
        in.close();

        BMICal guy01 = new BMICal(height, weight);

        System.out.println("BMI is " + guy01.getBMIDone());

        guy01.getBMIIntepretation(guy01.getBMIDone());
    }
}
