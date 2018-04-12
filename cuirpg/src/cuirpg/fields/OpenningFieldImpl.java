package cuirpg.fields;

import java.util.Scanner;

import cuirpg.Characters.Hero;

public class OpenningFieldImpl implements OpenningFieldInf {

	private String mName; // 主人公の名前

	@Override
	public int startGame() {
		String title = "  ■■■■■  ■      ■  ■   ■■■■■   ■■■■■     ■■■■■ \n"
				+ " ■■   ■  ■      ■  ■   ■   ■■  ■   ■■   ■■   ■■\n"
				+ "■■       ■      ■  ■   ■    ■  ■    ■  ■■      \n"
				+ "■        ■      ■  ■   ■   ■■  ■   ■■  ■       \n"
				+ "■        ■      ■  ■   ■■■■    ■■■■■   ■    ■■■\n"
				+ "■        ■      ■  ■   ■  ■■   ■       ■      ■\n"
				+ "■■       ■      ■  ■   ■   ■■  ■       ■■     ■\n"
				+ " ■■   ■  ■■    ■■  ■   ■    ■  ■        ■■   ■■\n"
				+ "  ■■■■     ■■■■    ■   ■    ■■ ■         ■■■■■ \n";
		System.out.println(title);
		System.out.println();
		int input = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("START：0");
			System.out.println("  END：9");
			input = sc.nextInt();
			if (input == 9 || input == 0) {
				break;
			} else {
				System.out.println("入力値が不正です。");
			}
		}
		return input;
	}

	@Override
	public int whatYourName() {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("主人公の名前を入力:");
			System.out.println("やっぱり終了:9");
			String mName = sc.nextLine();
			if (mName.length() == 1 && mName.equals("9")) {
				input = 9;
				break;
			} else if (mName.length() != 0) {
				this.mName = mName;
				break;
			}
		}
		return input;
	}

	@Override
	public Hero getHero() {
		return new Hero(mName, 20, 5);// 勇者インスタンスを生成
	}
}
