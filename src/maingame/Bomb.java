package maingame;


public class Bomb  extends BaseObject{
        private double x,y,radius;
    private boolean isAlive;
    Bomb(double x, double y, double radius) {
			super(x, y, radius);
		this.x =x;
		this.y = y;
		this.radius = radius;
		isAlive = true;
	}
}