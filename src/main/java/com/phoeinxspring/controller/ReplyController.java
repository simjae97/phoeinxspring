package com.phoeinxspring.controller;



import com.phoeinxspring.model.dao.ReplyDao;
import com.phoeinxspring.model.dto.ReplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class ReplyController {

    @Autowired
    ReplyDao replyDao;

    //입력받은 boardno 를 댓글 다오로 보내서 처리결과 받아오기
    public ArrayList<Map> replyview(int boardno){
        ArrayList<Map> result = replyDao.replyview(boardno);
        return result;
    }

    public boolean replyWrite(ReplyDTO replyDTO){
        return replyDao.replyWrite(replyDTO);
    }

    public boolean replyDelete(int replyno){
        return  replyDao.replyDelete(replyno);
    }

    public boolean replyUpdate(ReplyDTO replyDTO){
        return replyDao.replyUpdate(replyDTO);
    }
}
