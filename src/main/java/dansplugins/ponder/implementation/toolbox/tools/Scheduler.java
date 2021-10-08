package dansplugins.ponder.implementation.toolbox.tools;

import dansplugins.ponder.implementation.PonderAPI;
import dansplugins.ponder.specification.toolbox.tools.IScheduler;
import org.bukkit.Bukkit;

public class Scheduler implements IScheduler {

    private PonderAPI ponderAPI;

    public Scheduler(PonderAPI ponderAPI) {
        this.ponderAPI = ponderAPI;
    }

    @Override
    public void scheduleAutosave() {
        int delay = 60 * 60; // 1 hour
        int secondsUntilRepeat = 60 * 60; // 1 hour
        Bukkit.getScheduler().scheduleSyncRepeatingTask(ponderAPI.getPlugin(), new Runnable() {
            @Override
            public void run() {
                ponderAPI.getStorageService().save();
            }
        }, delay * 20, secondsUntilRepeat * 20);
    }

}