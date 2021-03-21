package com.sded.zoetest.service;

import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.sded.zoetest.config.ApplicationProperties;
import com.sded.zoetest.domain.Candidate;
import com.sded.zoetest.domain.Record;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class CandidateService {
    public class statusReport {
        String status;
        String msg;
        int ragicId;
        String rv;
    }

    private Gson gson = new Gson();
    private String Address = "1000006";
    private String Zipcode = "1000007";

    // Read
    public List<Candidate> getCandidate(int sheetId, String query) {
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/";
        url += sheetId;
        List<Candidate> list = new ArrayList<>();
        try {
            String output = HttpService.sendGet(url, query);
            // output = output.substring(1, output.length()-1);

            Map<String, Candidate> res = gson.fromJson(output, new TypeToken<Map<String, Candidate>>() {
            }.getType());
            // JsonObject jsonObj = element.getAsJsonObject();
            res.keySet().stream().forEach(key -> list.add(res.get(key)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // Create
    public void createCandidate(int sheetId, Candidate candidate, String query) {
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/";
        url += sheetId;
        try {
            String json = Address + "=" + URLEncoder.encode(candidate.getAddress(), "UTF-8") + "&" + Zipcode + "="
                    + URLEncoder.encode(candidate.getZipcode(), "UTF-8");
            String output = HttpService.sendPost(url, json);
            statusReport sr = gson.fromJson(output, statusReport.class);
            System.out.println(sr.status);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update
    public Candidate getTargetCandidate(int sheetId, int recordId, String query){
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/";
        url += sheetId + "/" + recordId;
        List<Candidate> list = new ArrayList<>();
        try {
            String output = HttpService.sendGet(url, query);
            // output = output.substring(1, output.length()-1);

            Map<String, Candidate> res = gson.fromJson(output, new TypeToken<Map<String, Candidate>>() {
            }.getType());
            
            res.keySet().stream().forEach(key -> list.add(res.get(key)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list.size() > 0?list.get(0):null;
    }

    public void updateCandidate(int sheetId, int recordId, Candidate candidate, String query) {
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/";
        url += sheetId + "/" + recordId;
        try {
            String json = Address + "=" + URLEncoder.encode(candidate.getAddress(), "UTF-8") + "&" + Zipcode + "="
                    + URLEncoder.encode(candidate.getZipcode(), "UTF-8");
            String output = HttpService.sendPost(url, json);
            statusReport sr = gson.fromJson(output, statusReport.class);
            System.out.println(sr.status);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete
    public void deleteCandidate(int sheetId, int recordId, String query) {
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/";
        url += sheetId + "/" + recordId;
        try {
            String output = HttpService.sendDelete(url, query);
            statusReport sr = gson.fromJson(output, statusReport.class);
            System.out.println(sr.msg);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
