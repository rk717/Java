class Half {
    public static void main( String[] args ){
		/* either this solutiuon by args
		if (args.length != 2){
			System.err.println("you did not enter two numbers.");
			System.exit(1);
		}
		else{
        int from, to;

		from=Integer.parseInt(args[0]);
		to=Integer.parseInt(args[1]);
        System.out.print( from + " és " + to + " között a számok fele:\n\n" );
        
        for( int idx = from; idx <= to; ++idx ){
            System.out.print( idx + " fele " + idx / 2.0 + "\n" );
        }
    	} */
	
		/* or this solution
		int from, to;

        //System.out.print(  );
        from = Integer.parseInt( System.console().readLine("Kérem az alsó határt: "));
        //System.out.print(  );
        to   = Integer.parseInt( System.console().readLine("Kérem a felső határt: "));

        System.out.print( from + " és " + to + " között a számok fele:\n\n" );
        
        for( int idx = from; idx <= to; ++idx ){
            System.out.print( idx + " fele " + idx / 2.0 + "\n" );
        } */
	}
}

