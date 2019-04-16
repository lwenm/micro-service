package com.wm.eurekaclient.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class GetJsonData {
  

      
 // 创建JSONObject对象  
    public  JSONObject createJSONObject() {
        JSONObject result = new JSONObject();  
        result.put("success", true);  
        result.put("totalCount", "30");  
        
        JSONObject user1 = new JSONObject();  
        user1.put("id", "12");  
        user1.put("name", "智能开关");
        user1.put("createTime", "2017-11-16 12:12:12");  
   
        JSONObject user2 = new JSONObject();  
        user2.put("id", "13");  
        user2.put("name", "智能插座");
        user2.put("createTime", "2017-11-16 12:12:15"); 
        
        JSONObject department = new JSONObject();
        department.put("id", 1);
        department.put("name","星火原");
        
        user1.put("department", department);
        user2.put("department", department);
          
        // 返回一个JSONArray对象  
        JSONArray jsonArray = new JSONArray();  
          
        jsonArray.add(0, user1);  
        jsonArray.add(1, user2);  
        result.element("data", jsonArray);  
          
        return result;  
    } 
}