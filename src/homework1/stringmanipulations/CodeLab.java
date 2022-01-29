package homework1.stringmanipulations;

import java.util.Scanner;

public class CodeLab {

	public static void main(String[] args) {
		String name1, name2, name3;
		Scanner stdin= new Scanner(System.in);
		
		name1= stdin.nextLine();
		name2= stdin.nextLine();
		name3= stdin.nextLine();
		System.out.println(name1+","+" "+name2+","+" "+"and"+" "+name3);
		System.out.println(name1+","+" "+name3+","+" "+"and"+" "+name2);
		System.out.println(name2+","+" "+name1+","+" "+"and"+" "+name3);
		System.out.println(name2+","+" "+name3+","+" "+"and"+" "+name1);
		System.out.println(name3+","+" "+name2+","+" "+"and"+" "+name1);
		System.out.println(name3+","+" "+name1+","+" "+"and"+" "+name2);

	}

}
