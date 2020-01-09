package maingame;


public class Rocket  extends BaseObject{
    private double x,y,radius;
    private boolean isAlive;
    Rocket(double x, double y, double radius) {
		super(x, y, radius);
		this.x =x;
		this.y = y;
		this.radius = radius;
		isAlive = true;
	}
}