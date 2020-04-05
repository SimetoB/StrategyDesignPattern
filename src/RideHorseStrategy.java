
public class RideHorseStrategy implements TravelStrategy {
	
	private String playerName;
	private boolean playerHasHorse;
	private String desitnationName;
	private float timeToArrive;

	public RideHorseStrategy(Player player, Destination destination) {
		this.playerName = player.getName();
		this.playerHasHorse = player.hasHorse();
		this.desitnationName = destination.getName();
		this.timeToArrive = destination.getTimeToArrive();
	}

	@Override
	public void travel() {
		if (playerHasHorse) {
			System.out.println("Player " + playerName + " decided to ride his horse to " + desitnationName
								+ ". It took him " + timeToArrive / 5 + " minutes.");			
		} else {
			System.out.println("Player " + playerName + " does not have a horse and cannot ride to destination!");
		}

	}

}
