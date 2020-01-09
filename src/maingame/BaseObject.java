package maingame;



public abstract class BaseObject {

    private double x,y,radius;
    private boolean isAlive;
    BaseObject(double x, double y, double radius){
    	this.x = x;
    	this.y = y;
    	this.radius = radius;
    	isAlive  = true;
    	
    }
    public void draw(){
        
    }
    public void move(){
        
    }
    public void die(){
        isAlive = false;
    }
    
    public boolean intersects(BaseObject o){
                double dx = x - o.x;
        double dy = y - o.y;
        double destination = Math.sqrt(dx * dx + dy * dy);
        double destination2 = Math.max(radius, o.radius);
        return destination <= destination2;
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
