package com.cezia.knowledgeofcreation.menu;

public class ItemDrawerMenu {
    public int icon;
    public String title;
    public ItemDrawerMenu(){
        super();
    }

    public ItemDrawerMenu(int icon, String title) {
        super();
        this.icon = icon;
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
