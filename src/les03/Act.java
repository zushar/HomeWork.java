package les03;

public class Act {
    private String actName;
    private int lrn;
    private Actor[] actArr;
    private int currentNum;

    public Act(String actName, int lrn ) {
        this.actName = actName;
        this.lrn = lrn;
        this.actArr = new Actor[20];
        this.currentNum = 0;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public int getLrn() {
        return lrn;
    }

    public void setLrn(int lrn) {
        this.lrn = lrn;
    }

    public Actor[] getActArr() {
        return actArr;
    }

    public void setActArr(Actor[] actArr) {
        this.actArr = actArr;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }

    public String add(Actor ac){
        if(this.actArr.length==this.currentNum){
            return "no room";
        }
        if (ac.getAge()<45 || ac.getNumActs()<5){
            return "nut suitable";
        }
        this.actArr[currentNum]=ac;
        this.currentNum++;
        return "was add";
    }
    public int acprions(){
        int xp = 0;
        for (int i = 0; actArr.length<currentNum; i++){
            if(actArr[i].getNumActs()>=10){
                xp++;
            }
        }
        return xp;
    }
}

