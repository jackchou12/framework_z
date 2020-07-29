package com.fec.yunmall.projectcore.bean.peasant;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/4/15
 * @describe 首页中部数据
 */
public class HomeCenterData {
    private List<String> title;
    private List<ADTitleData> titles;
    private List<Statistics> statistics;
    private int total;

    public List<ADTitleData> getTitles() {
        return titles;
    }

    public void setTitles(List<ADTitleData> titles) {
        this.titles = titles;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<String> getTitle() {
        return title;
    }

    public void setTitle(List<String> title) {
        this.title = title;
    }

    public List<Statistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<Statistics> statistics) {
        this.statistics = statistics;
    }

    public static class Statistics {
        private int browsevolume;
        private String chaCategory;
        private int number;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getBrowsevolume() {
            return browsevolume;
        }

        public void setBrowsevolume(int browsevolume) {
            this.browsevolume = browsevolume;
        }

        public String getChaCategory() {
            return chaCategory;
        }

        public void setChaCategory(String chaCategory) {
            this.chaCategory = chaCategory;
        }
    }
}
