import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return String.format("Greetings %s, it's nice to see you today!",name);
    }

    // overloaded method
    public String guestGreeting(String name, String myName) {
        return String.format("Greetings %s, this is %s speaking. This is an overloaded method! Pretty cool huh?",name, myName);
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return String.format("Hello, the current date is: %s",currentDate);
    }
    
    // checks to see if "Alexis" or "Batman" are contained in the string input and responds accordingly
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis")>-1) {
            return "Yes, right away sir. I know alexis is very slow at responding.";
        }
        else if (conversation.indexOf("Batman")>-1) {
            return "Maybe that's what batman is about.. Failing. Not winning..";
        }
        else {
            return "Right away! I am your humble servant";
        }
    }
    // Checks length of string input, and if greater than 50, returns a yelling response and apology from Alfred
    public String tiredAlfredBot(String longRequest) {
        if (longRequest.length()>50) {
            String yellResponse = "I'm sorry but this is a very long request and Alfred Bot is tired";
            return yellResponse.toUpperCase()+"......Sorry, I didn't mean to yell. My emotions got the better of me";
        }
        else {
            return "This is reasonable! Getting right on it";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

