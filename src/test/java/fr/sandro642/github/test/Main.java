package fr.sandro642.github.test;

import fr.sandro642.github.ChannelzAPI.ChannelzAPI;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ChannelzAPI.Channelz().setChannels("Channelz");
        ChannelzAPI.Channelz().setSubChannels("sub");

    }
}
