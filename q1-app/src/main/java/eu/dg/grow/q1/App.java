package eu.dg.grow.q1;

import eu.dg.grow.q1.power.StarString;
import eu.dg.grow.q1.power.StarStringImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* Star App
*/
public class App 
{
    private static final String INPUT_MESSAGE="Enter valid integer: ";
    private static final String ERROR_MESSAGE="ERROR: Not valid integer!";

    public static void main( String[] args )
    {

        int inputExponent = readIntFromConsole(args);
        StarString p2s = new StarStringImpl();
        String result = p2s.starString(inputExponent);
        printResult(result);

    }


    /**
     * Simple helper method to read the console input
     * */
    public static int readIntFromConsole(String args[] ){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = -1;
        String input= (args.length > 0) ? args[0] : null;
        while (true){
            try {
                if (null == input ){
                    System.out.print(INPUT_MESSAGE);
                    result = Integer.parseInt(br.readLine());
                }else {
                    result = Integer.parseInt(input);
                }
                return result;
            }catch(Exception e){
                System.out.println(ERROR_MESSAGE);
                input=null;
            }
        }
    }

    public static void printResult(String s){
        System.out.println("Result length: " + s.length());
        System.out.println("Result: " +  ( (s.length() > 20 )? s.substring(0, 20) + "..." : s) );
    }


}