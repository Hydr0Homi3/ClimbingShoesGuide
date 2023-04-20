public class Shoe {

    String rockShoeModel;
    String technicalFit;        //Hard Bouldering, Hard Sport Climbing and Elite Trad Climbing.
    String semiTechnicalFit;    //Hard Trad Climbing, Mid Grade Bouldering and Sport Climbing.
    String traditionalFit;      //All purpose Trad Climbing, Sun Rock Sport Climbers and Circuit Bouldering.
    String entryLevelFit;       //Beginners or people who only climb a few times a year.
    String footVolume;          //High volume, Mid volume, Low volume
    String footType;            //Classic - egyptian feet, Square - germanic feet, Centre - greek feet, Morton's toe


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
        return "Shoe{" +
                "rockShoeModel='" + rockShoeModel + '\'' +
                ", technicalFit='" + technicalFit + '\'' +
                ", semiTechnicalFit='" + semiTechnicalFit + '\'' +
                ", traditionalFit='" + traditionalFit + '\'' +
                ", entryLevelFit='" + entryLevelFit + '\'' +
                ", footVolume='" + footVolume + '\'' +
                ", footType='" + footType + '\'' +
                '}';
    }
}
