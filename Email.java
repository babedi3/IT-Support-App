package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor for first, last
    public Email(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email Created: "+this.firstName+" "+this.lastName);
        
        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: "+ this.department);
        	
    }

    // Ask for department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for developement \n3 for accounting \n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "sales"; }
        else if (depChoice == 2) {return "dev"; }
        else if (depChoice == 3) {return "acct"; }
        else {return ""; }
    }
    // Generate random passowrd

    // Set mailbox capacity

    // Set alternate email

    //Change password
}