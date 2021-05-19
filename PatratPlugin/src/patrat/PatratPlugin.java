package patrat;

import iowithplugins.IIOPlugin;
import iowithplugins.IShape;

public class PatratPlugin implements IIOPlugin {

	@Override
	public String getName() {
		return "Patrat";
	}

	@Override
	public IShape getShape() {
		return new Patrat();
	}

	@Override
	public String getDisplayText() {
		return "Patrat";
	}

}
