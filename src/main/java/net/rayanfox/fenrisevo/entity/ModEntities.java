package net.rayanfox.fenrisevo.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rayanfox.fenrisevo.Fenrisevolution;
import net.rayanfox.fenrisevo.entity.custom.FennecEntity;

public class ModEntities {
    public static final EntityType<FennecEntity> FENNEC = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Fenrisevolution.MOD_ID, "fennec"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FennecEntity::new).dimensions(EntityDimensions.fixed(0.7f, 0.f)).build());
}
