package com.onarandombox.MultiverseCore.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.onarandombox.MultiverseCore.api.MultiverseWorld;

/**
 * Called after Multiverse has successfully loaded a world.
 */
public class MVWorldLoadEvent extends Event {
    private final MultiverseWorld world;

    public MVWorldLoadEvent(MultiverseWorld world) {
        if (world == null)
            throw new IllegalArgumentException("world can't be null!");

        this.world = world;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    /**
     * {@inheritDoc}
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * Gets the handler list. This is required by the event system.
     * @return A list of HANDLERS.
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    /**
     * Gets the world that's about to be deleted.
     *
     * @return That {@link MultiverseWorld}.
     */
    public MultiverseWorld getWorld() {
        return world;
    }
}
