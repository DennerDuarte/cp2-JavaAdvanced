package br.com.fiap.lojaBrinquedos.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrinquedoDTO {
    public long Id;
    public String Nome;
    public String Tipo;
    public int Classificacao;
    public String Tamanho;
    public int Preco;
}
