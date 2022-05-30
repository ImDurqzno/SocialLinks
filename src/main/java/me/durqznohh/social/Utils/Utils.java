package me.durqznohh.social.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Utils {

    public static void logger(String msg) {
        Bukkit.getConsoleSender().sendMessage(msg);
    }

    public static String translate(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}

