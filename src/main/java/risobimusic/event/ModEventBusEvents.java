package risobimusic.event;


import risobimusic.RisobiMusicMain;
import risobimusic.event.loot.BrysonTillerDungeonModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = RisobiMusicMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new BrysonTillerDungeonModifier.Serializer().setRegistryName
                        (new ResourceLocation(RisobiMusicMain.MOD_ID,"brysontiller_dungeon_modifier")),
                new BrysonTillerDungeonModifier.Serializer().setRegistryName
                        (new ResourceLocation(RisobiMusicMain.MOD_ID,"brysontiller_creeper_modifier"))


        );
    }
}