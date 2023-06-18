package fr.sandro642.github.channels;

import fr.sandro642.github.ChannelzAPI.ChannelzAPI;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import static org.bukkit.Bukkit.getServer;

public class SetChannels {

    private static Plugin plugin;

    public static void setPlugin(Plugin plugin) {
        SetChannels.plugin = plugin;
    }

    public static void setChannels(String channels) {
        getServer().getMessenger().registerOutgoingPluginChannel(plugin, "Channelz:" + channels);
        getServer().getMessenger().registerIncomingPluginChannel(plugin, "Channelz:" + channels, (PluginMessageListener) ChannelzAPI.Channelz());
    }
}
