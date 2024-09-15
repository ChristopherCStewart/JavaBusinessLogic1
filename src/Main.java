import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create an array of type User and initialize
        List<User> myUserList = new ArrayList<>();

        User user1 = new User("John", "Doe", true, false, false);
        myUserList.add(user1);

        User user2 = new User("Bob", "Doe", true, true, true);
        myUserList.add(user2);

        User user3 = new User("Frank", "Doe", false, true, true);
        myUserList.add(user3);

        // loop through the array with confirm DiscountAmount calculations are correct
        for (User user : myUserList) {
            printUserDiscount(user);
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
            this.DiscountAmount = 0;
        }
        public String FirstName;
        public String LastName;
        public Boolean IsSenior;
        public Boolean IsFirstResponder;
        public Boolean IsMilitary;
        public int DiscountAmount;
    }

    public static void printUserDiscount(User user)
    {
        if(user.IsSenior)
        {
            user.DiscountAmount += 15;
        }

        if(user.IsFirstResponder)
        {
            user.DiscountAmount += 10;
        }

        if(user.IsMilitary)
        {
            user.DiscountAmount += 12;
        }

        System.out.println(user.FirstName + ", " + user.LastName + ", " + user.DiscountAmount + "% Discount. ");
        System.out.println("A $100 purchase would only cost you $" + (100 - user.DiscountAmount) + " today. \n\n");
    }
}