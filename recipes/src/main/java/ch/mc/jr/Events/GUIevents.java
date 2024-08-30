package ch.mc.jr.Events;

import ch.mc.jr.GUI.*;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIevents implements Listener {

    @EventHandler
   public void onclick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null){
            return;
        }
        if(event.getClickedInventory().getHolder() instanceof GUI){
            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();
            if(event.getCurrentItem() == null){
                return;
            }
            if(event.getCurrentItem().getType() == Material.OAK_PLANKS){
                PlankGUI gui = new PlankGUI();
                player.openInventory(gui.getInventory());
            }
            if(event.getCurrentItem().getType() == Material.IRON_NUGGET){
                StrongGUI gui = new StrongGUI();
                player.openInventory(gui.getInventory());
            }
            if(event.getCurrentItem().getType() == Material.CHAINMAIL_HELMET){
                HelmetGUI gui = new HelmetGUI();
                player.openInventory(gui.getInventory());
            }
            if(event.getCurrentItem().getType() == Material.CHAINMAIL_CHESTPLATE){
                ChestplateGUI gui = new ChestplateGUI();
                player.openInventory(gui.getInventory());
            }
            if(event.getCurrentItem().getType() == Material.CHAINMAIL_LEGGINGS){
                LeggingsGUI gui = new LeggingsGUI();
                player.openInventory(gui.getInventory());
            }
            if(event.getCurrentItem().getType() == Material.CHAINMAIL_BOOTS){
                BootsGUI gui = new BootsGUI();
                player.openInventory(gui.getInventory());
            }
            if(event.getCurrentItem().getType() == Material.BARRIER){
                RecipeGUI gui = new RecipeGUI();
                player.openInventory(gui.getInventory());
            }
            if(event.getCurrentItem().getType() == Material.FIRE_CHARGE){
                FireChargeGUI gui = new FireChargeGUI();
                player.openInventory(gui.getInventory());
            }
            if(event.getCurrentItem().getType() == Material.TIPPED_ARROW){
                ExplosiveArrowGUI gui = new ExplosiveArrowGUI();
                player.openInventory(gui.getInventory());
            }

        }
    }
}
