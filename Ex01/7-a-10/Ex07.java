public class Ex07 {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		Rectangle rect1 = new Rectangle();
		rect1.set_lenght(10);
		rect1.set_height(10);;
		System.out.println(rect1.calculateArea());
		System.out.println(rect1.calculatePerimeter());
	}

}

class Rectangle {
	private double lenght;
	private double height;

	public void set_lenght(double lenght){
		this.lenght = lenght;

	}
	public void set_height(double height){
		this.height = height;
	}
	
	public double calculateArea(){
		return this.height * this.lenght;
	}
	public double calculatePerimeter() {
		return 2 * this.height + 2 * this.lenght;
	}

}
