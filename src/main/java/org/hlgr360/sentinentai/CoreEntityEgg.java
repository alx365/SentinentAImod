package org.hlgr360.sentinentai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class CoreEntityEgg extends EntityEgg {

    public CoreEntityEgg(World worldIn)
    {
        super(worldIn);
    }

    public CoreEntityEgg(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public CoreEntityEgg(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }
    
    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(RayTraceResult result)
    {
        if (result.entityHit != null)
        {
            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0.0F);
        }

        if (!this.world.isRemote)
        {
        		CoreEntity coreEntity = new CoreEntity(this.world);
        		coreEntity.setGrowingAge(-24000);
        		coreEntity.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
        		this.world.spawnEntity(coreEntity);
        		
            this.world.setEntityState(this, (byte)3);
            this.setDead();
        }
    }    
}
