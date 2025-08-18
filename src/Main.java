import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Get current date & time
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss");

        // Some motivational quotes
        String[] quotes = {
            "Keep pushing forward, success is on the way!",
            "Believe in yourself, you’re stronger than you think.",
            "Great things take time, keep going!",
            "Small progress each day adds up to big results.",
            "Your hard work will pay off, trust the process!"
        };

        // Pick a random quote
        Random rand = new Random();
        String randomQuote = quotes[rand.nextInt(quotes.length)];

        // Print personalized message
        System.out.println("=========================================");
        System.out.println("   🚀 Hello, Sagar Barve! 🚀");
        System.out.println("   Today is: " + formatter.format(currentDate));
        System.out.println("-----------------------------------------");
        System.out.println("💡 Quote of the Day: " + randomQuote);
        System.out.println("=========================================");
    }
}
