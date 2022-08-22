package org.digital.decorator;

import org.digital.SimpleWriter;
import org.digital.decorator.WriterDecorator;

public class UpperCase extends WriterDecorator {

    SimpleWriter simpleWriter;

    public UpperCase(SimpleWriter simpleWriter) {
        this.simpleWriter = simpleWriter;
    }

    @Override
    public String write() {

        return simpleWriter.write();
    }

    @Override
    public String getData() {

        return simpleWriter.getData().toUpperCase();
    }
}
