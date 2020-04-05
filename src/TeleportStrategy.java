
public class TeleportStrategy implements TravelStrategy {
	
	private String playerName;
	private int playerGold;
	private String desitnationName;
	private int teleportTax;

	public TeleportStrategy(Player player, Destination destination) {
		this.playerName = player.getName();
		this.playerGold = player.getGold();
		this.desitnationName = destination.getName();
		this.teleportTax = destination.getTeleportTax();
	}

	@Override
	public void travel() {
		if (playerGold >= teleportTax) {
			System.out.println("Player " + playerName + " decided to teleport to " + desitnationName
							   + ". He paid " + teleportTax + " gold to do so.");
		} else {
			System.out.println("Player " + playerName + " does not have enough gold and cannot teleport to destination!");
		}
	}

}
