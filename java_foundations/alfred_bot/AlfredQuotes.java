import java.util.Date;
import java.text.*;
public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }


    public String guestGreeting() {
        // your code here
        // return "place holder for guest greeting return string";
        return String.format("Hello, %s. Lovely to see you.");
    }


    public String guestGreeting(String name) {
        Date date = new Date();
        // int hour = date.getHours() + 1; // this will get hour from 1 - 24

        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        int currentHour = Integer.parseInt(hourFormat.format(date));
        // condition
        if (currentHour >= 4 && currentHour <= 11) {
            return "Good Morning, " + name + ". Lovely to see you.";
        } else if (currentHour > 11 && currentHour <= 5) {
            return "Good Afternoon, " + name + ". Lovely to see you.";
        } else {
            return "Good Evening, " + name + ". Lovely to see you.";
        }
        // return date;
    }


    public String dateAnnouncement() {
        // your code here
        // return "place holder for date announcement return string";
        Date date = new Date();
        return "It is currently " + date;
    }


    public String respondBeforeAlexis(String conversation) {
        // your code here
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    public String yelling(String statement) {
        return statement.toUpperCase();
    }
    // NINJA BONUS
	// See the specs to overload the guessGreeting method

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the
    // String methods you have learned!
}