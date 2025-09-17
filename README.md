# DynamoDBProject
DynamoDB Project

📌 Project Description
This is a basic Spring Boot project that demonstrates how to integrate with Amazon DynamoDB and perform standard CRUD (Create, Read, Update, Delete) operations.
The project showcases how DynamoDB can be used as a NoSQL database for modern applications and how developers can interact with it using the AWS SDK for Java.

🔑 Features
✅ Create – Insert new records into DynamoDB tables.
✅ Read – Fetch records using partition keys and secondary indexes.
✅ Update – Modify existing records.
✅ Delete – Remove items from DynamoDB tables.

⚙️ Tech Stack
Java 17+ / Spring Boot
AWS DynamoDB (Local / Cloud)
AWS SDK v2 for Java
Maven for dependency management

🚀 How It Works
DynamoDB table is created with primary key (Partition Key).
Spring Boot app connects to DynamoDB (local or AWS cloud

REST APIs are exposed for CRUD operations:
POST /users → Create a new user
GET /users/{id} → Fetch a user by ID\
PUT /users/{id} → Update user details
DELETE /users/{id} → Delete a user

🎯 Learning Goals
Understand NoSQL data modeling using DynamoDB.
Learn Spring Boot + DynamoDB integration.
Practice building REST APIs for CRUD functionality.
