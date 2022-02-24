class Project{
    private int daysRequired;
    private int bestBefore;
    private int score;
    private int numRole;
    Object[][] roles;

    public void Project(int daysR,int score, int bestB, int roles ){
        this.daysRequired = daysR;
        this.bestBefore= bestB;
        this.score = score;
        this.numRole=roles;
        this.roles = new String[numRole][2];
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public int getScore() {
        return score;
    }

    public int getRoleLevel(String RoleName){
        int level = 0;
        for(int i=0;i<roles.length;i++){
            if(RoleName.equals(roles[i][0])){
                level = (int) roles[i][1];
            }
        }
        return level;
    }

    public String[] getRoles(){
        String[] role = new String[numRole];
        for(int i=0;i<roles.length;i++){
                role[i] = (String)roles[i][0];
        }
        return role;
    }

}