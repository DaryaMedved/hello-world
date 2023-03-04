package by.itacademy.hw18.elementsDesign;

import by.itacademy.hw18.collectedElements.CarBody;
import by.itacademy.interfaces.ILineStep;
import by.itacademy.interfaces.IProductPart;

public class BodyDesign implements ILineStep {

    public IProductPart buildProductPart() {
        return new CarBody();
    }
}