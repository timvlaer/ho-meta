# Herfstontmoeting API
REST Api with metadata for the start event of Scouts en Gidsen Vlaanderen, [Herfstontmoeting](https://www.scoutsengidsenvlaanderen.be/herfstontmoeting).

## Static file hosting with firebase (current implementation)
See firebase directory, files hosted with redirection on [Firebase](https://herfstontmoeting-7d97e.firebaseapp.com/)

### Generate and upload the static files to Firebase
1. `gradle generateFirebaseApi`, this command will generate json-files in `firebase/public/api`.
2. `cd firebase`
3. `firebase deploy --only hosting`, will upload the static files to [Firebase](https://herfstontmoeting-7d97e.firebaseapp.com/).

--------------

## Java Implementation (for future usage)
* [x] `/api/v1/gouwen`
* [ ] `/api/v1/activiteiten`
* [ ] `/api/v1/locaties`

### Technology

* Microservice with [Vert.x](http://vertx.io/)
* Build with [gradle](http://gradle.org)
