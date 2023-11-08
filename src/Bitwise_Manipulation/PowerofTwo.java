package Bitwise_Manipulation;

public class PowerofTwo {
	static  public boolean isPowerOfTwo(int x)
	{
		return(x !=0) && ((x&(x-1))==0);
	}

	public static void main(String[] args) {
	System.out.println(isPowerOfTwo(10));

	}

}
