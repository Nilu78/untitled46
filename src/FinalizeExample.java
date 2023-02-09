public class FinalizeExample {
    public static void main (String[]args){
        FinnallyExample obj = new FinnallyExample();
        System.out.println("Hashcode of obj: " + obj.hashCode());
        obj = null;
        System.gc();
        System.out.println("End of the garbage collection");
    }


    protected void finalize(){
        System.out.println("Called the finalize()method");


    }


}
