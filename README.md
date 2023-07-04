# Système de Gestion des Infractions de Dépassement de Vitesse

# Description du Projet
Ce projet vise à créer un système distribué basé sur des micro-services pour gérer et automatiser le processus des infractions liées aux dépassements de vitesse détectés par des radars automatiques. Le système se compose de trois micro-services :

1- Micro-service Radar : Gère les radars qui sont définis par leur identifiant, leur vitesse maximale et leurs coordonnées de longitude et de latitude.

2- Micro-service Immatriculation : Gère les véhicules appartenant à des propriétaires. Chaque propriétaire est défini par son identifiant, son nom, sa date de naissance, son email et son adresse. Chaque véhicule est défini par son identifiant, son numéro de matricule, sa marque, sa puissance fiscale et son modèle.

3- Micro-service Infractions : Gère les infractions liées aux dépassements de vitesse. Chaque infraction est caractérisée par son identifiant, sa date, le numéro du radar ayant détecté le dépassement, le numéro de matricule du véhicule, la vitesse du véhicule, la vitesse maximale autorisée par le radar et le montant de l'infraction.

Le système doit permettre de consulter et de modifier les données des micro-services, de signaler un dépassement de vitesse qui entraîne une infraction, ainsi que de permettre aux propriétaires de consulter leurs infractions.

# Fonctionnalités

Les principales fonctionnalités du système sont :

-Gestion des radars :
* Ajout d'un radar avec ses détails (identifiant, vitesse maximale, coordonnées)
* Consultation des radars existants
* Modification des détails d'un radar existant
* Suppression d'un radar existant

-Gestion des propriétaires et des véhicules :

* Ajout d'un propriétaire avec ses détails (identifiant, nom, date de naissance, email, adresse) et des véhicules qui lui appartiennent
* Consultation des propriétaires et de leurs véhicules
* Modification des détails d'un propriétaire ou d'un véhicule existant
* Suppression d'un propriétaire ou d'un véhicule existant

-Gestion des infractions :
* Ajout d'une infraction liée à un dépassement de vitesse détecté par un radar
* Consultation des infractions existantes
* Modification des détails d'une infraction existante
* Suppression d'une infraction existante

-Communication entre les micro-services :
* Le micro-service Radar communique avec le micro-service Immatriculation pour récupérer les informations sur le propriétaire du véhicule lors d'un dépassement de vitesse et fait appel au micro-service Infractions pour générer une nouvelle infraction.

-Authentification et Sécurité :
* Utilisation du système d'authentification OAuth2 avec Keycloak pour sécuriser l'accès aux micro-services.

-Interface Utilisateur :
* Développement d'une application frontend avec Angular ou React pour interagir avec les micro-services et afficher les informations relatives aux radars, propriétaires, véhicules et infractions.

-Déploiement en Conteneurs Docker :
* Utilisation d'un fichier docker-compose.yml pour le déploiement du système distribué dans des conteneurs Docker.


# Architecture Technique

![architecture](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/24ffb82e-e546-4ccd-aacd-db6bcaf104e3)
L'architecture technique du projet est basée sur les principes des micro-services et utilise les technologies suivantes :

-Langage de programmation : Java
-Frameworks et outils :
* Spring Boot pour le développement des micro-services
* Spring Data JPA pour la gestion de la persistance des données
* gRPC pour la communication entre les micro-services
* Spring Web pour les services REST
* GraphQL pour les services GraphQL
* Apache CXF pour les services SOAP
* Angular ou React pour le développement de l'interface utilisateur
* Keycloak pour la gestion de l'authentification et de la sécurité

# Diagramme de Classe
Le diagramme de classe global du projet est représenté ci-dessous :
![diagramme_classes](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/3fa80b71-5ed2-43c4-865c-bbd87cff22fe)

-Spring data REST :

All Vehicles
![springdata_vehicles](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/d6401ab5-0c82-4ae5-9cb6-36f06169b485)

All owners
![springdata_owners](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/41ce16c9-088a-4240-8df2-0fd7b4a32393)

-Les 4 web services

* REST en utilisant POSTMAN: 

Ajouter vehicule
![rest-addvehicle](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/88de4cb0-4f7c-496a-a74b-2d25d5e47b8e)

afficher les vehicules
![rest-vehicles](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/e9dc9fb9-d216-48b6-b6cc-dc9ae5d096f8)

afficher les radars
![rest-radars](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/72346468-83e4-4523-84f8-b2d2e0ed3fc1)

afficher les infractions
![rest-fullinfractions](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/8dbe0f14-f7c3-4b72-8d3e-a000f6ad1265)

* GraphQL :
 
afficher une vehicule by id
![graphql-getvehiclebyid](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/051808ae-538c-4d28-819e-b45f4d78f503)

ajouter un proprietaire
![graphql-addowner](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/60e2f5af-f86f-4f70-a4de-dcd8c72f4d14)

afficher les proprietaires
![graphql-getowner](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/64dc4050-f0e1-4e59-a41b-6f959d317b6f)

* SOAP :

WSDL de web service SOAP :
![soap-wsdl](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/e506a4f1-4c5c-4a9b-9f7b-bbb4c064efdf)

afficher les vehicules en utilisant SoapUI
![soap-getVehicles](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/671888b2-d803-46f3-9dbd-0fff033e0c7b)

* GRPC en utilisant BoomRPC:
ajouter les vehicules 
![grpc-addVehicle](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/b69fb669-3aec-4fa8-9057-4238c695277a)

afficher vehicule by id
![grpc-getVehicle](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/ca6ee5fb-deb8-414e-b1a1-3ff79570c3e0)

afficher proprietaire by id
![grpc-getOwner](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/5434d042-2b6c-40ec-9dee-b5504273f008)

* Simulation d'un radar :
![radar_simulation](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/bf3336d1-4bdb-4f5a-bbd7-c47c04ea9c0d)


# Application Frontend

Vehicles 
![vehicles](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/4c4d28b4-c3dd-4b16-a803-1173be11ffd8)

Radars
![radars](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/b3b7a4b2-8b4e-4571-843a-32eca25a5239)

Les infractions
![infractions](https://github.com/youssefelgoumri/SD_PROJET/assets/94170257/ea8f8402-ed9e-4a86-9e13-28e353debb0d)

