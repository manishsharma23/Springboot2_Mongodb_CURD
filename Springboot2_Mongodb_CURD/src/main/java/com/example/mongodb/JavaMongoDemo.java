package com.example.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class JavaMongoDemo {
	public static void main(String[] args) {
		try {
//---------- Connecting DataBase -------------------------//  
			MongoClient mongoClient = new MongoClient("localhost", 27017);
//---------- Creating DataBase ---------------------------//  
			MongoDatabase db = mongoClient.getDatabase("local");
//---------- Creating Collection -------------------------//  
			MongoCollection<Document> table = db.getCollection("employee");
//---------- Creating Document ---------------------------//    
			Document doc = new Document("name", "hetansh mSharma");
			doc.append("id", 11);
//----------- Inserting Data ------------------------------//  
			table.insertOne(doc);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
