package cuirpg.fields;

import java.util.Scanner;

import cuirpg.Characters.Hero;
import cuirpg.Monsters.Monster;

public class BattleFieldImpl implements BattleFieldInf {

	@Override
	public void battleManager(Hero hero, Monster monster) {
		System.out.println(monster.getName() + "が現れた！！");
		// ターン制を想定
		while (true) {
			// バトルメニュー
			System.out.println(hero.getName() + ":HP" + hero.getHp() + ":MP:" + hero.getMp());
			int select = battleSelect();
			switch (select) {
			case 1:
				// 攻撃⇒判定
				combat(hero, monster);
				if (winner(hero, monster) == 1) {
					System.out.println("戦闘に勝利した！");
					return;
				}
				// 防御⇒判定
				defence(monster, hero);
				if (winner(hero, monster) == 1) {
					System.out.println("戦闘に勝利した！");
					return;
				}
				break;
			// case 2:
			// defence(hero,monster);
			// break;
			case 3:
				int nigeru = runAway(hero, monster);
				// 逃げが成功したら処理を終了する。
				if (nigeru == 1) {
					return;
				}
				break;
			default:
				break;
			}
		}
	}

	@Override
	public int battleSelect() {
		int input = 0;
		while (true) {
			System.out.println("1：攻撃");
			// System.out.println("2：防御");
			System.out.println("3：逃走");
			input = new Scanner(System.in).nextInt();
			if (input == 1 || input == 3) {
				break;
			} else {
				System.out.println("入力値が違います。");
			}
		}
		return input;
	}

	@Override
	public void combat(Hero hero, Monster monster) {
		// 防御高い奴考慮しましょうねー
		int damage = (hero.attack() - monster.defence()) < 0 ? 0 : (hero.attack() - monster.defence());
		System.out.println(hero.getName() + "は" + monster.getName() + "を攻撃した！！");
		System.out.println(damage + "のダメージ！！");
		monster.setHp(monster.getHp() - damage);
	}

	// public void exCombat(BattleInf charaA, BattleInf charaB) {
	// System.out.println(charaA.getName() + "は" + charaB.getName() + "の攻撃を防御した！！");
	// System.out.println(charaB.attack() - charaA.defence() + "のダメージ！！");
	// charaA.setHp(charaA.getHp() - charaB.attack() - charaA.defence());
	// }

	@Override
	public void defence(Monster monster, Hero hero) {
		int damage = (monster.attack() - hero.defence()) < 0 ? 0 : (monster.attack() - hero.defence());
		System.out.println(monster.getName() + "は" + hero.getName() + "を攻撃した！！");
		System.out.println(hero.getName() + "は" + damage + "のダメージ！！");
		hero.setHp(hero.getHp() - damage);
	}

	@Override
	public int runAway(Hero hero, Monster monster) {
		// 1なら逃げる0なら殴られる。
		int mRANDOM = new java.util.Random().nextInt(100) + 1; // エンカウンター
		if (mRANDOM < 80) {
			hero.runAway();// 逃げ台詞
			monster.winComment();// 勝どき
			return 1;
		}
		System.out.println("逃げる事が出来なかった！！");
		defence(monster, hero);
		return 0;
	}

	// 勝利判定
	public int winner(Hero hero, Monster monster) {
		// 勝ち負け判定
		if (hero.getHp() <= 0) {
			monster.winComment();
			hero.defeatedCommend();
			System.out.println(hero.getName() + "は目の前が真っ暗になった・・・");
			System.out.println("ゲームが終了します。");
			System.exit(0);
		} else if (monster.getHp() <= 0) {
			hero.winComment();
			monster.defeatedCommend();
			System.out.println(hero.getName() + "は" + monster.getExp() + "経験値を得た。");
			hero.setExp(hero.getExp() + monster.getExp()); // 経験値獲得
			hero.levelUp(); // レベルアップ判定
			return 1;
		}
		return 0;
	}
}
