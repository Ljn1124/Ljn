package pac;

public class Find {
	void findZero(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if(array2d[row][column]==0) {
					System.out.print("R_zero("+column+","+row+")\r");
					System.out.print("R_left("+(column-1)+","+row+")\r");
					System.out.print("R_right("+(column+1)+","+row+")\r");
					System.out.print("R_up("+column+","+(row-1)+")\r");
					System.out.print("R_down("+column+","+(row+1)+")");
				}
			}
		}
	}
}
