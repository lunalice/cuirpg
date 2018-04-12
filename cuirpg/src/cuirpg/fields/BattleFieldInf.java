package cuirpg.fields;

import cuirpg.Characters.Hero;
import cuirpg.Monsters.Monster;

public interface BattleFieldInf {

	public void battleManager(Hero hero, Monster monster); // ○○が現れた！！

	public int battleSelect(); // バトルメニュー

	public void combat(Hero hero, Monster monster); // 攻撃

	public void defence(Monster monster, Hero hero); // ちょっと調整

	public int runAway(Hero hero, Monster monster); // 逃げる
}
