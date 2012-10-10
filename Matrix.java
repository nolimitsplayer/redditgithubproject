public class Matrix {
	private int row, column;
	private double[][] matrix;

	public Matrix(row, column) {
		this.row=row;
		this.column=column;
		matrix = new double[row][column];
	}

	public Matrix multiplyMatrix(Matrix a, Matrix b) {
	}

	public Matrix divideMatrix(Matrix a, Matrix b) {
	}

	public Matrix transformMatrix(Matrix a) {
	}

	public Matrix determinantOfMatrix(Matrix a) {
		if (a.rows() == a.columns()) {
			int columns = a.columns();
			for (int i=0; i<columns; i++) {
				matrix[i]-
			}
			//do determinant
		} else {
			System.out.println("Determinant is not square.");
		}
	}

	//row echelon form
	public Matrix ref(Matrix a) {

	}

	//reduced row echelon form
	public Matrix rref(Matrix a) {
	}

	private int rows() {
		return width;
	}

	private int columns() {
		return height;
	}

	public String printMatrix(Matrix a) {
		String result = "";
		result += "[";
		for (int i=0; i<a.rows(); i++)
			for (int j=0; j<a.columns()-1; i++)
				result += matrix[i][j];
		return result;
	}
}