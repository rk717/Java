class Greeting2 {
	public static void main( String[] args ){
		if (args.length != 1){
			System.err.println("you did not enter a name.");
			System.exit(1);
		} else {
			System.out.println("Hello " + args[0] + "!");
		}	
	}
}
