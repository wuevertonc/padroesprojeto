/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.guilhermevillaca.padroes.estruturais.bridge;

/**
 *
 * @author Wueve
 */
public class Televisão implements Dispositivo{
    private boolean ligado = false;
    private int volume = 10;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("televisor esta ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("televisor esta desligado");
    }

    @Override
     public void aumentarVolume() {
        if(ligado && volume <100){
        volume++;
        System.out.println("volume é " + volume);
        }
    }

    @Override
    public void diminuirVolume() {   
        if(ligado && volume >0){
        volume--;
        System.out.println("volume é " + volume);
        }
    }

    @Override
    public boolean estaLigado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
