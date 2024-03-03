package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tom", "555 444-2233"));
        list.add(new Contact(2, "Alice", "555 444-2234"));
        list.add(new Contact(3, "Bob", "555 444-2235"));
        return list;
    }
}
