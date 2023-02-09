
public class FinnallyExample{
    public static void main (String[]args){
        try{
            int data=25/0;
            System.out.println(data);
        }
       catch(ArithmeticException e){
           System.out.println("Exception handled");
           System.out.println(e);

        }
        finally{
            System.out.println("Finally block executed");

        }
        System.out.println("Rest of the code");
    }
}
