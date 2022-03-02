# Songr
Additions to the app are noted below per-lab

## Lab 12: Spring RESTful Routing
03/01/2022

### Objectives

To allow users of the Songr site to view and add album data that persists.

### Functionality

The existing Spring application can now make POST requests to a database using an HTML form located at the existing "/albums" route.

### Tools Used
* Postgres for database functionality
* pgAdmin for database troubleshooting/management

#### Usage Instructions

For command line execution: 
* Within the \songr directory, run `gradlew bootRun` to start the server
* Default ports are used (`5432` for server itself)