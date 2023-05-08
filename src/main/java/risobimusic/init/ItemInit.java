package risobimusic.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import risobimusic.RisobiMusicMain;
import risobimusic.sound.ModSounds;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RisobiMusicMain.MOD_ID);

    public static final RegistryObject<Item> BRYSONTILLER = ITEMS.register("brysontiller",
            () -> new RecordItem(4, ModSounds.DONT,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BRYSONTILLERPLAT = ITEMS.register("brysontillerplat",
            () -> new RecordItem(4, ModSounds.DONT_PLAT,
                    new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

}
