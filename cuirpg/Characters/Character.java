package cuirpg.Characters;

public abstract class Character {
	private String name;

	public Character(String name) {
		this.name = name;
	}

	// そのまま使えるものは抽象化出来ない
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 抽象化
	public abstract void talk();

	public abstract void walk();

	public abstract void sleep();

	public abstract void runAway();

}
