class Odd {
	public static void main( String[] args ){
		if( args.length != 1 ){
			System.err.println("Enter exactly one number on the command line!");
		} else {
			int num = Integer.parseInt(args[0]);
			//String answer = (num % 2 != 0) ? "páratlan" : "páros";
			String answer = ((num & 1) != 0) ? "páratlan" : "páros";
			System.out.println( answer );
		}
	}
}
