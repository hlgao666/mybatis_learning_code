package allen.utils;


import java.util.UUID;

/**
 * @author Allen
 * @date 2020/11/22 22:25
 */

public class IDutils {

    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
