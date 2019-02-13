 class Patient {
      
    

    private String patientName;
    private int patientAge;
    private String  patientGender;
    private String disease;
    Patient (String patientName, int patientAge,String patientGender, String disease)
    {
        this.patientName= patientName;
        this.patientGender= patientGender;
        this.patientAge=patientAge;
        this.disease=disease;
    }   

    public String getDisease()
    {return disease;}

    public String toString()
    {
        return (patientName+""+patientAge+""+patientGender +" "+ disease);
    }

}
