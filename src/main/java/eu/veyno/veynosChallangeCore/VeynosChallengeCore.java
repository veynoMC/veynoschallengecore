package eu.veyno.veynosChallangeCore;

import eu.veyno.veynosChallangeCore.command.StartCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class VeynosChallengeCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("start").setExecutor(new StartCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
