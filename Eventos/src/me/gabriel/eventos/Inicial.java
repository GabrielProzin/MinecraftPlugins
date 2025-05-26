package me.gabriel.eventos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Inicial extends JavaPlugin {

    @Override
    public void onEnable(){

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + getClass().getSimpleName() + " Iniciado com sucesso!");

        getServer().getPluginManager().registerEvents(new Eventos(), this);
        Eventos blockBreakEvent = new Eventos();
    }
}
