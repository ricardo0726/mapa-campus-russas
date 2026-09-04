# 🗺️ Mapa Campus Russas

Catálogo interativo de Pontos de Interesse (POIs) do Campus Russas da
Universidade Federal do Ceará (UFC) — salas, blocos, laboratórios e serviços,
com busca, detalhes e suporte offline.

![Kotlin](https://img.shields.io/badge/Kotlin-100%25-7F52FF?logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-4285F4?logo=jetpackcompose&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![License](https://img.shields.io/badge/license-MIT-blue)

## 📖 Sobre o projeto

Ideia: ajudar estudantes e visitantes a se localizarem no Campus Russas —
pesquisar uma sala, bloco ou serviço e ver no mapa como chegar até lá, mesmo
sem conexão com a internet.

Este repositório também é um projeto de estudo/portfólio, construído em
público, do zero, com Clean Architecture aplicada de forma real (não só em
teoria) num app Android completo.

## 🧱 Stack

- **Kotlin** + **Jetpack Compose** (UI 100% declarativa)
- **Clean Architecture** + **MVVM** + **Unidirectional Data Flow (UDF)**
- **Room** — persistência local, fonte única de verdade (offline-first)
- **Supabase** (PostgreSQL + PostGIS) — backend e catálogo remoto de POIs
- **Hilt** — injeção de dependência
- **Coroutines + Flow** — concorrência e reatividade
- **Google Maps SDK** (`maps-compose`) — mapa interativo
- **WorkManager** — sincronização periódica em segundo plano

## 🚧 Status do projeto

Em desenvolvimento, construído dia a dia com commits incrementais.

- [ ] Camada Domain (modelos, use cases, contrato do repositório)
- [ ] Camada Data — Room (persistência local)
- [ ] Camada Data — Supabase/PostGIS (backend remoto)
- [ ] Sincronização offline-first + WorkManager
- [ ] Tela do mapa com marcadores
- [ ] Busca de POIs
- [ ] Detalhes do POI (Bottom Sheet)
- [ ] Localização do usuário no mapa
- [ ] Rastreamento em segundo plano (Foreground Service)
- [ ] Testes automatizados
- [ ] README final com arquitetura, screenshots e GIF de demonstração

## 🏗️ Arquitetura

```
presentation/  Compose UI + ViewModels
domain/        Modelos, contratos de repositório e use cases (Kotlin puro)
data/          Room (local) + Supabase (remoto), estratégia offline-first
service/       Foreground Service de localização
di/            Módulos Hilt
```

Detalhes completos das decisões de arquitetura serão documentados aqui
conforme o projeto avança.

## ▶️ Como rodar

Instruções de setup (chaves de API, Supabase, etc.) serão adicionadas assim
que o app tiver sua primeira versão funcional.

## 📄 Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais detalhes.
