public class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGuesses = 0;//记录玩家猜测次数的变化

        GameHelper helper = new GameHelper();//初始化一个GameHelper()对象

        SimpleDotCom theDotCom = new SimpleDotCom();//创建dot come对象
        //用随机数产生第一格的位置，然后以此制作出数组
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocationCells(locations);//赋值的位置

        //创建出记录游戏是否继续进行的boolean变量，这会用在while循环中
        boolean isAlive = true;

        while (isAlive == true) {

            String guess = helper.getUserInput("enter a number");//取得玩家输入的字符串

            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")) {

                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
