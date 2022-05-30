package me.durqznohh.social.Commands;

import me.durqznohh.social.SocialLinks;
import me.durqznohh.social.Utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommand implements CommandExecutor {

    private SocialLinks main;

    private void Config() {
        this.main = main;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player) {
            Player p = (Player) sender;

            p.sendMessage(Utils.translate("&e======================================"));
            p.sendMessage(Utils.translate("&7                                      "));
            p.sendMessage(Utils.translate("&c           Social Links               "));
            p.sendMessage(Utils.translate("&7                                      "));
            p.sendMessage(Utils.translate("&e     Thanks for use the plugin :D!    "));
            p.sendMessage(Utils.translate("&7                                      "));
            p.sendMessage(Utils.translate("&e         Use /socials admin           "));
            p.sendMessage(Utils.translate("&e     To display the admin commands    "));
            p.sendMessage(Utils.translate("&7                                      "));
            p.sendMessage(Utils.translate("&e======================================"));

            if(p.hasPermission(main.getConfig().getString("Admin"))) {
                if(args.length == 0) {
                    if(args[0].equalsIgnoreCase("admin")) {
                        p.sendMessage(Utils.translate("&cAdmin commands: /socials reload"));
                    }

                }
            }

            if(p.hasPermission(main.getConfig().getString("Reload"))) {
                if(args.length == 1) {
                    if (args[0].equalsIgnoreCase("reload")) {
                        p.sendMessage(Utils.translate(main.getConfig().getString("Reload-Msg")));
                        main.reloadConfig();
                    }
                }
            }


        }

        return false;
    }
}