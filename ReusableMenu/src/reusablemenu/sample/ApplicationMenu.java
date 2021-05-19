/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reusablemenu.sample;



import java.util.ArrayList;

import board.Board;
import iowithplugins.IShape;
import plugins.PluginsManager;
import reusablemenu.abstractions.IMenuItem;
import reusablemenu.implementation.Menu;
import reusablemenu.implementation.MenuItem;

public class ApplicationMenu{
    
	 private PluginsManager pluginm;
	    private Menu mainMenu = null;
	    private Menu shapeMenu = null;
	    private Board board = null;
	    
	    public ApplicationMenu(PluginsManager pluginm, Board board)
	    {
	          this.pluginm = pluginm;
	          this.board = board;
	    }
	    
	    public void loadMain()
	    {
	        ArrayList<IMenuItem> menuItems = new ArrayList();
	        
	        int shortCut = 1;    
	        
	         
	       menuItems.add(new MenuItem("Adaugare forma geometrica", shortCut++, (parameters)->{
	           shapeMenu.execute();
	       }));  
	       
	       menuItems.add(new MenuItem("Sterge forma geometrica", shortCut++, (parameters)->{
	           board.removeShape();
	       })); 
	       
	       menuItems.add(new MenuItem("Vizualizare plansa", shortCut++, (parameters)->{
	           board.printShapes();
	       })); 
	       
	       menuItems.add(new MenuItem("Editeaza forma geometrica", shortCut++, (parameters)->{
	           board.printShapes();
	           board.editShape();
	       })); 
	       
	        
	        mainMenu = new Menu("Main Menu", -1, menuItems);
	        
	    }
	    
	    public void load()
	    {
	        pluginm.loadPlugins("/plugins");
	        ArrayList<IMenuItem> menuItems = new ArrayList();
	        
	        int shortCut = 1;
	        var plugins = pluginm.getPluginsList();
	        
	        for (int i = 0 ; i < plugins.size(); i++)
	        {      
	           var currentPlugin = plugins.get(i); 
	           MenuItem currentItem = new MenuItem(plugins.get(i).getDisplayText(), shortCut++, (parameters)->{
	               IShape shape = currentPlugin.getShape();
	               board.addShape(shape);
	           });
	           menuItems.add(currentItem);
	       
	        }
	       shapeMenu=new Menu("Add new shape",1,menuItems);
	       this.loadMain();
	     
	    }
	    
	    public void execute()
	    {
	        mainMenu.execute();
	    }
    
}
