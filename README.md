Patronage2013
=============
zadanie 2 
autor Pawe³ Kwiecieñ

Projekt zosta³ wykonany w Eclipse.
Mo¿na go zaimportowaæ i rozwijaæ ;)

Odpala siê na przy pomocy Server Tomcat v7.0

Dodany jest plugin jetty i je¿eli chcemy odpaliæ z wiersza poleceñ w windows 
lub w konsoli na ubuntu to wpisujemy polecenie: 
	mvn clean package jetty:run
Powinnœmy oczywiœcie mieæ zainstalowany 'maven' w systemie operacyjnym,
na ubuntu mo¿emy to uczyniæ komend¹: sudo apt-get install maven

Po kompilacji oraz odpaleniu serwera wpisujemy w przegl¹darce:
http://localhost:8080/api/hello?param=Willson

Teraz mo¿emy siê cieszyæ komunikatem w formacie JSON, który przypomina tego, kogo wska¿emu mu jako parametr :)

Dodatkowo, je¿eli mamy zainstalowany serwer Tomcat, to projekt powinien odpalic siê po wpisaniu polecenia: 
	mvn clean package tomcat:run

	