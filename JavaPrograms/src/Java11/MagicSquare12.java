package Java11;

import java.util.Scanner;

public class MagicSquare12 {

	public static void main(String[] args) {
		int row;
		int col;
		int rowSum = 0;
		int colSum = 0;
		int diaSum = 0;
		int diaSum2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row: ");
		row = sc.nextInt();
		System.out.println("Enter the column: ");
		col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter Matrix Data");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Your Matrix is : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("Sum of rows: ");
		for (int i = 0; i < row; i++) {
			rowSum = 0;
			for (int j = 0; j < col; j++) {
				rowSum = rowSum + arr[i][j];

			}
			System.out.println(rowSum);
		}
		System.out.println("Sum of cols: ");
		for (int i = 0; i < row; i++) {
			colSum = 0;
			for (int j = 0; j < col; j++) {
				colSum = colSum + arr[j][i];

			}
			System.out.println(colSum);
		}
		System.out.println("Diagonal Sum: ");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				if (i == j) {

					diaSum = diaSum + arr[i][j];

				}

				System.out.println(diaSum);

			}

			if (rowSum == colSum && rowSum == diaSum)

			{
				System.out.println("Given matrix is sqaure magic ");
			} else {
				System.out.println("Matrix is not sqaure matrix ");
			}
		}
	}
}
