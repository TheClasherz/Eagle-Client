package Eagle.Hero.clickgui.util;

import java.awt.Color;

import Eagle.Client;



/**
 *  Made by HeroCode
 *  it's free to use
 *  but you have to credit me
 *
 *  @author HeroCode
 */
public class ColorUtil {
	
	public static Color getClickGUIColor(){
		return new Color((int)Client.settingsManager.getSettingByName("GuiRed").getValDouble(), (int)Client.settingsManager.getSettingByName("GuiGreen").getValDouble(), (int)Client.settingsManager.getSettingByName("GuiBlue").getValDouble());
	}
}
