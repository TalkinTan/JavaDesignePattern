package com.gmail.italkingtan.structure.facade;

/**
 * Created by tantan on 2017/1/23.
 */
public class EncryptFacade implements Facade {

    private FileReader fileReader;
    private FileWriter fileWriter;

    private Encrypt encrypt;

    public EncryptFacade(String srcFileName, String destFileName) {
        fileReader = new FileReader(srcFileName);
        encrypt = new Encrypt();
        fileWriter = new FileWriter(destFileName);
    }

    @Override
    public void method() {
        String info = fileReader.read();
        String encryptInfo = encrypt.encrypt(info);

        System.out.println(encryptInfo);
        fileWriter.write(encryptInfo);
    }
}
