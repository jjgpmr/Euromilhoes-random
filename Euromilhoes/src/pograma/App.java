package pograma;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		// System.out.println(key[]);
		// int randomm = (int) (Math.random()*50);
		// System.out.println(randomm);
		/*
		 * for(int index = 0; index<key.length; index++) { key[index] =
		 * (int)(Math.random()*6); } for(int index = 0; index<key.length; index++) {
		 * System.out.print(key[index]); }
		 */
		/*
		 * int key[] = {1,2,3,4,5,6,7,8,9,10 ,11,12,13,14,15,16,17,18,19,20
		 * ,21,22,23,24,25,26,27,28,29,30 ,31,32,33,34,35,36,37,38,39,40
		 * ,41,42,43,44,45,46,47,48,49,50};
		 * 
		 * int stars[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		 */

		Random random = new Random();

		int min = 1, max = 50, slots = 5;

		int[] lotteryArray = new int[slots];
		boolean isRepeated;
		int randomNumber = 0;

		for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
			do {
				isRepeated = false;
				randomNumber = random.nextInt(max + 1 - min) + min;
				for (int i = 0; i <= indexDrawn; i++) {
					if (lotteryArray[i] == randomNumber) {
						isRepeated = true;
						break;
					}
				}
			} while (isRepeated);
			lotteryArray[indexDrawn] = randomNumber;
		}
		Arrays.sort(lotteryArray);
		System.out.println("Os números são: ");
		for (int x = 0; x < slots; x++) {
			System.out.print(lotteryArray[x] + " ");
		}
		System.out.println();

		int min2 = 1, max2 = 12, slots2 = 2;

		int[] lotteryArray2 = new int[slots2];
		boolean isRepeated2;
		int randomNumber2 = 0;

		for (int indexDrawn2 = 0; indexDrawn2 < slots2; indexDrawn2++) {
			do {
				isRepeated2 = false;
				randomNumber2 = random.nextInt(max2 + 1 - min2) + min2;
				for (int i = 0; i <= indexDrawn2; i++) {
					if (lotteryArray2[i] == randomNumber2) {
						isRepeated2 = true;
						break;
					}
				}
			} while (isRepeated2);
			lotteryArray2[indexDrawn2] = randomNumber2;
		}
		Arrays.sort(lotteryArray2);
		System.out.println("As estrelas: ");
		for (int x = 0; x < slots2; x++) {
			System.out.print(lotteryArray2[x] + " ");
		}
	}
}
