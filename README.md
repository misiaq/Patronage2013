Patronage2013
=============
zadanie 2 
autor Pawe� Kwiecie�

Projekt zosta� wykonany w Eclipse.
Mo�na go zaimportowa� i rozwija� ;)

Odpala si� na przy pomocy Server Tomcat v7.0

Dodany jest plugin jetty i je�eli chcemy odpali� z wiersza polece� w windows 
lub w konsoli na ubuntu to wpisujemy polecenie: 
	mvn clean package jetty:run
Powinn�my oczywi�cie mie� zainstalowany 'maven' w systemie operacyjnym,
na ubuntu mo�emy to uczyni� komend�: sudo apt-get install maven

Po kompilacji oraz odpaleniu serwera wpisujemy w przegl�darce:
http://localhost:8080/api/hello?param=Willson

Teraz mo�emy si� cieszy� komunikatem w formacie JSON, kt�ry przypomina tego, kogo wska�emu mu jako parametr :)

Dodatkowo, je�eli mamy zainstalowany serwer Tomcat, to projekt powinien odpalic si� po wpisaniu polecenia: 
	mvn clean package tomcat:run

	