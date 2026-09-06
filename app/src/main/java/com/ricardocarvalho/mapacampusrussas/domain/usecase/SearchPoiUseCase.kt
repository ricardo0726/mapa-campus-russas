package com.ricardocarvalho.mapacampusrussas.domain.usecase

import com.ricardocarvalho.mapacampusrussas.domain.model.Poi
import com.ricardocarvalho.mapacampusrussas.domain.PoiRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Busca POIs pelo texto digitado na SearchBar. Query em branco retorna o
 * catálogo completo (comportamento de "nenhum filtro aplicado").
 */
class SearchPoiUseCase @Inject constructor(
    private val repository: PoiRepository
) {
    operator fun invoke(query: String): Flow<List<Poi>> {
        val trimmed = query.trim()
        return if (trimmed.isBlank()) repository.observePois() else repository.searchPois(trimmed)
    }
}
