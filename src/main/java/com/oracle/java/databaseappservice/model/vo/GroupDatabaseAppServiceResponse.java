package com.oracle.java.databaseappservice.model.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;


@Data
public class GroupDatabaseAppServiceResponse {
	
	private Integer ATUALIZACAO;
	private Integer ID_PESQUISA;
	private Integer CODIGO_CONCESSIONARIA;
	private String NOME_FANTASIA_CONCESSIONARIA;
	private Long NUMERO_OS;
	private Integer TIPO_OS;
	private Timestamp DATA_ABERTURA_OS;
	private Timestamp DATA_FECHAMENTO_OS;
	private String STATUS_OS;
	private String CHASSI;
	private Long ANO_FABRICACAO;
	private Long QUILOMETRAGEM;
	private Integer MODELO_NM;
	private String LINHA;
	private String MODELO;
	private String NOME_CONSULTOR_TECNICO;
	private String CPF_CONSULTOR_TECNICO;
	private String NOME_CLIENTE;
	private Date DATA_NASCIMENTO;
	private String GENERO_CLIENTE;
	private String PCD;
	private String CPF_CLIENTE;
	private String ENDERECO;
	private String BAIRRO;
	private String CIDADE;
	private String ESTADO;
	private String CEP;
	private String TELEFONE_RESIDENCIAL;
	private String TELEFONE_COMERCIAL;
	private String TELEFONE_CELULAR;
	private String EMAIL;

}
