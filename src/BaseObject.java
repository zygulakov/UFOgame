
public abstract class BaseObject {

    protected double x,y,radius;
    protected boolean isAlive;
    BaseObject(double x, double y, double radius){
    	this.x = x;
    	this.y = y;
    	this.radius = radius;
    	isAlive  = true;
    	
    }
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
    

	
}
