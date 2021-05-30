
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
| **id** |  **nom**  | **mot de passe** |
|:------:|:---------:|:----------------:|
| 1      | Jean Bon  | jeanbon          |
| 2      | Élie Miné | motdepasse       |

### Liste des comptes bancaires :
| **id** |  **nom**            | **utilisateur** | **solde**    | 
|:-------:|:------------------:|:---------------:|:------------:|
| 1       | Compte principal   | Jean Bon        | 500          |
| 2       | Compte secondaire  | Jean Bon        | 1750         |
| 3       | Compte principal   | Élie Miné       | 200          |
| 4       | Compte secondaire  | Élie Miné       | 800.5        |
| 4       | Compte epargne     | Élie Miné       | 1500.99      |
### Liste des opérations : 
| **id** |  **nom**              | **source** | **destinataire** | **valeur** |
|:-------:|:--------------------:|:----------:|:----------------:|:----------:|
| 1       | Transfert epargne    | Compte N°3 | Compte N°5       | 450        |
| 2       | Nourriture tortues   | Compte N°1 | Compte N°3       | 1500       |
| 3       | Tortue-dinateur      | Compte N°1 | Compte N°4       | 50         |
| 4       | Terminator-tue       | Compte N°1 | Compte N°3       | 20         |

## En cas d'erreur de déployement du site : 
Il est possible de lancer une version du site en local avec 
* Lancer MyBankWebAalApplication via intellij
* Lancer NPM via le script start-dev du fichier package.json