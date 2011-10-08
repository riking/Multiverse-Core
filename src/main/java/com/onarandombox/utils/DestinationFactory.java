/******************************************************************************
 * Multiverse 2 Copyright (c) the Multiverse Team 2011.                       *
 * Multiverse 2 is licensed under the BSD License.                            *
 * For more information please check the README.md file included              *
 * with this project.                                                         *
 ******************************************************************************/

package com.onarandombox.utils;

import com.onarandombox.MultiverseCore.MultiverseCore;
import com.onarandombox.utils.MVDestination;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

/**
 * Dummy class to make old MV Plugins not explode.
 * If this loads, the user WILL get a severe telling them to update said plugin!
 * WILL BE DELETED ON 11/1/11
 */

@Deprecated
public class DestinationFactory extends com.onarandombox.MultiverseCore.destination.DestinationFactory {
    public DestinationFactory(MultiverseCore plugin) {
        super(plugin);
    }

    @Override
    public MVDestination getDestination(String destination) {
        return new InvalidDestination();
    }
}
