# Progetto API Instagram
L'applicazione ci permette di ottenere delle informazioni sui contenuti degli album di Instagram dell'utente che abbiamo voluto analizzare. Ci siamo serviti delle API di Instagram, attraverso la creazione di un Token siamo riuscitti ad estrarre i dati facendo una chiamata GET attraverso Postman. Per far ciò ci abbiamo utlizzato le istruzioni su https://developers.facebook.com/docs/instagram-basic-display-api/guides. In seguito questi dati sono stati analizzati grazie alla creazione di statistiche e filtri.

### Guida utilizzo programma
L'utente, dopo aver importato su Eclipse il progetto, deve cambiare le directory richieste nel package inserendone di valide per salvare i file generati sul proprio dispositivo. Dovrà, solo in seguito, avviare il programma come "Spring Boot App". A seguito di questi passaggi si potranno cominciare a fare le chiamate usando la porta  http://localhost:8080.

Le richieste che sarà possibile fare, per esempio attraverso Postman, sono:
* **GET/metadata:** permette di visualizzara tipo e nome di ogni dato estratto
* **GET/dati:** permette di visualizzare i dati
* **GET/stats:** permette di visualizzare le statisiche fatte
