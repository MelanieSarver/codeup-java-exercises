/**
 * Created by mel on 1/17/17.
 */
public class Circle {
    double radius;
    public static int objectCount;

    public Circle (double radius) {
        this.radius = radius;
        objectCount ++;
    }

    public double getCircumference(double r) {
      double circumference = (r * 2) * Math.PI;
        return circumference;
    }

    public String getFormattedCircumference(double c) {
        String circumferenceFormat = String.format("%.2f", c);
        System.out.println("The circumference is " + circumferenceFormat + ".");
        return circumferenceFormat;

    }

    public double getArea(double r) {
     double area = Math.PI * (r * r);
        return area;
    }

    public String getFormattedArea(double a) {
        String areaFormat = String.format("%.2f", a);
        System.out.println("The area is " + areaFormat + ".");
        return areaFormat;

    }


}
