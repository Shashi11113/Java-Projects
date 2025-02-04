// Sadam Hashi, smhashi, CIS 340, MP2

public class Device {
	//Declared class variables
    private String sku;
    private String name;
    private boolean available;

    //Default constructor
    public Device() {}
    //Main constructor that takes has 3 parameters
    public Device(String sku, String name, boolean available) 
    {
        this.sku = sku;
        this.name = name;
        this.available = available;
    }

    //Getter and Setter methods in order to use this class's fields
    public String getSku() 
    {
        return sku;
    }

    public String getName() 
    {
        return name;
    }
   
    public boolean getAvailable() 
    {
        return available;
    }

    public void setSku(String sku)
    {
    	this.sku =  sku;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAvailable(boolean available) 
    {
        this.available = available;
    }

    //Checks the status of the device
    public String status() 
    {
        if (available) 
        {
            return "Available";
        } 
        else 
        {
            return "Checked out";
        }
    }

}
