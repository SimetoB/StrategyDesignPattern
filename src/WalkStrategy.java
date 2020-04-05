
public class WalkStrategy implements TravelStrategy {

	private String playerName;
	private String desitnationName;
	private float timeToArrive;
	
	public WalkStrategy(Player player, Destination destination) {
		this.playerName = player.getName();
		this.desitnationName = destination.getName();
		this.timeToArrive = destination.getTimeToArrive();
	}

	@Override
	public void travel() {
		System.out.println("Player " + playerName + " decided to walk to " + desitnationName + ". It took him " + timeToArrive + " minutes." );
	}

}
