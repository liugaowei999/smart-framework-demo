package com.liugw.learn.controller;

import com.smart4j.framework.annotation.Action;
import com.smart4j.framework.annotation.Controller;
import com.smart4j.framework.beans.Data;
import com.smart4j.framework.beans.View;
import com.smart4j.framework.utils.JsonUtil;

@Controller
public class TestController {

    static {
        System.out.println("Load Class : TestController");
    }

    public TestController() {
        System.out.println("TestController --- create instance!");
    }

    @Action(value = "get:/hello")
    public Data hello() {
        TjTourScenicTouristStat sss = new TjTourScenicTouristStat();
        sss.setAreaName("adfafdsa");
        sss.setScenicName("1");
        sss.setCount(1);
        sss.setTjDate("20180901");
        Data result = new Data(JsonUtil.toJson(sss));
        return result;
    }

    @Action(value = "get:/hello1")
    public Data hello(String aaa) {
        Data result = new Data("Hello " + aaa);
        return result;
    }

    @Action(value = "get:/index")
    public View toIndex() {
        View view = new View("index.jsp");
        return view;
    }
}

class TjTourScenicTouristStat {

    private static final long serialVersionUID = 1L;
    private String tjDate; // ͳ������
    private String scenicId; // �������
    private String scenicName; // ��������
    private String lon; // �������ھ���
    private String lat; // ��������ά��
    private String areaCode; // �ο���Դ�ر��
    private String areaName; // �ο���Դ������
    private Integer count; // �ο�����
    private String remark; // remark
    private String beginDate; // ͳ�ƿ�ʼ����
    private String endDate; // ͳ�ƽ�������

    public String getTjDate() {
        return tjDate;
    }

    public void setTjDate(String tjDate) {
        this.tjDate = tjDate;
    }

    public String getScenicId() {
        return scenicId;
    }

    public void setScenicId(String scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
