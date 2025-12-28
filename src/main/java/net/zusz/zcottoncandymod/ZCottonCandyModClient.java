package net.zusz.zcottoncandymod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.zusz.zcottoncandymod.screen.ModScreenHandlers;
import net.zusz.zcottoncandymod.screen.custom.CottonCandyMachineScreen;

public class ZCottonCandyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.COTTON_CANDY_MACHINE_SCREEN_HANDLER, CottonCandyMachineScreen::new);
    }
}
