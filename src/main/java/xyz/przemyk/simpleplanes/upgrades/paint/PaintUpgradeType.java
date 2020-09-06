package xyz.przemyk.simpleplanes.upgrades.paint;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import xyz.przemyk.simpleplanes.upgrades.UpgradeType;

public class PaintUpgradeType extends UpgradeType {

    public PaintUpgradeType() {
        super(null /* placeholder */, PaintUpgrade::new);
    }

    @Override
    public boolean IsThisItem(ItemStack itemStack) {
        return PaintUpgrade.PAINTS.containsKey(itemStack.getItem().getRegistryName()) && itemStack.getCount() == 64;
    }
}
