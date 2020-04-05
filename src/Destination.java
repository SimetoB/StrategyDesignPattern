
public class Destination {

	private String name;
	private int teleportTax;
	private float timeToArrive;
	
	public Destination(String name, int teleportTax, float timeToArrive) {
		this.name = name;
		this.teleportTax = teleportTax;
		this.timeToArrive = timeToArrive;
	}

	public String getName() {
		return name;
	}

	public int getTeleportTax() {
		return teleportTax;
	}

	public float getTimeToArrive() {
		return timeToArrive;
	}

}
