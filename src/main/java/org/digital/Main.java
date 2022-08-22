package org.digital;

import org.digital.decorator.DuplicateRemover;
import org.digital.decorator.LowerCase;
import org.digital.decorator.StupidRemover;
import org.digital.decorator.UpperCase;

public class Main {
    public static void main(String[] args) {

        WriterUseCase sringUseCase = new WriterUseCase();
        System.out.println(sringUseCase.stringWriter());

        WriterUseCase fileUseCase = new WriterUseCase();
        System.out.println(fileUseCase.fileWriter());

    }
}