public enum CaseList {
    CASE1("TRAVEL ABROAD", "QUARANTINE"),
    CASE2("CLOSE CONTACT", "QUARANTINE"),
    CASE3("COVID SYMPTOM", "WARDED"),
    CASE4("CRITICAL", "ICU"),
    CASE5("RECOVER", "DISCHARGED");

    String background;
    String status;

    CaseList(String background, String status){
        this.background = background;
        this.status = status;
    }

    public String getBackground() {
        return background;
    }
    
    public String getStatus() {
        return status;
    }
    
}
