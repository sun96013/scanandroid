package com.ivan.scanandroid.util;

import com.ivan.scanandroid.utils.AidlUtil;

import java.util.List;

/**
 * Created by Administrator on 2017/12/6/006.
 */


public class PrintUtil {
    public static void PrintList(String title,List<PrintModel> modelList) {
        AidlUtil.getInstance().printText(title,40,false,false,false);
        for (PrintModel printModel : modelList) {

            AidlUtil.getInstance().printText(printModel.getContent(),printModel.getSize(),printModel.isBold(),printModel.isUnderline(),printModel.isCenter());
        }
        AidlUtil.getInstance().print3Line();
    }
}
