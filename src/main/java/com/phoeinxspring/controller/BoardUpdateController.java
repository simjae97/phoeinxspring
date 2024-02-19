package com.phoeinxspring.controller;

import com.phoeinxspring.model.dao.BoardUpdateDao;
import com.phoeinxspring.model.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardUpdateController {

    @Autowired
    BoardUpdateDao boardUpdateDao;
    public boolean boardnoSearch(int boardno){
        return boardUpdateDao.boardnoSearch(boardno)==EmployController.loginEno.getEno();
        //로그인 놈과 보드넘버의 eno를 비교해서 같은 사람이면, true 아니면 false 리턴
    }

    public boolean boardUpdate(BoardDTO boardDTO){ // 글 수정 실행 함수 DTO로 받기
        return boardUpdateDao.boardUpdate(boardDTO);
    } // 글 수정 끝

    public boolean boardDelete(int boardno){ // 글 삭제 실행 함수
        return boardUpdateDao.boardDelete(boardno);
    } // 글 삭제 끝
}
