package net.zusz.zcottoncandymod.block.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zusz.zcottoncandymod.ZCottonCandyMod;
import net.zusz.zcottoncandymod.block.ModBlocks;

public class ModBlockEntities {

    public static final BlockEntityType<CottonCandyMachineBlockEntity> COTTON_CANDY_MACHINE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(ZCottonCandyMod.MOD_ID, "cotton_candy_machine_be"),
                    BlockEntityType.Builder.create(CottonCandyMachineBlockEntity::new, ModBlocks.COTTON_CANDY_MACHINE).build(null));
    public static void registerBlockEntities() {
        ZCottonCandyMod.LOGGER.info("Registering Block Entities for " + ZCottonCandyMod.MOD_ID);
    }
}
