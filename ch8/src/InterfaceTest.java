class Shape1{
	protected int x = 0;
	protected int y = 0;
	Shape1(){
		this(0, 0);
	}
	Shape1(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Circle1 extends Shape1 implements Drawable{
	protected int radius;
	int BOLD_PEN = 20;
	Circle1(int x, int y, int radius){
		super(x,y);
		this.radius = radius;
	}
 public void draw(){
	System.out.println
	("x = " + x + ", y = " + y + "  radius = " + radius);
	}
	public void move(int x, int y){
		System.out.println
		("x = " + (this.x + x) + ", y = " + (this.y + y) + "  radius = " + radius);
	}
}
class Rectangle1 extends Shape1 
implements Drawable{
	protected int width;
	protected int height;
	Rectangle1
	(int x, int y, int width, int height){
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void draw(){
		System.out.println("x = " + x + ", y = " + y + "  width = " + width + ", height = " + height);
	}
	public void move(int x, int y){
		System.out.println("x = " + (this.x + x) + ", y = " + (this.y + y) + "  width = " + width + ", height = " + height);
	}
}
class InterfaceTest{
	public static void main(String args[]){
		Drawable c = new Circle1(10, 10, 100);
		Drawable  r = new Rectangle1(20, 20, 50, 50);
		c.draw(); 
		c.move(5,5);
		r.draw();
		r.move(5,10);
		System.out.println(((Rectangle1)r).width);
		System.out.println(((Circle1)c).radius);
	}
}