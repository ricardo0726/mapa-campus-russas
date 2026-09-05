package com.ricardocarvalho.mapacampusrussas.domain.model

/**
 * Categorias de POI do campus. O valor de `name` (enum constant) é o que
 * fica persistido no Room e deve corresponder ao texto salvo na coluna
 * `category` do Supabase (ver data/mapper/PoiMapper.kt).
 */
enum class Category(val displayName: String) {
    BLOCO_DIDATICO("Bloco didático"),
    LABORATORIO("Laboratório"),
    BIBLIOTECA("Biblioteca"),
    RESTAURANTE_UNIVERSITARIO("Restaurante universitário"),
    COORDENACAO("Coordenação de curso"),
    AUDITORIO("Auditório"),
    ESTACIONAMENTO("Estacionamento"),
    SECRETARIA("Secretaria acadêmica"),
    SERVICO("Serviço"),
    ESPORTE("Área esportiva"),
    OUTRO("Outro")
}
