package cerc;

import iowithplugins.IIOPlugin;
import iowithplugins.IShape;

public class CirclePlugin implements IIOPlugin {

	@Override
	public String getName() {
		return "Cerc";
	}

	@Override
	public IShape getShape() {
		return new Cerc();
	}

	@Override
	public String getDisplayText() {
		return "Cerc";
	}

}
