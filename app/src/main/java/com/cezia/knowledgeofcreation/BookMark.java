package com.cezia.knowledgeofcreation;

import android.os.Build;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class BookMark {
    private int numPart;
    private String strFragment;
    private int positionScrollY;
    private int positionScrollX;

    public BookMark() {
        clearBookMark();
    }

    BookMark(BookMark bookMark) {
        numPart = bookMark.getNumPart();
        strFragment = bookMark.getStrFragment();
        positionScrollY = bookMark.getPositionScrollY();
        positionScrollX = bookMark.getPositionScrollX();
    }

    BookMark(int numPart, int numFragment) {
        this.numPart = numPart;
        this.strFragment = "";
    }

    BookMark(int numPart, String strFragment) {
        this.numPart = numPart;
        this.strFragment = strFragment;
    }

    private void clearBookMark() {
        numPart = 0;
        strFragment = "";
        positionScrollX = 0;
        positionScrollY = 0;
    }

    boolean equalsStrFragment(BookMark bookMark){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return Objects.equals(this.strFragment, bookMark.getStrFragment());
        }else {
            return this.strFragment == bookMark.getStrFragment();
        }
    }

    public String getFileName(){
        int pos = strFragment.indexOf(".");
        String strYear= strFragment.substring(0,pos);
        pos = strFragment.indexOf(".", pos+1);
        String strMonth= strFragment.substring(0,pos);
        return strYear+ "/" +strMonth+ "/" +strFragment+".txt";
    }

    public String getStrFragment() {
        return strFragment;
    }

    public void setStrFragment(String strFragment) {
        this.strFragment = strFragment;
    }

    public int getNumPart() {
        return numPart;
    }

    public void setNumPart(int numPart) {
        this.numPart = numPart;
    }

    private int getPositionScrollY() {
        return positionScrollY;
    }

    public void setPositionScrollY(int positionScrollY) {
        this.positionScrollY = positionScrollY;
    }

    private int getPositionScrollX() {
        return positionScrollX;
    }

    public void setPositionScrollX(int positionScrollX) {
        this.positionScrollX = positionScrollX;
    }

    public String getSubTitle() {
        DateFormat itemDateStr = new SimpleDateFormat("yyyy.MM.dd");
        Date date = null;
        try {
            date = itemDateStr.parse(strFragment);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        itemDateStr = new SimpleDateFormat("d MMMM yyyy года");
        return itemDateStr.format(date);
    }}
