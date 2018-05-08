package cuirpg.Characters;

public interface BattleInf {

	// 攻撃
	public int attack();

	// 防御
	public int defence();

	// 逃げる
	public void runAway();

	// 勝ちコメ
	public void winComment();

	// 負けコメ
	public void defeatedCommend();

}
