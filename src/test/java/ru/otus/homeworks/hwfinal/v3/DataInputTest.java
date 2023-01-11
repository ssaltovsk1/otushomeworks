package ru.otus.homeworks.hwfinal.v3;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class DataInputTest {

    DataInput toTestInput = new DataInput();
    @Test
    void getInputData() {
        String expected = "333";

        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("333".getBytes());
        System.setIn(in);
        String input = toTestInput.getInputData();;

        System.setIn(sysInBackup);
    }

}