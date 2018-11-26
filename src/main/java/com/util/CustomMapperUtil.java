package com.util;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CustomMapperUtil {
    public static String getClippedJson(String jsonString,Class clazz)
    {
        JSONObject jsonObject = (JSONObject) JSONValue.parse(jsonString);
        Map<Object,Object> clippedJsonMap = new HashMap<>();
        for(Field field : clazz.getDeclaredFields())
        {
            clippedJsonMap.put(field.getName(),jsonObject.get(field.getName()));
        }
        return JSONValue.toJSONString(clippedJsonMap);
    }
}
