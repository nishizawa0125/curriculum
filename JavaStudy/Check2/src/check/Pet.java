package check;
//スーパークラス
public class Pet {
    //フィールド変数
    private String name;
    private String masterName;
 // コンストラクタ
    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }
    //メソッド
    public void introduce() {//a
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}
//サブクラス
class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }
//スペック　メソッド　オーバーライド
    public void introduce() {//b
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}