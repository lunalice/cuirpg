package cuirpg.Monsters;

import cuirpg.Characters.BattleInf;

public abstract class Monster implements BattleInf {
	// protected＝親と子の間なら同じ変数使えるよよよ
	// interface=実装の強制、抽象化メソッドにして個別のモンスター生成に使用する。
	protected String name;
	protected int hp;
	protected int mp;
	protected int exp;
	protected int attackPower;
	protected int defencePower;

	public Monster(String name) {
		this.name = name;
	}

	public Monster(String name, int hp, int mp) {
		this(name);
		this.hp = hp;
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	// 攻撃
	@Override
	public abstract int attack();

	// 防御
	@Override
	public abstract int defence();

	// 逃げる
	@Override
	public abstract void runAway();

	// 勝利
	@Override
	public abstract void winComment();

	// 死に台詞
	@Override
	public abstract void defeatedCommend();
}
