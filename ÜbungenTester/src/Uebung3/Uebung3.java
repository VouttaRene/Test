package Uebung3;

public class Uebung3 {
	
	public static void main(String[] args) {
	
		int[][][] numbers = 	{{{1,2,3},{4,5,6},{7,8,9}},
								{{10,11,12},{13,14,15},{16,17,18}},
								{{19,20,21},{22,23,24},{25,26,27}}
		};
		
		int i = 0;
		while(i<numbers.length) {
			int j = 0;
			while(j<numbers[i].length) {
				int n = 0;
				while(n < numbers[i][j].length) {
					if(numbers[i][j][n] == 24)
						System.out.println(i + " " + j + " " + n);
					n++;
				}
				
				j++;
			}
			i++;
		}
		
		for(int k = 0; k < numbers.length; k++) {
			for(int l = 0; l < numbers[k].length;l++) {
				for(int m = 0; m < numbers[k][l].length;m++) {
					if(numbers[k][l][m] == 24)
						System.out.println(k + " " + l + " " + m);
				}
				
			}
		}
		int[] sums = {50,40,30,20,10};
		int sumAll = 0;
		
		for(int sum : sums) {
			sumAll += sum;
		}
		int avg = sumAll/sums.length;
		System.out.println(avg);
	}
}

