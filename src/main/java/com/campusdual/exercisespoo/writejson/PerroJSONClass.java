package com.campusdual.exercisespoo.writejson;

import com.campusdual.exercisespoo.Perro;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PerroJSONClass {

    public void writeJSON() {
        Perro balto = new Perro(90, true, "Huskey", "Balto", "Gris", 25);
        Perro roco = new Perro(80, false, "Labrador", "Roco", "Negro", 15);
        Perro rex = new Perro(85, true, "Pastor alemán", "Rex", "Bicolor", 30);

        JSONArray perretes = new JSONArray();
        perretes.add(balto.toJSON());
        perretes.add(roco.toJSON());
        perretes.add(rex.toJSON());

        JSONObject objComponent = new JSONObject();
        objComponent.put("perros", perretes);
//        System.out.println(objComponent.toJSONString());

        try (FileWriter fw = new FileWriter("src/main/resources/perros.json")) {
            fw.write(objComponent.toJSONString());
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readJSON() {
        JSONParser parser = new JSONParser();
        try (FileReader fr = new FileReader("src/main/resources/perros.json")) {
            JSONObject parse = (JSONObject) parser.parse(fr);
            JSONArray perrosArray = (JSONArray) parse.get("perros");
            for (int i = 0; i < perrosArray.size(); i++) {
                JSONObject perroEnJSON = ((JSONObject) perrosArray.get(i));
                Perro perro = new Perro(perroEnJSON);
                perro.presentarse();
            }

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        PerroJSONClass json = new PerroJSONClass();
        json.writeJSON();
        json.readJSON();
    }

}
