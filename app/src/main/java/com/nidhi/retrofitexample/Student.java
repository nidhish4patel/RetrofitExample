package com.nidhi.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by nidhi on 8/24/2017.
 */

public class Student {

        @SerializedName("ID")
        @Expose
        private int iD;
        @SerializedName("FIRSTNAME")
        @Expose
        private String fIRSTNAME;
        @SerializedName("LASTNAME")
        @Expose
        private String lASTNAME;
        @SerializedName("BUILDING")
        @Expose
        private String bUILDING;
        @SerializedName("PHONE")
        @Expose
        private String pHONE;
        @SerializedName("EMAIL")
        @Expose
        private String eMAIL;
        @SerializedName("DEPT")
        @Expose
        private String dEPT;
        @SerializedName("POSITION")
        @Expose
        private String pOSITION;
        @SerializedName("URL")
        @Expose
        private Object uRL;

        public int getID() {
            return iD;
        }

        public void setID(int iD) {
            this.iD = iD;
        }

        public String getFIRSTNAME() {
            return fIRSTNAME;
        }

        public void setFIRSTNAME(String fIRSTNAME) {
            this.fIRSTNAME = fIRSTNAME;
        }

        public String getLASTNAME() {
            return lASTNAME;
        }

        public void setLASTNAME(String lASTNAME) {
            this.lASTNAME = lASTNAME;
        }

        public String getBUILDING() {
            return bUILDING;
        }

        public void setBUILDING(String bUILDING) {
            this.bUILDING = bUILDING;
        }

        public String getPHONE() {
            return pHONE;
        }

        public void setPHONE(String pHONE) {
            this.pHONE = pHONE;
        }

        public String getEMAIL() {
            return eMAIL;
        }

        public void setEMAIL(String eMAIL) {
            this.eMAIL = eMAIL;
        }

        public String getDEPT() {
            return dEPT;
        }

        public void setDEPT(String dEPT) {
            this.dEPT = dEPT;
        }

        public String getPOSITION() {
            return pOSITION;
        }

        public void setPOSITION(String pOSITION) {
            this.pOSITION = pOSITION;
        }

        public Object getURL() {
            return uRL;
        }

        public void setURL(Object uRL) {
            this.uRL = uRL;
        }

    }







