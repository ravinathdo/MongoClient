/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.client.bean;

import java.io.File;

/**
 *
 * @author Janakav
 */

public class MongoStoreBean {
    
    private String username   = "";
    private String password   = "";
    private String seq_no     = "";
    private String ref_id     = "";
    private String channel_id = "";
    private String file_type  = "";
    private String data       = "";
    private String datetime   = ""; // YYYY-MM-DD HH:MM:SS
            
    public String getRef_id() {
        return ref_id;
    }

    public void setRef_id(String ref_id) {
        this.ref_id = ref_id;
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSeq_no() {
        return seq_no;
    }

    public void setSeq_no(String seq_no) {
        this.seq_no = seq_no;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
//    public String getDatetime() {
//        return datetime;
//    }
//
//    public void setDatetime(String datetime) {
//        this.datetime = datetime;
//    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

   
    
    
}
