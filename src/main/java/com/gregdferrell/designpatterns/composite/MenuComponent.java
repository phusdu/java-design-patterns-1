package com.gregdferrell.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Greg on 8/1/2017.
 */
public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponentList = new ArrayList<>();

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder sb = new StringBuilder(name);
        sb.append(": ");
        sb.append(url);
        sb.append("\n");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}