package exercise;

// BEGIN
public class Flat implements Home {
	private double area;
	private double balconyArea;
	private int floor;

	public Flat(double area, double balconyArea, int floor) {
		this.area = area;
		this.balconyArea = balconyArea;
		this.floor = floor;
	}

	
	public double getArea() {
		return this.area + this.balconyArea;
	}
	
	public int compareTo() {
		return 0;
	}
	
	public int compareTo(Home another) {
		if (this.getArea() == another.getArea()) return 0;
		if (this.getArea() > another.getArea()) return 1;
		else return -1;
	}

	public String toString() {
		return "Квартира площадью " + this.getArea() + " метров на " + this.floor + " этаже";
	}
}
// END
