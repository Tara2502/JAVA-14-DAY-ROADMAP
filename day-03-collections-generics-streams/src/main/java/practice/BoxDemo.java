package practice;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> box=new Box<String>();
        box.setValue("Hello Java");
        System.out.println(box.getValue());
        Box<Integer> integerBox=new Box<>();
        integerBox.setValue(100);
        System.out.println(integerBox.getValue());
        Box<Double> DoubleBox=new Box<>();
        DoubleBox.setValue(95.60);
        System.out.println(DoubleBox.getValue());

    }
}
