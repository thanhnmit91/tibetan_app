package com.android.dfr.tibetan_dfr.adapters;

/**
 * Created by bpncool on 2/23/2016.
 */
public class Section {

    private final String name;

    public boolean isExpanded;

    public Section(String name) {
        this.name = name;
        isExpanded = false;
    }

    public String getName() {
        return name;
    }
}
