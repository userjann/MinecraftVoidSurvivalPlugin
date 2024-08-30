package ch.mc.jr.Events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;




public class ExplosionArrowEvent implements Listener {



    @EventHandler
    public void onEvent(ProjectileHitEvent event){
        Projectile arrow = event.getEntity();

        if(arrow.getType() == EntityType.ARROW && "Explosive Arrow".equals(arrow.getCustomName())){
            World world =arrow.getWorld();
            world.createExplosion(arrow.getLocation(),2,false);
        }

    }



}
