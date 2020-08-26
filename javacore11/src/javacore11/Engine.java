package javacore11;

public class Engine{
	
	int amountOfCylinders;

	public Engine(int amountOfCylinders) {
		super();
		this.amountOfCylinders = amountOfCylinders;
	}
	
	public int getAmountOfCylinders() {
		return amountOfCylinders;
	}

	public void setAmountOfCylinders(int amountOfCylinders) {
		this.amountOfCylinders = amountOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [amountOfCylinders=" + amountOfCylinders + "]";
	}
	
}
