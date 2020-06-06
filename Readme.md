# Progetto API Instagram
L'applicazione ci permette di ottenere delle informazioni sui contenuti degli album di Instagram dell'utente che abbiamo voluto analizzare. Ci siamo serviti delle API di Instagram, attraverso la creazione di un Token siamo riuscitti ad estrarre i dati facendo una chiamata GET attraverso Postman. Per far ciò ci abbiamo utlizzato le istruzioni su https://developers.facebook.com/docs/instagram-basic-display-api/guides. In seguito questi dati sono stati analizzati grazie alla creazione di statistiche e filtri.

### Guida utilizzo programma
L'utente dovrà avviare il programma come "Spring Boot App". Solo in seguito si potranno cominciare a fare le chiamate usando la porta  http://localhost:8080.

Le richieste che sarà possibile fare, per esempio attraverso Postman, sono:

> **GET** /metadati

Query su Postman: **localhost:8080/metadati**

Permette di visualizzara tipo e nome di ogni dato estratto


> **GET** /album

Query su Postman: **localhost:8080/album**

Permette di visualizzare tutti i dati relativi agli albums


> **GET** /dati

Query su Postman: **localhost:8080/dati**

Permette di visualizzare tutti i dati relativi ai contenuti multimediali di tutti gli album del profilo analizzato


> **GET** /stats

Query su Postman: - **localhost:8080/stats?field=media_url**
                  - **localhost:8080/stats?field=larghezza**
                  - **localhost:8080/stats?field=altezza**
                  - **localhost:8080/stats?field=dimensione*

Permette di visualizzare tutte le statistiche dei contenuti multimediali. Inserendo "media_url" vengono restituite tutte, nel caso delle altre chiamate vengono restituite le statistiche di quel determinato campo. 


> **POST** /timestamp/{timestamp}

Query su Postman: **localhost:8080/timestamp/{timestamp}**

