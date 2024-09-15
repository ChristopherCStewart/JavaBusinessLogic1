//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<User> myUserList = new ArrayList<>();

        User user1 = new User("John", "Doe", false, false, false);
        myUserList.add(user1);

        User user2 = new User("Bob", "Doe", true, true, true);
        myUserList.add(user2);

        User user3 = new User("Frank", "Doe", false, true, true);
        myUserList.add(user3);

        for (int i = 0; i < myUserList.size(); i++)
        {
            printUserDiscount(myUserList.get(i));
        }
    }

    public static class User
    {
        // constructor
        public User(String fn, String ln, Boolean senior, Boolean firstResponder, Boolean military)
        {
            this.FirstName = fn;
            this.LastName = ln;
            this.IsSenior = senior;
            this.IsFirstResponder = firstResponder;
            this.IsMilitary = military;
        }
        public String FirstName;
        public String LastName;
        public Boolean IsSenior;
        public Boolean IsFirstResponder;
        public Boolean IsMilitary;
    }

    public static void printUserDiscount(User user)
    {
        int DiscountAmount = 0;

        if(user.IsSenior)
        {
            DiscountAmount += 15;
        }

        if(user.IsFirstResponder)
        {
            DiscountAmount += 10;
        }

        if(user.IsMilitary)
        {
            DiscountAmount += 12;
        }

        System.out.println(user.FirstName + ", " + user.LastName + ", " + DiscountAmount + "% Discount \n");
    }
}


