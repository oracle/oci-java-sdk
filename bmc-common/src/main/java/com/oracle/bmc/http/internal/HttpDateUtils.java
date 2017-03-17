/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import lombok.extern.slf4j.Slf4j;

/**
 * Date parsing utils.
 * <p>
 * Handles reusing date formatters, as well as which date formats that will be
 * used to parse various headers.
 */
@Slf4j
public class HttpDateUtils {
    private static final TimeZone TIMEZONE_GMT = TimeZone.getTimeZone("GMT");
    private static final Date AMBIGUOUS_YEAR_TWO_DIGIT_YEAR_START;

    private static final ThreadLocal<List<SimpleDateFormat>> RFC2616_DATE_FORMATS =
            new ThreadLocal<List<SimpleDateFormat>>() {
                @Override
                protected synchronized List<SimpleDateFormat> initialValue() {
                    return createRfc2616DateFormats();
                }
            };

    private static final ThreadLocal<List<SimpleDateFormat>> RFC3339_DATE_FORMATS =
            new ThreadLocal<List<SimpleDateFormat>>() {
                @Override
                protected synchronized List<SimpleDateFormat> initialValue() {
                    return createRfc3339DateFormats();
                }
            };

    static {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TIMEZONE_GMT);
        calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        AMBIGUOUS_YEAR_TWO_DIGIT_YEAR_START = calendar.getTime();
    }

    private static List<SimpleDateFormat> createRfc2616DateFormats() {
        List<SimpleDateFormat> dateFormats = new ArrayList<>();

        // rfc 1123
        dateFormats.add(new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US));
        // rfc 1036 - Note, the 2 digit year is interpreted as being in the
        // century 2000-2100
        SimpleDateFormat rfc1036Format =
                new SimpleDateFormat("EEE, dd-MMM-yy HH:mm:ss zzz", Locale.US);
        rfc1036Format.set2DigitYearStart(AMBIGUOUS_YEAR_TWO_DIGIT_YEAR_START);
        dateFormats.add(rfc1036Format);
        // ANSI C
        dateFormats.add(new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US));

        init(dateFormats);
        return dateFormats;
    }

    private static List<SimpleDateFormat> createRfc3339DateFormats() {
        List<SimpleDateFormat> dateFormats = new ArrayList<>();

        // 'date-time' format
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX"));
        // 'date-time' with millis format
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
        // 'full-date' format
        dateFormats.add(new SimpleDateFormat("yyyy-MM-dd"));

        init(dateFormats);
        return dateFormats;
    }

    private static void init(List<SimpleDateFormat> formats) {
        for (SimpleDateFormat format : formats) {
            format.setTimeZone(TIMEZONE_GMT);
        }
    }

    /**
     * Attempts to parse the given header into a Date instance.
     *
     * @param headerName
     *            The header name.
     * @param value
     *            The header value.
     * @return A new Date instance, or null if it could not be parsed.
     */
    static Date parse(String headerName, String value) {
        // date and last-modified use 'HTTP-date' format, rfc2616:
        // https://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html
        String lowerCasedHeaderName = headerName.toLowerCase();
        if ("date".equals(lowerCasedHeaderName) || "last-modified".equals(lowerCasedHeaderName)) {
            Date date = tryParse(value, RFC2616_DATE_FORMATS.get());
            if (date == null) {
                LOG.warn("Could not create Date instance from rfc2616 format: " + value);
            }
            return date;
        }

        // swagger spec says datetime and date types should follow rfc3339:
        // http://swagger.io/specification/
        // https://tools.ietf.org/html/rfc3339#section-5.6
        Date date = tryParse(value, RFC3339_DATE_FORMATS.get());
        if (date == null) {
            LOG.warn("Could not create Date instance from rfc3339 format: " + value);
        }
        return date;
    }

    /**
     * Format the given date into Swagger date-time format.
     *
     * @param date
     *            The date to format.
     * @return The formatted date.
     */
    public static String format(Date date) {
        final SimpleDateFormat format =
                (date.getTime() % 1000 == 0)
                        ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
                        : new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        return format.format(date);
    }

    private static Date tryParse(String date, List<SimpleDateFormat> formats) {
        for (final SimpleDateFormat format : formats) {
            try {
                Date result = format.parse(date);
                // parse can modify TZ, reset it
                format.setTimeZone(TIMEZONE_GMT);
                return result;
            } catch (final ParseException e) {
                // ignore
            }
        }
        return null;
    }
}
