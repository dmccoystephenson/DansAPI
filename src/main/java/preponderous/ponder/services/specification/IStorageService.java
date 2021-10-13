package preponderous.ponder.services.specification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IStorageService {
    void initialize(String filePath);
    boolean writeOutFiles(List<Map<String, String>> saveData, String fileName);
    ArrayList<HashMap<String, String>> loadDataFromFilename(String filename);
}