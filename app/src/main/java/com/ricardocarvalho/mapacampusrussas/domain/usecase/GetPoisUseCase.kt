package com.ricardocarvalho.mapacampusrussas.domain.usecase

import com.ricardocarvalho.mapacampusrussas.domain.model.Poi
import com.ricardocarvalho.mapacampusrussas.domain.PoiRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/** Retorna todos os POIs do catálogo, usados para desenhar os marcadores do mapa. */
class GetPoisUseCase @Inject constructor(
    private val repository: PoiRepository
) {
    operator fun invoke(): Flow<List<Poi>> = repository.observePois()
}
