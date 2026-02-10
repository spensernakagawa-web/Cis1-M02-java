/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
     public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your name");
	String firstName = input.next();
double randomDouble = Math.random();
int randomInt = (int) Math.random();
char charTest = 'a';
int charAsciiValue = (int) charTest;
System.out.println("Please enter the first initial of your last name");
char lastInitial = input.next().charAt(0);
int stringlength = firstName.length();
String summary = ("Hello" + " " + firstName + " " + lastInitial + ".");
System.out.println(summary);
char firstinitial = firstName.charAt(0);
int length = firstName.length();
char lastinitial = firstName.charAt(length - 1);

	}
}
