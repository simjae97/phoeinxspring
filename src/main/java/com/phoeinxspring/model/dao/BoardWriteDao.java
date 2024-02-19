package com.phoeinxspring.model.dao;



import com.phoeinxspring.model.dto.BoardDTO;
import com.phoeinxspring.model.dto.EmployeeDTO;
import org.springframework.stereotype.Component;

import java.sql.Statement;

@Component
public class BoardWriteDao extends SuperDao {

    public boolean boardWrite(BoardDTO boardDTO , EmployeeDTO loginEno){
        try {
            String sql = "insert into board(boardtitle,boardcontent,eno,bcno,bcno2) values(?,?,?,?,?);";
            ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS); // getGeneratedKeys() 메소드를 실행 하기위한 매개변수 등록
            ps.setString(1,boardDTO.getBoardtitle());
            ps.setString(2,boardDTO.getBoardcontent());
            ps.setInt(3,boardDTO.getEno());
            ps.setInt(4,boardDTO.getBcno());
            ps.setInt(5,boardDTO.getBcno2());
            ;//executeUpdate() 기재된 sql 실행하고 insert된 레코드 개수 반환.
            int count = ps.executeUpdate();
            if(count == 1) return true;
        } catch (Exception e){
            System.out.println("등록오류");
            System.out.println(e);
        }

        return false;
    }
}
