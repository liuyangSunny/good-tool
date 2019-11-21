package com.github.liuyangSunny.good.tool.core.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * LocalDateTime工具类
 *
 * @author liuyang
 */
public class LocalDateTimeUtil {

    /**
     * 将Date转为LocalDateTime
     *
     * @param date Date对象
     * @return LocalDateTime对象
     */
    public static LocalDateTime toLocalDateTime(Date date) {
        return toLocalDateTime(date.toInstant());
    }

    /**
     * LocalDateTime转 Instant
     *
     * @param dateTime 时间
     * @return Instant
     */
    public static Instant toInstant(LocalDateTime dateTime) {
        return dateTime.atZone(ZoneId.systemDefault()).toInstant();
    }

    /**
     * Instant 转 LocalDateTime
     *
     * @param instant Instant
     * @return Instant
     */
    public static LocalDateTime toLocalDateTime(Instant instant) {
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    /**
     * timestamp 转 LocalDateTime
     *
     * @param timestamp long类型的时间戳
     * @return Instant
     */
    public static LocalDateTime toLocalDateTime(long timestamp) {
        return toLocalDateTime(Instant.ofEpochMilli(timestamp));
    }

    /**
     * 获取LocalDateTime的毫秒数
     *
     * @param localDateTime LocalDateTime
     * @return 毫秒数
     */
    public static Long toMillis(LocalDateTime localDateTime) {
        return toInstant(localDateTime).toEpochMilli();
    }
}
