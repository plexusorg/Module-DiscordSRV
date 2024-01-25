package dev.plex.discordsrv;

import dev.plex.discordsrv.listener.DiscordListener;
import dev.plex.module.PlexModule;

public class DiscordSRV extends PlexModule
{
    @Override
    public void enable()
    {
        registerListener(new DiscordListener());
    }

    @Override
    public void disable()
    {
        // Unregistering listeners / commands is handled by Plex
    }
}
