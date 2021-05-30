# Projet AAW Spring Security

## Les étudiants
Ce projet a été réalisé par :
- Adrien MEVELEC
- Michaël PARMENTIER
- Alexandre BRUNET 

## Accès à l'application 
L'application déployée sur Clever-Cloud, et est accessible à l'adresse suivante : [TODO](todo). La base de données est également déployée sur Clever-Cloud.

## Les URL
### API
- POST /api/user/login?password=jambon&username=Jean Bon
Permet à un utilisateur de se connecter
- GET /api/user/current
Permet de récupérer les informations de l'utilisateur actuellement connecté ( retourne rien si personne de connecté)
- GET /api/BankAccount/list
Permet de récupérer la liste de compte bancaire de l'utilisateur actuellement connecté
- GET /api/BankAccount/{id}
Permet de récupérer un compte pas son id (retourne null si ce n'est pas un compte de l'utilisateur actuel)
- GET /api/Operation/debits/{id}
Permet de récupérer les opérations de débit d'un compte bancaire (retourne null si ce n'est pas un compte de l'utilisateur actuel)
- GET /api/Operation/credits/{id}
Permet de récupérer les opérations de crédit (retourne null si ce n'est pas un compte de l'utilisateur actuel)
- GET /api/Operation/list/{id}
Permet de récupérer les opérations de débit et de crédit (retourne null si ce n'est pas un compte de l'utilisateur actuel)

## La base de donnée :
### Liste des utilisateurs : 
- TODO
- TODO
### Liste des comptes bancaires :
- TODO
- TODO
### Liste des opérations : 
- TODO
- TODO
