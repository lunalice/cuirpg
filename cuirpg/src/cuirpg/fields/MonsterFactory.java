package cuirpg.fields;

import cuirpg.Monsters.Doragon;
import cuirpg.Monsters.Maou;
import cuirpg.Monsters.Monster;
import cuirpg.Monsters.Suraimu;
import cuirpg.Monsters.Zombi;

public class MonsterFactory {

	// ランダムエンカウント
	public Monster randomEncount() {
		int mRANDOM = new java.util.Random().nextInt(100) + 1; // エンカウンター
		// 80%くらいで遭遇する。
		if (80 > mRANDOM) {
			return createMonster();
		}
		// 出現しない場合。
		return null;
	}

	// どのモンスターを生成するか
	public Monster createMonster() {
		int mRANDOM = new java.util.Random().nextInt(4);
		Monster monster = null;
		switch (mRANDOM) {
		case 0:
			monster = new Suraimu();
			break;
		case 1:
			monster = new Zombi();
			break;
		case 2:
			monster = new Doragon();
			break;
		case 3:
			monster = new Maou();
			break;
		default:
			break;
		}
		return monster;
	}
}
