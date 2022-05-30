package me.durqznohh.social.Commands;

import me.durqznohh.social.SocialLinks;
import me.durqznohh.social.Utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {

    private SocialLinks main;

    private void Config() {
        this.main = main;
    }


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;

            p.sendMessage(Utils.translate(String.valueOf(main.getConfig().getString("Discord"))));

        }

        return false;
    }
}

