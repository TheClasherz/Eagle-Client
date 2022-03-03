package Eagle.module.render;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import Eagle.Hero.settings.Setting;
import Eagle.Client;
import Eagle.module.Category;
import Eagle.module.Module;

public class ClickGUI extends Module{

        public ClickGUI() {
        super("ClickGui", Keyboard.KEY_RSHIFT, Category.RENDER);
    }

    @Override
    public void setup() {
        ArrayList<String> options = new ArrayList<>();
        options.add("New");
        options.add("JellyLike");
        Client.settingsManager.rSetting(new Setting("Design", this, "New", options));
        Client.settingsManager.rSetting(new Setting("Sound", this, false));
        Client.settingsManager.rSetting(new Setting("GuiRed", this, 255, 0, 255, true));
        Client.settingsManager.rSetting(new Setting("GuiGreen", this, 26, 0, 255, true));
        Client.settingsManager.rSetting(new Setting("GuiBlue", this, 42, 0, 255, true));
    }

    @Override
    public void onEnable() {
        super.onEnable();

        mc.displayGuiScreen(Client.clickGUI);
        toggle();
    }
}