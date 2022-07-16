package Lesson4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private final Map<String, HashSet<String>> surnamePhone;

    public PhoneBook() {
        this.surnamePhone = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        HashSet<String> numbers;
        if (surnamePhone.containsKey(surname)) {
            numbers = surnamePhone.get(surname);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNumber);
        surnamePhone.put(surname, numbers);
    }

    @SuppressWarnings("SameParameterValue")
    Set<String> get(String surname) {
        return surnamePhone.get(surname);
    }

    public void print() {
        for (Map.Entry<String, HashSet<String>> o : surnamePhone.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
}
