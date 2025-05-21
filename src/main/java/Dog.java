/**
	* This class allows you to create an object dog with parameters name, breed and weight. There are getters for all variables and you can set the name, weight, and height with the setter methods.
	* @author Jerry Zhu
	* @version 1.0.0
	*/

class Dog{

//instance variables    
private String name;
private String breed;
private int weight;

/**
	 * This constructor initializes an object Dog with parameters name, breed and weight.
	 * @param name a String that represents to the name of the dog
	 * @param breed a String that represents to the breed of the dog
     * @param weight refers to the weight of the dog 
	 */
public Dog(String name, String breed, int weight){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}

/**
 * This method gets the name of the dog 
 * @return returns the name of the dog as a String
 */
public String getName(){
	return this.name;
}

/**
 * This method gets the breed of the dog 
 * @return returns the breed of the dog as a String
 */
public String getBreed(){
	return this.breed;
}

/**
 * This method gets the weight of the dog 
 * @return returns the name of the dog as an int
 */
public int getWeight(){
	return this.weight;
}

/**
 * This method sets the dog's name to a provided String
 * @param name A String that the current name is to be replaced with 
 */
public void setName(String name) {
	this.name = name;
}

/**
 * This method sets the dog's breed to a provided String
 * @param breed A String that the current breed is to be replaced with 
 */
public void setBreed(String breed) {
	this.breed = breed;
}

/**
 * This method sets the dog's weight to a provided int
 * @param weight The dog's new weight value 
 */
public void setWeight(int weight) {
	this.weight = weight;
}

}