package electronics;

public class Oppo extends Mobile implements CommonMethods {

	private String processorName;
	private String modelName;
	private String releaseDate;
	private String cameraPixel;

	public Oppo() {

		super();
		this.modelName = "Oppo";
		this.processorName = "pqr";
		this.cameraPixel = "12MP";
		this.releaseDate = "Jan'18";
	}

	public int batteryBackUps() {

		int batteryBackUp = 10;
		return batteryBackUp;
	}

	public void processor() {

		System.out.println("The processor is " + processorName + ".");
	}

	public void releaseDate() {

		System.out.println("The Release Date of Oppo Mobile is " + releaseDate);
	}

	public void camera() {

		System.out.println("The camera of Oppo Mobile is " + cameraPixel);
	}

	public boolean isDualSim() {

		return false;

	}

	public boolean isTouchScreen() {

		return true;
	}

}
