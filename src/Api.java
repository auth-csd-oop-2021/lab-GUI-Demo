/**
 * This class implements the logic of the application
 */
public class Api {
    
    public String increase(String s) {
        int value = Integer.parseInt(s);
        return value + 1 + "";
    }

    public String decrease(String s) {
        int value = Integer.parseInt(s);
        return value - 1 + "";
    }
}
