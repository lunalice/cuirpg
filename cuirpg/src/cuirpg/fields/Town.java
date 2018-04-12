package cuirpg.fields;

import java.util.Scanner;

import cuirpg.Characters.Hero;
import cuirpg.Items.Weapon;

public class Town implements TownInf {

	// メニュー選択
	@Override
	public int selectMenu() {
		int input = 0;
		while (true) {
			System.out.println("0：宿屋");
			System.out.println("1：鍛冶屋");
			System.out.println("9：冒険を続ける");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			sc.close();
			if (input == 0 || input == 1 || input == 9) {
				return input;
			} else {
				System.out.println("入力値が違います。");
			}
		}
	}

	// 宿屋
	@Override
	public void yado(Hero hero) {
		hero.sleep();
		hero.setHp(hero.getMaxHP());
		hero.setMp(hero.getMaxMp());
		System.out.println("宿屋の親父「昨晩はお楽しみでしたね！」");
	}

	// 鍛冶屋
	@Override
	public void kajiya(Hero hero) {
		System.out.println("鍛冶屋の親父「なんでも作ってやるぞ」");
		System.out.println("武器名：");
		Scanner sc = new Scanner(System.in);
		String mName = sc.nextLine();
		int attackPower = new java.util.Random().nextInt(10) + 1;
		System.out.println(mName + ":攻撃力 " + attackPower + "が完成した！");
		Weapon ken = new Weapon(mName, attackPower);
		hero.setKen(ken);
		sc.close();
	}
}