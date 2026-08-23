package com.rushabh.designpatterns.creational.abstractfactorypattern;

import java.awt.*;

// Abstract Factory interface for the Abstract Factory pattern
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
