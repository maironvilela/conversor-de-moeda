package br.com.current_converter;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

public class JsonToObjectConverter<T> {
    public T convert( String json,  Type typeOfT){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy((FieldNamingPolicy.UPPER_CAMEL_CASE))
                .create();

       return gson.fromJson(json, typeOfT);

    }
}
