import java.util.Scanner;

public class getInitials
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("\nPlease neter your full names:\t");
		String fullNames = s.nextLine();
		
		String[] separate = fullNames.split(" ");
		int size = separate.length;
		
		String initials = "";
		int index = 0;
		
		while(index < size -1)
		{
			initials += separate[index].charAt(0) +".";
			index++;
		}
		
		System.out.println("\nHello " + initials + " " + separate[size-1]);
	}
}