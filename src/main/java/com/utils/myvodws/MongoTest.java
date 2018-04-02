/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils.myvodws;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import java.net.UnknownHostException;
import javax.swing.text.Document;

/**
 *
 * @author kunsi
 */
public class MongoTest {

    public static void main(String[] args) throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        DB database = mongoClient.getDB("myvod");
        DBCollection collection = database.getCollection("users");

        DBObject document = new BasicDBObject("uid", "MongoDB")
                .append("userName", 1)
                .append("name", "database")
                .append("email", 100)
                .append("mobile", "http://www.tutorialspoint.com/mongodb/")
                .append("interests", "tutorials point");
        collection.insert(document);
       
    }
}

