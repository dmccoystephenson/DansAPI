package preponderous.ponder.minecraft.spigot.modifiers;

import java.util.ArrayList;
import java.util.UUID;

/**
 * @author Daniel Stephenson
 */
public interface Lockable {
    void setOwner(UUID s);
    UUID getOwner();
    void addToAccessList(UUID playerName);
    void removeFromAccessList(UUID playerName);
    boolean hasAccess(UUID playerName);
    ArrayList<UUID> getAccessList();
}