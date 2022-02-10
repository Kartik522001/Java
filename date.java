import java.util.Date;

class TuesdayNotOperational extends Exception {
    public TuesdayNotOperational(String msg) {
        super(msg);
    }
}

public class date {
    public static void main(String[] args) {
        try {
            Date obj = new Date();
            String day = obj.toString().substring(0, 3);
            if (day.equalsIgnoreCase("true")) {
                throw new TuesdayNotOperational("Sorry today is Tue Bank is closed");
            }
            else{
                System.out.println("welcome to Bank");
            }
        } catch (TuesdayNotOperational e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This is finally");
        }
    }
}