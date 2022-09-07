package boardgame;

public class Position {
	private Integer row;
	private Integer column;

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return String.format("Position (%d, %d)", row, column);
	}
    
	
}