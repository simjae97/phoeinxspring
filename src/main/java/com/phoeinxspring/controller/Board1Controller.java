package com.phoeinxspring.controller;

import com.phoeinxspring.model.dao.Board1Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;
@Controller
public class Board1Controller { // 개별 글 출력 컨트롤러


    @Autowired
    Board1Dao board1Dao;

    //개별글 출력 컨트롤러 // Map으로 받아서 출력을 map.get으로 하기.
    public Map<String, String> board1(int boardno){
        Map<String,String> result = board1Dao.board1(boardno);
        return result;
    }

    public boolean board1Checking(int boaradno){
        return board1Dao.board1Checking(boaradno, EmployController.loginEno);
    }
}
