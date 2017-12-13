/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.client.backup;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.pb.client.bean.MongoStoreBean;
import java.util.Date;

/**
 *
 * @author User
 */
public class MongoStore {

    public static MongoClient mongoClient = null;
    
    public void setStoreDocument(MongoStoreBean bean, String collection) {
        
        DB db = getDbConnection();
        
        DBCollection table = db.getCollection(collection);
        //---------------Save example-----------------
        BasicDBObject document = new BasicDBObject();
        document.put("ref_id", bean.getRef_id());
        document.put("channel_id", bean.getChannel_id());
        document.put("file_type", bean.getFile_type());
        document.put("data", bean.getData());
        document.put("datetime", new Date());
        table.insert(document);
        
    }

    public DB getDbConnection() {
        DB db;
        if(mongoClient == null){
        mongoClient = new MongoClient("localhost", 27017);
        }
        db = mongoClient.getDB("omnirepodb");
        return db;
    }
}
