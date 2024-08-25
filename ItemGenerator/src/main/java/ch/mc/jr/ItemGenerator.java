package ch.mc.jr;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import java.util.Random;

public class ItemGenerator extends JavaPlugin {
    @Override
    public void onEnable() {
        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Random rand = new Random();
                    int num = rand.nextInt(1000) + 1;
                    ItemStack item;

                    if (num <= 200) { 
                        item = new ItemStack(Material.COBBLESTONE);
                    } else if (num <= 400) { 
                        item = new ItemStack(Material.OAK_PLANKS);
                    } else if (num <= 600) { 
                        item = new ItemStack(Material.STICK);
                    } else if (num <= 800) {
                        item = new ItemStack(Material.DIRT);
                    } else if (num <= 900) { 
                        item = new ItemStack(Material.IRON_NUGGET);
                    } else if (num <= 995) { 
                        item = new ItemStack(Material.GOLD_NUGGET);
                    } else { 
                        item = new ItemStack(Material.DIAMOND);
                    }

                    player.getInventory().addItem(item);
                }
            }
        }.runTaskTimer(this, 0L, 100L);
    }

    @Override
    public void onDisable() {
       
    }
}
