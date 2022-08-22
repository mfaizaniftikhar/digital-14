package org.digital;

import org.digital.decorator.DuplicateRemover;
import org.digital.decorator.LowerCase;
import org.digital.decorator.StupidRemover;
import org.digital.decorator.UpperCase;
import org.digital.decorator.types.WriterType;

public class WriterUseCase {

    public WriterUseCase() {

    }

    /*TODO Didn't get a chance to write unit test cases due to short of time as informed to recruiter
    test use uses based on implementation */
    public String stringWriter() {

        String data = "This is really really stupid";
        String writerType = WriterType.STRING_WRITER.toString();

        WriterFactory writerFactory = new WriterFactory();
        SimpleWriter simpleWriter = writerFactory.getSimpleWriter(writerType);
        simpleWriter.setData(data);

        simpleWriter = simpleWriter.stupidRemover();

        simpleWriter = simpleWriter.duplicateRemover();

        return simpleWriter.getData();
    }

    public String fileWriter() {

        String data = "This is is stupid";
        String writerType = WriterType.FILE_WRITER.toString();

        WriterFactory writerFactory = new WriterFactory();
        SimpleWriter simpleWriter = writerFactory.getSimpleWriter(writerType);
        simpleWriter.setData(data);

        simpleWriter = simpleWriter.duplicateRemover();
        simpleWriter = simpleWriter.stupidRemover();

        return simpleWriter.getData();
    }
}
