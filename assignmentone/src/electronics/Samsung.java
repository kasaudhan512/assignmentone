package electronics;

public class Samsung extends Mobile implements CommonMethods {

	private String processorName;
	private String modelName;
	private String releaseDate;
	private String camera;
	
	public Samsung() {
		
		super();
		this.modelName = "Samsung";
		this.processorName = "abc";
		this.camera = "20MP";
		this.releaseDate = "Dec'18";
	}
	
	public int batteryBackUps() {
	
		int batteryBackUp = 5;
		return batteryBackUp;
	}
	
	public void processor() {
		
		System.out.println("The processor is "+ processorName + ".");
	}
	
	public void releaseDate() {
		
		System.out.println("The Release Date of Samsung Mobile is " + releaseDate);
	}
	
	public void camera() {
	
		System.out.println("The camera of Samsung Mobile is " + camera);
	}
	
	public boolean isDualSim() {
		
		return false;
		
	}
	
	public boolean isTouchScreen() {
		
		return false;
	}
}
