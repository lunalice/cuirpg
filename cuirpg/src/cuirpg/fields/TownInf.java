package cuirpg.fields;

import cuirpg.Characters.Hero;

public interface TownInf {

	// 町で追加したい機能があれば追加する。

	public int selectMenu(); // メニュー画面

	public void yado(Hero hero); // 宿屋

	public void kajiya(Hero hero); // 鍛冶屋
}
