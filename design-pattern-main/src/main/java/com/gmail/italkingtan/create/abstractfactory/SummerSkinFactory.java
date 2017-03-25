package com.gmail.italkingtan.create.abstractfactory;

import com.gmail.italkingtan.create.abstractfactory.componet.*;

/**
 * Created by tantan on 2017/1/22.
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button produceButton() {
        return new SummerButton();
    }

    @Override
    public CheckBox produceCheckBox() {
        return new SummerCheckBox();
    }

    @Override
    public TextField productTextField() {
        return new SummerTextField();
    }
}
