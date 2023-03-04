package by.itacademy.hw18.elementsDesign;

import by.itacademy.hw18.collectedElements.Engine;
import by.itacademy.interfaces.ILineStep;
import by.itacademy.interfaces.IProductPart;

public class EngineDesign implements ILineStep {
    public IProductPart buildProductPart() {
        return new Engine();
    }
}