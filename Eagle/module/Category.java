package Eagle.module;

public enum Category {
	
	BLATANT("Blatant", 40, 50, false, true),
	COMBAT("Combat", 160, 50, false, true),
	RENDER("Render", 280, 50, false, true),
	MISC("Misc", 400, 50, false, true);
	
	public String name;
	public int posX, posY;
	public boolean mouseClicked;
	public boolean showModules;
	
	Category(String name, int posX, int posY, boolean mouseClicked, boolean showModules) {
		this.name = name;
		this.posX = posX;
		this.posY = posY;
		this.mouseClicked = mouseClicked;
		this.showModules = showModules;
	}

}
