/**
	* This class allows you to create an object car with parameters make, model, year and price. There are getters for all variables and you can set the make, model, year, and price with the setter methods.
	* @author Jerry Zhu
	* @version 1.0.0
	*/
public class Car {

private String make;
private String model;
private int year;
private double price;

/**
	 * This constructor initializes an object Car with parameters make, model, year and price.
	 * @param make a String that represents to the make of the Car
	 * @param model a String that represents to the model fo the Car
     * @param year refers to the year that the Car was made
     * @param price a double referring to the price that the car is selling for
	 */
    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    /**
     * This method gets the make of the Car 
     * @return returns the make of the Car as a String
     */
    public String getMake(){
        return this.make;
    }

    /**
     * This method gets the model of the Car 
     * @return returns the model of the Car as a String
     */
    public String getModel(){
        return this.model;
    }

    /**
     * This method gets the Year that the car was made 
     * @return returns the Year that the car was made as a int
     */
    public int getYear(){
        return this.year;
    }
    
    /**
     * This method gets the price of the car 
     * @return returns the price of the car as a double
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * This method sets the Car's make to a provided String
     * @param newMake A String that the current make is to be replaced with 
     */
    public void setMake(String newMake){
        this.make = newMake;
    }

    /**
     * This method sets the Car's model to a provided String
     * @param newModel A String that the current model is to be replaced with 
     */
    public void setModel(String newModel){
        this.model = newModel;
    }

    /**
     * This method sets the year that the car was made to a provideded int
     * @param newYear The year that the current year is to be replaced with 
     */
    public void setYear(int newYear){
        this.year = newYear;
    }

    /**
     * This method sets the Car's price to a provided double
     * @param newPrice A double that the current price is to be replaced with 
     */
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
}