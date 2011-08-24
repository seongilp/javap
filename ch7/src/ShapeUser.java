class ShapeUser {
	public static void main(String arg[]) {
		Rectangle r1 = new Rectangle(4,5);
		Circle c1 = new Circle(7);
		System.out.println
		("r1의 너비 = "	+ r1.area());
		System.out.println
		("r1의 둘레 = " + r1.circumference());
		System.out.println
		("c1의 너비 = "	+ c1.area());
		System.out.println
		("c1의 둘레 = " + c1.circumference());
	}
}