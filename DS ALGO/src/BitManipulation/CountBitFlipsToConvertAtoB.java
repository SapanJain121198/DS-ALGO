package BitManipulation;

public class CountBitFlipsToConvertAtoB {

	public static void main(String[] args) {
		System.out.println(CountBitFlipsToConvertAtoB.countBitsFlip(20, 25));
	}

	public static int countBitsFlip(int a, int b) {
		int count = 0;
		while (a != 0 || b != 0) {
			if (a % 2 != b % 2) {
				count++;
			}
			a = a / 2;
			b = b / 2;
		}
		return count;
	}
	
	
//	 1. Calculate XOR of A and B.      
//      a_xor_b = A ^ B
	
//	 2. Count the set bits in the above 
//      calculated XOR result.
//      countSetBits(a_xor_b)	
	
//	// Function that count set bits
//    public static int countSetBits(int n)
//    {
//        int count = 0;
//        while (n != 0) {
//            count++;
//            n &=(n-1);
//        }
//        return count;
//    }
// 
//    // Function that return count of
//    // flipped number
//    public static int FlippedCount(int a, int b)
//    {
//        // Return count of set bits in
//        // a XOR b
//        return countSetBits(a ^ b);
//    }
}
