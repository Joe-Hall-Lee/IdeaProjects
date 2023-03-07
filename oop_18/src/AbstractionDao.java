public abstract class AbstractionDao implements IDAO {

    // void connect();

    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void del() {
        System.out.println("修改");
    }

    @Override
    public void upd() {
        System.out.println("查询");
    }

    @Override
    public void sel() {
        System.out.println("查询");
    }
}