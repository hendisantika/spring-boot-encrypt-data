# spring-boot-encrypt-data

Encrypt PII ( Personally Identifiable Information ) sensitive data in the database using Spring Boot AttributeConverter
with direct search capabilities

### Objective

Enable encryption of certain fields in a datastore.
The data will be encrypted when persisting in the database and will be decrypted when it’s being read from the DB into
the entity object.
The repository methods should work seamlessly without requiring the service layer to explicitly encrypt and pass for
matching or lookup.

### Define the AttributeConverter

An AttributeConverter is a specific interface that provides the capability to transform an attribute ( field ) before
persisting and also while retrieving from the database. We will be defining an AttributeConverter that will encrypt the
data before persisting to DB and also the logic to decrypt the field when retrieving.

Once defined, an AttributeConverter can be mapped into an entity field using @Converter annotation and Spring will
invoke the AttributeConverter whenever the field is being persisted or retrieved to or from DB respectively.

