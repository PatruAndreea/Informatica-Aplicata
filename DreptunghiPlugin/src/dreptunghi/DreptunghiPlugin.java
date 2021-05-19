package dreptunghi;

import iowithplugins.IIOPlugin;
import iowithplugins.IShape;

public class DreptunghiPlugin implements IIOPlugin {

	@Override
	public String getName() {
		return "Dreptunghi";
	}

	@Override
	public IShape getShape() {
		return new Dreptunghi();
	}

	@Override
	public String getDisplayText() {
		return "Dreptunghi";
	}

}
