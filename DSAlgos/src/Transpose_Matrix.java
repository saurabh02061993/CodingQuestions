
public class Transpose_Matrix {

	static void clockwise(int B[][]) {

		for (int i = 0; i < B.length; i++) {
			for (int j = B[0].length - 1; j >= 0; j--) {

				System.out.print(B[i][j] + " ");

			}
			System.out.println();

		}
	}

	static void Anticlockwise(int B[][]) {

		for (int i = B.length - 1; i >= 0; i--) {
			for (int j = 0; j < B.length; j++) {

				System.out.print(B[i][j] + " ");

			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		System.out.println("Original is *************");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {

				System.out.print(A[i][j]+" ");

			}
			System.out.println();

		}

		int B[][] = new int[A.length][A[0].length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {

				B[i][j] = A[j][i];

			}

		}
		System.out.println("************Transpose is *********");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("************Printing clockWise****************");
		clockwise(B);
		System.out.println("************Printing Anticlock****************");
		Anticlockwise(B);

	}
}
