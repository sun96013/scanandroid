package com.ivan.scanandroid.util;

/**
 * Created by Administrator on 2017/12/6/006.
 */

public class PrintModel {
    String content;
    int size;
    boolean bold;
    boolean underline;
    boolean center;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isUnderline() {
        return underline;
    }

    public void setUnderline(boolean underline) {
        this.underline = underline;
    }

    public boolean isCenter() {
        return center;
    }

    public void setCenter(boolean center) {
        this.center = center;
    }

    public PrintModel(String content, int size, boolean bold, boolean underline, boolean center) {
        this.content = content;
        this.bold = bold;
        this.size = size;
        this.underline = underline;
        this.center = center;
    }
}