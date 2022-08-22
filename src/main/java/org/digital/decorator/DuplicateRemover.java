package org.digital.decorator;

import org.digital.SimpleWriter;
import org.digital.decorator.WriterDecorator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateRemover extends WriterDecorator {

    SimpleWriter simpleWriter;

    public DuplicateRemover(SimpleWriter simpleWriter) {
        this.simpleWriter = simpleWriter;
    }

    @Override
    public String write() {

        return this.simpleWriter.write();
    }

    @Override
    public String getData() {
        String duplicates = "";
        String[] removeDuplicates = simpleWriter.getData().split(" ");
        HashSet<String> s = new LinkedHashSet<String>(Arrays.asList(removeDuplicates));
        for (String x : removeDuplicates)
            s.add(x);
        return String.join(" ", s);
    }
}
