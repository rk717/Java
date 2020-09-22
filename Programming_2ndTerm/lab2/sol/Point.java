class Point {
	double x, y;
	void move( double dx, double dy ){
		x += dx;
		y += dy;
	}
	void mirror( double cx, double cy ){
		x = 2*cx-x;
		y = 2*cy-y;
	}
	
	void mirror( Point c ){
		x = 2*c.x-x;
		y = 2*c.y-y;
	}
	double distance( Point that ){
		double dx = x - that.x,
		       dy = y - that.y;
		return Math.sqrt( dx*dx + dy*dy );
	}
	static double getDistance(Point p1,Point p2){
		double dx =p1.x- p2.x,
		       dy = p1.y - p2.y;
		return Math.sqrt( dx*dx + dy*dy );
	}
	
}