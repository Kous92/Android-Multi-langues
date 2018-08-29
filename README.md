# Application Android: multi-langues
* Créé par Koussaïla BEN MAMAR, 29 août 2018

## Que fait cette application ?
* Tout simplement afficher les phrases dans une langue parmi 9 possibles:
	* Français (par défaut)
	* Anglais
	* Espagnol
	* Portugais
	* Italien
	* Allemand
	* Turc
	* Arabe
	* Japonais

### La langue appliquée dépend de celle sélectionnée sur le smartphone Android.

Pour les langues, cela se fait grâce aux fichiers strings.xml (1 pour chaque langue). Avec Android Studio, il est assez simple de les mettre en place et de les utiliser dans:
* Les layouts avec ` @string/ ` dans les propriétés XML ` android:text="" ` ou ` android:hint="" `
* Les chaînes de caractères (String) en Java avec ` getString(R.string.exemple) `, attention tout de même à bien cibler le contexte de l'application si c'est dans un dialogue, fragment, Toast,...

Faites le test. Ouvrez l'appli, c'est en Français par exemple. Changez la langue du téléphone en anglais, et le contenu de l'appli sera en anglais,... Un bon modèle pour de gros projets par la suite. UN INDISPENSABLE MÊME :)