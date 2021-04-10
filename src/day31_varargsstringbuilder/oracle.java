package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class oracle {


    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;
        for (String s : strs){
            strs[idx]= strs[idx].concat(" element "+idx);  //concat yapiyor ama initilaze yapmadigi icin etkilemez.
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }

}}








