package farming;

import farmGame.Plantation;
import farmGame.Plant;

public class PlantSpecie extends Plant{
	private PlantType plantType;

	public PlantSpecie(Plantation plantation, PlantType plantType) {
		super(plantation);
		this.plantType = plantType;
	}

	public PlantType getPlantType() {
		return plantType;
	}
	}

