/**
 * 
 */
package dsAlgoInJava;

/**
 * @author ipallavi
 *
 */
public class PalindromicPermutation {

	/**
	 * @param args
	 */
	public static boolean palindromicPermutation(String s) {
		int[] char_counts = new int[128];
		if(s.length()<0) {
			return false;
		}
		for(int i =0; i <s.length(); i++) { 
			char_counts[s.charAt(i)]++;
		}
		int count = 0;
		for(int i=0; i< 128; i++) {
			count += char_counts[i] %2;
		}
		
		System.out.println(count<=1);
		return count<=1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromicPermutation("bbb");
	}

}
