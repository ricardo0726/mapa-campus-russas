package com.ricardocarvalho.mapacampusrussas.domain

import com.ricardocarvalho.mapacampusrussas.domain.model.Poi
import kotlinx.coroutines.flow.Flow

/**
 * Contrato do repositório de POIs. A camada de domínio não sabe que por trás
 * disso existe Room + Supabase — apenas que os dados são reativos (Flow) e que
 * existe uma operação explícita de sincronização com o backend remoto.
 */
interface PoiRepository {

    /** Todos os POIs, sempre lidos da fonte local (Room). Funciona offline. */
    fun observePois(): Flow<List<Poi>>

    /** Um único POI por id, útil para a Bottom Sheet e deep links. */
    fun observePoiById(id: String): Flow<Poi?>

    /** Busca textual (nome, bloco, categoria) — também 100% local. */
    fun searchPois(query: String): Flow<List<Poi>>

    /** Busca o catálogo no Supabase e faz upsert no Room. Requer rede. */
    suspend fun syncWithRemote(): Result<Unit>

    /** Timestamp da última sincronização bem-sucedida, ou null se nunca sincronizou. */
    suspend fun getLastSyncTimestamp(): Long?
}
