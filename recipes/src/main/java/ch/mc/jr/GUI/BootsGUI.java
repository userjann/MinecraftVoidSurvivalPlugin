package ch.mc.jr.GUI;

import com.google.common.collect.Lists;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class BootsGUI extends GUI{
    public BootsGUI( ) {
        super("Chainmail Boots");
    }

    protected void init() {
       super.init();
       List<ItemStack> Plank = Lists.newArrayList(
                g, g, g, g, g, g, g, g, g,
                g, g, n, n, n, g, g, g, g,
                g, g, sn, n, sn, g, b, g, g,
                g, g, sn, n, sn, g, g, g, g,
                ba, g, g, g, g, g, g, g, g
        );

        for (int i =0; i< Plank.size(); i++ ){
            if(Plank.get(i) != null){
                inventory.setItem(i, Plank.get(i));
            }
        }
    }
}
