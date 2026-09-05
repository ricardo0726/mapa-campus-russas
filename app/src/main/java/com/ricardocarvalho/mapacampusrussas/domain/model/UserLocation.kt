package com.ricardocarvalho.mapacampusrussas.domain.model

/**
 * Localização do usuário reportada pelo FusedLocationProviderClient.
 * Mantida como modelo de domínio simples (sem dependência do SDK do Maps).
 */
data class UserLocation(
    val latitude: Double,
    val longitude: Double,
    val accuracyMeters: Float,
    val timestampMillis: Long
)
