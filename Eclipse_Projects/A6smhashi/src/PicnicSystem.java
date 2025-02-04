// Sadam Hashi, smhashi, CIS 340, A6

public class PicnicSystem {

	public static void main(String[] args) {
		
		//Creates a instance of PinicSystem class and then calls the makeFruitBaskets method
		PicnicSystem myPicnicSystem = new PicnicSystem();
        myPicnicSystem.makeFruitBaskets();
		

	}
	
	//Creating two objects of the fruitBasket type, and it references fruitBasket class
	private void makeFruitBaskets() 
	{
        FruitBasket basket1 = new FruitBasket();
        FruitBasket basket2 = new FruitBasket();

        basket1.setBasketName("Weekend");
        basket2.setBasketName("Weekday");

       basket1.makeFruits();
        basket1.eatFruits();

        basket2.makeFruits();
        basket2.eatFruits();
    }

}
