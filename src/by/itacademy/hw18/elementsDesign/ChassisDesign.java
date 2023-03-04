package by.itacademy.hw18.elementsDesign;


import by.itacademy.hw18.collectedElements.Chassis;
import by.itacademy.interfaces.ILineStep;
import by.itacademy.interfaces.IProductPart;

public class ChassisDesign implements ILineStep {
    public IProductPart buildProductPart() {
        return new Chassis();
    }
}