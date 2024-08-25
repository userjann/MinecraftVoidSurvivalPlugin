package ch.mc.jr.GUI;

import com.google.common.collect.Lists;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PlankGUI extends GUI{
    public PlankGUI() {
        super("Oak Planks");
    }

    protected void init() {
        super.init();
        List<ItemStack> Plank = Lists.newArrayList(
                g, g, g, g, g, g, g, g, g,
                g, g, s, s, n, g, g, g, g,
                g, g, s, s, n, g, p, g, g,
                g, g, n, n, n, g, g, g, g,
                ba, g, g, g, g, g, g, g, g
        );

        for (int i =0; i< Plank.size(); i++ ){
            if(Plank.get(i) != null){
                inventory.setItem(i, Plank.get(i));
            }
        }
    }
}
