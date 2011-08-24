class Rectangle extends Shape{
	protected  int width, height;
	public Rectangle(int w, int h) {
		width = w;
		height = h; 
	}
	public double area() {
		return width*height; 
	}
	public double circumference() {
		return 2*(width+height); 
	} 
}