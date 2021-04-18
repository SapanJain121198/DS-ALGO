package BitManipulation;

public class CountSetBits {

	public static void main(String[] args) {
		System.out.println(CountSetBits.setBits(3));
	}

	static int setBits(int N) {
		int count = 0;

		while (N / 2 != 0) {
			if (N % 2 == 1) {
				count++;
			}
			N = N / 2;
		}
		count++;
		return count;
	}

//=======================================================

//	static int countSetBits(int n)
//    {
//        int count = 0;
//        while (n > 0) {
//            count += n & 1;
//            n >>= 1;
//        }
//        return count;
//    }

//=======================================================	

//	 // recursive function to count set bits
//    public static int countSetBits(int n)
//    {
//
//        // base case
//        if (n == 0)
//            return 0;
//
//        else
//
//            // if last bit set add 1 else add 0
//            return (n & 1) + countSetBits(n >> 1);
//    }

//=======================================================
	/**
	 * Brian Kernighan's Algorithm: Subtracting 1 from a decimal number flips all
	 * the bits after the rightmost set bit(which is 1) including the rightmost set
	 * bit. for example : 10 in binary is 00001010 9 in binary is 00001001 8 in
	 * binary is 00001000 7 in binary is 00000111 So if we subtract a number by 1
	 * and do bitwise & with itself (n & (n-1)), we unset the rightmost set bit. If
	 * we do n & (n-1) in a loop and count the no of times loop executes we get the
	 * set bit count. The beauty of this solution is the number of times it loops is
	 * equal to the number of set bits in a given integer.
	 * 
	 **/

//	static int countSetBits(int n)
//    {
//        int count = 0;
//        while (n > 0) {
//            n &= (n - 1);
//            count++;
//        }
//        return count;
//    }

// Implementation of kernighan algo using rsbm
	
//	static int countSetBits(int n) {
//
//		int count = 0;
//		while (n > 0) {
//			int rsbm = n & -n;
//			n -= rsbm;
//			count++;
//		}
//		return count;
//	}

//	// recursive function to count set bits
//    public static int countSetBits(int n)
//    {
//
//        // base case
//        if (n == 0)
//            return 0;
//        else
//            return 1 + countSetBits(n & (n - 1));
//    }

	/**
	 * 3. Using Lookup table: We can count bits in O(1) time using lookup table.
	 * Please see
	 * http://graphics.stanford.edu/~seander/bithacks.html#CountBitsSetTable for
	 * details.
	 * 
	 **/

	/**
	 * In GCC, we can directly count set bits using __builtin_popcount(). So we can
	 * avoid a separate function for counting set bits.
	 * 
	 **/

//	System.out.println(Integer.bitCount(4));

// https://practice.geeksforgeeks.org/problems/set-bits0143/1
}
