package exceptions;

public class MultipleCatchPractice {
    public static void main(String[] args) {
        int option=3;
        try{
            if(option==1){
            int result =10/0;
            }
            if(option==2){
                 String string =null;
                System.out.println(string.length());
            }
            if(option ==3){
                int[] arr={10,2,45};
                System.out.println(arr[5]);
            }
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by 0");
        }catch (NullPointerException e){
            System.out.println("cannot be null");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bound");
        }
        System.out.println("Program ended");
    }
}
