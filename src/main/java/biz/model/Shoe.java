package biz.model;

public class Shoe {

    private String rockShoeModel;
    private String technicalFit;        //Hard Bouldering, Hard Sport Climbing and Elite Trad Climbing.
    private String semiTechnicalFit;    //Hard Trad Climbing, Mid Grade Bouldering and Sport Climbing.
    private String traditionalFit;      //All purpose Trad Climbing, Sun Rock Sport Climbers and Circuit Bouldering.
    private String entryLevelFit;       //Beginners or people who only climb a few times a year.
    private String footVolume;          //High volume, Mid volume, Low volume
    private String footType;            //Classic - egyptian feet, Square - germanic feet, Centre - greek feet, Morton's toe


    public Shoe(String rockShoeModel, String technicalFit, String semiTechnicalFit, String traditionalFit, String entryLevelFit, String footVolume, String footType) {
        this.rockShoeModel = rockShoeModel;
        this.technicalFit = technicalFit;
        this.semiTechnicalFit = semiTechnicalFit;
        this.traditionalFit = traditionalFit;
        this.entryLevelFit = entryLevelFit;
        this.footVolume = footVolume;
        this.footType = footType;
    }

    public String getRockShoeModel() {
        return rockShoeModel;
    }

    public void setRockShoeModel(String rockShoeModel) {
        this.rockShoeModel = rockShoeModel;
    }

    public String getTechnicalFit() {
        return technicalFit;
    }

    public void setTechnicalFit(String technicalFit) {
        this.technicalFit = technicalFit;
    }

    public String getSemiTechnicalFit() {
        return semiTechnicalFit;
    }

    public void setSemiTechnicalFit(String semiTechnicalFit) {
        this.semiTechnicalFit = semiTechnicalFit;
    }

    public String getTraditionalFit() {
        return traditionalFit;
    }

    public void setTraditionalFit(String traditionalFit) {
        this.traditionalFit = traditionalFit;
    }

    public String getEntryLevelFit() {
        return entryLevelFit;
    }

    public void setEntryLevelFit(String entryLevelFit) {
        this.entryLevelFit = entryLevelFit;
    }

    public String getFootVolume() {
        return footVolume;
    }

    public void setFootVolume(String footVolume) {
        this.footVolume = footVolume;
    }

    public String getFootType() {
        return footType;
    }

    public void setFootType(String footType) {
        this.footType = footType;
    }

    @Override
    public String toString() {
        return
                "Shoe model: " + rockShoeModel + "\n" +
                "Technical Fit: " + technicalFit + "\n" +
                "Semi-Technical Fit: " + semiTechnicalFit + "\n" +
                "Traditional Fit: " + traditionalFit + "\n" +
                "Entry Level Fit: " + entryLevelFit + "\n" +
                "Foot Volume: " + footVolume + "\n" +
                "Foot Type: " + footType + "\n";
    }
}
