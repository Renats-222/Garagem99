/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.renato.garagem99.DTO;

import br.gm.renato.garagem99.entities.Veiculo;

/**
 *
 * @author digma
 */
public class VeiculoDTO {

    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private Integer ano;
    private Integer km;
    private String linkImagem;

    public VeiculoDTO() {
    }

    public VeiculoDTO(Veiculo entity) {
        this.id = entity.getId();
        this.marca = entity.getMarca();
        this.modelo = entity.getModelo();
        this.cor = entity.getCor();
        this.ano = entity.getAno();
        this.km = entity.getKm();
        this.linkImagem = entity.getLinkImagem();
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }
}

