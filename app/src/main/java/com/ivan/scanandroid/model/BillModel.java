/**
 * Copyright 2017 bejson.com
 */
package com.ivan.scanandroid.model;

import java.io.Serializable;

/**
 * Auto-generated: 2017-12-06 16:53:1
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class BillModel {

    private String ResultStatus;
    private JsonResult Result;
    public void setResultStatus(String ResultStatus) {
        this.ResultStatus = ResultStatus;
    }
    public String getResultStatus() {
        return ResultStatus;
    }

    public void setResult(JsonResult Result) {
        this.Result = Result;
    }
    public JsonResult getResult() {
        return Result;
    }

    /**
     * Copyright 2017 bejson.com
     */


    /**
     * Auto-generated: 2017-12-06 16:53:1
     *
     * @author bejson.com (i@bejson.com)
     * @website http://www.bejson.com/java2pojo/
     */
    public class JsonResult  implements Serializable {

        private int Car_ID;
        private int TestType_ID;
        private String dStartTime;
        private String dEndTime;
        private int BillStatus;
        private String cMemo;
        private String BillCode;
        private int iAppTimeNum;
        private int MakeUserID;
        private int iTotalMon;
        private int iRelMon;
        private String Car_Brand;
        private String Car_SortNo;
        private String User_Name;
        private String User_Phone;
        public void setCar_ID(int Car_ID) {
            this.Car_ID = Car_ID;
        }
        public int getCar_ID() {
            return Car_ID;
        }

        public void setTestType_ID(int TestType_ID) {
            this.TestType_ID = TestType_ID;
        }
        public int getTestType_ID() {
            return TestType_ID;
        }

        public void setDStartTime(String dStartTime) {
            this.dStartTime = dStartTime;
        }
        public String getDStartTime() {
            return dStartTime;
        }

        public void setDEndTime(String dEndTime) {
            this.dEndTime = dEndTime;
        }
        public String getDEndTime() {
            return dEndTime;
        }

        public void setBillStatus(int BillStatus) {
            this.BillStatus = BillStatus;
        }
        public int getBillStatus() {
            return BillStatus;
        }

        public void setCMemo(String cMemo) {
            this.cMemo = cMemo;
        }
        public String getCMemo() {
            return cMemo;
        }

        public void setBillCode(String BillCode) {
            this.BillCode = BillCode;
        }
        public String getBillCode() {
            return BillCode;
        }

        public void setIAppTimeNum(int iAppTimeNum) {
            this.iAppTimeNum = iAppTimeNum;
        }
        public int getIAppTimeNum() {
            return iAppTimeNum;
        }

        public void setMakeUserID(int MakeUserID) {
            this.MakeUserID = MakeUserID;
        }
        public int getMakeUserID() {
            return MakeUserID;
        }

        public void setITotalMon(int iTotalMon) {
            this.iTotalMon = iTotalMon;
        }
        public int getITotalMon() {
            return iTotalMon;
        }

        public void setIRelMon(int iRelMon) {
            this.iRelMon = iRelMon;
        }
        public int getIRelMon() {
            return iRelMon;
        }

        public void setCar_Brand(String Car_Brand) {
            this.Car_Brand = Car_Brand;
        }
        public String getCar_Brand() {
            return Car_Brand;
        }

        public void setCar_SortNo(String Car_SortNo) {
            this.Car_SortNo = Car_SortNo;
        }
        public String getCar_SortNo() {
            return Car_SortNo;
        }

        public void setUser_Name(String User_Name) {
            this.User_Name = User_Name;
        }
        public String getUser_Name() {
            return User_Name;
        }

        public void setUser_Phone(String User_Phone) {
            this.User_Phone = User_Phone;
        }
        public String getUser_Phone() {
            return User_Phone;
        }

    }
}