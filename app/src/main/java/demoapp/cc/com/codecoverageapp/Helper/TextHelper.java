package demoapp.cc.com.codecoverageapp.Helper;

public class TextHelper {
    private static TextHelper helper;
    public static TextHelper getInstance(){
        if(helper == null)return new TextHelper();
        return helper;
    }

    public static String getText(int progress){
        if(progress>0 && progress<50)return "low";
        else return "high";

    }
}
