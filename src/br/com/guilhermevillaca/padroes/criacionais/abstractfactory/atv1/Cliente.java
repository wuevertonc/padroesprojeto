/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.guilhermevillaca.padroes.criacionais.abstractfactory.atv1;

/**
 *
 * @author Wueve
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaVeiculo fabricaeletrica = new FabricaVeiculosEletricos();
        Carro carroEletrico = fabricaeletrica.criarCarro();
        Caminhao caminhaoEletrico = fabricaeletrica.criarCaminhao();
        
        carroEletrico.dirigir();
        caminhaoEletrico.transportar();
        
        FabricaVeiculo fabricacombustao = new FabricaVeiculosCombustao();
        Carro carroCombustao = fabricacombustao.criarCarro();
        Caminhao caminhaoCombustao = fabricacombustao.criarCaminhao();
        
        carroCombustao.dirigir();
        caminhaoCombustao.transportar();
    }
    
}
