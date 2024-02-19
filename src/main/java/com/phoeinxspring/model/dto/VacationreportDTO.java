package com.phoeinxspring.model.dto;


import lombok.*;

@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
public class VacationreportDTO extends ReportDTO{
    String startdate;
    String enddate;

    public VacationreportDTO(String reporttitle, String reportcontent, String startdate, String enddate) {
        super(reporttitle, reportcontent);
        this.startdate = startdate;
        this.enddate = enddate;
    }

}
