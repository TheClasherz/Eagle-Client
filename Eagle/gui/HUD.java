package Eagle.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import Eagle.Client;
import Eagle.module.Module;

public class HUD {
	
	public Minecraft mc = Minecraft.getMinecraft();
	
	public static class ModuleComparator implements Comparator<Module>{
		
		@Override
		public int compare(Module arg0, Module arg1) {
			if(Minecraft.getMinecraft().fontRendererObj.getStringWidth(arg0.name) > Minecraft.getMinecraft().fontRendererObj.getStringWidth(arg1.name)) {
				return -1;
			}
				if(Minecraft.getMinecraft().fontRendererObj.getStringWidth(arg0.name) < Minecraft.getMinecraft().fontRendererObj.getStringWidth(arg1.name)) {
					return 1;
				}
				return 0;
			}
		}

	
	
	
	
	public void Draw() {
		ScaledResolution sr = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		FontRenderer fr = mc.fontRendererObj;
		
		int count = 0;
		
		Collections.sort(Eagle.Client.moduleManager.modules, new ModuleComparator());
		

		fr.drawStringWithShadow(Client.name + " " + Client.version, 3, 2, -1);
	
		
		for(Module m : Client.moduleManager.modules) {
			if(!m.toggled) {
				continue;
			}
			ArrayList<Module> enabledModules = new ArrayList<>();
				
				
						
		Gui.drawRect(sr.getScaledWidth() - fr.getStringWidth(m.name) - 6, count*(fr.FONT_HEIGHT + 3), sr.getScaledWidth(), 3 + fr.FONT_HEIGHT  + count*(fr.FONT_HEIGHT + 3), 0x90000000);
		fr.drawStringWithShadow(m.name, sr.getScaledWidth() - fr.getStringWidth(m.name) - 2, 2 + count*(fr.FONT_HEIGHT + 3), -1);
		
	
		

		
		count++;
		}
}
}