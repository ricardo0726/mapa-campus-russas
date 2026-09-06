package com.ricardocarvalho.mapacampusrussas.domain.usecase

import com.ricardocarvalho.mapacampusrussas.domain.PoiRepository
import javax.inject.Inject

/** Dispara a sincronização do catálogo local com o Supabase. */
class SyncPoiDataUseCase @Inject constructor(
    private val repository: PoiRepository
) {
    suspend operator fun invoke(): Result<Unit> = repository.syncWithRemote()
}
