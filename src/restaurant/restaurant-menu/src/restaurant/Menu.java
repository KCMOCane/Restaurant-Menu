package restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

public class Menu {
    Date lastUpdated;
    HashMap<String, ArrayList<MenuItem>> menuItems = new HashMap<>();

    public Menu() { this.lastUpdated = new Date(); }

    public Menu(Date lastUpdated, ArrayList<MenuItem> menu) {
        this.lastUpdated = lastUpdated;
        this.menuItems = menu;
    }

    //getters
    public Date getLastUpdated() {return lastUpdated; }
    public HashMap<String, ArrayList<MenuItem>> getMenuItems() { return menuItems; }

    //setters
    public void setLastUpdated(Date lastUpdated) {this.lastUpdated = lastUpdated;}
    public void setMenuItems(HashMap<String, ArrayList<MenuItem>>) { this.menuItems = menuItems = menuItems;}

    //constructors
    public Menu() { this.setLastUpdated(new Data());}

    //add menu item
    public void addMenuItems(Double price, String description, String category, Boolean newItem) {
        MenuItem newMenuItem = new MenuItem(price, description, category, newItem);
    }

    //remove menu item
    public void removeMenuItem(String description) {
        if(this.menuItems)
    }
    
    private void updateDateUpdated() { this.lasUpdated = new Date(); }
    
    public Date getLastUpdated() {
        return lastUpdated;
    }
    
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    



}
