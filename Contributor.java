class Contributor {
    private String contributorName;
    private int numOfContributorSkills;
    private String contributorSkill;
    private int contributerSkillLevel;
    Object[][] role;
    
    public void Contributor(String cName, int numOfCSkills, String cSkill, int cSkillLevel){
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

    public String getContributorSkill(){
        return contributorSkill;
    }

    public int getContributorSkillLevel(){
        return contributerSkillLevel;
    }

    



}
