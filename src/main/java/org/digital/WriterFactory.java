package org.digital;

import org.digital.decorator.types.WriterType;

public class WriterFactory {

    public SimpleWriter getSimpleWriter(String writerType) {
        if(writerType == null){
            return null;
        }
        if(WriterType.STRING_WRITER.equalsName(writerType)){
            return new StringWriter();

        } else if(WriterType.FILE_WRITER.equalsName(writerType)){
            return new FilesWriter();
        }

        return null;
    }
}
