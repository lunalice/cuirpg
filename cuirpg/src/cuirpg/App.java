package cuirpg;

import cuirpg.Characters.Hero;
import cuirpg.Monsters.Monster;
import cuirpg.fields.BattleFieldImpl;
import cuirpg.fields.BattleFieldInf;
import cuirpg.fields.MonsterFactory;
import cuirpg.fields.OpenningFieldImpl;
import cuirpg.fields.OpenningFieldInf;
import cuirpg.fields.Town;
import cuirpg.fields.TownInf;
import cuirpg.fields.WalkingFieldInf;
import cuirpg.fields.WorkingFieldImpl;

public class App {
	public static void main(String[] args) {
		// オープニングフィールドインスタンス
		OpenningFieldInf opField = new OpenningFieldImpl();

		// タイトル
		if (opField.startGame() == 9) {
			System.out.println("世知辛い世の中に出るのを諦めた。");
			System.exit(0);
		}

		// 主人公の名前を決める
		if (opField.whatYourName() == 9) {
			System.out.println("やっぱり止めよう。");
			System.exit(0);
		}

		// 名前を保持したOPクラスから主人公の生成を行う。
		Hero hero = opField.getHero();
		hero.aisatsu();

		// 通常エリアフィールド
		WalkingFieldInf walkField = new WorkingFieldImpl();
		// モンスター生成＋エンカウント判定
		MonsterFactory monsterhouse = new MonsterFactory();
		// バトルフィールド生成
		BattleFieldInf battlefield = new BattleFieldImpl();
		// 町フィールド生成
		TownInf town = new Town();

		// メイン処理
		while (true) {
			System.out.println("どこへ行きますか？");
			int choice = walkField.whatDoYouGoing(); // どこへ行くか選択する。
			switch (choice) {
			case 0: // 冒険に出かける
				// ランダムエンカウント
				Monster monster = monsterhouse.randomEncount();
				// モンスター出現判定
				if (monster != null) {
					// 戦闘システム
					battlefield.battleManager(hero, monster);
				} else {
					System.out.println("何も見つかりませんでした。");
				}
				break;
			case 1:
				// 街へ出かける。
				// 宿屋と武器屋想定
				choice = town.selectMenu();
				switch (choice) {
				// 宿屋
				case 0:
					town.yado(hero);
					break;
				// 鍛冶屋
				case 1:
					town.kajiya(hero);
					break;
				default:
					break;
				}
				System.out.println("メニューに戻ります。");
				break;
			case 9:
				System.out.println("お疲れ様でした。ゲームを終了します。");
				System.exit(0);
				break;
			default:
				System.out.println("想定外入力です。");
				break;
			}
		}
	}
}
