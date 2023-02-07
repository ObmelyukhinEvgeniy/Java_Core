package Lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> arrayList;

    public Box() {
        arrayList = new ArrayList<>();
    }

    public void add(T element) {
        arrayList.add(element);
    }

    public void addition(Box<T> targetBox) {
        for (T t : arrayList) {
            targetBox.add(t);
        }
        arrayList.clear();
    }

    public Float getWeight() {
        return arrayList.size() * arrayList.get(0).getWeight();
    }

    public Boolean compare(Box<?> element) {
        return this.getWeight().equals(element.getWeight());
    }

}
