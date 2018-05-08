package cuirpg.Characters;

public class King extends Character {
	// private String name;

	public King(String name) {
		super(name);
	}

	@Override
	public void runAway() {
		System.out.print("護衛につれてこられて逃げた");
	}

	@Override
	public void sleep() {
		System.out.println("Zzzzzz・・・");
	}

	@Override
	public void talk() {
		System.out.println("ご苦労であった。");
	}

	@Override
	public void walk() {
		System.out.println("どすどす");
	}

	/*
	 * public String getName() { return name; }
	 *
	 * public void setName(String name) { this.name = name; }
	 */

}