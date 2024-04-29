--1Estrai tutti i clienti con nome Mario
select * from public.clienti where nome = 'Mario';

--2Estrarre il nome e il cognome dei clienti nati nel 1982
select nome, cognome from public.clienti where anno_nascita = 1982;

--3Estrarre il numero delle fatture con iva al 20%?
select count (*) from public.fatture where iva=20;

--4Estrarre i prodotti attivati nel 2017 e che sono in produzione oppure in commercio
select * from public.prodotti 
where extract(year from data_attivazione) = 2017 
and (in_produzione = 'true' or in_commercio = 'true');

--5Estrarre le fatture con importo inferiore a 1000 e i dati dei clienti ad esse collegate
select f.importo, c.* 
from public.fatture f 
join public.clienti c 
on f.id_cliente = c.numero_cliente 
where f.importo < 1000;

--6Riportare l'elenco delle fatture(numero, importo, iva e data) con in aggiunta il nome/numero del fornitore
select f.numero_fattura, f.importo, f.iva, f.data_fattura, fo.numero_fornitore as numero_fornitore 
from public.fatture f 
join public.fornitori fo 
on f.numero_fornitore = fo.numero_fornitore;

--7Considerando soltanto le fatture con iva al 20%, estrarre il numero di fatture per ogni anno
select extract(year from data_fattura) as anno, count(*) as numero_fatture
from public.fatture
where iva = 20
group by extract(year from data_fattura);


--8Riportare il numero di fatture e la somma dei relativi importi divisi per anno di fatturazione
select 
    EXTRACT(year FROM data_fattura) AS anno,
    COUNT(*) AS numero_fatture,
    SUM(importo) AS somma_importi
FROM 
    public.fatture
GROUP BY 
    EXTRACT(year FROM data_fattura);



