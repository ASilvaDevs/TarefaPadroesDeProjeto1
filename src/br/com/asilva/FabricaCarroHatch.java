package br.com.asilva;

public class FabricaCarroHatch implements FabricaCarro{
    @Override
    public ICarro criarCarro() {
        return new CarroHatch();
    }

    @Override
    public IMotor criarMotor() {
        return new MotorHatch();
    }
}
