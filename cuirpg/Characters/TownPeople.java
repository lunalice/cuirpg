package cuirpg.Characters;

public class TownPeople extends Character {
	// private String name;

	public TownPeople(String name) {
		super(name);
	}

	@Override
	public void runAway() {
		System.out.print("すたこらさっさ！");
	}

	@Override
	public void sleep() {
		System.out.println("グーグー");
	}

	@Override
	public void talk() {
		System.out.println("・・・と話した。");
	}

	@Override
	public void walk() {
		System.out.println("てくてく");
	}

	/*
	 * public String getName(){ return name; }
	 *
	 * public void setName(String name){ this.name = name; }
	 */
}
