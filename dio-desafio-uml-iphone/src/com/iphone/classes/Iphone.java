package com.iphone.classes;

import com.iphone.interfaces.AparelhoTelefonico;
import com.iphone.interfaces.NavegadorInternet;
import com.iphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public static void main(String[] args) throws Exception {
        
    }

    @Override
    public void tocar() {
         System.out.println("Tocando música...");       
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
       System.out.println("Música "+musica+" selecionada.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o telefone "+numero+"...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página para a url: "+url+"...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
