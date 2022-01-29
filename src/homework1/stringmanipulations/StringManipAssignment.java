package homework1.stringmanipulations;

public class StringManipAssignment {

	public static void main(String[] args) {
		String name = "Rachid ALANE";
		String ID = "30391NY";
		System.out.println(name +" "+ ID);
		System.out.println(name.contains(ID));
		System.out.println(name.contains("r"));
		System.out.println(ID.contains("39"));
		System.out.println(ID.isBlank());
		System.out.println(ID.lastIndexOf("Y"));
		System.out.println(ID.length());
		System.out.println(name.indexOf("A"));
		System.out.println(name.replace('a', 'i'));
		System.out.println(name.replaceAll(name, "ALANE RICHARD"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(ID.concat(name));
		System.out.println(name.replace("L", "M"));
		
	}
}
