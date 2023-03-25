package exercise;

// BEGIN
public class Cottage implements Home {
	private double area;
	private int floorCount;
	
	public Cottage(double area, int floorCount) {
		this.area = area;
		this.floorCount = floorCount;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public String toString() {
		return this.floorCount + " этажный коттедж площадью " + this.area + " метров"; 
	}
	
	public int compareTo() {
		return 0;
	}
	
	public int compareTo(Home another) {
		if (this.getArea() == another.getArea()) return 0;
		if (this.getArea() > another.getArea()) return 1;
		else return -1;
	}
}
// END
