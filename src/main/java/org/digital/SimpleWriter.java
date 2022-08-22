package org.digital;

import org.digital.decorator.DuplicateRemover;
import org.digital.decorator.LowerCase;
import org.digital.decorator.StupidRemover;
import org.digital.decorator.UpperCase;

public abstract class SimpleWriter {

    String data = "Unknow writer";

    public String getData() {
        return data;
    }

    public void setData() {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public abstract String write();

    public SimpleWriter lowerCase() {
        return new LowerCase(this);
    }

    public SimpleWriter upperCase() {
        return new UpperCase(this);
    }

    public SimpleWriter duplicateRemover() {
        return new DuplicateRemover(this);
    }

    public SimpleWriter stupidRemover() {
        return new StupidRemover(this);
    }
}


