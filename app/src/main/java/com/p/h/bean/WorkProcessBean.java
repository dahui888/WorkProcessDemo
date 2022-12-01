package com.p.h.bean;

import java.io.Serializable;
import java.util.List;

/**
 * desc： 工作流
 */
public class WorkProcessBean implements Serializable {

    private List<DateBean> data;

    public List<DateBean> getData() {
        return data;
    }

    public void setData(List<DateBean> data) {
        this.data = data;
    }

    public class DateBean implements Serializable {
        private String name;
        private String key;
        private String type;
        private String user;
        private String content;
        private String startTime;
        private String endTime;
        private String dueDate;
        private Integer level;
        private Integer status;
        private Integer result;
        private String signUrl;
        private String last;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getDueDate() {
            return dueDate;
        }

        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getResult() {
            return result;
        }

        public void setResult(Integer result) {
            this.result = result;
        }

        public String getSignUrl() {
            return signUrl;
        }

        public void setSignUrl(String signUrl) {
            this.signUrl = signUrl;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }

    //模拟服务器数据
    public static class JsonBean implements Serializable {
        public static String json = "[\n" +
                "        {\n" +
                "            \"name\":\"开始\",\n" +
                "            \"key\":\"StartEvent_1y45yut\",\n" +
                "            \"type\":\"startEvent\",\n" +
                "            \"user\":\"唐慧建\",\n" +
                "            \"userStr\":null,\n" +
                "            \"userId\":null,\n" +
                "            \"content\":null,\n" +
                "            \"startTime\":\"2022-11-22 16:02:11\",\n" +
                "            \"endTime\":\"2022-11-22 16:02:11\",\n" +
                "            \"dueDate\":null,\n" +
                "            \"level\":1,\n" +
                "            \"status\":1,\n" +
                "            \"result\":null,\n" +
                "            \"signUrl\":null,\n" +
                "            \"last\":null\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\":\"作业前工作\",\n" +
                "            \"key\":\"zypsq\",\n" +
                "            \"type\":\"userTask\",\n" +
                "            \"user\":\"唐慧建\",\n" +
                "            \"userStr\":null,\n" +
                "            \"userId\":null,\n" +
                "            \"content\":null,\n" +
                "            \"startTime\":\"2022-11-22 16:02:11\",\n" +
                "            \"endTime\":\"2022-11-22 16:30:50\",\n" +
                "            \"dueDate\":null,\n" +
                "            \"level\":2,\n" +
                "            \"status\":1,\n" +
                "            \"result\":1,\n" +
                "            \"signUrl\":null,\n" +
                "            \"last\":null\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\":\"属地经理审核\",\n" +
                "            \"key\":\"gszjlsp\",\n" +
                "            \"type\":\"userTask\",\n" +
                "            \"user\":\"唐慧建\",\n" +
                "            \"userStr\":null,\n" +
                "            \"userId\":null,\n" +
                "            \"content\":null,\n" +
                "            \"startTime\":\"2022-11-22 16:30:50\",\n" +
                "            \"endTime\":\"2022-11-22 16:31:01\",\n" +
                "            \"dueDate\":null,\n" +
                "            \"level\":3,\n" +
                "            \"status\":1,\n" +
                "            \"result\":1,\n" +
                "            \"signUrl\":null,\n" +
                "            \"last\":null\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\":\"生产部、机动部、安环部会签\",\n" +
                "            \"key\":\"sbhq\",\n" +
                "            \"type\":\"userTask\",\n" +
                "            \"user\":\"王芬,杨志刚(同意),殷美霞,潘华(同意),郑家文,袁锁俊,陈国中,杨勇,唐慧建(同意),周文文,殷云平,杨春林,孙利方,李伟民,张国平,刘林佳,潘程程\",\n" +
                "            \"userStr\":null,\n" +
                "            \"userId\":null,\n" +
                "            \"content\":null,\n" +
                "            \"startTime\":\"2022-11-22 16:31:01\",\n" +
                "            \"endTime\":\"2022-11-22 16:33:10\",\n" +
                "            \"dueDate\":null,\n" +
                "            \"level\":4,\n" +
                "            \"status\":1,\n" +
                "            \"result\":null,\n" +
                "            \"signUrl\":null,\n" +
                "            \"last\":null\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\":\"副总或安全总监审批\",\n" +
                "            \"key\":\"Activity_01u7720\",\n" +
                "            \"type\":\"userTask\",\n" +
                "            \"user\":\"纪红波,王芬,杨勇,唐慧建,周文文,殷云平,杨春林,孙利方,李伟民,张国平,刘林佳,潘程程\",\n" +
                "            \"userStr\":null,\n" +
                "            \"userId\":null,\n" +
                "            \"content\":null,\n" +
                "            \"startTime\":\"2022-11-22 16:33:10\",\n" +
                "            \"endTime\":\"\",\n" +
                "            \"dueDate\":null,\n" +
                "            \"level\":21,\n" +
                "            \"status\":0,\n" +
                "            \"result\":null,\n" +
                "            \"signUrl\":null,\n" +
                "            \"last\":null\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\":\"验票\",\n" +
                "            \"key\":\"yp\",\n" +
                "            \"type\":\"userTask\",\n" +
                "            \"user\":\"纪红波,王芬,杨勇,唐慧建,周文文,殷云平,杨春林,孙利方,李伟民,张国平,刘林佳,潘程程\",\n" +
                "            \"userStr\":null,\n" +
                "            \"userId\":null,\n" +
                "            \"content\":null,\n" +
                "            \"startTime\":null,\n" +
                "            \"endTime\":null,\n" +
                "            \"dueDate\":null,\n" +
                "            \"level\":22,\n" +
                "            \"status\":-1,\n" +
                "            \"result\":null,\n" +
                "            \"signUrl\":null,\n" +
                "            \"last\":null\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\":\"闭票\",\n" +
                "            \"key\":\"bp\",\n" +
                "            \"type\":\"userTask\",\n" +
                "            \"user\":\"纪红波,王芬,杨勇,唐慧建,周文文,殷云平,杨春林,孙利方,李伟民,张国平,刘林佳,潘程程\",\n" +
                "            \"userStr\":null,\n" +
                "            \"userId\":null,\n" +
                "            \"content\":null,\n" +
                "            \"startTime\":null,\n" +
                "            \"endTime\":null,\n" +
                "            \"dueDate\":null,\n" +
                "            \"level\":23,\n" +
                "            \"status\":-1,\n" +
                "            \"result\":null,\n" +
                "            \"signUrl\":null,\n" +
                "            \"last\":null\n" +
                "        }\n" +
                "    ]";
    }

