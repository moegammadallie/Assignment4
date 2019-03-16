package za.ac.cput.Projects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TrasportationDevice td1 = new Car();
        td1.startEngine();

        TrasportationDevice td2 = new Bicycle();
        td2.startEngine();
    }
}
