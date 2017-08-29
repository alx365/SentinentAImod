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

	public static Item sentinentAItem;	

	@EventHandler
	public void init(FMLInitializationEvent event) {
		sentinentAItem = new SentinentAI().setRegistryName(MODID, "sentinentai");
		GameRegistry.register(sentinentAItem);
		
		ModelResourceLocation sentinentAItemModel = new ModelResourceLocation("sentinentai:sentinentai", "inventory"); 
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(sentinentAItem, 0, sentinentAItemModel);		
	}
} 
