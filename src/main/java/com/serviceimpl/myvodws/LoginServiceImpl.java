/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviceimpl.myvodws;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;

/**
 *
 * @author kunsi
 */
public class LoginServiceImpl {

    public String checkLogin(String userName, String password) throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        DB database = mongoClient.getDB("myvod");
        DBCollection collection = database.getCollection("users");
        BasicDBObject query = new BasicDBObject();

        query.put("userName", userName);
        query.put("password",password);
     

        DBCursor cursor = collection.find(query);

// Print out "highest" priority items
        while (cursor.hasNext()) {

            System.out.println(cursor.next());

        }
        return null;
    }
}
