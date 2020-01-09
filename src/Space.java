

import java.util.*;

public class Space {
    public void run(){
        
    }
    public void draw(){
        
    }
    public void sleep(int ms){
        
    }

	private int height, width;
	private Spaceship ship;
	private List<Ufo> ufos = new ArrayList<>();
	private List<Rocket> rockets = new ArrayList<>();
	private List<Bomb> bombs = new ArrayList<>();

	public Space(int width, int height) {
		super();
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public Spaceship getShip() {
		return ship;
	}

	public List<Ufo> getUfos() {
		return ufos;
	}

	public List<Rocket> getRockets() {
		return rockets;
	}

	public List<Bomb> getBombs() {
		return bombs;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setShip(Spaceship ship) {
		this.ship = ship;
	}

	public void setUfos(List<Ufo> ufos) {
		this.ufos = ufos;
	}

	public void setRockets(List<Rocket> rockets) {
		this.rockets = rockets;
	}

	public void setBombs(List<Bomb> bombs) {
		this.bombs = bombs;
	}

	public static void main(String[] args) {

	}
}

