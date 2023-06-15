package fr.sandro642.github.ChannelzAPI;

import fr.sandro642.github.channels.GetChannels;
import fr.sandro642.github.channels.SetChannels;
import org.bukkit.plugin.Plugin;

public class ChannelzAPI {

    private static ChannelzAPI instance;
    private boolean status;
    public String channelname;
    public String subchannelname;

    private Plugin plugin;
    public ChannelzAPI(Plugin plugin) {
        this.plugin = plugin;
        SetChannels.setPlugin(plugin);
        GetChannels.setPlugin(plugin);
    }

    // Check status of api

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Set channels name

    public void setChannels(String name) {
        if (!status == false) return;
        SetChannels.setChannels(name);
        this.channelname = name;
    }

    public void setSubChannels(String name) {
        if (!status == false) return;
        // SetChannels.setSubChannels(name);
        this.subchannelname = name;
    }

    // Get channels

    public void getChannels() {
        if (!status == false) return;
        GetChannels.onPluginMessageReceived();
    }




    // Getter class ChannelzAPI

    public static ChannelzAPI Channelz() {
        return instance;
    }
}
