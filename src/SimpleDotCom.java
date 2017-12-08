

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits=0;
    public void setLocationCells(int[] locs){
        locationCells=locs;
    }
    public String checkYourself(String stringGuess){
        int guess=Integer.parseInt(stringGuess);//把字符串转换成int
        String result="miss";//创建出保存返回结果的变量。以miss作为默认值。
        //以循环对每个格子重复执行
        for (int cell:locationCells){
            if (guess==cell){//比较格子与猜测值
                result="hit";
                numOfHits++;
                break;//离开循环，需要判断是否击沉。
            }

        }
        //已经离开循环，但需要判断是否击沉
        if (numOfHits==locationCells.length){
            result="kill";
        }
        System.out.println(result);//将结果打印出来。
        return result;//将结果返回给调用方
    }



}
