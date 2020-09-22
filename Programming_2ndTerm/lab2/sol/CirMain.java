class CircleMain{
	public static void main( String[] args ){
		Circle c = new Circle ();
		c.x = 2;
		c.y = 3;
		c.radius=5;

		c.enlarge(5);
		System.out.println(c.radius);
		
	}
}
