Patronage2013
=============
zadanie 3 
autor Pawe� Kwiecie�

Projekt zosta� wykonany w Eclipse.
Mo�na go zaimportowa� i rozwija� ;)

Odpala si� na przy pomocy Server Tomcat v7.0

Dodany jest plugin jetty i je�eli chcemy odpali� z wiersza polece� w windows 
lub w konsoli na ubuntu to b�d�c w katalogu projektu Patronage-task-2 wpisujemy polecenie:

mvn clean package jetty:run

dodanie gracza tworzy pusty rekord w innym wypadku nie dzia�a
curl -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{}' http://localhost:8080/api/players

powinno by�: stworzenie gracza username: player, email: player@wp.pl

curl -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"username":"player","email":"player@wp.pl"}' http://localhost:8080/api/players

update gracza wywo�anie, kt�re powinno dzia�a�: podajemy id, oraz nowe para,etry gracza, np dla id=1 powinno byc jak ponizej ale nie za bardzo dzia�a
curl -H "Accept: application/json" -H "Content-Type: application/json" -X PUT -d '{"username": "playerone", "email": "patr@play.pl"}' http://localhost:8080/api/players/1

pobranie gracza GET
jako jedyne dzia�a bez zarzutu, ale pokazuje warto�ci NULL, ponizej przyklad jak zwrocic gracza o id=1
curl -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/api/players/1



wylistowanie wszytkich graczy
nie dzia�a jak trzeba:

curl -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/api/players

usuwanie gracza
powinno by�, to przyk�ad dla id=1
curl -H "Accept: application/json" -H "Content-Type: application/json" -X DELETE http://localhost:8080/api/players/1



