package com.fec.yunmall.projectcore.util;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author by  .
 * @data on      2018/6/25 14:44
 * @describe ${时间相关}
 */

public class TimeUtils {

    @SuppressLint("SimpleDateFormat")
    private static final DateFormat DEFAULT_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @SuppressLint("SimpleDateFormat")
    private static final DateFormat DEFAULT_FORMAT2 = new SimpleDateFormat("yyyy-MM-dd");


    private TimeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 获取时间戳
     *
     * @return
     */
    public static String getCurString() {
        long msg = System.currentTimeMillis();

        return Long.toString(msg);
    }


    public static int getTimeDay(String suppyDate, int day){
        long millis = TimeUtils.string2Millis(suppyDate);
        int days = TimeUtils.getFitTimeSpanV2(millis, System.currentTimeMillis(), 0);
        return day-days;
    }

    /**
     * 获取两个时间字符串间隔多少天
     * @param startTime
     * @param endTime
     * @return
     */
    public static int getIntervalDay(String startTime,String endTime){
        long stime = TimeUtils.string2Millis2(startTime);
        long etime = TimeUtils.string2Millis2(endTime);
        return TimeUtils.getFitTimeSpanV2(stime,etime, 0);
    }

    /**
     * 将时间戳转为时间字符串
     * <p>The pattern is {@code yyyy-MM-dd HH:mm:ss}.</p>
     *
     * @param millis The milliseconds.
     * @return the formatted time string
     */
    public static String millis2String(final long millis) {
        return millis2String(millis, DEFAULT_FORMAT);
    }

    /**
     * Milliseconds to the formatted time string.
     *
     * @param millis The milliseconds.
     * @param format The format.
     * @return the formatted time string
     */
    public static String millis2String(final long millis, @NonNull final DateFormat format) {
        return format.format(new Date(millis));
    }

    /**
     * 将时间字符串转为时间戳
     * <p>The pattern is {@code yyyy-MM-dd HH:mm:ss}.</p>
     *
     * @param time The formatted time string.
     * @return the milliseconds
     */
    public static long string2Millis(final String time) {
        return string2Millis(time, DEFAULT_FORMAT);
    }
    public static long string2Millis2(final String time) {
        return string2Millis(time, DEFAULT_FORMAT2);
    }

    /**
     * Formatted time string to the milliseconds.
     *
     * @param time   The formatted time string.
     * @param format The format.
     * @return the milliseconds
     */
    public static long string2Millis(final String time, @NonNull final DateFormat format) {
        try {
            return format.parse(time).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * 将时间字符串转为 Date 类型
     * <p>The pattern is {@code yyyy-MM-dd HH:mm:ss}.</p>
     *
     * @param time The formatted time string.
     * @return the date
     */
    public static Date string2Date(final String time) {
        return string2Date(time, DEFAULT_FORMAT);
    }


    public static Date string2Date2(final String time) {
        return string2Date(time, DEFAULT_FORMAT2);
    }

    /**
     * 转换年月日
     * @param time
     * @return
     */
    public static List<Integer> stringToYMd(String time){
        List<Integer> arr = new ArrayList<>();
        arr.add(Integer.parseInt(time.substring(0,4)));
        arr.add(Integer.parseInt(time.substring(5,7)));
        arr.add(Integer.parseInt(time.substring(8,10)));
        return arr;
    }

    /**
     * Formatted time string to the date.
     *
     * @param time   The formatted time string.
     * @param format The format.
     * @return the date
     */
    public static Date string2Date(final String time, @NonNull final DateFormat format) {
        try {
            return format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取合适型两个时间差
     *
     * @param millis0   毫秒时间戳1
     * @param millis1   毫秒时间戳2
     * @param precision 精度
     *                  <p>precision = 0，返回null</p>
     *                  <p>precision = 1，返回天</p>
     *                  <p>precision = 2，返回天和小时</p>
     *                  <p>precision = 3，返回天、小时和分钟</p>
     *                  <p>precision = 4，返回天、小时、分钟和秒</p>
     *                  <p>precision &gt;= 5，返回天、小时、分钟、秒和毫秒</p>
     * @return 合适型两个时间差
     */
    public static int getFitTimeSpanV2(long millis0, long millis1,int precision) {
        return millis2FitTimeSpanV2(Math.abs(millis0 - millis1),precision);
    }

    @SuppressLint("DefaultLocale")
    public static int millis2FitTimeSpanV2(long millis, int precision) {
        if (millis <= 0) return 0;
        int[] unitLen = {86400000, 3600000, 60000, 1000, 1};
        long mode = 0;
        precision = Math.min(precision, 5);
        mode = millis / unitLen[precision];
        return (int) mode;
    }

    /**
     * 返回今天、昨天、2019-10-10 三种格式
     *
     * @param date
     * @return
     */
    public static String isNow(String date) {
        if (ObjectUtils.isEmpty(date)) {
            return "";
        }

        String dateF = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(dateF);
        String nowDay = "";
        try {
            nowDay = sdf.format(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //今天
        Calendar cal = Calendar.getInstance();
        String yday = sdf.format(cal.getTime());
        if (yday.equals(nowDay)) {
            return "今天";
        }

        //昨天
        cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        yday = sdf.format(cal.getTime());
        if (yday.equals(nowDay)) {
            return "昨天";
        }
        L.i("nowDay：" + nowDay);
        return nowDay;
    }
}
