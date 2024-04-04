package com.excelr.basics.arrays;

public class MultidimentionalArrayExample {

	public static void main(String[] args) {
		int[][] multiArray = {
				{1,2,3},
				{2,3},
				{5,6,7,8}
		};
		System.out.println("2d array");
		for(int i =0; i<multiArray.length;i++) {
			for(int j =0; j<multiArray[i].length;j++)
			{
				System.out.print(multiArray[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");

		int[][][] threeDimArray = {
				{{1,2,3,4,5},{2,3,4,5},{3,4,5}},
				{{234,324},{23,76},{9,8,7,6,5}},
				{{1,2,7},{23,34},{456}}
		};
		
		for(int layer =0; layer<threeDimArray.length;layer++) {
			System.out.println("Layer "+ layer+ ":");
			for(int i=0; i< threeDimArray[layer].length; i++)
			{
				for(int j=0; j< threeDimArray[layer][i].length; j++)
				{
					System.out.print(threeDimArray[layer][i][j]+" ");
				}
				System.out.println();

			}
		}
}
}
