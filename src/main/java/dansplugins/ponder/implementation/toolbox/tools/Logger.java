package dansplugins.ponder.implementation.toolbox.tools;

import dansplugins.ponder.implementation.PonderAPI;
import dansplugins.ponder.specification.toolbox.tools.ILogger;

public class Logger implements ILogger {

    private PonderAPI ponderAPI;

    public Logger(PonderAPI dansAPI) {
        this.ponderAPI = dansAPI;
    }

    @Override
    public void log(boolean debug, String message) {
        if (ponderAPI.getPlugin() == null) {
            System.out.println("Error: Plugin was null.");
            return;
        }
        if (debug) {
            System.out.println("[" + ponderAPI.getPlugin().getName() + "] " + message);
        }
    }

    @Override
    public void print(String message) {
        if (ponderAPI.getPlugin() == null) {
            System.out.println("Error: Plugin was null.");
            return;
        }
        System.out.println("[" + ponderAPI.getPlugin().getName() + "] " + message);
    }
}