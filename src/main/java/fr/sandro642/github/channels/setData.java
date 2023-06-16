package fr.sandro642.github.channels;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import fr.sandro642.github.ChannelzAPI.ChannelzAPI;
import org.bukkit.plugin.Plugin;

public class setData {

    private static Plugin plugin;
    public static void setPlugin(Plugin plugin) {
        setData.setPlugin(plugin);
    }

    public static String player;
    public static String value;
    public static Integer integer;
    public static Double aDouble;
    public static Boolean aBoolean;


    public static void load() {
        String channel = "Channelz:" + ChannelzAPI.Channelz().channelname;
        if (channel.equals("Channelz" + ChannelzAPI.Channelz().channelname)) {
            final ByteArrayDataInput in = ByteStreams.newDataInput(channel.getBytes());

            String subchannel = in.readUTF();
            if (subchannel.equals(ChannelzAPI.Channelz().subchannelname)) {
                // setData
                player = in.readUTF();
                value = in.readUTF();
                integer = in.readInt();
                aDouble = in.readDouble();
                aBoolean = in.readBoolean();
            }
        }
    }
}
