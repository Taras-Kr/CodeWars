package com.codewars.implementation.classes;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/interactive-dictionary/
 */
public class Dictionary {
    private Map<String, String> entry;

    public Dictionary() {
        entry = new HashMap();
    }

    public void newEntry(String key, String value) {
        entry.put(key, value);
    }

    public String look(String key) {
        return entry.getOrDefault(key, "Cant find entry for " + key);
    }
}
