package preponderous.ponder;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import preponderous.ponder.services.specification.ICommandService;
import preponderous.ponder.services.specification.IConfigService;
import preponderous.ponder.services.specification.IStorageService;
import preponderous.ponder.specification.IPonderAPI_Integrator;

public class PonderAPI_Integrator implements IPonderAPI_Integrator {

    private PonderAPI ponderAPI = null;

    public PonderAPI_Integrator(JavaPlugin plugin) {
        if (isPonderPresent()) {
            System.out.println("Ponder was found successfully!");
            ponderAPI = new PonderAPI(plugin);
        }
        else {
            System.out.println("Ponder was not found!");
        }
    }

    public PonderAPI_Integrator(JavaPlugin plugin, ICommandService commandInterpreter, IConfigService configService, IStorageService storageService) {
        if (isPonderPresent()) {
            System.out.println("Ponder was found successfully!");
            ponderAPI = new PonderAPI(plugin, commandInterpreter, configService, storageService);
        }
        else {
            System.out.println("Ponder was not found!");
        }
    }

    /**
     * Method to check whether the Ponder plugin is present on the server.
     *
     * @return Whether or not the Ponder plugin is present on the server.
     */
    @Override
    public boolean isPonderPresent() {
        return (Bukkit.getServer().getPluginManager().getPlugin("PonderAPI") != null);
    }

    /**
     * Method to get the instance of the Ponder API that is managed by this class.
     *
     * @return The instance of the Ponder API that is managed by this class.
     */
    @Override
    public PonderAPI getAPI() {
        return ponderAPI;
    }

}