    // json

    //[
    //{
    //    "name":"开始",
    //        "key":"StartEvent_1y45yut",
    //        "type":"startEvent",
    //        "user":"唐慧建",
    //        "userStr":null,
    //        "userId":null,
    //        "content":null,
    //        "startTime":"2022-11-22 16:02:11",
    //        "endTime":"2022-11-22 16:02:11",
    //        "dueDate":null,
    //        "level":1,
    //        "status":1,
    //        "result":null,
    //        "signUrl":null,
    //        "last":null
    //},
    //{
    //    "name":"作业前工作",
    //        "key":"zypsq",
    //        "type":"userTask",
    //        "user":"唐慧建",
    //        "userStr":null,
    //        "userId":null,
    //        "content":null,
    //        "startTime":"2022-11-22 16:02:11",
    //        "endTime":"2022-11-22 16:30:50",
    //        "dueDate":null,
    //        "level":2,
    //        "status":1,
    //        "result":1,
    //        "signUrl":null,
    //        "last":null
    //},
    //{
    //    "name":"属地经理审核",
    //        "key":"gszjlsp",
    //        "type":"userTask",
    //        "user":"唐慧建",
    //        "userStr":null,
    //        "userId":null,
    //        "content":null,
    //        "startTime":"2022-11-22 16:30:50",
    //        "endTime":"2022-11-22 16:31:01",
    //        "dueDate":null,
    //        "level":3,
    //        "status":1,
    //        "result":1,
    //        "signUrl":null,
    //        "last":null
    //},
    //{
    //    "name":"生产部、机动部、安环部会签",
    //        "key":"sbhq",
    //        "type":"userTask",
    //        "user":"王芬,杨志刚(同意),殷美霞,潘华(同意),郑家文,袁锁俊,陈国中,杨勇,唐慧建(同意),周文文,殷云平,杨春林,孙利方,李伟民,张国平,刘林佳,潘程程",
    //        "userStr":null,
    //        "userId":null,
    //        "content":null,
    //        "startTime":"2022-11-22 16:31:01",
    //        "endTime":"2022-11-22 16:33:10",
    //        "dueDate":null,
    //        "level":4,
    //        "status":1,
    //        "result":null,
    //        "signUrl":null,
    //        "last":null
    //},
    //{
    //    "name":"副总或安全总监审批",
    //        "key":"Activity_01u7720",
    //        "type":"userTask",
    //        "user":"纪红波,王芬,杨勇,唐慧建,周文文,殷云平,杨春林,孙利方,李伟民,张国平,刘林佳,潘程程",
    //        "userStr":null,
    //        "userId":null,
    //        "content":null,
    //        "startTime":"2022-11-22 16:33:10",
    //        "endTime":"",
    //        "dueDate":null,
    //        "level":21,
    //        "status":0,
    //        "result":null,
    //        "signUrl":null,
    //        "last":null
    //},
    //{
    //    "name":"验票",
    //        "key":"yp",
    //        "type":"userTask",
    //        "user":"纪红波,王芬,杨勇,唐慧建,周文文,殷云平,杨春林,孙利方,李伟民,张国平,刘林佳,潘程程",
    //        "userStr":null,
    //        "userId":null,
    //        "content":null,
    //        "startTime":null,
    //        "endTime":null,
    //        "dueDate":null,
    //        "level":22,
    //        "status":-1,
    //        "result":null,
    //        "signUrl":null,
    //        "last":null
    //},
    //{
    //    "name":"闭票",
    //        "key":"bp",
    //        "type":"userTask",
    //        "user":"纪红波,王芬,杨勇,唐慧建,周文文,殷云平,杨春林,孙利方,李伟民,张国平,刘林佳,潘程程",
    //        "userStr":null,
    //        "userId":null,
    //        "content":null,
    //        "startTime":null,
    //        "endTime":null,
    //        "dueDate":null,
    //        "level":23,
    //        "status":-1,
    //        "result":null,
    //        "signUrl":null,
    //        "last":null
    //}
//]

}
