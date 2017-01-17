package lang;

import java.util.Random;

public class FlashPb01 {
	public static void main(String[] args) {
		Random random = new Random();
		final int a = 20;
		int[] tiles = new int[a];
		for (int i = 0; i < a; i++) {
			tiles[i] = (int) i / 2;
		}
		for (int i = 0; i < a; i++) {
			System.out.print(tiles[i]);
		}
		int swap;
		int temp;
		System.out.println();
		System.out.println();
		
		for(int i = a - 1; i > 0; i--){
			swap=random.nextInt(20);
			temp = tiles[i];
			tiles[i] = tiles[swap];
			tiles[swap] = temp;
			
		}
		int b = 0;
		for(int j=0; j<4;j++){
		for (int i = 0; i < 5; i++) {
			
			System.out.print(tiles[b]);
			b++;
		}
		System.out.println();
	}
	}
}
