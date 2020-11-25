package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 250;
    private int defaultPasswordLength = 7;
    private String alternateEmail;
    private String companySuffix = "xycompany.com";

    // Constructor for first, last
    public Email(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        
        // Call a method asking for the department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Create email with first+last name
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    // Ask for department
    private String setDepartment() {
        System.out.print("NEW EMPLOYEE: " + firstName + ". Department Codes:\n1 for Sales\n2 for Developement \n3 for Accounting \n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "sales"; }
        else if (depChoice == 2) {return "dev"; }
        else if (depChoice == 3) {return "acct"; }
        else {return ""; }
    }
    // Generate random passowrd
    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*_+";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    // Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail= altEmail;
    }

    //Change password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getpassword() { return password; }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
        "\nCOMPANY EMAIL: " + email +
        "\nMAILBOX CAPACITY: " + mailboxCapacity + "gb";
    }
}