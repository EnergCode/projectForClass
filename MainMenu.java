package forProject;

import java.util.Scanner;

public class MainMenu
{
	public MainMenu()
	{
		
	}
	public void displayMenuOptions()
	{
		int selectedOption;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(
					"What would you like to do today?" +
					"\n1. Create a new account" +
					"\n2. Access an existing account" + 
					"\nSelect Optiion 1 or 2"
					);
			selectedOption = scan.nextInt();
		}while(selectedOption != 1 || selectedOption != 2);
		scan.close();
		if(selectedOption == 1)
		{
			createNewAccount();
		}
		else if(selectedOption == 1)
		{
			accessExistingAccount();
		}
		
	}
	private void createNewAccount()
	{
		
	}
	private void accessExistingAccount()
	{
		
	}
}
