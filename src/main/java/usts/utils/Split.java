package usts.utils;

import java.util.ArrayList;
import java.util.List;

public class Split {
    public static List<Integer> split(String split){
        String[] splitArray=split.split("\\|");
        List<Integer> indexs = new ArrayList<Integer>();
        for(int i = 0;i<splitArray.length;i++ ){
            indexs.add(Integer.valueOf(splitArray[i]));
        }
        return indexs;
    }
}
