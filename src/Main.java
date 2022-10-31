public class Main {
    public static void main(String[] args) {
        int monthDay[];//Создали массив но не выделили память.
        monthDay=new int[12];//Выделили память.
         int monthDay2[];
        monthDay = new int[]{33,7,4,1,8,6,5,4,8,99,8};//Заполнели массив .
        for(int i=0;i< monthDay.length;i++)
        {
            System.out.println(monthDay[i]);
        }

    }
}
