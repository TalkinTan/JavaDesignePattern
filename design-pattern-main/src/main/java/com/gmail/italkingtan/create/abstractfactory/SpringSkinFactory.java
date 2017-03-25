package com.gmail.italkingtan.create.abstractfactory;

import com.gmail.italkingtan.create.abstractfactory.componet.*;

/**
 * Created by tantan on 2017/1/22.
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button produceButton() {
        return new SpringButton();
    }

    @Override
    public CheckBox produceCheckBox() {
        return new SpringCheckBox();
    }

    @Override
    public TextField productTextField() {
        return new SpringTextField();
    }
}
