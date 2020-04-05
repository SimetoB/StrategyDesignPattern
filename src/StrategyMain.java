
public class StrategyMain {

	public static void main(String[] args) {
		Player player1 = new Player("Ivan", true, 30);
		Player player2 = new Player("Peter", false, 0);
		Player player3 = new Player("Stamat", true, 50);
		
		Destination destination1 = new Destination("Home town", 5, 5);
		Destination destination2 = new Destination("PvP sector", 30, 20);
		
		WalkStrategy walkStrategy = new WalkStrategy(player2, destination1);
		walkStrategy.travel();
		
		RideHorseStrategy rideHorseStrategy1 = new RideHorseStrategy(player1, destination2);
		rideHorseStrategy1.travel();
		RideHorseStrategy rideHorseStrategy2 = new RideHorseStrategy(player2, destination2);
		rideHorseStrategy2.travel();
		
		TeleportStrategy teleportStrategy1 = new TeleportStrategy(player3, destination2);
		teleportStrategy1.travel();
		TeleportStrategy teleportStrategy2 = new TeleportStrategy(player2, destination1);
		teleportStrategy2.travel();		
	}

}
