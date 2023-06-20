## Java HashMap Class API

Dans ce repo, nous allons voir quelques exemples de l'utilisation des méthodes/API de classe HashMap.

La classe Java HashMap implémente l' interface `Map` en utilisant une table de hachage. Il hérite de la classe
`AbstractMap` et implémente l' interface `Map`.

Les points importants concernant la classe Java `HashMap` :

- Un HashMap ne peut pas contenir de clés en double.
- Java HashMap autorise les valeurs nulles et la clé nulle unique.
- HashMap est une collection non ordonnée. Il ne garantit aucun ordre spécifique des éléments.
- Java HashMap n'est pas thread-safe. Vous devez synchroniser explicitement les modifications simultanées sur le
  HashMap.

### Exemples
---

- Créer un HashMap et y ajouter des paires clé-valeur
- HashMap méthode put()
- HashMap méthode putIfAbsent()
- API Hashmap pour accéder aux clés et modifier leur valeur associée
- HashMap suppression APIs
- HashMap pour clés nulles et valeurs nulles
- Opérations view sur Map
- Différentes façons d'itérer sur Map
- Stocker plusieurs valeurs dans Map
- Java 8 méthoed ForEach() avec Map
- Synchronisation de l'accès à Java HashMap