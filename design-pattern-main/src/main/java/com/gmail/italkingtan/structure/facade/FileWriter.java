package com.gmail.italkingtan.structure.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by tantan on 2017/1/23.
 */
public class FileWriter {
    private String fileName;

    public FileWriter(String fileName) {
        this.fileName = fileName;
    }

    public void write(String info) {
        System.out.println("==写入文件==");

        try {
            String fileUrl = this.getClass().getResource("/facade/" + fileName).getFile();
            FileOutputStream fos = new FileOutputStream(fileUrl,true);

            fos.write(info.getBytes());
            fos.flush();

            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
