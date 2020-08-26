package javacore11;

public class SteeringWheel{
	
	int wheelsSize;
	String SteeringWheelMaterial = "alcantara";
	
	public SteeringWheel(int wheelsSize, String steeringWheelMaterial) {
		super();
		this.wheelsSize = wheelsSize;
		SteeringWheelMaterial = steeringWheelMaterial;
	}

	public int getWheelsSize() {
		return wheelsSize;
	}

	public void setWheelsSize(int wheelsSize) {
		this.wheelsSize = wheelsSize;
	}

	public String getSteeringWheelMaterial() {
		return SteeringWheelMaterial;
	}

	public void setSteeringWheelMaterial(String steeringWheelMaterial) {
		SteeringWheelMaterial = steeringWheelMaterial;
	}

	@Override
	public String toString() {
		return "SteeringWheel [wheelsSize=" + wheelsSize + ", SteeringWheelMaterial=" + SteeringWheelMaterial + "]";
	}
	
	
	

}
