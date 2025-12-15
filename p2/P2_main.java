package p2;

public class P2_main {
	// static public int[][] grid = new int[3][3];
	public static int[][] grid = { { 0, -1, 0 }, { 0, 0, 0 }, { -1, 0, 0 } };

	public static void main(String[] args) {
		setup();
	}

	public static void setup() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; i++) {
				if(grid[i][j] == 0) {
					grid[i][j] = neighbourBombs(i, j);
				}
			}
		}
	}
	
	public static int neighbourBombs(int row, int col) {
		int sum = 0;
		for(int i = row -1; i <= row+1;i++) {
			for(int j = col-1;j <= col+1;j++) {
				if(i >=0 && j >= 0) {
					if (grid[i][j] == -1) sum++;
				}
			}
		}
		return sum;
	}

}
