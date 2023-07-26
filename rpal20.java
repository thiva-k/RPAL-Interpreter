import Engine.Evaluvator;

public class rpal20 {
    
    public static void main(String[] args) {   
               
        String fn = args[0];                                                    // get file name          
        System.out.println(Evaluvator.evaluvate(fn));                                   // get and print the answer
    }
}
