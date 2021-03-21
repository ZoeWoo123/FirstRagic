package com.sded.zoetest.service;

import java.util.*;

import com.sded.zoetest.domain.Candidate;

import org.junit.jupiter.api.Test;

public class CandidateServiceTest {
    private CandidateService cs = new CandidateService();
    private int sheetId = 1;

    @Test
    public void candidateGetTest(){
        String query = "v=3&api&naming=FNAME";
        List<Candidate> list = new ArrayList<>();
        try{
            list = cs.getCandidate(sheetId, query);
            list.stream().forEach(candidate -> System.out.println(candidate));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void candidateCreateTest(){
        Candidate candidate = new Candidate("978 University St. Roselle", "60172");
        try{
            cs.createCandidate(sheetId, candidate, "v=3&api");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void candidateUpdateTest(){
        Candidate candidate = new Candidate();
        int recordId = 12;
        String query = "v=3&api&naming=FNAME";
        try{
            candidate = cs.getTargetCandidate(sheetId, recordId, query);
            System.out.println("Going to change: " + candidate);
        }catch(Exception e){
            e.printStackTrace();
        }
        String newAddress = "715 Bowman Street";
        candidate.setAddress(newAddress);
        String query2 = "v=3&api";
        try{
            cs.updateCandidate(sheetId, recordId, candidate, query2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void candidateDeleteTest(){
        int recordId = 9;
        try{
            cs.deleteCandidate(sheetId, recordId, "v=3&api");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
