package services;

import java.util.*;

import models.dictionary;

public class DS_mpl {
    private static Map<Integer, dictionary> dictionaryMap=new HashMap<>();

    static {
        dictionaryMap.put(1,new dictionary("hello","xin chao"));
        dictionaryMap.put(2,new dictionary("hi","xin chao"));
        dictionaryMap.put(3,new dictionary("school","truong hoc"));
        dictionaryMap.put(4,new dictionary("one","mot"));
        dictionaryMap.put(5,new dictionary("two","hai"));
        dictionaryMap.put(6,new dictionary("three","ba"));
        dictionaryMap.put(7,new dictionary("shopping","mua sam"));
        dictionaryMap.put(8,new dictionary("ten","muoi"));
    }

    public List<dictionary> findAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
