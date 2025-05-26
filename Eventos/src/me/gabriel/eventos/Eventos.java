package me.gabriel.eventos;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class Eventos implements Listener {

    @EventHandler
    public void whenBreakABlock(BlockBreakEvent blockBreakEvent){

        Player player = blockBreakEvent.getPlayer();
        Block block = blockBreakEvent.getBlock();
        Material material = block.getType();

        player.sendMessage(player.getName() + " broke the block: " + material.name());

    }
    @EventHandler
    public void whenPlacingBlock(BlockPlaceEvent blockPlaceEvent) {
        Player player = blockPlaceEvent.getPlayer();
        Block blockPlaced = blockPlaceEvent.getBlockPlaced();
        Block block = blockPlaceEvent.getBlock();
        Block blockAgainst = blockPlaceEvent.getBlockAgainst();

        Location location = player.getLocation();

        ItemStack itemStack = blockPlaceEvent.getItemInHand();

        player.sendMessage(("x: " + location.getBlockX() + "y: " + location.getBlockY() + "z: " + location.getBlockZ()));

        player.sendMessage("Quantity of blocks: " + itemStack.getAmount());

        player.sendMessage("Block placed: " + blockPlaced.getType().name() + ", on block: " + blockAgainst.getType().name() + "\n\n\n");
    }
}
