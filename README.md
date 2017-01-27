# Herfstontmoeting API
REST Api with metadata for the start event of Scouts en Gidsen Vlaanderen, [Herfstontmoeting](https://www.scoutsengidsenvlaanderen.be/herfstontmoeting).

## Static file hosting with firebase (current implementation)
See firebase directory, files hosted with redirection on [Firebase](https://herfstontmoeting-7d97e.firebaseapp.com/)

Generate the static file api using `gradle generateApi`. This program will put the generated files in `firebase/public/api`.

### Upload the static files to Firebase
1. `cd firebase`
2. `firebase deploy --only hosting`

## Java Implementation (for future usage)
* [x] `/api/v1/gouwen`: retrieve a [list of all regions](https://herfstontmoeting-7d97e.firebaseapp.com/api/v1/gouwen) with their name and location on the event
* [ ] :wrench: `/api/v1/activities`: the program of the weekend

### Technology

* Microservice with [Vert.x](http://vertx.io/)
* Build with [gradle](http://gradle.org)
