package fr.sandro642.github.ChannelzAPI;

import fr.sandro642.github.channels.GetChannels;
import fr.sandro642.github.channels.SetChannels;
import fr.sandro642.github.channels.setData;
import org.bukkit.plugin.Plugin;

public class ChannelzAPI {

    private static ChannelzAPI instance;
    private boolean status;
    public String channelname;
    public String subchannelname;

    // set data

    public String setPlayer(String player) {
        return player = GetChannels.player;
    }

    public String setString(String value) {
        return value = GetChannels.value;
    }

    public Integer setInteger(Integer integer) {
        return integer = GetChannels.integer;
    }

    public Double setDouble(Double aDouble) {
        return aDouble = GetChannels.aDouble;
    }

    public Boolean setBoolean(Boolean aBoolean) {
        return aBoolean = GetChannels.aBoolean;
    }

    // get data

    public String getPlayer() {
        return GetChannels.player;
    }

    public String getString() {
        return GetChannels.value;
    }

    public Integer getInteger() {
        return GetChannels.integer;
    }

    public Double getDouble() {
        return GetChannels.aDouble;
    }

    public Boolean getBoolean() {
        return GetChannels.aBoolean;
    }

    private Plugin plugin;

    public ChannelzAPI(Plugin plugin) {
        this.plugin = plugin;
        SetChannels.setPlugin(plugin);
        GetChannels.setPlugin(plugin);
        setData.setPlugin(plugin);
    }

    // Set status

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
        this.subchannelname = name;
    }

    public void launchData() {
        if (!status == false) return;
        setData.load();
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
