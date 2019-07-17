package com.poboy975.mcjtytutorial.items;

import com.poboy975.mcjtytutorial.mcjtytutorial;
import net.minecraft.item.Item;

public class FirstItem extends Item {
    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(mcjtytutorial.setup.itemgroup));
        setRegistryName("firstitem");
    }
}
