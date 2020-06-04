# Progetto API Instagram
L'applicazione ci permette di ottenere delle informazioni sui contenuti degli album di Instagram dell'utente che abbiamo voluto analizzare. Ci siamo serviti delle API di Instagram, attraverso la creazione di un Token siamo riuscitti ad estrarre i dati facendo una chiamata GET attraverso Postman. Per far ciò ci abbiamo utlizzato le istruzioni su https://developers.facebook.com/docs/instagram-basic-display-api/guides. In seguito questi dati sono stati analizzati grazie alla creazione di statistiche e filtri.

### Guida utilizzo programma
L'utente, dopo aver importato su Eclipse il progetto, deve cambiare le directory presenti nel package **nome** inserendo il giusto percorso per salvare i file generati sul proprio dispositivo. Dovrà, solo in seguito, avviare il programma come "Spring Boot App". A seguito di questi passaggi si potranno cominciare a fare le chiamate usando la porta  http://localhost:8080.

Le richieste che sarà possibile fare, per esempio attraverso Postman, sono:

> **GET** /metadata

Query su Postman: **localhost:8080/metadati**

Permette di visualizzara tipo e nome di ogni dato estratto

> **GET** /album

Query su Postman: **localhost:8080/album**

Permette di visualizzare tutti i dati relativi agli albums

> **GET** /dati

Query su Postman: **localhost:8080/dati**

Permette di visualizzare tutti i dati relativi ai contenuti multimediali di tutti gli album del profilo analizzato

> **GET** /stats

Query su Postman: **localhost:8080/stats**

Permette di visualizzare tutte le statistiche dei contenuti multimediali

> **GET** /stats/width

Query su Postman: **localhost:8080/stats/width**

Permette di visualizzare la lista con solo le statistiche riguandi la larghezza delle immagini

> **GET** /stats/heigth

Query su Postman: **localhost:8080/stats/heigth**

Permette di visualizzare la lista con solo le statistiche riguandi l'altezza delle immagini

> **GET** /stats/size

Query su Postman: **localhost:8080/stats/size**

Permette di visualizzare la lista con solo le statistiche riguandi la dimensione delle immagini

> **GET** /stats/size

Query su Postman: **localhost:8080/stats/size**

Permette di visualizzare la lista con solo le statistiche riguandi la dimensione delle immagini

> **GET** /stats/size

Query su Postman: **localhost:8080/stats/size**

Permette di visualizzare la lista con solo le statistiche riguandi la dimensione delle immagini

> **GET** /timestamp/{timestamp}

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

## Use Case ##
<a href="https://ibb.co/3fH3QWR"><img src="https://i.ibb.co/YDGCw80/finale.png" alt="finale" border="0"></a>
