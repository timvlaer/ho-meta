# ho-meta
REST Api with metadata for [Herfstontmoeting](https://www.scoutsengidsenvlaanderen.be/herfstontmoeting)

# Static file hosting with firebase
See firebase directory, files hosted with redirection on [Firebase](https://herfstontmoeting-7d97e.firebaseapp.com/)

## Java Implementation
* [x] `/api/v1/gouwen`: retrieve a [list of all regions](https://herfstontmoeting-7d97e.firebaseapp.com/api/v1/gouwen) with their name and location on the event
* [ ] :wrench: `/api/v1/activities`: the program of the weekend

### Technology

* Microservice with [Vert.x](http://vertx.io/)
* Build with [gradle](http://gradle.org)
