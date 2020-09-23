
public class Main {

	public static void main(String[] args) {
		
		Bank jrt = new Bank("JRT Bank Co.");
		
		Client ryan = new Client("Ryan", "Lu", 12, "678-234-5922", "32-343-3434", "Reed Hall");
		Client josh = new Client("Josh", "Ng", 9, "770-234-3843", "56-343-4534", "Payne Hall");
		Client tyler = new Client("Tyler", "Gise", 21, "678-221-3222", "32-919-3564", "Russell Hall");
		
		Account acc1 = new Account(ryan, 6_500_000.00);
		Account acc2 = new Account(josh, 5_200_000.00);
		Account acc3 = new Account(tyler, 4_500_555.00);
		
		jrt.addAccount(acc1);
		jrt.addAccount(acc2);
		jrt.addAccount(acc3);
		
		System.out.println(acc1);
		System.out.println(acc2);
	
		acc1.transfer(acc2, 78787);
		
		System.out.println(acc1);
		System.out.println(acc2);
		
		/*
		 * Enter your Name
		 * Enter DOB.....
		 * 
		 * -> The code creates a new Client
		 * 
		 * What do you want to do? Open an ACcount
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
