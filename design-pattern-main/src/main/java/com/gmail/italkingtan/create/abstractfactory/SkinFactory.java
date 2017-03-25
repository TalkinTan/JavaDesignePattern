package com.gmail.italkingtan.create.abstractfactory;

import com.gmail.italkingtan.create.abstractfactory.componet.Button;
import com.gmail.italkingtan.create.abstractfactory.componet.CheckBox;
import com.gmail.italkingtan.create.abstractfactory.componet.TextField;

/**
 * Created by tantan on 2017/1/22.
 */
public interface SkinFactory {
    Button produceButton();

    CheckBox produceCheckBox();

    TextField productTextField();
}
