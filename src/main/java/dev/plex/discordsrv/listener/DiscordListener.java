package dev.plex.discordsrv.listener;

import dev.plex.listener.PlexListener;
import dev.plex.util.PlexLog;
import github.scarsz.discordsrv.DiscordSRV;
import github.scarsz.discordsrv.dependencies.jda.api.entities.TextChannel;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.BroadcastMessageEvent;

public class DiscordListener extends PlexListener
{
    @EventHandler
    public void onBroadcastMessage(BroadcastMessageEvent event)
    {
        Component message = event.message();
        TextChannel textChannel = DiscordSRV.getPlugin().getDestinationTextChannelForGameChannelName("global");
        if (textChannel != null)
        {
            textChannel.sendMessage(LegacyComponentSerializer.legacyAmpersand().serialize(message)).queue();
        }
        else
        {
            PlexLog.debug("Error sending message to channel!");
        }
    }
}
