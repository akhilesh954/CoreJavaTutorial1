package CoreJavaTraing;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// for(int i=0; i<4;i++) //outer loop
// {
//	 System.out.println("Outer Lop");
//	 for(int j=0; j<4; j++) // inner loop
//	 {
//		 System.out.println("Inner loop Finshed");// Nested Loop
//	 }
// }
		for(int i=0; i<=4;i++) //outer loop
			{
			System.out.println("Inner loop Started");
				 for(int j=1; j<=4-i; j++) // inner loop
				 {	
					 System.out.println("Inner loop");
				 }
				System.out.println("Outerloop finished");
}
	}
}
