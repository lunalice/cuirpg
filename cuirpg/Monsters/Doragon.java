package cuirpg.Monsters;

public class Doragon extends Monster {

	// コンストラクタ
	public Doragon(){
        super("大型ドラゴン");
        super.hp = new java.util.Random().nextInt(10)+15;// 変動値
        super.mp = new java.util.Random().nextInt(5)+1;// 変動値
        super.exp = 3;
        super.attackPower = 3;// 気が向いたら変動値にする。
        super.defencePower = 3;// 気が向いたら変動値にする。
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
		System.out.println("フローラルな香り");
	}

	@Override
	public void defeatedCommend() {
		System.out.println("おでのからだはぼどぼどだー");
	}

}