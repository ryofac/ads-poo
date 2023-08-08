public class Ex07 {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		Rectangle rect1 = new Rectangle();
		rect1.lenght = 10;
		rect1.height = 10;
		System.out.println(rect1.calculateArea());
		System.out.println(rect1.calculatePerimeter());
	}

}

class Rectangle {
	double lenght;
	double height;
	
	public double calculateArea(){
		return this.height * this.lenght;
	}
	public double calculatePerimeter() {
		return 2 * this.height + 2 * this.lenght;
	}

}
