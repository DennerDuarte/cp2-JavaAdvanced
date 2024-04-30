package br.com.fiap.lojaBrinquedos.Models;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name="TDS_TB_Brinquedos")
public class Brinquedo {
    @Id
    @Column(name="Id")
    public long Id;

    @Column(name="Nome")
    @Size(min = 10, max = 200, message = "O nome precisa ter entre 10 e 200 caracteres")
    public String Nome;

    @Column(name="Tipo")
    @Size(min = 10, max = 50, message = "O tipo precisa ter entre 10 e 50 caracteres")
    public String Tipo;

    @Column(name="Classificacao")
    public int Classificacao;

    @Column(name="Tamanho")
    @Size(min = 1, max = 20, message = "O tamanho precisa ter entre 1 e 20 caracteres")
    public String Tamanho;

    @Column(name="Preco")
    public int Preco;
}
