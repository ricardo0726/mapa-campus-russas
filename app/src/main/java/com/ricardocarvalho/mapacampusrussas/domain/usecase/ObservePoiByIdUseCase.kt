package com.ricardocarvalho.mapacampusrussas.domain.usecase

import com.ricardocarvalho.mapacampusrussas.domain.model.Poi
import com.ricardocarvalho.mapacampusrussas.domain.PoiRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Observa um POI específico por id — usado para a Bottom Sheet, de forma que
 * o item selecionado continue reativo mesmo se os resultados de busca mudarem.
 */
class ObservePoiByIdUseCase @Inject constructor(
    private val repository: PoiRepository
) {
    operator fun invoke(id: String): Flow<Poi?> = repository.observePoiById(id)
}
