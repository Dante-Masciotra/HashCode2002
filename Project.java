class Project{
    private String name;
    private int daysRequired;
    private int bestBefore;
    private int score;
    private int numRole;
    private String[] Skill;
    private int[] SkillLevel;

    public void Project(String Name, int daysR,int score, int bestB,int numOfSkills, String[] pSkill, int[] pSkillLevel ){
        this.name= Name;
        this.daysRequired = daysR;
        this.bestBefore= bestB;
        this.numRole = numOfSkills;
        this.score = score;
        this. Skill =pSkill;
        this. SkillLevel =pSkillLevel;
    }

    public String getName() {
        return name;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public int getScore() {
        return score;
    }

    public int getRoleLevel(String RoleName){
        int level = 0;
        for(int i=0;i<Skill.length;i++){
            if(RoleName.equals(Skill[i])){
                level = SkillLevel[i];
                break;
            }
        }
        return level;
    }

    public String getRoles(int index){
        return Skill[index];
    }

}