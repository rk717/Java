public class BitsTry{
	public static void main( String[] args ){
		int pos=1;
		short bitmask = 0;
		bitmask |= (1 << pos);
		System.out.println(Integer.toBinaryString(bitmask));
		System.out.println(Integer.toBinaryString(pos | bitmask));
	
	}
}