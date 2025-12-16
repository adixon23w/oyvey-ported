package me.alpha432.oyvey.features.modules.combat;

import me.alpha432.oyvey.event.impl.PacketEvent;
import me.alpha432.oyvey.event.system.Subscribe;
import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.network.protocol.game.ServerboundInteractPacket;
import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;

    
public class Reach extends Module {
    public Reach() {
        super("Reach", Category.COMBAT);
    }

    public final Setting<Float> blocksRange = new Setting<>("BlocksRange", 3f, 0.1f, 10.0f);
    public final Setting<Float> entityRange = new Setting<>("EntityRange", 3f, 0.1f, 10.0f);
    public final Setting<Boolean> Creative = new Setting<>("Creative", false);
    public final Setting<Float> creativeBlocksRange = new Setting<>("CBlocksRange", 5f, 0.1f, 10.0f, v -> Creative.getValue());
    public final Setting<Float> creativeEntityRange = new Setting<>("CEntityRange", 5f, 0.1f, 10.0f, v -> Creative.getValue());

    @Override
    public String getDisplayInfo() {
        return "B: " + blocksRange.getValue() + " E:" + entityRange.getValue();
    }
}
