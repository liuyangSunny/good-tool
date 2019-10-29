package com.github.liuyangSunny.good.tool.core.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * LocalDateTime工具类
 * @author liuyang
 */
public class LocalDateTimeUtil {

    public LocalDateTime toLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    public Long toMillis(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
