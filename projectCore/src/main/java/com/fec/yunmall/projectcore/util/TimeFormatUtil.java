package com.fec.yunmall.projectcore.util;

import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zhoubo
 * @date 2020/4/22
 * @describe 时间格式化
 */
public class TimeFormatUtil {

    public static String showDate(Date date,String pattern){
        String  dateStr=format(date,pattern);
        String year = dateStr.substring(0,4);
        Long yearNum =Long.parseLong(year);
        int month = Integer.parseInt(dateStr.substring(5,7));
        int day = Integer.parseInt(dateStr.substring(8,10));
        String hour = dateStr.substring(11,13);
        String minute = dateStr.substring(14,16);

        long addtime =date.getTime();
        long today = System.currentTimeMillis();//当前时间的毫秒数
        Date now = new Date(today);
        String  nowStr=format(now,pattern);
        int  nowDay = Integer.parseInt(nowStr.substring(8,10));
        String result="";
        long l=today-addtime;//当前时间与给定时间差的毫秒数
        long days=l/(24*60*60*1000);//这个时间相差的天数整数，大于1天为前天的时间了，小于24小时则为昨天和今天的时间
        long hours=(l/(60*60*1000)-days*24);//这个时间相差的减去天数的小时数
        long min=((l/(60*1000))-days*24*60-hours*60);//
        long s=(l/1000-days*24*60*60-hours*60*60-min*60);
        if(days > 0){
            if(days>0 && days<2){
                result ="前天";
            } else {
                result = month+"月"+day+"日";
            }
        }else if(hours > 0 ) {
            if(day!=nowDay){
                result = "昨天";
            }else{
                result=hours+"小时前";
            }
        } else if(min > 0){
            if(min>0 && min<15){
                result="刚刚";
            } else {
                result=min+"分前";
            }
        }else {
            result=s+"秒前";
        }
        return result;
    }
    public static String showDate2(Date date,String pattern){
        String  dateStr=format(date,pattern);
        String year = dateStr.substring(0,4);
        Long yearNum =Long.parseLong(year);
        int month = Integer.parseInt(dateStr.substring(5,7));
        int day = Integer.parseInt(dateStr.substring(8,10));
        String hour = dateStr.substring(11,13);
        String minute = dateStr.substring(14,16);

        long addtime =date.getTime();
        long today = System.currentTimeMillis();//当前时间的毫秒数
        Date now = new Date(today);
        String  nowStr=format(now,pattern);
        int  nowDay = Integer.parseInt(nowStr.substring(8,10));
        String result="";
        long l=today-addtime;//当前时间与给定时间差的毫秒数
        long days=l/(24*60*60*1000);//这个时间相差的天数整数，大于1天为前天的时间了，小于24小时则为昨天和今天的时间
        long hours=(l/(60*60*1000)-days*24);//这个时间相差的减去天数的小时数
        long min=((l/(60*1000))-days*24*60-hours*60);//
        long s=(l/1000-days*24*60*60-hours*60*60-min*60);
        if(days > 0){
            if(days>0 && days<2){
                result ="前天"+hour+"点"+minute+"分";
            } else {
                result = yearNum%100+"年"+month+"月 "+day+"日"+hour+"点"+minute+"分";
            }
        }else if(hours > 0 ) {
            if(day!=nowDay){
                result = "昨天"+hour+"点"+minute+"分";
            }else{
                result=hours+"小时前";
            }
        } else if(min > 0){
            if(min>0 && min<15){
                result="刚刚";
            } else {
                result=min+"分前";
            }
        }else {
            result=s+"秒前";
        }
        return result;
    }
    public static String formatData(String time){
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date parse = null;
        try {
            parse = sdf.parse(time);
            return showDate(parse, pattern);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
    public static String formatDateYYYYMMdd(String time){
        if (TextUtils.isEmpty(time))return "";
        System.out.println("time = [" + time + "]");
        String str1 = "yyyy-MM-dd HH:mm:ss";
        String str2 = "yyyy-MM-dd";
        String pattern = "";
        if (time.length()>str2.length()){
            pattern = str1;
        }else{
            pattern = str2;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date parse = null;
        try {
            parse = sdf.parse(time);
            return format(parse, "yyyy-MM-dd");
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return "";
    }
    public static String formatDateYYYYMMdd2(String time){
        if (TextUtils.isEmpty(time))return "";
        System.out.println("time = [" + time + "]");
        String str1 = "yyyy-MM-dd HH:mm:ss";
        String str2 = "yyyy-MM-dd";
        String pattern = "";
        if (time.length()>str2.length()){
            pattern = str1;
        }else{
            pattern = str2;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date parse = null;
        try {
            parse = sdf.parse(time);
            return format(parse, "yyyy年MM月dd日 HH:mm:ss");
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return "";
    }
    /**
     * 日期格式化
     * @param date      需要格式化的日期
     * @param pattern   时间格式，如：yyyy-MM-dd HH:mm:ss
     * @return          返回格式化后的时间字符串
     */
    public static String format(Date date, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }


    /**
     * 将日期转化为上中下旬
     *
     * @param inDate
     * @return
     */
    public static String getData(String inDate) {
        String returnCode = "月下旬";

        Calendar cal = Calendar.getInstance();//日历对象
        try {
            cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(inDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int day = cal.get(Calendar.DATE);//获取日
        if (day < 11)
            returnCode = "月上旬";
        else if (day < 21)
            returnCode = "月中旬";
        returnCode = cal.get(Calendar.YEAR) + "年" + String.valueOf(cal.get(Calendar.MONTH) + 1) + returnCode;

        return returnCode;
    }
    /**
     * 将日期转化为上中下旬不带年
     *
     * @param inDate
     * @return
     */
    public static String getDataNoYear(String inDate) {
        String returnCode = "月下旬";

        Calendar cal = Calendar.getInstance();//日历对象
        try {
            cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(inDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int day = cal.get(Calendar.DATE);//获取日
        if (day < 11)
            returnCode = "月上旬";
        else if (day < 21)
            returnCode = "月中旬";
        returnCode =String.valueOf(cal.get(Calendar.MONTH) + 1) + returnCode;

        return returnCode;
    }
}
