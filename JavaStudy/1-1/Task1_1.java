

public class Task1_1 {
public static void main(String[] args) {

        // ①int型の hogeInt という名前の変数を宣言し、値「50」で初期化
    	int hogeInt = 50;
    	System.out.println(hogeInt);

        // ②Stringクラスの hogeString という名前の変数を宣言、値「テスト」で初期化
    	String hogeString = "テスト";
    	System.out.println(hogeString);

        // ③下記の処理について、何をしているのかコメントを記入してください
        // [double型のhogeDoubleという名前の変数を宣言し、値「0.8」で初期化]
    	double hogeDouble = 0.8;

        // ④変数 hogeInt を値「100」で上書き
        hogeInt = 100;
        System.out.println(hogeInt);
        
        // ⑤変数 hogeString を値「良くできました！」で上書き
        hogeString = "良くできました!";
        System.out.println(hogeString);
        
        // ⑥変数 hogeInt の値を表示
        hogeInt = 100;
       
        // ⑦下記の処理について、何をしているのかコメントを記入してください
        // [hogeStringという名前の変数の値を出力している]
        System.out.println(hogeString);

        // ⑧変数 hogeDouble の値を表示
       
        int score[] = { 80, 70, 90 }; 

     // 合計スコアを宣言し、0で初期化する 
     int unk = 0; 

     unk = score[0] + score[1] + score[2]; 

     System.out.println("合計点は" + unk + "点です");

    
}}
