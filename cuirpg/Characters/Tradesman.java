package cuirpg.Characters;

public class Tradesman extends Character {
	// private String name;

	public Tradesman(String name) {
		super(name);
	}

	@Override
	public void runAway() {
		System.out.print("一目散に逃げた！");
	}

	@Override
	public void sleep() {
		System.out.println("むにゃ、むにゃ");
	}

	@Override
	public void talk() {
		System.out.println("・・・と話した。");
	}

	@Override
	public void walk() {
		System.out.println("すたすた");
	}

	/*
	 * public String getName(){ return name; }
	 * 
	 * public void setName(String name){ this.name = name; }
	 */
}
