public class studentClass {
    private String name;
    private Integer age;
    private String sesso;
    private Boolean essereUmano;
    private Double stipendio;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age>0){this.age = age;}


    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public Boolean getEssereUmano() {
        return essereUmano;
    }

    public void setEssereUmano(Boolean essereUmano) {
        this.essereUmano = essereUmano;
    }

    public Double getStipendio() {
        return stipendio;
    }

    public void setStipendio(Double stipendio) {
        if(stipendio>0){this.stipendio = stipendio;}

    }

    public studentClass(String na, Integer ag, String ses, Boolean ess, Double sti){
        this.name=na;
        this.sesso=ses;
        this.essereUmano=ess;
        if(ag>0){this.age = ag;}
        if(sti>0){this.stipendio = sti;}

    }
}
