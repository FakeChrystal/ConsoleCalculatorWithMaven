package ch.bsfh.richardhauri;

/**
 * Kein Hello world! --- Console Calculator.
 * @author richa
 * @version 0.0.1
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calculator = new Calculator();
    	int a, b, c, d, f;
    	a = 2;
    	b = 3;
    	c = 5;
    	
    	d = calculator.addition(3, 5);
    	f = calculator.subtraction(5, 2);
        System.out.println( "Calculator" );
        System.out.println(b + " + " + c + " = " + d);
        System.out.println(c + " - " + a + " = " + f);
    }
}
