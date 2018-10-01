package com.javarush.task.task08.task0816;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Iterator;
/* Добрая Зинаида и летние каникулы */
public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Ballone", df.parse("JULY 2 1980"));
        map.put("Mallone", df.parse("AUGUST 17 1980"));
        map.put("Vallone", df.parse("DECEMBER 1 1980"));
        map.put("Challone", df.parse("FEBRUARY 28 1980"));
        map.put("Aallone", df.parse("APRIL 1 1981"));
        map.put("Gallone", df.parse("MAY 1 1980"));
        map.put("Berlone", df.parse("OCTOBER 1 1980"));
        map.put("Llone", df.parse("SEPTEMBER 1 1983"));
        map.put("Alone", df.parse("SEPTEMBER 1 1984"));
        //напишите тут ваш код
        return map;
    }
    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> entry = iterator.next();
            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }

    }
    public static void main(String[] args) {
    }
}