# Bibliothèque Java 📚

Un système de gestion de bibliothèque en console, développé en Java avec une architecture orientée objet stricte.

## Fonctionnalités
- Gestion des livres (`Livre`) : titre, auteur, ISBN, disponibilité
- Gestion des membres (`Membre`) : nom, identifiant, quota d'emprunts
- Membres VIP (`MembreVIP`) avec héritage : quota étendu (10 au lieu de 3) et réduction
- Gestion des emprunts (`Emprunt`) : liaison entre un livre et un membre, calcul automatique de la date de retour
- Interface `Empruntable` implémentée par `Livre`, définissant un contrat clair

## Concepts de POO démontrés
- Classes et encapsulation (attributs privés, getters)
- Héritage (`MembreVIP extends Membre`)
- Redéfinition de méthode (`@Override`)
- Interfaces (`Empruntable`)
- Typage fort (chaque variable a un type explicite)
- Compilation Java (`javac`)

## Prérequis
- JDK 21 ou supérieur installé

## Comment lancer le programme

1. Cloner le dépôt :

git clone https://github.com/yodaghaniyou-afk/bibliotheque-java.git

2. Se déplacer dans le dossier :

cd bibliotheque-java

3. Compiler tous les fichiers source :

javac src/*.java

4. Exécuter le programme :

java -cp src Main

## Structure du projet
- `src/Main.java` — point d'entrée du programme
- `src/Livre.java` — classe représentant un livre
- `src/Membre.java` — classe représentant un membre standard
- `src/MembreVIP.java` — classe héritant de Membre, avec règles VIP
- `src/Emprunt.java` — classe reliant un livre et un membre
- `src/Empruntable.java` — interface définissant le contrat d'emprunt

## Méthodologie de développement
Chaque fonctionnalité a été développée sur une branche dédiée, puis fusionnée dans `main` via une Pull Request après vérification :
- `feature-classe-livre`
- `feature-classe-membre`
- `feature-classe-emprunt`
- `feature-membre-vip`
- `feature-interface-empruntable`

## Technologies utilisées
- Java 26 (JDK)