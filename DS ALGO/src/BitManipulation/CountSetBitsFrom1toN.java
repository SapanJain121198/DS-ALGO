package BitManipulation;

public class CountSetBitsFrom1toN {
	
//Decimal	E	D	C	B	A
	//	0	0	0	0	0	0
	//	1	0	0	0	0	1
	//	2	0	0	0	1	0
	//	3	0	0	0	1	1
	//	4	0	0	1	0	0
	//	5	0	0	1	0	1
	//	6	0	0	1	1	0
	//	7	0	0	1	1	1
	//	8	0	1	0	0	0
	//	9	0	1	0	0	1
	//	10	0	1	0	1	0
	//	11	0	1	0	1	1
	//	12	0	1	1	0	0
	//	13	0	1	1	0	1
	//	14	0	1	1	1	0
	//	15	0	1	1	1	1
	//	16	1	0	0	0	0
//	Notice that,
//
//	Every alternate bits in A are set.
//	Every 2 alternate bits in B are set.
//	Every 4 alternate bits in C are set.
//	Every 8 alternate bits in D are set.
//	…..
//	This will keep on repeating for every power of 2.
	
	
//	So, we will iterate till the number of bits in the number. And we don’t have to iterate every single number in the range from 1 to n.
//	We will perform the following operations to get the desired result.
//
//	The quotient when n+1 is divided by 2 will return the number of times the 0,1 pattern has appeared at LSB.
//	Similarly the quotient when n+1 is divided by 4 will return the number of times the 0,0,1,1 pattern has appeared at 2nd least significant bit and so on.

	public static void main(String[] args) {
		System.out.println(CountSetBitsFrom1toN.countSetBits(6));
	}

	public static int countSetBits(int n) {
		
		int bits = (int) Math.ceil((Math.log10(n) / Math.log10(2)));
		int totalCount = 0;
		n=n+1;
		for (int i = 1; i <= bits; i++) {

			int repeatSetSize = (int) Math.pow(2, i);

			totalCount += (n / repeatSetSize) * (repeatSetSize / 2);

			if (n % repeatSetSize != 0) {
				if ((n % repeatSetSize) > (repeatSetSize / 2)) {
					totalCount += n % repeatSetSize - repeatSetSize / 2;
				}
			}

		}
		return totalCount;
	}

// O(N) 
//	public static int countSetBits(int n) {
//
//		int count = 0;
//
//		for (int i = 1; i <= n; i++) {
//
//			int j = i;
//
//			while (j != 0) {
//				j = j & (j - 1);
//				count++;
//			}
//		}
//		return count;
//	}

}
