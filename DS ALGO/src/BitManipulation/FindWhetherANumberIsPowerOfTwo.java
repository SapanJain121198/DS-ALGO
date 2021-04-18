package BitManipulation;
import java.security.KeyStore.TrustedCertificateEntry;

public class FindWhetherANumberIsPowerOfTwo {

	public static void main(String[] args) {
		System.out.println(FindWhetherANumberIsPowerOfTwo.isPowerofTwo(15));
	}

	public static boolean isPowerofTwo(long n) {

		if (n == 0)
			return false;

		if ((n & (n - 1)) != 0) {
			return false;
		}
		return true;
		
		
		// we can do this to handle case of 0 in one line
		//  n & (! n&(n-1) )
	}
	
//	static boolean isPowerOfTwo(int n)
//	{
//	    if(n==0)
//	    return false;
//	 
//	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
//	       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
//	}
	
//NOTE :- to create 2 ** x ===> (1 << x)

}
