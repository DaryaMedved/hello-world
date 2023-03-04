package by.itacademy.hw18;


import by.itacademy.hw18.elementsDesign.BodyDesign;
import by.itacademy.hw18.elementsDesign.ChassisDesign;
import by.itacademy.hw18.elementsDesign.EngineDesign;
import by.itacademy.interfaces.IAssemblyLine;
import by.itacademy.interfaces.IProduct;

public class CarAssemblyLine implements IAssemblyLine {

    private final BodyDesign bodyDesign;
    private final EngineDesign engineDesign;
    private final ChassisDesign chassisDesign;

    public CarAssemblyLine() {
        bodyDesign = new BodyDesign();
        chassisDesign = new ChassisDesign();
        engineDesign = new EngineDesign();
    }

    @Override
    public IProduct assembleProduct(IProduct car) {
        if (!(car instanceof Car)) return car;
        car.installFirstPart(bodyDesign.buildProductPart());
        car.installSecondPart(chassisDesign.buildProductPart());
        car.installThirdPart(engineDesign.buildProductPart());
        return car;
    }

}