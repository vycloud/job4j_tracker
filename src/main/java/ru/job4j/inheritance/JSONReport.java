package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String json = "{%n\t\"name\" : \"%s\",%n\t\"body\" : \"%s\"%n}";
        return json.formatted(name, body);
    }
}
