
public class CommonImpl implements MyInterface<PolyParam> {

    @Override
    public void method1(PolyParam param) {
        param.op();
    }
}
