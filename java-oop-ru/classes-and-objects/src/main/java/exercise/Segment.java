package exercise;

// BEGIN
public class Segment {
	Point x;
	Point y;
	
	public Segment(Point x, Point y) {
		this.x = x;
		this.y = y;
	}

	public Point getBeginPoint() {
		return this.x;
	}

	public Point getEndPoint() {
		return this.y;
	}

	public Point getMidPoint() {
		return new Point((this.x.getX() + this.y.getX())/2, (this.x.getY() + this.y.getY())/2);
	}
}
// END
