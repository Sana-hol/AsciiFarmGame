package farmGame;

public class Plant {
	protected Position position;
	private Plantation plantation;
	public Plant(Plantation plantation) {
		this.plantation = plantation;
		position = null;
	}
	protected Plantation getFarm() {
		return plantation;
	}
	

}
