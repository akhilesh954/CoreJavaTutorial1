package CoreJavaTraing;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[][]= new int[2][3];
		int a[][]= {{1,2,3},{4,5,6},{6,7,8}};
		int sum;
a[0][0]=1;
a[0][1]=2;
a[0][2]=3;

a[1][0]=4;
a[1][1]=5;
a[1][2]=6;

a[2][0]=7;
a[2][1]=8;
a[2][2]=9;

//System.out.println(a[2][2]);
//sum=a[2][2]+a[0][1];
for(int i=0; i<3; i++)
{
	for(int j=0; j<3; j++)
	{
		System.out.println(a[i][j]);
	}
}

//System.out.println(sum);

	}

}
