package cuirpg.Characters;

import cuirpg.Items.ProtectiveGear;
import cuirpg.Items.Weapon;

public class Hero extends Character implements BattleInf {
	private static final double growth = 1.5; // キャラ成長倍率

	// 属性定義
	private int hp = 20;
	private int maxHP = 20;
	private int mp = 10;
	private int maxMp = 10;
	private int exp = 0;
	private int attackPower = 3;
	private int defencePower = 1;
	private int level = 1;
	private Weapon ken = null;
	private ProtectiveGear tate = null;

	// コンストラクタ 親のやつを使う
	public Hero(String name) {
		super(name);
	}

	// コンストラクタ 型無だったり
	public Hero(String name, int hp, int mp) {
		this(name);
		this.hp = hp;
		this.mp = mp;
		this.ken = new Weapon("すで", 0);
		this.tate = new ProtectiveGear("はだか", 0);
	}

	// 攻撃する
	@Override
	public int attack() {
		return (attackPower + ken.getAttackPower()); // 武器との合わせ技
	}

	// 特殊攻撃。
	public int exAttack() {
		if (mp > 0) {
			this.mp -= 1;
			System.out.print("全力攻撃！！");
			return (this.attackPower + ken.getAttackPower()) * 2;
		}
		System.out.print("MPが足りません。");
		return 0;
	}

	@Override
	// 防御する
	public int defence() {
		return this.defencePower + tate.getDefencePower(); // 防具との合わせ技
	}

	@Override
	public void runAway() {
		System.out.println("とっとと逃げ出した！");
	}

	@Override
	public void sleep() {
		System.out.println("おやすみなさーい");
	}

	@Override
	public void talk() {
		System.out.println("・・・と話した。");
	}

	@Override
	public void walk() {
		System.out.println(super.getName() + "は、歩いた。");
	}

	@Override
	public void winComment() {
		System.out.println(super.getName() + "「ヒャハー！汚物は消毒だー！」");
	}

	@Override
	public void defeatedCommend() {
		System.out.println(super.getName() + "「かなしーみのーむこーへとー」");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getDefencePower() {
		return defencePower;
	}

	public void setDefencePower(int defencePower) {
		this.defencePower = defencePower;
	}

	public Weapon getKen() {
		return ken;
	}

	public void setKen(Weapon ken) {
		this.ken = ken;
	}

	public ProtectiveGear getTate() {
		return tate;
	}

	public void setTATE(ProtectiveGear tate) {
		this.tate = tate;
	}

	public void levelUp() {
		// ステータスの最大値を1.1倍にする。
		// 基礎レベル必要経験値。
		int nextLevel = (int)(exp / (5 * growth));
		if (nextLevel > level) {
			System.out.print("レベルアップ！！");
			this.level = nextLevel;
			this.maxHP = (int)(maxHP * growth);
			this.hp = maxHP;
			this.maxMp = (int)(maxMp * growth);
			this.mp = maxMp;
			this.attackPower = (int)(attackPower * growth);
			this.defencePower = (int)(defencePower * growth);
		}
	}

	// あいさつ
	public void aisatsu() {
		System.out.println("俺の名前は" + super.getName() + "。フリーターと名乗るのは辛いから勇者と名乗っている。\n これからコンビニでも行こうと思う。");
	}
}
