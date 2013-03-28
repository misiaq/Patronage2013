Patronage2013
=============
zadanie 3 
autor Pawe³ Kwiecieñ

Projekt zosta³ wykonany w Eclipse.
Mo¿na go zaimportowaæ i rozwijaæ ;)

Odpala siê na przy pomocy Server Tomcat v7.0

Dodany jest plugin jetty i je¿eli chcemy odpaliæ z wiersza poleceñ w windows 
lub w konsoli na ubuntu to bêd¹c w katalogu projektu Patronage-task-2 wpisujemy polecenie:

mvn clean package jetty:run

dodanie gracza tworzy pusty rekord w innym wypadku nie dzia³a
curl -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{}' http://localhost:8080/api/players

powinno byæ: stworzenie gracza username: player, email: player@wp.pl

curl -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"username":"player","email":"player@wp.pl"}' http://localhost:8080/api/players

update gracza wywo³anie, które powinno dzia³aæ: podajemy id, oraz nowe para,etry gracza, np dla id=1 powinno byc jak ponizej ale nie za bardzo dzia³a
curl -H "Accept: application/json" -H "Content-Type: application/json" -X PUT -d '{"username": "playerone", "email": "patr@play.pl"}' http://localhost:8080/api/players/1

pobranie gracza GET
jako jedyne dzia³a bez zarzutu, ale pokazuje wartoœci NULL, ponizej przyklad jak zwrocic gracza o id=1
curl -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/api/players/1



wylistowanie wszytkich graczy
nie dzia³a jak trzeba:

curl -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/api/players

usuwanie gracza
powinno byæ, to przyk³ad dla id=1
curl -H "Accept: application/json" -H "Content-Type: application/json" -X DELETE http://localhost:8080/api/players/1



