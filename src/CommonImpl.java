
public class CommonImpl<T extends PolyParam> implements MyInterface<T> {

    @Override
    public void method1(PolyParam param) {
        param.op();
    }
}
