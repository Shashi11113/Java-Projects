// Sadam Hashi, smhashi, CIS 340, A6

public class Apple {
	
	//Creating the fields/variables for this class
	private int peelThickness;
    private double percentLeft;
    private double radius;

    //Two constructors to initialize the percentLeft variable
    public Apple() 
    {
        this.percentLeft = 100.0;
    }

    public Apple(double radius) 
    {
        this.percentLeft = 100.0;
        this.radius = radius;
    }
    
    //Creating setters and getters methods for the class variables 
    public int getPeelThickness() 
    {
        return peelThickness;
    }

    public void setPeelThickness(int peelThickness) 
    {
        this.peelThickness = peelThickness;
    }

    public double getPercentLeft() 
    {
        return percentLeft;
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    //Method used to reflect how much of the apple was eaten
    public void eat(double eatenAmount) {
    	
        this.percentLeft -= eatenAmount;
    }
	
	
}
