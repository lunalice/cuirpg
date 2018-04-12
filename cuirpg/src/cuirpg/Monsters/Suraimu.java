package cuirpg.Monsters;

public class Suraimu extends Monster {

	// コンストラクタ
	public Suraimu() {
		super("弱小スライム");
		super.hp = new java.util.Random().nextInt(5) + 5;// 変動値
		super.mp = new java.util.Random().nextInt(5) + 1;// 変動値
		super.exp = 1;
		super.attackPower = 1;// 気が向いたら変動値にする。
		super.defencePower = 1;// 気が向いたら変動値にする。
	}

	// 攻撃する
	@Override
	public int attack() {
		return super.attackPower; // 武器との合わせ技
	}

	@Override
	// 防御する
	public int defence() {
		return super.defencePower; // 防具との合わせ技
	}

	@Override
	public void runAway() {
		System.out.println("メタル系じゃないから逃げるわけないでしょ！");
	}

	@Override
	public void winComment() {
		System.out.println(super.getName() + "「乳酸菌とってるぅ？」");
	}

	@Override
	public void defeatedCommend() {
		System.out.println(super.getName() + "「我は四天王のうち最弱」");
	}

}