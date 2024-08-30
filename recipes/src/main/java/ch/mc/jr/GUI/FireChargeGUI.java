package ch.mc.jr.GUI;

import com.google.common.collect.Lists;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class FireChargeGUI extends GUI{
    public FireChargeGUI( ) {
        super("Firecharge");
    }

    protected void init() {
       super.init();
       List<ItemStack> Plank = Lists.newArrayList(
                g, g, g, g, g, g, g, g, g,
                g, g, g, ch, g, g, g, g, g,
                g, g, g, g, g, g, f, g, g,
                g, g, g, p, g, g, g, g, g,
                ba, g, g, g, g, g, g, g, g
        );

        for (int i =0; i< Plank.size(); i++ ){
            if(Plank.get(i) != null){
                inventory.setItem(i, Plank.get(i));
            }
        }
    }
}
