package com.sded.zoetest.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.junit.jupiter.api.Test;

public class HttpServiceTest {
    @Test
    public void testGetApi(){
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/1?v=3&api";
        //String url = "https://www.ragic.com/demo/sales/1";
        String query = "";
        String ret = "";
        try {
            ret = HttpService.sendGet(url, query);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.print(ret);
        }
    }
    @Test
    public void testPostApi(){
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/1?v=3&api";
        String Address = "1000006";
        String Zipcode = "1000007";
        String data = "";
        try {
            data = Address + "=" + URLEncoder.encode("1021 Arlington Blvd", "UTF-8") + "&" +
            Zipcode + "=" + URLEncoder.encode("22209", "UTF-8");
            System.out.print(HttpService.sendPost(url, data));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    @Test
    public void testDeleteApi(){
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/1/5?v=3&api";
        try{
            System.out.print(HttpService.sendDelete(url, ""));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
