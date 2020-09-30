import java.awt.Graphics;
import java.util.LinkedList;

public abstract class AstroObject implements Astromath{
	
	protected double mass;
	protected double radius;
	
	protected PVector position;
	protected PVector velocity;
	protected PVector acceleration;
	
	public AstroObject(double mass, double x, double y) {
		this.mass = mass;
		this.position = new PVector(x,y);
		this.velocity = new PVector(0,0);
		this.acceleration = new PVector(0,0);
	}
	
	//Mainly used for custom objects
	public AstroObject(double mass, double x, double y, double radius) {
		this.mass = mass;
		this.position = new PVector(x,y);
		this.velocity = new PVector(0,0);
		this.acceleration = new PVector(0,0);
		this.radius = radius;
	}
	
	public AstroObject(double x, double y) {
		this.position = new PVector(x,y);
		this.velocity = new PVector(0,0);
		this.acceleration = new PVector(0,0);
	}
	
	public AstroObject() {
		this.mass = 0;
		this.position = new PVector(0,0);
		this.velocity = new PVector(0,0);
		this.acceleration = new PVector(0,0);

	}
	
	public abstract void trace(Graphics g);
	
	public abstract void updatePosition(LinkedList<AstroObject> AstroObjects, Graphics g);
	
	public abstract double getMass();
	
	public abstract void setMass(double mass);
	
	public abstract double getXVelocity();
	
	public abstract double getYVelocity();
	
	public abstract void setVelocity(double xv, double vy);
	
	public abstract double getXAcceleration();
	
	public abstract double getYAcceleration();
	
	public abstract void setAcceleration(double ax, double ay);

	public abstract double getRadius();
	
	public abstract void setRadius(int radius);
	 
	public abstract void setBounds(double x, double y, double radius);
	 
	public abstract double getX();

	public abstract double getY();
	
	public abstract double getVelocity();

	public abstract double getCenterY();
	
	public abstract double getCenterX();


}
