
public class Usage {

    public static void main(String[] args) {
        CommonImpl commonImpl = new CommonImpl();
        commonImpl.method1(new CommonPolyParamImpl());

        DebugImpl debugImpl = new DebugImpl();
        debugImpl.method1(new DebugPolyParamImpl());

    }
}
