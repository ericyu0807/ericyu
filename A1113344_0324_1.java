import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    int speed;
    void show(){
        System.out.println("姓名:"+this.name);
        System.out.println("身高:"+this.height);
        System.out.println("體重:"+this.weight);
        System.out.println("速度:"+this.speed);
        System.out.println();
    }
    double distance(int x,double y){
        return x*y*this.speed;
    }
    int distance(int x){
        return x*this.speed;
    }
}
public class A1113344_0324_1 {
    public static void main(String[] argv){
            animal []animals = new animal[4];
            for(int i=0;i<4;i++){
                animals[i]=new animal();
            }

        animals[0].name = "雪寶";
        animals[0].height = 1.1;
        animals[0].weight = 52;
        animals[0].speed = 100;

        animals[1].name = "驢子";
        animals[1].height = 1.5;
        animals[1].weight = 99;
        animals[1].speed = 200;

        animals[2].name = "安那";
        animals[2].height = 1.7;
        animals[2].weight = 48;
        animals[2].speed = 120;

        animals[3].name = "愛沙";
        animals[3].height = 1.7;
        animals[3].weight = 50;
        animals[3].speed = 120;

        for(int i=0;i<4;i++){
            animals[i].show();
        }

        Scanner sc = new Scanner(System.in);

        for(animal a : animals){
            System.out.println("請輸入"+a.name+"的奔跑時間(x)");
            int x = sc.nextInt();
            System.out.println("請輸入"+a.name+"的加速度(y)。若無請輸入0");
            double y = sc.nextDouble();
            double speed;
            if (y>0)
                speed = a.distance(x,y);
            else
                speed = a.distance(x);
            System.out.println(a.name+"的奔跑距離為"+speed); 
        }
    }    
}