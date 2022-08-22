package org.digital.decorator;

import org.digital.SimpleWriter;
import org.digital.decorator.WriterDecorator;

public class LowerCase extends WriterDecorator {

    SimpleWriter simpleWriter;

    public LowerCase(SimpleWriter simpleWriter) {
        this.simpleWriter = simpleWriter;
    }

    @Override
    public String write() {

        return simpleWriter.write();
    }

    @Override
    public String getData() {

        return simpleWriter.getData().toLowerCase();
    }
}
