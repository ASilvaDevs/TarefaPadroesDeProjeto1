package br.com.asilva;


public class Main {
    public static void main(String[] args) {

        // Utilizando a fábrica para criar CarroSedan e MotorSedan
        FabricaCarro fabricaSedan = new FabricaCarroSedan();
        ICarro carroSedan = fabricaSedan.criarCarro();
        IMotor motorSedan = fabricaSedan.criarMotor();

        carroSedan.exibirInfo();
        motorSedan.ligar();

        System.out.println();

        // Utilizando a fábrica para criar CarroHatch e MotorHatch
        FabricaCarro fabricaHatch = new FabricaCarroHatch();
        ICarro carroHatch = fabricaHatch.criarCarro();
        IMotor motorHatch = fabricaHatch.criarMotor();

        carroHatch.exibirInfo();
        motorHatch.ligar();


        }
    }
