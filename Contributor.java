class Contributor {
    private String contributorName;
    private int numOfContributorSkills;
    private String contributorSkill[];
    private int contributerSkillLevel[];
    
    public void Contributor(String cName, int numOfCSkills, String cSkill[], int cSkillLevel[]){
        this.contributorName = cName;
        this.numOfContributorSkills = numOfCSkills;
        this.contributorSkill = cSkill;
        this.contributerSkillLevel = cSkillLevel;
    }

    public String getContributorName(){
        return contributorName;
    }

    public int getNumOfContributorSkills(){
        return numOfContributorSkills;
    }

    public String getContributorSkill(int i){
        return contributorSkill[i];
    }

    public int getContributorSkillLevel(String contributorSkill){
        for(int i = 0; i < contributorSkill.length(); i++){
            if(contributorSkill.equals(this.contributorSkill[i])){
                return this.contributerSkillLevel[i];
            }
        }
        return 0;
    }

    public void skillLevelUp(String contributorSkill){
        int index = 0;
        
        for(int i = 0; i < contributorSkill.length(); i++){
            if(contributorSkill.equals(this.contributorSkill[i])){
                index = i;
                break;
            }
        }
        contributerSkillLevel[index]++;
    }
}
