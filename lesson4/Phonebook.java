package ru.geekbrains.lesson4;

import java.util.*;

class Phonebook {
    private final HashMap<String, String> phonebook = new HashMap<>();

    private ArrayList<String> getPhone(String name) {
        ArrayList<String> phones = new ArrayList<>();

        Set<Map.Entry<String, String>> phonebookMap = phonebook.entrySet();
        for (Map.Entry<String, String> entry : phonebookMap) {
            if (Objects.equals(entry.getValue(), name))
                phones.add(entry.getKey());
        }
        return phones;
    }

    void getInfo(String name) {
        ArrayList<String> phones = getPhone(name);
        for (String phone : phones) {
            System.out.println("Номер " + name + ": " + phone);
        }
    }

    void putInfo(String name, String phone) {
        phonebook.put(phone, name);
    }
}