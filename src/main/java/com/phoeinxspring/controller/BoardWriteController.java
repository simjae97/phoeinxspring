package com.phoeinxspring.controller;

import com.phoeinxspring.model.dao.BoardWriteDao;
import com.phoeinxspring.model.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardWriteController {
    @Autowired
    BoardWriteDao boardWrite;

    public boolean boardWrite(BoardDTO boardDTO) {
        return boardWrite.boardWrite(boardDTO,EmployController.loginEno);
    }
}
