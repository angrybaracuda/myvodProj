/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviceimpl.myvodws;

import com.beans.myvodws.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;

/**
 *
 * @author kunsi
 */
public class UserServiceImpl {

    public User addNewUser(User user) throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        DB database = mongoClient.getDB("myvod");
        DBCollection collection = database.getCollection("users");

        DBObject document = new BasicDBObject("uid", user.getUid())
                .append("userName", user.getUserName())
                .append("name", user.getName())
                .append("email", user.getEmail())
                .append("password", user.getPassword())
                .append("mobile", user.getMobile())
                .append("accountType", user.getAccntType())
                .append("interests", user.getInterests());
        collection.insert(document);
        return user;
    }

    public User getUser(User user) throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        DB database = mongoClient.getDB("myvod");
        DBCollection collection = database.getCollection("users");

        DBObject document = new BasicDBObject();
        document.put("email", "");
        DBCursor cursor = collection.find(document);

// Print out "highest" priority items
        while (cursor.hasNext()) {

            System.out.println(cursor.next());

        }
        return user;
    }

    public String verifyUser() {
        return null;
    }
}
