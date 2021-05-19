package reusablemenu.sample;

import board.Board;
import plugins.PluginsManager;

public class MainReusableMenu {

	public static void main(String[] args) {
		PluginsManager plugin = new PluginsManager();
		Board board = new Board();
		
		ApplicationMenu menu = new ApplicationMenu(plugin, board);
		menu.load();
		menu.execute();

	}

}
