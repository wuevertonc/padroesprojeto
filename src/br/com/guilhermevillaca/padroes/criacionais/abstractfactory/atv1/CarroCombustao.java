/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.guilhermevillaca.padroes.criacionais.abstractfactory.atv1;

/**
 *
 * @author Wueve
 */
public class CarroCombustao implements Carro {

    @Override
    public void dirigir() {
        System.out.println("Dirigindo Carro a combustão");
    }
    
}
