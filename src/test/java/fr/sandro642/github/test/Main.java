package fr.sandro642.github.test;

import fr.sandro642.github.ChannelzAPI.ChannelzAPI;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        ChannelzAPI.Channelz().setStatus(true);
        ChannelzAPI.Channelz().setChannels("custom");
        ChannelzAPI.Channelz().setSubChannels("subcustom");
        ChannelzAPI.Channelz().setPlayer("Sandro642");
        ChannelzAPI.Channelz().setString("Hello World");
        ChannelzAPI.Channelz().setInteger(1);
        ChannelzAPI.Channelz().setDouble(1.0);
        ChannelzAPI.Channelz().setBoolean(true);
        ChannelzAPI.Channelz().launchData();
    }
}
