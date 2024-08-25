package ch.mc.jr.GUI;

import com.google.common.collect.Lists;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class ChestplateGUI extends GUI{

    public ChestplateGUI() {
        super("Chainmail Chestplate");
    }

    protected void init() {
       super.init();
       List<ItemStack> Plank = Lists.newArrayList(
                g, g, g, g, g, g, g, g, g,
                g, g, sn, n, sn, g, g, g, g,
                g, g, sn, sn, sn, g, c, g, g,
                g, g, sn, sn, sn, g, g, g, g,
                ba, g, g, g, g, g, g, g, g
        );

        for (int i =0; i< Plank.size(); i++ ){
            if(Plank.get(i) != null){
                inventory.setItem(i, Plank.get(i));
            }
        }
    }
}
