package cuirpg.Monsters;

public class Maou extends Monster {

	// コンストラクタ
	public Maou(){
        super("魔王");
        super.hp = new java.util.Random().nextInt(10)+30;// 変動値
        super.mp = new java.util.Random().nextInt(5)+1;// 変動値
        super.exp = 4;
        super.attackPower = 4;// 気が向いたら変動値にする。
        super.defencePower = 4;// 気が向いたら変動値にする。
    }

	// 攻撃する
	@Override
	public int attack() {
		return super.attackPower;
	}

	@Override
	// 防御する
	public int defence() {
		return super.defencePower;
	}

	@Override
	public void runAway() {
		System.out.println("メタル系じゃないから逃げるわけないでしょ！");
	}

	@Override
	public void winComment() {
		System.out.println("世界はワイのもんやで");
	}

	@Override
	public void defeatedCommend() {
		System.out.println("世界の半分を分けてやる");
	}

}