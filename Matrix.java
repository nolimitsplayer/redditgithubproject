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
			//do determinant
		} else {
			System.out.println("Determinant is not square.");
		}
	}

	public Matrix rref(Matrix a) {
	}

	private int rows() {
		return width;
	}

	private int columns() {
		return height;
	}

	public String printMatrix(Matrix a) {
		
	}
}