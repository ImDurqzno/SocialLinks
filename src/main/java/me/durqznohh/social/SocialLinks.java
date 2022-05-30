package me.durqznohh.social;

import me.durqznohh.social.Commands.*;
import me.durqznohh.social.Utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocialLinks extends JavaPlugin {

    private SocialLinks main;

    private void Config() {
        this.main = main;
    }


    public void onEnable() {

        Utils.logger(Utils.translate("&f================================"));
        Utils.logger(Utils.translate("&7                                "));
        Utils.logger(Utils.translate("&c        Social Links            "));
        Utils.logger(Utils.translate("&e  The plugin has been enabled   "));
        Utils.logger(Utils.translate("&7                                "));
        Utils.logger(Utils.translate("&e    Plugin made with love by    "));
        Utils.logger(Utils.translate("&e         Durqznohh <3           "));
        Utils.logger(Utils.translate("&7                                "));
        Utils.logger(Utils.translate("&f================================"));


        Utils.logger(Utils.translate("[SocialLinks] Discord command loaded"));
        Utils.logger(Utils.translate("[SocialLinks] Store command loaded"));
        Utils.logger(Utils.translate("[SocialLinks] TeamSpeak command loaded"));
        Utils.logger(Utils.translate("[SocialLinks] Twitter command loaded"));
        Utils.logger(Utils.translate("[SocialLinks] Website command loaded"));


        getConfig().options().copyDefaults();
        saveDefaultConfig();



    }

    private void load() {

        if(main.getConfig().getBoolean("Discord-Enabled"))getCommand("discord").setExecutor(new DiscordCommand());
        if(main.getConfig().getBoolean("Store-Enabled"))getCommand("store").setExecutor(new StoreCommand());
        if(main.getConfig().getBoolean("TeamSpeak-Enabled"))getCommand("teamspeak").setExecutor(new TeamSpeakCommand());
        if(main.getConfig().getBoolean("Twitter-Enabled"))getCommand("twitter").setExecutor(new TwitterCommand());
        if(main.getConfig().getBoolean("Website-Enabled"))getCommand("website").setExecutor(new WebsiteCommand());
        getCommand("sociallinks").setExecutor(new MainCommand());

    }

    public void onDisable() {

       Utils.logger(Utils.translate("&c[Social Links] &fThe plugin has been disabled. Thanks for use it!"));

    }
}
