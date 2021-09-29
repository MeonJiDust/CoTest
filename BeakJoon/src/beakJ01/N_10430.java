package beakJ01;

import java.util.Scanner;

public class N_10430 {
	/*
	 * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z;
		
		Scanner scanner = new Scanner(System.in);
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		
		System.out.println((x + y) % z);
		System.out.println(((x % z) + (y % z)) % z);
		System.out.println((x * y) % z);
		System.out.println(((x % z) * (y % z)) % z);

	}

}
