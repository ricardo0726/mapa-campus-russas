package com.ricardocarvalho.mapacampusrussas.domain.model

/**
 * Ponto de Interesse do campus (sala, bloco, laboratório, serviço etc).
 * Modelo de domínio: não conhece Room nem Supabase, apenas o vocabulário do negócio.
 */
data class Poi(
    val id: String,
    val name: String,
    val block: String,
    val category: Category,
    val description: String,
    val latitude: Double,
    val longitude: Double,
    val photoUrls: List<String>,
    val openingHours: String,
    val floor: Int? = null,
    val isAccessible: Boolean = false,
    val lastUpdatedAt: Long
)
