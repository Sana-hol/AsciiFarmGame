package farmGame;

public class Plantation {
	private int rows;
	private int columns;
	private Plant [][] plants;
	public Plantation(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		plants = new Plant [rows][columns];
		
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public Plant plant(int row, int column) {
		return plants[row][column];
	}
	public Plant getPlant(Position position) {
		return plants[position.getRow()][position.getColumn()];
			
			}
		}

