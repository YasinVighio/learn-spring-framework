package com.springlearn.beans;

public class EnglishMarkSheet implements Marksheet{
    private String markSheetId;
    private String markSheetName = "English";
    private String markSheetGrade;

    public String getMarkSheetId() {
        return markSheetId;
    }

    public void setMarkSheetId(String markSheetId) {
        this.markSheetId = markSheetId;
    }

    public String getMarkSheetName() {
        return markSheetName;
    }

    public void setMarkSheetName(String markSheetName) {
        this.markSheetName = markSheetName;
    }

    public String getMarkSheetGrade() {
        return markSheetGrade;
    }

    public void setMarkSheetGrade(String markSheetGrade) {
        this.markSheetGrade = markSheetGrade;
    }
}
