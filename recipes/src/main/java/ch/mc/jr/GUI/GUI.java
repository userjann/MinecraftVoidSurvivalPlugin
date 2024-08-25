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

import java.util.ArrayList;
import java.util.List;

public class GUI implements InventoryHolder {
    protected Inventory inventory;

    protected ItemStack g = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);

    protected ItemStack p = new ItemStack(Material.OAK_PLANKS, 1);

    protected ItemStack s = new ItemStack(Material.STICK,1);

    protected ItemStack in = new ItemStack(Material.IRON_NUGGET, 1);
    protected ItemStack sn = new ItemStack(Material.IRON_NUGGET, 1);
    protected ItemStack h = new ItemStack(Material.CHAINMAIL_HELMET,1);

    protected ItemStack c = new ItemStack(Material.CHAINMAIL_CHESTPLATE,1);

    protected ItemStack l = new ItemStack(Material.CHAINMAIL_LEGGINGS,1);

    protected ItemStack b = new ItemStack(Material.CHAINMAIL_BOOTS,1);

    protected ItemStack n = null;

    protected ItemStack ba = new ItemStack(Material.BARRIER, 1);


    public GUI(String title){
        inventory = Bukkit.createInventory(this,45,title);
        init();
    }



    protected void init() {



        ItemMeta glasMeta = g.getItemMeta();
        glasMeta.setDisplayName(" ");
        g.setItemMeta(glasMeta);

        ItemMeta baMeta = ba.getItemMeta();
        baMeta.setDisplayName(ChatColor.WHITE + "back");
        ba.setItemMeta(baMeta);

        ItemMeta strongNuggetMeta = sn.getItemMeta();
        strongNuggetMeta.setDisplayName(ChatColor.BOLD + "Strong Iron Nugget");
        sn.setItemMeta(strongNuggetMeta);

    }
    @NotNull
    @Override
    public Inventory getInventory() {
        return inventory;
    }
}