Permette di visualizzare i contenuti multimediali filtrati (scelti dall'utente mediante gli Conditional Operators)

Per fare la richiesta relativa filtri si devono usare i Conditional Operators come descritto nel seguente paragrafo.


### Filtri
I Conditional Operators che si possono usare per filtrare secondo la data di pubblicazione sono:
- "$gt": maggiore (>)

  Query su Postman: **localhost:8080/timestamp/"timestamp"="$gt":{2020-05-19 19:30:23}**
- "$lt": minore (<)

  Query su Postman: **localhost:8080/timestamp/"timestamp"="$lt":{2020-05-19 19:30:23}**
- "$gte": maggiore uguale (>=)

  Query su Postman: **localhost:8080/timestamp/"timestamp"="$gte":{2020-05-19 19:30:23}**
- "$lte": minore uguale (<=)

  Query su Postman: **localhost:8080/timestamp/"timestamp"="$lte":{2020-05-19 19:30:23}**
- "$bt": compreso (>= value <=)

  Query su Postman: **localhost:8080/timestamp/"timestamp"="$bt":[2020-05-19 19:30:23,2020-05-26 19:30:23]**


**ATTENZIONE**: Bisogna scrivere la data e l'ora in questo formato: 2020-05-20 19:30:23


## Impostazione progetto ##

### Use Case
<p align="center">
<a href="https://ibb.co/cJ5XGT0"><img src="https://i.ibb.co/H7vpWg6/finale.png" alt="finale" border="0"></a>
</p>


### UML
<p align="center">
<a href="https://ibb.co/1ZpchTL"><img src="https://i.ibb.co/y0M2GqX/UMLL.png" alt="UMLL" border="0"></a>
</p>

#### Package
<p align="center">
<a href="https://ibb.co/ncKvRRp"><img src="https://i.ibb.co/1q45bbc/package.png" alt="package" border="0"></a>
</p>

##### Class Diagram
- progetto.esame.app

<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/Z608zqR/app.png" alt="app" border="0"></a>
</p>

- progetto.esame.controller

<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/dB0nv1z/controller.png" alt="controller" border="0"></a>
</p>

- progetto.esame.database

<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/BBmf03N/database.png" alt="database" border="0"></a>
</p>

- progetto.esame.exception

<p align="center">
<a href="https://ibb.co/YQHXNh5"><img src="https://i.ibb.co/54bk1LQ/exception.png" alt="exception" border="0"></a>
</p>

- progetto.esame.filter

<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/TvTJmS3/filter.png" alt="filter" border="0"></a>
</p>

- progetto.esame.model

<p align="center">
<a href="https://ibb.co/3zzfQ5h"><img src="https://i.ibb.co/ZmmH7RT/model.png" alt="model" border="0"></a>
</p>

- progetto.esame.service

<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/2ym09wF/service.png" alt="service" border="0"></a>
</p>

- progetto.esame.stats.image

<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/1vnHHhr/stats-image.png" alt="stats-image" border="0"></a>
</p>

- progetto.esame.stats.model

<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/sFHV4BC/stats-model.png" alt="stats-model" border="0"></a>
</p>


### Sequencial Diagram

- **chiamata GET/ album:** Controller esegue una chiamata tramite il metodo getAlbum() che ci restituisce una lista con tutti i dati relativi all'album.
<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/rG288VS/1.png" alt="1" border="0"></a>
</p>

- **chiamata GET/ dati:**  Controller esegue una chiamata tramite il metodo getDati() che ci restituisce una lista con tutti i dati relativi a tutti gli album.
<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/ZzbRrpX/2.png" alt="2" border="0"></a>
</p>

- **chiamata GET/ metadati:** Controller esegue una chiamata tramite il metodo getArrayMetadata() che ci restituisce un ArrayList con i metadata.
<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/DzpTMRV/3.png" alt="3" border="0"></a>
</p>

- **chiamata GET/ stats?field=media_url:** Controller esegue una chiamata tramite il metodo GetImageStats(String media_url) che ci restituisce un ArrayList con tutte le statistiche. Per far ciò c'è però bisogno che venga passata la lista con i dati a StatsImage attraverso il metodo dati.stream().count().
<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/Hqk6yj5/4.png" alt="4" border="0"></a>
</p>

- **chiamata GET/ stats?field=larghezza:** Controller esegue una chiamata tramite il metodo GetImageStats(String media_url) che ci restituisce un ArrayList con le statistiche relative alla larghezza. Per far ciò c'è però bisogno che venga passata la lista con i dati a StatsImage attraverso il metodo dati.stream().count().
<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/BjXnc5r/5.png" alt="5" border="0"></a>
</p>

- **chiamata GET/ stats?field=altezza:** Controller esegue una chiamata tramite il metodo GetImageStats(String media_url) che ci restituisce un ArrayList con le statistiche relative all'altezza. Per far ciò c'è però bisogno che venga passata la lista con i dati a StatsImage attraverso il metodo dati.stream().count().
<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/2tyVTvf/6.png" alt="6" border="0"></a>
</p>

- **chiamata GET/ stats?field=dimensione:** Controller esegue una chiamata tramite il metodo GetImageStats(String media_url) che ci restituisce un ArrayList con le statistiche relative alla dimensione. Per far ciò c'è però bisogno che venga passata la lista con i dati a StatsImage attraverso il metodo dati.stream().count().
<p align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/6wSGYtp/7.png" alt="7" border="0"></a>
</p>

- **chiamata POST/ timestamp/{timestamp}:** Controller esegue una chiamata tramite il metodo GetImageStats(String media_url) che ci restituisce la lista di dati filtrata. Per far ciò c'è però bisogno che venga passata la lista con i dati a DataFilter attraverso il metodo dati.size(). Ci interessa anche che nella lista timestamp abbia un determinato formato e questo lo ricaviamo tramite il metodo parse(Storage.dati.get(i).timestamp) che ci restituisce il timestamp fromattato.
<p align="center">
<a href="https://ibb.co/nL6WP1g"><img src="https://i.ibb.co/tJQdL2m/8.png" alt="8" border="0"></a>
</p>


### Autori e ruoli
- **Abatelli Eros**
- **De Padova Cecilia**


