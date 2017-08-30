package org.hlgr360.sentinentai;

import net.minecraft.item.ItemMonsterPlacer;

public class ElizaSpawn extends ItemMonsterPlacer {

	public ElizaSpawn() {
		this.setUnlocalizedName("elizaspawn");
	}
   
//	@Override
//	protected void onImpact(RayTraceResult result) {
//        if (!world.isRemote) // never spawn entity on client side
//        {
//        	 	entityResource = new ResourceLocation();
//            entityToSpawn = (EntityVillager) EntityList.createEntityByIDFromName(entityToSpawnName, world);
//            entityToSpawn.setGrowingAge(-24000);
//            entityToSpawn.setLocationAndAngles(posX, posY, posZ, rotationYaw, 0.0F);
//            world.spawnEntity(entityToSpawn);
//        }
//
//        for (int j = 0; j < 8; ++j)
//        {
//            world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 
//                  0.0D, 0.0D, 0.0D);
//        }
//
//        if (!world.isRemote)
//        {
//            setDead();
//        }	
//	}
}
