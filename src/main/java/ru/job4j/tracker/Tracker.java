package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] temp = Arrays.copyOf(items, size);
        Item[] result = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(temp[index].getName())) {
                result[index] = temp[index];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            result = true;
        }
        return result;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            int startPos = index + 1;
            int length = size - index - 1;
            System.arraycopy(items, startPos, items, index, length);
            items[size - 1] = null;
            size--;
        }
    }
}