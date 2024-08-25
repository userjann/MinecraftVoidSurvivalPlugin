package ch.mc.jr.recipes;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Recipes extends JavaPlugin implements CommandExecutor, Listener {

    @Override
    public void onEnable() {

        registerRecipes();
    }

    @Override
    public void onDisable() {
    }

    private void registerRecipes() {
        ItemStack oakPlanks = new ItemStack(Material.OAK_PLANKS, 2);
        ShapedRecipe wood = new ShapedRecipe(new NamespacedKey(this, "plank"), oakPlanks);
        wood.shape("XX", "XX");
        wood.setIngredient('X', Material.STICK);

        ItemStack strongNugget = new ItemStack(Material.IRON_NUGGET);
        ItemMeta strongNuggetMeta = strongNugget.getItemMeta();
        strongNuggetMeta.setDisplayName(ChatColor.BOLD + "Strong Iron Nugget");
        strongNugget.setItemMeta(strongNuggetMeta);

        ShapedRecipe strongIronNugget = new ShapedRecipe(new NamespacedKey(this, "strongNugget"), strongNugget);
        strongIronNugget.shape("YYY", "YYY", "   ");
        strongIronNugget.setIngredient('Y', Material.IRON_NUGGET);

        ItemStack chainHelmet = new ItemStack(Material.CHAINMAIL_HELMET);
        ShapedRecipe chainmailHelmet = new ShapedRecipe(new NamespacedKey(this, "chainmailHelmet"), chainHelmet);
        chainmailHelmet.shape("ZZZ", "Z Z", "   ");
        chainmailHelmet.setIngredient('Z', new RecipeChoice.ExactChoice(strongNugget));

        ItemStack chainChestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ShapedRecipe chainmailChestplate = new ShapedRecipe(new NamespacedKey(this, "chainmailChestplate"), chainChestplate);
        chainmailChestplate.shape("X X", "XXX", "XXX");
        chainmailChestplate.setIngredient('X', new RecipeChoice.ExactChoice(strongNugget));

        // Chainmail Leggings Recipe
        ItemStack chainLeggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ShapedRecipe chainmailLeggings = new ShapedRecipe(new NamespacedKey(this, "chainmail_leggings"), chainLeggings);
        chainmailLeggings.shape("XXX", "X X", "X X");
        chainmailLeggings.setIngredient('X', strongNugget.getType());

        // Chainmail Boots Recipe
        ItemStack chainBoots = new ItemStack(Material.CHAINMAIL_BOOTS);
        ShapedRecipe chainmailBoots = new ShapedRecipe(new NamespacedKey(this, "chainmail_boots"), chainBoots);
        chainmailBoots.shape("   ", "X X", "X X");
        chainmailBoots.setIngredient('X', strongNugget.getType());

        getServer().addRecipe(wood);
        getServer().addRecipe(strongIronNugget);
        getServer().addRecipe(chainmailHelmet);
        getServer().addRecipe(chainmailChestplate);
        getServer().addRecipe(chainmailLeggings);
        getServer().addRecipe(chainmailBoots);
    }


}
