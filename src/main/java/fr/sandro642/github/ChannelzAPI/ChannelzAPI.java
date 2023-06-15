package fr.sandro642.github.ChannelzAPI;

import fr.sandro642.github.channels.SetChannels;
import org.bukkit.plugin.Plugin;

public class ChannelzAPI {

    private static ChannelzAPI instance;
    private boolean status;

    private Plugin plugin;
    public ChannelzAPI(Plugin plugin) {
        this.plugin = plugin;
        SetChannels.setPlugin(plugin);
    }

    // Check status of api

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Set channels name

    public void setChannels(String name) {

        if (!status == false) return;
            SetChannels.setChannels(name);
    }




    // Getter class ChannelzAPI

    public static ChannelzAPI getInstance() {
        return instance;
    }
}
