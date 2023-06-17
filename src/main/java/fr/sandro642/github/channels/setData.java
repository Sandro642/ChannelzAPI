package fr.sandro642.github.channels;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import fr.sandro642.github.ChannelzAPI.ChannelzAPI;
import org.bukkit.entity.Player;
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
            final ByteArrayDataOutput out = ByteStreams.newDataOutput();
            final ByteArrayDataInput in = ByteStreams.newDataInput(out.toByteArray());

            String subchannel = in.readUTF();
            if (subchannel.equals(ChannelzAPI.Channelz().subchannelname)) {
                // setData
                out.writeUTF(String.valueOf(subchannel.equals(ChannelzAPI.Channelz().subchannelname)));
                out.writeUTF(player);
                out.writeUTF(value);
                out.writeInt(integer);
                out.writeDouble(aDouble);
                out.writeBoolean(aBoolean);

                final Player player1 = plugin.getServer().getPlayer(player);

                player1.sendPluginMessage((Plugin) ChannelzAPI.Channelz(), channel, out.toByteArray());
            }
        }
    }
}
