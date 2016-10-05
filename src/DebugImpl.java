

public class DebugImpl implements MyInterface<DebugPolyParam> {

    @Override
    public void method1(DebugPolyParam param) {
        param.debugOp();
    }
}
