package fr.sandro642.github.test;

import fr.sandro642.github.ChannelzAPI.ChannelzAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        ChannelzAPI.Channelz().setStatus(true);
        ChannelzAPI.Channelz().setChannels("custom");

        super.onEnable();
    }
}
