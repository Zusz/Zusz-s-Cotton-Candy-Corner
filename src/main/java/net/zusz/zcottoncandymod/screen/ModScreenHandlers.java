package net.zusz.zcottoncandymod.screen;

import net.zusz.zcottoncandymod.ZCottonCandyMod;
import net.zusz.zcottoncandymod.screen.custom.CottonCandyMachineScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CottonCandyMachineScreenHandler> COTTON_CANDY_MACHINE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(ZCottonCandyMod.MOD_ID, "cotton_candy_machine_screen_handler"),
                    new ExtendedScreenHandlerType<>(CottonCandyMachineScreenHandler::new, BlockPos.PACKET_CODEC));
    public static void registerScreenHandlers() {
        ZCottonCandyMod.LOGGER.info("Registering Screen Handlers for " + ZCottonCandyMod.MOD_ID);
    }
}
