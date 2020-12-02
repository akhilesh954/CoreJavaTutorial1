package CoreJavaTraing;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Akhilesh Jaiswal";
		String b="Akhilesh Jaiswal";
//	System.out.println(a.charAt(3));
//	System.out.println(a.indexOf("Z")); 
	/// if any any Character is not available in string the this will print -1 value.
//	System.out.println(a.substring(0, 6));
//	System.out.println(a.concat("AJay Jaiswal"));
//	System.out.println(a.length());
//	System.out.println(a.trim());
	a.toUpperCase();
	a.toLowerCase();
	// Split
	String arr[]=b.split("a");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	// Replace the char in String
	System.out.println(b.replace("J", "K"));
	}

}
