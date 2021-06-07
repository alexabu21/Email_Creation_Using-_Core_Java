package EmailApp;

import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private int passwordLength = 8;
	private String companySuffix = "xyz.com";
	
	//construct the firstname and lastname;
	public email(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName = lastName;
		System.out.println("name: "+ firstName+" "+ lastName);
	
	// Call the method setdepartment
		this.department = setDepartment();
		System.out.println("Department: "+ this.department);
	
	// generating the random password
		this.password = randomPassword(passwordLength);
		System.out.println("generated password is: " + this.password);
	
	//set an email
		 email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department + companySuffix;
		System.out.println("Email Id: " + email);
	
	//change the password
	}
	//Ask the department
	private String setDepartment() {
		System.out.print("select department \n 1 for sales \n 2 for development \n 3 for accounting\n enter the department ");
		Scanner as = new Scanner(System.in);
		int no = as.nextInt();
		if (no == 1) return "sales";
		else if (no==2) return "development";
		else if (no==3) return "accounting";
		else return "none";	
	}
	// generating the random password
	private String randomPassword(int length) {
		String str = "QWERTYUIOPASDFGHJKLMNBVCXZ1234567890!@#$%&*";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random() * str.length());
			password[i] = str.charAt(rand);
		}
		return new String(password);
	}
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity= capacity;
	}
	//set an alternateemail
	public void setAlternateMail(String mail) {
		this.alternateEmail=mail;
	}
	//change the password
	public void setPassword(String Password ) {
		this.password = Password;
}
	
	public int getMailboxCapacity() {return mailBoxCapacity;}
	public String getAlternateMail() { return alternateEmail;}
	public String getPassword() {return password;}
	
	public void showInfo() {
		System.out.println("Details of employee: name: "+ firstName+" "+lastName+ "\n EmailId :"+ email + "\n MailBoxCapacity: "+ mailBoxCapacity+"mb");
	}
	}
