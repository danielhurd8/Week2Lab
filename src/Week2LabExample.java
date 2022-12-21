
public class Week2LabExample {

	public static void main(String[] args) {
	/*Question 1
	 *Create a variable named age and assign it a value of 14. 
	 */
	int age = 14;
	
	/*Question 2
	 *Print the boolean expression age >= 16 to the console and note the results.
	 *change the value of age to 18 and run again.
	 */
	
	System.out.println(age >= 16);
	age = 18;
	System.out.println(age >= 16);
	
	/*Question 3
	 *using a conditional, print "You can drive" if age is greater than or equal to 16.
	 */
	boolean hasLicense = true;
	if (age >= 16 && hasLicense) {
		System.out.println("You can drive");
	} else {
		System.out.println("You cannot drive");
	}
	/*Question 4
	 *Add a new variable called hasLicense before the conditional.
	 *Change the boolean expression in the conditional to additionally include the need for hasLicense to be true.
	 *Try changing the values of age and hasLicense and note the different results. 
	 */
	
	/*Question 5
	 *Create two new variables - costOfMilk and thirstLevel
	 *Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
	 *or if thirstLevel is greater than 6 and prints "No Thanks" otherwise 
	 */
	double costOfMilk = 2.45;
	int thirstLevel = 7;
	
	if (costOfMilk < 2.50 || thirstLevel > 6) {
		System.out.println("Milk Please");
	} else {
		System.out.println("No Thanks");
	}
	
	/*Question 6
	 *Create two new variables called numberOfCookies and numberOfChildren
	 *You will eventually distribute all of the cookies to the children and as the adult
	 *you get to keep the remaining cookies to yourself.
	 *Use the conditional to print the following based on the following conditions:
	 *if there are 0 cookies remaining, print "Sad face"
	 *if there are less than 2 cookies, print "Yes!"
	 *if there are less than 5 cookies, print "Whoohoo!"
	 *if there are 5 or more cookies, print "Jackpot!" 
	 */
	int numberOfCookies = 10;
	int numberOfChildren = 2;
	
		if (numberOfCookies % numberOfChildren == 0) {
		System.out.println("Sad face");
		} else if (numberOfCookies % numberOfChildren < 2) {
		System.out.println("Yes!");
		} else if (numberOfCookies % numberOfChildren > 5) {
		System.out.println("Whoohoo!");
		} else if (numberOfCookies % numberOfChildren >= 5) {
		System.out.println("Jackpot!");
		}

	/*Question 7
	 *Create a variable called loyaltyMemberStatus and assign the value "SILVER"
	 *Create a variable called loyaltyMemberDiscount and assign the value 0.0
	 *using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
	 *"SILVER" is 0.10, "GOLD" is 0.15, "PLATINUM" is 0.25 
	 */
	
	String loyaltyMemberStatus = "SILVER";
	double loyaltyMemberDiscount = 0.0;
	
	switch (loyaltyMemberStatus) {
	case "SILVER":
		loyaltyMemberDiscount = 0.1;
			break;
	case "GOLD":
		loyaltyMemberDiscount = 0.15;
			break;
	case "PLATINUM":
		loyaltyMemberDiscount = 0.25;
			break;
	}
	System.out.println(loyaltyMemberDiscount);
	
	/*Question 8
	 *Create a variable called billTotal and assign a value
	 *Create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
	 *if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemebrStatus from SILVER to GOLD or GOLD to PLATINUM 
	 */
	double billTotal = 23.50;
	double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
	System.out.println(adjustedTotal);
	
	if (loyaltyMemberStatus == "SILVER") {
		loyaltyMemberStatus = "GOLD";
	} else if (loyaltyMemberStatus == "GOLD") {
		loyaltyMemberStatus = "PLATINUM";
	}
	
	/*Question 9
	 *Create two variables, username and password
	 *create a conditional that prints "login successful" if the username is "Daniel123" and the password is "12345"
	 *otherwise, print "access denied" 
	 */
	
	String username = "Daniel123";
	String password = "12345";
	
	if (username.equals("Daniel123") && password.equals("12345")) {
		System.out.println("login successful");
	} else {
		System.out.println("Access Denied");
		}
	
	/*Question 10
	 *Write a for loop that prints each number from 0 to 9
	 */
	
	for(int a = 0; a < 10; a++) {
		System.out.println(a);
	}
	
	/*Question 11
	 *Write a for loop that prints each number from 10 to 0 backwards 
	 */
	
	for (int b = 10; b >= 0; b--) {
		System.out.println(b);
	}
	
	/*Question 12
	 *Write a for loop that prints every other number from 0 to 100 
	 */
	
	for (int c = 0; c <= 100; c+= 2) {
		System.out.println(c);
	}
	
	/*Question 13
	 *Write a loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
	 */
	
	for (int d = 0; d <= 100; d++) {
		if (d % 2 == 0) {
			System.out.println(d + "EVEN");
	} else {
		System.out.println(d + "ODD");
	}

	/*Question 14
	 *Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
	 *divide each number by 3 and print the remainder to the console
	 */
	int e = 100;
	while (e > 0) {
		System.out.println(e + " " + (e % 3));
		e--;
	
	}
	
	
	
	
	
	
	
	}	
	
		
	}
		
		
	}		
		
		
	
		
		
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	


