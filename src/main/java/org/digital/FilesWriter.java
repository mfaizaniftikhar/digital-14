package org.digital;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class FilesWriter extends SimpleWriter {

    public FilesWriter() {}

    public FilesWriter(String data) {

        data = data;
    }

    @Override
    public String write() {
        return generateFile().getName();
    }

    private File generateFile() {
        try {
            File file = new File("myfile.txt");
            FileWriter fileWriter = null;
            file.setWritable(true);
            file.setReadable(true);
            try {
                fileWriter = new FileWriter(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            fileWriter.write(this.data);
            fileWriter.close();
            return file;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}
