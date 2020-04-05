
public class Player {
	
	private String name;
	private boolean horse;
	private int gold;
	
	public Player (String name, boolean horse, int gold) {
		this.name = name;
		this.horse = horse;
		this.gold = gold;
	}

	public String getName() {
		return name;
	}

	public boolean hasHorse() {
		return horse;
	}

	public int getGold() {
		return gold;
	}
	
	
}
