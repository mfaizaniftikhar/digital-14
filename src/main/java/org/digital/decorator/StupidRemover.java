package org.digital.decorator;

import org.digital.SimpleWriter;
import org.digital.decorator.WriterDecorator;

public class StupidRemover extends WriterDecorator {

    SimpleWriter simpleWriter;

    public StupidRemover(SimpleWriter simpleWriter) {
        this.simpleWriter = simpleWriter;
    }

    @Override
    public String write() {

        return simpleWriter.write();
    }

    @Override
    public String getData() {

        return simpleWriter.getData().replaceAll("(?i)stupid", "s*****");
    }
}
