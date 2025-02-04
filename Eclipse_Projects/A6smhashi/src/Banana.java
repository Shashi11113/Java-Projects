// Sadam Hashi, smhashi, CIS 340, A6

public class Banana {
	
	//Creating the fields/variables for this class
	private double length;
    private int peelThickness;
    private double percentLeft;

    //Two constructors to initialize the percentLeft variable
    public Banana() 
    {
        this.percentLeft = 100.0;
    }

    public Banana(double length) 
    {
        this.percentLeft = 100.0;
        this.length = length;
    }
    
    //Creating setters and getters methods for the class variables
    public double getLength() 
    {
        return length;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

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

    //Method used to reflect how much of the apple was eaten
    public void eat(double eatenAmount) 
    {
        this.percentLeft -= eatenAmount;
    }
	

}
