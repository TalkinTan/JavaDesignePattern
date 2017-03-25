package com.gmail.italkingtan.structure.facade;

import java.io.*;

/**
 * Created by tantan on 2017/1/23.
 */
public class FileReader {
    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public String read() {
        System.out.println("==读取文件==");
        StringBuilder sb = new StringBuilder();

        try {
            InputStream fileInputStream = this.getClass().getResourceAsStream("/facade/" + fileName);
            //每次读取时，将1024装满
            byte[] b = new byte[1024];
            int length = 0;

            while ((length = fileInputStream.read(b)) != -1) {
                String s = new String(b, 0, length);
                sb.append(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
