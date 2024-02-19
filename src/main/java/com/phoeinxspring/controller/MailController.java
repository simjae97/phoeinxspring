package com.phoeinxspring.controller;


import com.phoeinxspring.model.dao.MailDao;
import com.phoeinxspring.model.dto.EmployeeDTO;
import com.phoeinxspring.model.dto.MailDTO;
import com.phoeinxspring.model.dto.PartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

@Controller
public class MailController {

    @Autowired
    MailDao mailDao;

    public ArrayList<PartDTO> partView(){ // 파트 가져오기
        return mailDao.partView();
    }

    public EmployeeDTO enoSearch(int eno){ //슈퍼다오에 있는 enoSearch 쓰기위해
        return mailDao.enoSearch(eno);
    }

    public ArrayList<String> receiveEnoSearch(int mailno) { // 메일 받은 사람들 배열보이기
        return mailDao.receiveEnoSearch(mailno);
    }
    public ArrayList<String> sendEnoSearch(int mailno) { // 메일 보낸 사람들 배열보이기
        return mailDao.sendEnoSearch(mailno);
    }

    public boolean emailCheck(String email){
        if(mailDao.emailSearch(email)==-1){ //eno가 있으면 true
            return true;
        }
        return false;
    }
    public int[] sendpartMail(int partno){ // 부서별 eno 검색
        return mailDao.sendpartMail(partno);
    }

    public boolean sendpartMail(ArrayList<Map<String,String>> sendemailarr){ // 부서별 실제 보내기
        return mailDao.sendpartMail(sendemailarr);
    }

    public boolean sendMail(ArrayList<Map<String,String>> sendemailarr){ // 직접 입력
        return mailDao.sendMail(sendemailarr);
    }

    public TreeMap<MailDTO, ArrayList<String>> sendMailsView(int loginEno){
        return mailDao.sendMailsView(loginEno);
    }

    public ArrayList<Map<String,String>> receiveMail(int loginEno){
        return mailDao.receiveMail(loginEno);
    }

    public boolean changeEmailState(int state, int mailno){
        return mailDao.changeEmailState(state, mailno);
    }

}
