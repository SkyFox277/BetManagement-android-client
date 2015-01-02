package de.js.android.betmanagement.model;

import com.google.gson.annotations.Expose;

public class Links {

    @Expose
    private Self self;

    /**
     *
     * @return
     * The self
     */
    public Self getSelf() {
        return self;
    }

    /**
     *
     * @param self
     * The self
     */
    public void setSelf(Self self) {
        this.self = self;
    }

}
