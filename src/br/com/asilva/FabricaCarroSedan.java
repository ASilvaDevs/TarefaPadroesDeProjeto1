package br.com.asilva;

public class FabricaCarroSedan implements FabricaCarro{

    @Override
    public ICarro criarCarro() {
        return new CarroSedan();
    }

    @Override
    public IMotor criarMotor() {
        return new MotorHatch();
    }
}
