import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String guestGreeting() {
        SimpleDateFormat formatter = new SimpleDateFormat("H");
        Date date = new Date();
        String parsedDate = formatter.format(date);
        int h = Integer.parseInt(parsedDate);
        String dayPeriod;
        if (h >= 19)
            dayPeriod = "Evening";
        else if (h >= 12)
            dayPeriod = "Afternoon";
        else
            dayPeriod = "Morning";
        return String.format("Good %s. Lovely to see you.", dayPeriod);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis")>=0)
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        else if (conversation.indexOf("Alfred")>=0)
            return "At your service. As you wish, naturally.";
        else
            return "Right. And with that I shall retire.";
    }
    
}

