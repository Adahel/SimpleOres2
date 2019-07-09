package alexndr.plugins.SimpleOres;

import alexndr.api.content.items.SimpleItem;
import net.minecraft.client.gui.inventory.GuiBeacon;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SimpleGuiBeacon {
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onDraw(GuiScreenEvent.DrawScreenEvent.Post event) {
		if (event.gui instanceof GuiBeacon) {
			RenderItem itemRender = FMLClientHandler.instance().getClient().getRenderItem();
	        int xSize = 230;
	        int ySize = 219;
	        int i = (event.gui.width - xSize) / 2;
	        int j = (event.gui.height - ySize) / 2;
	        itemRender.zLevel = 100.0F;
	        if (((SimpleItem) Content.onyx_gem).getConfigEntry().getBeaconPayment()) {
	        	itemRender.renderItemAndEffectIntoGUI(new ItemStack(Content.onyx_gem), i + 12, j + 109);
	        }
	        if (((SimpleItem) Content.adamantium_ingot).getConfigEntry().getBeaconPayment()) {
	        	itemRender.renderItemAndEffectIntoGUI(new ItemStack(Content.adamantium_ingot), i + 12, j + 109 + 22);
	        }
	        if (((SimpleItem) Content.mythril_ingot).getConfigEntry().getBeaconPayment()) {
	        	itemRender.renderItemAndEffectIntoGUI(new ItemStack(Content.mythril_ingot), i + 12, j + 109 + 44);
	        }
	        if (((SimpleItem) Content.tin_ingot).getConfigEntry().getBeaconPayment()) {
	        	itemRender.renderItemAndEffectIntoGUI(new ItemStack(Content.tin_ingot), i + 12, j + 109 + 66);
	        }
	        if (((SimpleItem) Content.copper_ingot).getConfigEntry().getBeaconPayment()) {
	        	itemRender.renderItemAndEffectIntoGUI(new ItemStack(Content.copper_ingot), i + 12, j + 109 + 88);
	        }
	        itemRender.zLevel = 0.0F;
	        event.gui.mc.getTextureManager().bindTexture(new ResourceLocation(SimpleOres.plugin.getModId(), "textures/gui/container/beacon.png"));
	        if (((SimpleItem) Content.adamantium_ingot).getConfigEntry().getBeaconPayment()) {
	        	event.gui.drawTexturedModalRect(i + 10, j + 125, 0, 0, 18, 5);
	        }
	        if (((SimpleItem) Content.mythril_ingot).getConfigEntry().getBeaconPayment()) {
	        	event.gui.drawTexturedModalRect(i + 10, j + 125 + 22, 0, 0, 18, 5);
	        }
	        if (((SimpleItem) Content.tin_ingot).getConfigEntry().getBeaconPayment()) {
	        	event.gui.drawTexturedModalRect(i + 10, j + 125 + 44, 0, 0, 18, 5);
	        }
	        if (((SimpleItem) Content.copper_ingot).getConfigEntry().getBeaconPayment()) {
	        	event.gui.drawTexturedModalRect(i + 10, j + 125 + 66, 0, 0, 18, 5);
	        }
		}
	}
}
