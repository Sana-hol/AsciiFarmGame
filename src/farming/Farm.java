package farming;

import farmGame.Plantation;

public class Farm {
	private Plantation plantation;
	public Farm() {
		plantation = new Plantation(20, 20);
	}
	public PlantSpecie [] [] getPlants(){
		PlantSpecie[][]mat = new PlantSpecie[plantation.getRows()][plantation.getColumns()];
		for (int i=0; i<plantation.getRows(); i++) {
			for(int j=0 ; j<plantation.getColumns();j++){
				mat[i][j] = (PlantSpecie)plantation.plant(i, j);
			}
		}
		return mat;
	}
	

}
