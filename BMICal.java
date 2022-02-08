import java.lang.Math.*;
public class BMICal {

    private float height;
    private float weight;

    public BMICal(float height, float weight){
        this.height = height;
        this.weight = weight;

    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getBMIDone(){
        double x = (this.weight * 0.45359237) / Math.pow((this.height * 0.0254 ), 2);
        return x;
    }

    public void getBMIIntepretation(double getBMIDone){
        if (getBMIDone() < 18.5) {
            System.out.println("Underweight");
        } else if (getBMIDone() >= 18.5 && getBMIDone() < 25.0) {
            System.out.println("Normal");
        } else if (getBMIDone() >= 25.0 && getBMIDone() < 30.0) {
            System.out.println("Overweight");
        } else if (getBMIDone() >= 30.0) {
            System.out.println("Obese");
        } else {
            System.out.println("Error");
        }
    }
}
