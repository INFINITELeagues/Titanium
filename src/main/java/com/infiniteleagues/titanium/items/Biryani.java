package com.infiniteleagues.titanium.items;

import com.infiniteleagues.titanium.titanium;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Biryani extends Item {
    public Biryani() {
        super(new Item.Properties()
        .group(titanium.TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(1.5f)
                        .effect(new EffectInstance(Effects.REGENERATION,600, 4),1 )
                        .setAlwaysEdible()
                        .build())



        );
    }
}
