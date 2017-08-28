package org.hlgr360.sentinentai;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
	public static final String MODID = "sentinentai"; 
	public static final String NAME = "SentinentAI Mod"; 
	public static final String VERSION = "1.0";

	public static Item firmwareItem;	

	@EventHandler
	public void init(FMLInitializationEvent event) {
		firmwareItem = new Firmware().setRegistryName(MODID, "firmware");
		GameRegistry.register(firmwareItem);
		
		ModelResourceLocation firmwareItemModel = new ModelResourceLocation("sentinentai:firmware", "inventory"); 
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(firmwareItem, 0, firmwareItemModel);		
	}
} 
