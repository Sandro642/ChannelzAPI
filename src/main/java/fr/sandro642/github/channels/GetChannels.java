package fr.sandro642.github.channels;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import fr.sandro642.github.ChannelzAPI.ChannelzAPI;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class GetChannels {

    private static Plugin plugin;
    public static void setPlugin(Plugin plugin) {
        GetChannels.setPlugin(plugin);
    }

    public static String player;
    public static String value;
    public static Integer integer;
    public static Double aDouble;
    public static Boolean aBoolean;

    public static void onPluginMessageReceived() {
        String channel = "Channelz:" + ChannelzAPI.Channelz().channelname;
        byte[] message = new byte[0];
        if (!channel.equals("Channelz" + ChannelzAPI.Channelz().channelname)) return;
        ByteArrayDataInput in = ByteStreams.newDataInput(message);
        String subchannel = in.readUTF();
        if (subchannel.equals(ChannelzAPI.Channelz().subchannelname)) {

        }
    }

}
