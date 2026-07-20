import org.w3c.dom.ls.LSOutput;

public class AreaCalculator {
    public static void main(String[] args) {
        int radius=7;
        double areaOfCircle=3.14*radius*radius;
        System.out.println(areaOfCircle);

        int length=10;
        int width=7;
        double areaOfRectangle=length*width;
        int height=10;
        int base=4;
        double areaOfTriangle=height*base*0.5;
        System.out.println(areaOfRectangle);
        System.out.println(areaOfTriangle);


    }


}
