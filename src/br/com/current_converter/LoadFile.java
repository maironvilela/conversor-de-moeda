package br.com.current_converter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
 import java.util.List;

public class LoadFile {

    public List<Options> execute(String fileName){

        JsonToObjectConverter<List<Options>> jsonConverter = new JsonToObjectConverter<List<Options>>();
        Gson gson = new Gson();
        List<Options> options = null;

        try {
             String content = new String(Files.readAllBytes(Paths.get(fileName)));

             Type type = new TypeToken<List<Options>>(){}.getType();
               options = gson.fromJson(content, type);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao ler o arquivo: " + fileName, e);
        }


        return options;

    }

}
