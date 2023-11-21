package tp1.logic;

import java.util.ArrayList;
import java.util.List;

import tp1.logic.gameobjects.GameObject;

public class GameObjectContainer {

	private List<GameObject> objects;

	public GameObjectContainer() {

		objects = new ArrayList<>();
	}

	public void add(GameObject object) {

		objects.add(object);
	}

	public void remove(GameObject object) {

		objects.remove(object);
	}

	public void automaticMoves() {
		for (int i=0;i<objects.size();i++) {
				GameObject object = objects.get(i);
				object.automaticMove();

		}
		//TODO fill with your code
	}

	public void computerActions() {
		for (int i=0;i<objects.size();i++) {
			GameObject object = objects.get(i);
			object.computerAction();

		}
	}

	public String toString(Position pos) {
		String sr = new String ("");
		for (int i = 0; i < objects.size(); i++) {
			GameObject object = objects.get(i);
			sr += object.toString(pos);

		}
		return sr;
	}
}
