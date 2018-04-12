package cuirpg.fields;

import java.util.Scanner;

import cuirpg.Characters.Character;

public class WorkingFieldImpl implements WalkingFieldInf {

	// キャラクター
	public void walking(Character HITO) {
		HITO.walk();
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			System.out.println("想定外なエラーがおきました。");
		}
	}

	// メニュー表示
	public int whatDoYouGoing() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("0：冒険");
			System.out.println("1：街へ");
			System.out.println("9：ゲーム終了");
			int input = sc.nextInt();
			if (input == 0 || input == 1 || input == 9) {
				return input;
			} else {
				System.out.println("入力値が違います。");
			}
		}
	}
}
