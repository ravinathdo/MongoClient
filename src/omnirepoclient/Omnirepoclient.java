/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omnirepoclient;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.client.MongoIterable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author User
 */
public class Omnirepoclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        DB db;
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        System.out.println("======db-list");
        MongoIterable<String> listDatabaseNames = mongoClient.listDatabaseNames();
        for (String dbName : listDatabaseNames) {
            System.out.println(dbName);
        }

        
        
        db = mongoClient.getDB("omnirepodb");
        //get all collections 
        System.out.println("======collection-list");
        Set<String> tables = db.getCollectionNames();
        for (String tbl : tables) {
            System.out.println(tbl);
        }

        System.out.println("======collection");
        DBCollection table = db.getCollection("ebx");

        //---------------Save example-----------------
//        BasicDBObject document = new BasicDBObject();
//        document.put("name", "Ravinath Fernando");
//        document.put("age", 30);
//        document.put("createdDate", new Date());
//        table.insert(document);
        //---------------Update example---------------
//        BasicDBObject query = new BasicDBObject();
//        query.put("age", 30);
//        BasicDBObject newDocument = new BasicDBObject();
//        newDocument.put("name", "Gayathri-updated");
//        BasicDBObject updateObj = new BasicDBObject();
//        updateObj.put("$set", newDocument);
//        table.update(query, updateObj,false,true);
        //https://docs.mongodb.com/v3.4/reference/method/db.collection.update/
        //---------------Search example---------------
//        BasicDBObject searchQuery = new BasicDBObject();
//        searchQuery.put("fname", "Gayathri-updated");
//        DBCursor cursor = table.find(searchQuery);
//        while (cursor.hasNext()) {
//            System.out.println(cursor.next());
//        }
        //---------------Search example---------------
//        BasicDBObject searchQuery = new BasicDBObject();
//        searchQuery.put("age", 30);
//        table.remove(searchQuery);

        System.out.println("END");
    }

}
