package tasks;

public class MatrixRotate {
static int[][] m;
	
	
	public static void rotate(int[][] matrix, int n){
		for(int layer = 0; layer < n / 2; ++layer){
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i){
				int offset = 1 - first;
				int top = matrix[first][i];
				
				//left -> top
				 matrix[first][i] = matrix[last-offset][first]; 
	             printMove(last-offset,first,first,i);

				
				// bottom -> left
                printMove(last,last-offset,last-offset,first);
                matrix[last-offset][first] = matrix[last][last - offset]; 

                // right -> bottom
                printMove(i,last,last,last-offset);
                matrix[last][last - offset] = matrix[i][last]; 

                // top -> right
                printMove(first,i,i,last);
                matrix[i][last] = top;
                System.out.println("");
                printMatrix(matrix,n);
                System.out.println("");
			}
		}
	}
	static void printMove(int a1, int b1, int a2, int b2){
		System.out.println("["+(a1+1)+"]["+(b1+1)+ "] moves to [" + (a2+1) + "][" + (b2+1) + "]");
	}
	static void printMatrix(int[][] m, int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	static void makeMatrix(int[][] m, int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				m[i][j] = n * (i + 1) + j + 1;
			}
		}
	}
	public static void main(String[] args) {
    int n = 4;
    int[][] m = new int[n][n];
    makeMatrix(m, n);
    printMatrix(m, n);
    rotate(m,n);
    System.out.println("");
	}
}
