package com.phoeinxspring.controller;

import com.phoeinxspring.model.dao.ReportDAO;
import com.phoeinxspring.model.dto.EmployeeDTO;
import com.phoeinxspring.model.dto.ReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

@Controller
public class ReportController {
    @Autowired
    ReportDAO reportDAO;

    public TreeMap<ReportDTO,Boolean> allReport2(){
        return reportDAO.allReport2();
    }




    public boolean reportWrite(ReportDTO dto, ArrayList<Integer> array){return reportDAO.reportWrite(dto,array);}
    public EmployeeDTO enoSearch(int num){
        return reportDAO.enoSearch(num);
    }
    public TreeMap<ReportDTO,Boolean> goReport(){
        return reportDAO.goReport();
    }

    public ReportDTO specificreport(int num){
        return reportDAO.specificreport(num);
    }

    public boolean accept(int num){
        return reportDAO.accept(num);
    }

    public ArrayList<EmployeeDTO> findSuperior(){
        return reportDAO.findSuperior();
    }

    public boolean reportDelete(int num){return reportDAO.reportDelete(num);}
    public TreeMap<Integer, Boolean > findSuperiors(int num){
        return reportDAO.findSuperiors(num);
    }
    public String findType(int cno){return reportDAO.findType(cno);}

    public ArrayList<HashMap<Integer,String >> findCategories(){return reportDAO.findCategories();}
}
