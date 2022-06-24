import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StoredFiles {
    private String storedFiles;
    private JsonArray memory;

    public StoredFiles(String storedFiles) {
        this.storedFiles = storedFiles;
        this.memory = memory;
    }

    public int search(String key, String value) {
        int index = -1;
        String diachi = null;
        for (int i = 0; i < memory.size(); i++) {
            JsonObject jsonObject = memory.get(i).getAsJsonObject();
            diachi = jsonObject.get(key).getAsString();
            if (value.equals(diachi)) {
                index = i;

            }
            String sophong = null;
            for (int j = 0; j < memory.size(); j++) {
                jsonObject = memory.get(j).getAsJsonObject();
                sophong = jsonObject.get(key).getAsString();
                break;
            }
            return index;
        }
        return index;
    }

    public JsonArray read() {
        JsonArray jsonArray = null;
        try (FileReader reader = new FileReader(storedFiles)) {
            jsonArray = (JsonArray) JsonParser.parseReader(reader);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return jsonArray;
    }

    public void update(String diachi, String sophong, float dientich, float gia, boolean tienich, String yeucauthem) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("AD", diachi);
        jsonObject.addProperty("NU", sophong);
        jsonObject.addProperty("S", dientich);
        jsonObject.addProperty("MO", gia);
        jsonObject.addProperty("TI", tienich);
        jsonObject.addProperty("NOTE", yeucauthem);
        memory.add(jsonObject);
    }

    public void write() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(storedFiles)) {
            gson.toJson(memory, writer);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public JsonArray getAll() {
        return this.memory;
    }
}
