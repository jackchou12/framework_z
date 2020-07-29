package com.fec.yunmall.projectcore.util;

/**
 * @author zhoubo
 * @date 2020/4/9
 * @describe double转换String 科学计数法
 */
public class FormatFloatUtil {
    /**
     * 当浮点型数据位数超过7位之后，数据变成科学计数法显示。用此方法可以使其正常显示。
     * @param value
     * @return Sting
     */
    public static String formatFloatNumber(double value) {
        if(value != 0.00){
            java.text.DecimalFormat df = new java.text.DecimalFormat("#");
            return df.format(value);
        }else{
            return "0.00";
        }

    }
    /**
     * 当浮点型数据位数超过7位之后，数据变成科学计数法显示。用此方法可以使其正常显示。
     * @param value
     * @return Sting
     */
    public static String formatFloatNumber(double value,String format) {
        if(value != 0.00){
            java.text.DecimalFormat df = new java.text.DecimalFormat(format);
            return df.format(value);
        }else{
            return "0.00";
        }

    }
    public static String formatFloatNumber(Double value) {
        if(value != null){
            if(value.doubleValue() != 0.00){
                java.text.DecimalFormat df = new java.text.DecimalFormat("#0.00");//可选的".00"
                return df.format(value.doubleValue());
            }else{
                return "0.00";
            }
        }
        return "";
    }
}
