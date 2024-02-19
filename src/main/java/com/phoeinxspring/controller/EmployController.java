package com.phoeinxspring.controller;

import com.phoeinxspring.model.dao.EmployeeDao;
import com.phoeinxspring.model.dto.EmployeeDTO;
import com.phoeinxspring.model.dto.GradeDTO;
import com.phoeinxspring.model.dto.PartDTO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class EmployController {
    
    @Autowired
    EmployeeDao employeeDao;
    @PostMapping("/register")
    public int signUp(EmployeeDTO employeeDTO){
        int result =0;

        //id 중복검사
        if(employeeDao.checkId(employeeDTO.getEid())){
            return 2;
        }
        if(employeeDao.checkEmail(employeeDTO.getEemail())){
            return 3;
        }
        if(employeeDao.checkPhone(employeeDTO.getEphone())){
            return 4;
        }
        //회원가입 요청
        result = employeeDao.signUp(employeeDTO);
        return result;
    }

//    @PostMapping("/register")
//    public ResponseEntity<String> signUp(EmployeeDTO employeeDTO) {
//        // 아이디 중복검사
//        if (employeeDao.checkId(employeeDTO.getEid())) {
//            System.out.println("실패");
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("아이디가 이미 사용 중입니다.");
//        }
//
//        // 다른 실패 상황을 여기에 추가로 검사하고 실패 이유에 대한 문자열을 반환합니다.
//        if (employeeDao.checkEmail(employeeDTO.getEemail())) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("이메일이 이미 사용 중입니다.");
//        }
//
//        // 회원가입 요청
//        int result = employeeDao.signUp(employeeDTO);
//        if (result > 0) {
//            return ResponseEntity.ok("회원가입이 성공적으로 완료되었습니다.");
//        } else {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("서버 오류로 회원가입을 처리할 수 없습니다.");
//        }
//    }
    public static EmployeeDTO loginEno;

    @PostMapping("/login")
    public boolean logIn(EmployeeDTO employeeDTO){
        boolean result = false;
        result = employeeDao.logIn(employeeDTO);
        return result;
    }

    public void logOut(){
        loginEno = null;
    }

    public boolean exit(EmployeeDTO employeeDTO){

        boolean result = false;

        result = employeeDao.exit(employeeDTO, loginEno.getEno());

        return result;
    }

    public ArrayList<EmployeeDTO> employeeInfo(EmployeeDTO employeeDTO){
        ArrayList<EmployeeDTO> result = new ArrayList<>();

        result = employeeDao.employeeInfo(employeeDTO);

        return result;
    }

    public boolean changegradeno(EmployeeDTO employeeDTO){
        boolean result = false;

        result = employeeDao.changegradeno(employeeDTO);
        return result;
    }

    public PartDTO managerpartView(int partno){
        return employeeDao.partnoSearch(partno);
    }
    public GradeDTO managergradeView(int gradeno){
        return employeeDao.gradenoSearch(gradeno);
    }

    public boolean changepartno(EmployeeDTO employeeDTO){
        boolean result= false;
        result = employeeDao.changepartno(employeeDTO);
        return result;
    }

    public boolean fire(EmployeeDTO employeeDTO){
        boolean result = false;
        result = employeeDao.fire(employeeDTO);
        return result;
    }

    public boolean updateInfopw(EmployeeDTO employeeDTO){
        boolean result = false;
        result = employeeDao.updateInfopw(employeeDTO);
        return result;
    }

    public boolean updateInfophone(EmployeeDTO employeeDTO){
        boolean result = false;
        result = employeeDao.updateInfophone(employeeDTO);
        return result;

    }

    public String findEid(){
        return employeeDao.findEid(loginEno);
    }

    public boolean updateInfoEmail(EmployeeDTO employeeDTO){
        boolean result = false;
        result= employeeDao.updateInfoEmail(employeeDTO);
        return  result;
    }
}
