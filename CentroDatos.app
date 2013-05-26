application exampleapp

description {
  A simple app that uses CRUD page generation for managing a Person entity
}

imports templates
imports search/searchconfiguration

section pages

define page root() {
  main()
  define body() {
    "Hello world!"
  }
}

entity Customer {
  name    :: String (name)
  surname :: String (surname)
  address :: String (address)
  email       :: Email
  dateOfBirth :: Date
  bio         :: WikiText
  photo       :: Image  
}

derive CRUD Customer


