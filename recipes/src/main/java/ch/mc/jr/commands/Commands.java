package ch.mc.jr.commands;

import ch.mc.jr.GUI.RecipeGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class Commands implements CommandExecutor {



    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player)sender;
        if (command.getName().equalsIgnoreCase("recipes")){
            RecipeGUI gui = new RecipeGUI();
            player.openInventory(gui.getInventory());
        }

        return true;
    }





}
