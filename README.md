<h1 align="left">Progetto per la vendita e riparazioni di televisori.</h1>
<h2 align="left">Requisiti dell’applicazione </h2>
<p>
    Realizzare un’applicazione che permetta ad un’azienda di vendere e riparare delle televisioni (in breve tv). Le
    tv possono essere di marche e di tipi differenti. I tipi di tv sono: base, medio, avanzato.
    In particolare il tipo medio si caratterizza per avere due ingressi USB in più rispetto al modello base, mentre il
    tipo avanzato per avere un ingresso USB, un ingresso HDMI ed essere SMART in più rispetto al modello base. 
</p>
<ul>
  <li> L’applicazione permette di vendere tutti i tipi di tv e di riparare le tv medio ed avanzato. </li>
  <li> La riparazione dovrà riportare le seguenti informazioni:</li>
  <ul>
    <li> informazioni sulle tv riparate </li>
    <li> data di richiesta riparazione </li>
    <li> data prevista di riconsegna </li>
    <li> costo dellariparazione </li>
    <li> cliente che richiede la riparazione </li>
    <li> etc.</li>
  </ul>
  <li> Ogni vendita dovrà riportare le seguenti informazioni:</li>
  <ul>
    <li> informazioni sulle tv vendute</li>
    <li> data di vendita </li>
    <li> prezzo di vendita </li>
    <li> dipendente dell’azienda che effettua la vendita </li>
    <li>etc.</li>
  </ul>
  <li> Ogni dipendente dell’azienda non potrà vendere più di m tv al giorno (previa verifica disponibilità).</li>
  <li> Ogni tv, oltre ad essere definita dai propri attributi caratterizzanti, è dotata
       del proprio codice identificativo denominato numero di serie</li>
       rappresentato da una stringa di 12 caratteri in formato numerico </li>
  <li> Ogni cliente, oltre ad essere definito dai propri attributi caratterizzanti, è
       identificato univocamente mediante il codice fiscale</li>
  <li> Ogni dipendente, oltre ad essere definito dai propri attributi
       caratterizzanti, è dotato del proprio codice identificativo denominato
       codice dipendente rappresentato da una stringa di 10 caratteri in formato
       alfanumerico </li>
  <li> Tutti i dati devono essere acquisiti (inserimento, modifica, cancellazione) e visualizzati mediante
        tastiera</li>
  <li> I dati acquisiti, opportunamente elaborati, devono essere resi persistenti su file. </li>
  <li> I dati dei clienti e delle tv vendute devono essere serializzati prima della chiusura dell’applicazione.</li>
  <li> L’applicazione permette di visualizzare a video l’elenco delle tv riparate in un intervallo di tempo </li>
       specificato; l’elenco deve essere ordinato in base alla seguente coppia di parametri:
  <ul>
    <li> Dipendente che ha effettuato la riparazione</li>
    <li> Tipo di tv (avanzato e poi medio) </li>
  </ul>
  <li> L’applicazione permette di ottenere la stampa su file dell’elenco delle tv vendute da un certo </li>
       dipendente ad un certo cliente </li>
  <li> Tale elenco deve essere ordinato per data di vendita; l’elenco riporterà per ogni vendita tutte le informazioni della tv
       venduta. </li>
</ul>
