package com.example.entity.vo.response;

import lombok.Data;

import java.util.Date;

@Data
public class NotificationVO {
    Integer id;
    Integer uid;
    String title;
    String content;
    String type;
    String url;
    Date time;
}
