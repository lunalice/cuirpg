package cuirpg.fields;

import cuirpg.Characters.Hero;//別のパッケージにいる場合インポートしないといけない

public interface OpenningFieldInf {

	public int startGame();

	public int whatYourName();

	public Hero getHero();

}
