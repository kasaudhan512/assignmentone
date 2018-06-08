package electronics;

public class Xiaomi extends Mobile implements CommonMethods{
	
	private String processorName;
	private String modelName;
	private String releaseDate;
	private String cameraPixel;
	
	public Xiaomi() {
		
		super();
		this.modelName = "Xiaomi";
		this.processorName = "xyz";
		this.cameraPixel = "24MP";
		this.releaseDate = "June'18";
	}
	
	public int batteryBackUps() {
	
		int batteryBackUp = 20;
		return batteryBackUp;
	}
	
	public void processor() {
		
		System.out.println("The processor is "+ processorName + ".");
	}
	
	public void releaseDate() {
		
		System.out.println("The Release Date of Xiaomi Mobile is " + releaseDate);
	}
	
	public void camera() {
	
		System.out.println("The camera of Xiaomi Mobile is " + cameraPixel);
	}
	
	public boolean isDualSim() {
		
		return true;
		
	}
	
	public boolean isTouchScreen() {
		
		return true;
	}

}
