package com.cezia.knowledgeofcreation;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;

import com.cezia.knowledgeofcreation.menu.ItemDrawerMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public enum EBookPart {

    PART1_001(1, 1, "июль 2011", "2011.07.19"),
    PART1_002(2, 1, "июль 2011", "2011.07.20"),
    PART1_003(3, 1, "июль 2011", "2011.07.21"),
    PART1_004(4, 1, "июль 2011", "2011.07.22"),
    PART1_005(5, 1, "июль 2011", "2011.07.23"),
    PART1_006(6, 1, "июль 2011", "2011.07.24"),
    PART1_007(7, 1, "июль 2011", "2011.07.25"),
    PART1_008(8, 1, "июль 2011", "2011.07.26"),
    PART2_001(9, 2, "август 2011", "2011.08.01"),
    PART2_002(10, 2, "август 2011", "2011.08.03"),
    PART2_003(11, 2, "август 2011", "2011.08.04"),
    PART2_004(12, 2, "август 2011", "2011.08.05"),
    PART2_005(13, 2, "август 2011", "2011.08.06"),
    PART2_006(14, 2, "август 2011", "2011.08.07"),
    PART2_007(15, 2, "август 2011", "2011.08.08"),
    PART2_008(16, 2, "август 2011", "2011.08.09"),
    PART2_009(17, 2, "август 2011", "2011.08.10"),
    PART2_010(18, 2, "август 2011", "2011.08.12"),
    PART2_011(19, 2, "август 2011", "2011.08.13"),
    PART2_012(20, 2, "август 2011", "2011.08.14"),
    PART2_013(21, 2, "август 2011", "2011.08.16"),
    PART2_014(22, 2, "август 2011", "2011.08.26"),
    PART2_015(23, 2, "август 2011", "2011.08.27"),
    PART2_016(24, 2, "август 2011", "2011.08.28"),
    PART2_017(25, 2, "август 2011", "2011.08.29"),
    PART2_018(26, 2, "август 2011", "2011.08.30"),
    PART2_019(27, 2, "август 2011", "2011.08.31"),
    PART3_001(28, 3, "сентябрь 2011", "2011.09.01"),
    PART4_001(29, 4, "ноябрь 2011", "2011.11.28"),
    PART5_001(30, 5, "январь 2012", "2012.01.16"),
    PART5_002(31, 5, "январь 2012", "2012.01.17"),
    PART5_003(32, 5, "январь 2012", "2012.01.18"),
    PART5_004(33, 5, "январь 2012", "2012.01.19"),
    PART5_005(34, 5, "январь 2012", "2012.01.20"),
    PART5_006(35, 5, "январь 2012", "2012.01.21"),
    PART5_007(36, 5, "январь 2012", "2012.01.22"),
    PART5_008(37, 5, "январь 2012", "2012.01.23"),
    PART5_009(38, 5, "январь 2012", "2012.01.24"),
    PART5_010(39, 5, "январь 2012", "2012.01.25"),
    PART5_011(40, 5, "январь 2012", "2012.01.26"),
    PART5_012(41, 5, "январь 2012", "2012.01.27"),
    PART5_013(42, 5, "январь 2012", "2012.01.28"),
    PART5_014(43, 5, "январь 2012", "2012.01.29"),
    PART5_015(44, 5, "январь 2012", "2012.01.30"),
    PART5_016(45, 5, "январь 2012", "2012.01.31"),
    PART6_001(46, 6, "февраль 2012", "2012.02.01"),
    PART6_002(47, 6, "февраль 2012", "2012.02.02"),
    PART6_003(48, 6, "февраль 2012", "2012.02.03"),
    PART6_004(49, 6, "февраль 2012", "2012.02.04"),
    PART6_005(50, 6, "февраль 2012", "2012.02.05"),
    PART6_006(51, 6, "февраль 2012", "2012.02.07"),
    PART6_007(52, 6, "февраль 2012", "2012.02.08"),
    PART7_001(53, 7, "май 2012", "2012.05.31"),
    PART8_001(54, 8, "июнь 2012", "2012.06.01"),
    PART8_002(55, 8, "июнь 2012", "2012.06.03"),
    PART8_003(56, 8, "июнь 2012", "2012.06.05"),
    PART8_004(57, 8, "июнь 2012", "2012.06.07"),
    PART8_005(58, 8, "июнь 2012", "2012.06.08"),
    PART8_006(59, 8, "июнь 2012", "2012.06.09"),
    PART9_001(60, 9, "июнь 2016", "2016.06.04"),
    PART9_002(61, 9, "июнь 2016", "2016.06.05"),
    PART9_003(62, 9, "июнь 2016", "2016.06.07"),
    PART9_004(63, 9, "июнь 2016", "2016.06.08"),
    PART9_005(64, 9, "июнь 2016", "2016.06.09"),
    PART9_006(65, 9, "июнь 2016", "2016.06.11"),
    PART9_008(66, 9, "июнь 2016", "2016.06.13"),
    PART9_009(67, 9, "июнь 2016", "2016.06.14"),
    PART9_010(68, 9, "июнь 2016", "2016.06.15"),
    PART9_011(69, 9, "июнь 2016", "2016.06.16"),
    PART9_012(70, 9, "июнь 2016", "2016.06.17"),
    PART9_013(71, 9, "июнь 2016", "2016.06.18"),
    PART9_014(72, 9, "июнь 2016", "2016.06.24"),
    PART9_015(73, 9, "июнь 2016", "2016.06.25"),
    PART9_016(74, 9, "июнь 2016", "2016.06.27"),
    PART10_001(75, 10, "июль 2016", "2016.07.10"),
    PART10_002(76, 10, "июль 2016", "2016.07.24"),
    PART10_003(77, 10, "июль 2016", "2016.07.25"),
    PART11_001(78, 11, "август 2016", "2016.08.27"),
    PART11_002(79, 11, "август 2016", "2016.08.29"),
    PART11_003(80, 11, "август 2016", "2016.08.30"),
    PART11_004(81, 11, "август 2016", "2016.08.31"),
    PART12_001(82, 12, "сентябрь 2016", "2016.09.01"),
    PART12_002(83, 12, "сентябрь 2016", "2016.09.02"),
    PART12_003(84, 12, "сентябрь 2016", "2016.09.05"),
    PART12_004(85, 12, "сентябрь 2016", "2016.09.06"),
    PART12_005(86, 12, "сентябрь 2016", "2016.09.27"),

    ;
    int bookPart;
    String strPart;
    BookMark bookMark;

    EBookPart(int bookPart, int numPart, String strPart, String strFragment) {
        this.bookPart = bookPart;
        this.strPart = strPart;
        bookMark = new BookMark();
        bookMark.setNumPart(numPart);
        bookMark.setStrFragment(strFragment);
    }

    public String getStrPart() {
        return strPart;
    }

    static String getTextBookPart(Context context, BookMark bookMark, boolean htmlMode) {
        return getStringFromAssetFile(context, bookMark.getFileName(), htmlMode);
    }

    static String getHTMLTextBookPart(Context context, BookMark bookMark, boolean htmlMode) {
//                    "<html> <b><i><sup>"+bookMark.getStrFragment()+"</sup></i></b><br>";
//            iStr += EBookPart.getHTMLTextBookPart(getContext(), bookMark, true)+"</html>";
        return "<html>"+getStringFromAssetFile(context, bookMark.getFileName(), htmlMode)+"</html>";
    }

    private static String getStringFromAssetFile(Context context, String fileName, boolean htmlMode) {
        AssetManager am = context.getAssets();
        InputStream is = null;
        try {
            is = am.open(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = convertStreamToString(is, htmlMode);
        try {
            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    private static String convertStreamToString(InputStream is, boolean htmlMode) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (htmlMode)
                    sb.append(line).append("<br>");
                else
                    sb.append(line).append("\n");
            }
            is.close();
        } catch (OutOfMemoryError | Exception om) {
            om.printStackTrace();
        }
        return sb.toString();
    }

    public static BookMark getNextBookMark(BookMark bookMark) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Objects.equals(bookMark.getStrFragment(), EBookPart.getLastBookFragment()))
                return new BookMark(bookMark);
        } else{
            if (bookMark.getStrFragment() == EBookPart.getLastBookFragment()) return bookMark;
        }
        int lastPart = getNumBookPart(bookMark);
        lastPart++;
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookPart == lastPart) {
                return new BookMark(eBookPart.bookMark);
            }
        }
        return bookMark;
    }

    public static BookMark getPrevBookMark(BookMark bookMark) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Objects.equals(bookMark.getStrFragment(), EBookPart.getFirstBookFragment())) return bookMark;
        } else{
            if (bookMark.getStrFragment() == EBookPart.getFirstBookFragment()) return bookMark;
        }
        int lastPart = getNumBookPart(bookMark);
        lastPart--;
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookPart == lastPart) {
                return new BookMark(eBookPart.bookMark);
            }
        }
        return bookMark;
    }

    private static int getNumBookPart(BookMark bookMark) {
        int lastPart = 0;
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookMark.getNumPart() == bookMark.getNumPart() &&
                    eBookPart.bookMark.equalsStrFragment(bookMark)) {
                lastPart = eBookPart.bookPart;
                break;
            }
        }
        return lastPart;
    }

    public static boolean isLastBookPart(BookMark bookMark) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return (Objects.equals(bookMark.getStrFragment(), EBookPart.getLastBookFragment()));
        } else {
            return (bookMark.getStrFragment() == EBookPart.getLastBookFragment());
        }
    }

    public static BookMark getFirstBookPart() {
        EBookPart[] listBookPart = EBookPart.values();
        return new BookMark(listBookPart[0].bookMark);
    }

    public static String getFirstBookFragment() {
        EBookPart[] listBookPart = EBookPart.values();
        return new BookMark(listBookPart[0].bookMark).getStrFragment();
    }

    public static String getLastBookFragment() {
        EBookPart[] listBookPart = EBookPart.values();
        return new BookMark(listBookPart[listBookPart.length-1].bookMark).getStrFragment();
    }

    public static String getFirstFragment(int numPart) {
        String strFragment = "";
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookMark.getNumPart() == numPart) {
                strFragment = eBookPart.bookMark.getStrFragment();
                break;
            }
        }
        return strFragment;
    }

    public static boolean isFirstBookPart(BookMark bookMark) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return (Objects.equals(bookMark.getStrFragment(), EBookPart.getFirstBookFragment()));
        } else {
            return (bookMark.getStrFragment() == EBookPart.getFirstBookFragment());
        }
    }

    public static int getNumPartByStr(String strPart) {
        for (EBookPart eBookPart : values()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                if (Objects.equals(eBookPart.strPart, strPart)) {
                    return eBookPart.bookMark.getNumPart();
                }
            } else {
                if (eBookPart.strPart.trim() == strPart.trim()) {
                    return eBookPart.bookMark.getNumPart();
                }
            }
        }
        return -1;
    }

    public static BookMark getBookMarkByStr(String strPart, String strFragment) {
        int iPart = getNumPartByStr(strPart);
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookMark.getNumPart() == iPart &&
                    eBookPart.bookMark.getStrFragment() == strFragment) {
                return new BookMark(eBookPart.bookMark);
            }
        }
        return null;
    }

    public static String[] getListParts() {
        int iPart = -1;
        int cntPart = 0;
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookMark.getNumPart() != iPart) {
                iPart = eBookPart.bookMark.getNumPart();
                cntPart++;
            }
        }
        String[] listParts = new String[cntPart];
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookMark.getNumPart() != iPart) {
                iPart = eBookPart.bookMark.getNumPart();
                listParts[iPart - 1] = eBookPart.getStrPart();
            }
        }
        return listParts;
    }

    public static String getStrPart(BookMark bookMark) {
        String strPart = "";
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookMark.getNumPart() == bookMark.getNumPart()) {
                strPart = eBookPart.strPart;
                break;
            }
        }
        return strPart;
    }

    public static String[] getListFragment(BookMark bookMark) {
        int lastPart = bookMark.getNumPart();
        int cntFragment = getCntFragmentByPart(lastPart);
        String[] listFragments = new String[cntFragment];

        int iFrag = 0;
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookMark.getNumPart() == lastPart) {
                listFragments[iFrag] = eBookPart.bookMark.getStrFragment();
                iFrag++;
            }
        }
        return listFragments;
    }

    public static int getCntFragmentByPart(int iPart) {
        int cntFragment = 0;
        for (EBookPart eBookPart : values()) {
            if (eBookPart.bookMark.getNumPart() == iPart) {
                cntFragment++;
            }
        }
        return cntFragment;
    }

    public static int getSize() {
        return  EBookPart.values().length;
    }

    public static ItemDrawerMenu[] setListPart() {
        String[] listParts = EBookPart.getListParts();
        ItemDrawerMenu[] itemDrawerMenu = new ItemDrawerMenu[listParts.length];
        int index = 0;
        for (String iStr: listParts) {
            itemDrawerMenu[index] = new ItemDrawerMenu(R.drawable.ic_bookmark, iStr);
            index++;
        }
        return itemDrawerMenu;
    }

    public static int getFirstFragmentByStrPart(String strPart) {
        int numPart = 1;
        for (EBookPart eBookPart : values()) {
            if (eBookPart.strPart == strPart) {
                numPart = eBookPart.bookPart;
                break;
            }
        }
        return numPart;
    }
}
