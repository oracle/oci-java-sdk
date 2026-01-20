/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class ParamEncoderTest {
    @Test
    public void encodeDecodeQuery() throws UnsupportedEncodingException {
        for (char c = 0; c < 0x200; c++) {
            String s = String.valueOf(c);
            Assert.assertEquals(s, URLDecoder.decode(ParamEncoder.encodeQueryParam(s), "UTF-8"));
        }
    }

    @Test
    public void encodeDecodePath() throws UnsupportedEncodingException {
        for (char c = 0; c < 0x200; c++) {
            if (c == '+') {
                continue;
            }
            String s = String.valueOf(c);
            Assert.assertEquals(s, URLDecoder.decode(ParamEncoder.encodePathParam(s), "UTF-8"));
        }
    }

    private static final String JERSEY_COMPATIBILITY_JERSEY_RESULT =
            "?foo=%00&?foo=%01&?foo=%02&?foo=%03&?foo=%04&?foo=%05&?foo=%06&?foo=%07&?foo=%08&?foo=%09&?foo=%0A&?foo=%0B&?foo=%0C&?foo=%0D&?foo=%0E&?foo=%0F&?foo=%10&?foo=%11&?foo=%12&?foo=%13&?foo=%14&?foo=%15&?foo=%16&?foo=%17&?foo=%18&?foo=%19&?foo=%1A&?foo=%1B&?foo=%1C&?foo=%1D&?foo=%1E&?foo=%1F&?foo=%21&?foo=%22&?foo=%23&?foo=%24&?foo=%25&?foo=%26&?foo=%27&?foo=%28&?foo=%29&?foo=%2A&?foo=%2B&?foo=%2C&?foo=-&?foo=.&?foo=%2F&?foo=0&?foo=1&?foo=2&?foo=3&?foo=4&?foo=5&?foo=6&?foo=7&?foo=8&?foo=9&?foo=%3A&?foo=%3B&?foo=%3C&?foo=%3D&?foo=%3E&?foo=%3F&?foo=%40&?foo=A&?foo=B&?foo=C&?foo=D&?foo=E&?foo=F&?foo=G&?foo=H&?foo=I&?foo=J&?foo=K&?foo=L&?foo=M&?foo=N&?foo=O&?foo=P&?foo=Q&?foo=R&?foo=S&?foo=T&?foo=U&?foo=V&?foo=W&?foo=X&?foo=Y&?foo=Z&?foo=%5B&?foo=%5C&?foo=%5D&?foo=%5E&?foo=_&?foo=%60&?foo=a&?foo=b&?foo=c&?foo=d&?foo=e&?foo=f&?foo=g&?foo=h&?foo=i&?foo=j&?foo=k&?foo=l&?foo=m&?foo=n&?foo=o&?foo=p&?foo=q&?foo=r&?foo=s&?foo=t&?foo=u&?foo=v&?foo=w&?foo=x&?foo=y&?foo=z&?foo=%7C&?foo=%7F&?foo=%C2%80&?foo=%C2%81&?foo=%C2%82&?foo=%C2%83&?foo=%C2%84&?foo=%C2%85&?foo=%C2%86&?foo=%C2%87&?foo=%C2%88&?foo=%C2%89&?foo=%C2%8A&?foo=%C2%8B&?foo=%C2%8C&?foo=%C2%8D&?foo=%C2%8E&?foo=%C2%8F&?foo=%C2%90&?foo=%C2%91&?foo=%C2%92&?foo=%C2%93&?foo=%C2%94&?foo=%C2%95&?foo=%C2%96&?foo=%C2%97&?foo=%C2%98&?foo=%C2%99&?foo=%C2%9A&?foo=%C2%9B&?foo=%C2%9C&?foo=%C2%9D&?foo=%C2%9E&?foo=%C2%9F&?foo=%C2%A0&?foo=%C2%A1&?foo=%C2%A2&?foo=%C2%A3&?foo=%C2%A4&?foo=%C2%A5&?foo=%C2%A6&?foo=%C2%A7&?foo=%C2%A8&?foo=%C2%A9&?foo=%C2%AA&?foo=%C2%AB&?foo=%C2%AC&?foo=%C2%AD&?foo=%C2%AE&?foo=%C2%AF&?foo=%C2%B0&?foo=%C2%B1&?foo=%C2%B2&?foo=%C2%B3&?foo=%C2%B4&?foo=%C2%B5&?foo=%C2%B6&?foo=%C2%B7&?foo=%C2%B8&?foo=%C2%B9&?foo=%C2%BA&?foo=%C2%BB&?foo=%C2%BC&?foo=%C2%BD&?foo=%C2%BE&?foo=%C2%BF&?foo=%C3%80&?foo=%C3%81&?foo=%C3%82&?foo=%C3%83&?foo=%C3%84&?foo=%C3%85&?foo=%C3%86&?foo=%C3%87&?foo=%C3%88&?foo=%C3%89&?foo=%C3%8A&?foo=%C3%8B&?foo=%C3%8C&?foo=%C3%8D&?foo=%C3%8E&?foo=%C3%8F&?foo=%C3%90&?foo=%C3%91&?foo=%C3%92&?foo=%C3%93&?foo=%C3%94&?foo=%C3%95&?foo=%C3%96&?foo=%C3%97&?foo=%C3%98&?foo=%C3%99&?foo=%C3%9A&?foo=%C3%9B&?foo=%C3%9C&?foo=%C3%9D&?foo=%C3%9E&?foo=%C3%9F&?foo=%C3%A0&?foo=%C3%A1&?foo=%C3%A2&?foo=%C3%A3&?foo=%C3%A4&?foo=%C3%A5&?foo=%C3%A6&?foo=%C3%A7&?foo=%C3%A8&?foo=%C3%A9&?foo=%C3%AA&?foo=%C3%AB&?foo=%C3%AC&?foo=%C3%AD&?foo=%C3%AE&?foo=%C3%AF&?foo=%C3%B0&?foo=%C3%B1&?foo=%C3%B2&?foo=%C3%B3&?foo=%C3%B4&?foo=%C3%B5&?foo=%C3%B6&?foo=%C3%B7&?foo=%C3%B8&?foo=%C3%B9&?foo=%C3%BA&?foo=%C3%BB&?foo=%C3%BC&?foo=%C3%BD&?foo=%C3%BE&?foo=%C3%BF&?foo=%C4%80&?foo=%C4%81&?foo=%C4%82&?foo=%C4%83&?foo=%C4%84&?foo=%C4%85&?foo=%C4%86&?foo=%C4%87&?foo=%C4%88&?foo=%C4%89&?foo=%C4%8A&?foo=%C4%8B&?foo=%C4%8C&?foo=%C4%8D&?foo=%C4%8E&?foo=%C4%8F&?foo=%C4%90&?foo=%C4%91&?foo=%C4%92&?foo=%C4%93&?foo=%C4%94&?foo=%C4%95&?foo=%C4%96&?foo=%C4%97&?foo=%C4%98&?foo=%C4%99&?foo=%C4%9A&?foo=%C4%9B&?foo=%C4%9C&?foo=%C4%9D&?foo=%C4%9E&?foo=%C4%9F&?foo=%C4%A0&?foo=%C4%A1&?foo=%C4%A2&?foo=%C4%A3&?foo=%C4%A4&?foo=%C4%A5&?foo=%C4%A6&?foo=%C4%A7&?foo=%C4%A8&?foo=%C4%A9&?foo=%C4%AA&?foo=%C4%AB&?foo=%C4%AC&?foo=%C4%AD&?foo=%C4%AE&?foo=%C4%AF&?foo=%C4%B0&?foo=%C4%B1&?foo=%C4%B2&?foo=%C4%B3&?foo=%C4%B4&?foo=%C4%B5&?foo=%C4%B6&?foo=%C4%B7&?foo=%C4%B8&?foo=%C4%B9&?foo=%C4%BA&?foo=%C4%BB&?foo=%C4%BC&?foo=%C4%BD&?foo=%C4%BE&?foo=%C4%BF&?foo=%C5%80&?foo=%C5%81&?foo=%C5%82&?foo=%C5%83&?foo=%C5%84&?foo=%C5%85&?foo=%C5%86&?foo=%C5%87&?foo=%C5%88&?foo=%C5%89&?foo=%C5%8A&?foo=%C5%8B&?foo=%C5%8C&?foo=%C5%8D&?foo=%C5%8E&?foo=%C5%8F&?foo=%C5%90&?foo=%C5%91&?foo=%C5%92&?foo=%C5%93&?foo=%C5%94&?foo=%C5%95&?foo=%C5%96&?foo=%C5%97&?foo=%C5%98&?foo=%C5%99&?foo=%C5%9A&?foo=%C5%9B&?foo=%C5%9C&?foo=%C5%9D&?foo=%C5%9E&?foo=%C5%9F&?foo=%C5%A0&?foo=%C5%A1&?foo=%C5%A2&?foo=%C5%A3&?foo=%C5%A4&?foo=%C5%A5&?foo=%C5%A6&?foo=%C5%A7&?foo=%C5%A8&?foo=%C5%A9&?foo=%C5%AA&?foo=%C5%AB&?foo=%C5%AC&?foo=%C5%AD&?foo=%C5%AE&?foo=%C5%AF&?foo=%C5%B0&?foo=%C5%B1&?foo=%C5%B2&?foo=%C5%B3&?foo=%C5%B4&?foo=%C5%B5&?foo=%C5%B6&?foo=%C5%B7&?foo=%C5%B8&?foo=%C5%B9&?foo=%C5%BA&?foo=%C5%BB&?foo=%C5%BC&?foo=%C5%BD&?foo=%C5%BE&?foo=%C5%BF&?foo=%C6%80&?foo=%C6%81&?foo=%C6%82&?foo=%C6%83&?foo=%C6%84&?foo=%C6%85&?foo=%C6%86&?foo=%C6%87&?foo=%C6%88&?foo=%C6%89&?foo=%C6%8A&?foo=%C6%8B&?foo=%C6%8C&?foo=%C6%8D&?foo=%C6%8E&?foo=%C6%8F&?foo=%C6%90&?foo=%C6%91&?foo=%C6%92&?foo=%C6%93&?foo=%C6%94&?foo=%C6%95&?foo=%C6%96&?foo=%C6%97&?foo=%C6%98&?foo=%C6%99&?foo=%C6%9A&?foo=%C6%9B&?foo=%C6%9C&?foo=%C6%9D&?foo=%C6%9E&?foo=%C6%9F&?foo=%C6%A0&?foo=%C6%A1&?foo=%C6%A2&?foo=%C6%A3&?foo=%C6%A4&?foo=%C6%A5&?foo=%C6%A6&?foo=%C6%A7&?foo=%C6%A8&?foo=%C6%A9&?foo=%C6%AA&?foo=%C6%AB&?foo=%C6%AC&?foo=%C6%AD&?foo=%C6%AE&?foo=%C6%AF&?foo=%C6%B0&?foo=%C6%B1&?foo=%C6%B2&?foo=%C6%B3&?foo=%C6%B4&?foo=%C6%B5&?foo=%C6%B6&?foo=%C6%B7&?foo=%C6%B8&?foo=%C6%B9&?foo=%C6%BA&?foo=%C6%BB&?foo=%C6%BC&?foo=%C6%BD&?foo=%C6%BE&?foo=%C6%BF&?foo=%C7%80&?foo=%C7%81&?foo=%C7%82&?foo=%C7%83&?foo=%C7%84&?foo=%C7%85&?foo=%C7%86&?foo=%C7%87&?foo=%C7%88&?foo=%C7%89&?foo=%C7%8A&?foo=%C7%8B&?foo=%C7%8C&?foo=%C7%8D&?foo=%C7%8E&?foo=%C7%8F&?foo=%C7%90&?foo=%C7%91&?foo=%C7%92&?foo=%C7%93&?foo=%C7%94&?foo=%C7%95&?foo=%C7%96&?foo=%C7%97&?foo=%C7%98&?foo=%C7%99&?foo=%C7%9A&?foo=%C7%9B&?foo=%C7%9C&?foo=%C7%9D&?foo=%C7%9E&?foo=%C7%9F&?foo=%C7%A0&?foo=%C7%A1&?foo=%C7%A2&?foo=%C7%A3&?foo=%C7%A4&?foo=%C7%A5&?foo=%C7%A6&?foo=%C7%A7&?foo=%C7%A8&?foo=%C7%A9&?foo=%C7%AA&?foo=%C7%AB&?foo=%C7%AC&?foo=%C7%AD&?foo=%C7%AE&?foo=%C7%AF&?foo=%C7%B0&?foo=%C7%B1&?foo=%C7%B2&?foo=%C7%B3&?foo=%C7%B4&?foo=%C7%B5&?foo=%C7%B6&?foo=%C7%B7&?foo=%C7%B8&?foo=%C7%B9&?foo=%C7%BA&?foo=%C7%BB&?foo=%C7%BC&?foo=%C7%BD&?foo=%C7%BE&?foo=%C7%BF";

    @Test
    public void jerseyCompatibility() {
        StringBuilder sb = new StringBuilder();
        for (char c = 0; c < 0x200; c++) {
            if (c == ' ') {
                // space is encoded by us as %20 instead of +
                continue;
            }
            if (c == '{' || c == '}') {
                // jersey template
                continue;
            }
            if (c == '~') {
                // jersey does not encode tilde even though the spec requires it
                continue;
            }

            String s = String.valueOf(c);
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append("?foo=").append(ParamEncoder.encodeQueryParam(s));
        }
        Assert.assertEquals(JERSEY_COMPATIBILITY_JERSEY_RESULT, sb.toString());
    }

    private static final String JERSEY_DOUBLE_ENCODE_JERSEY_RESULT =
            "?foo=%00&?foo=%01&?foo=%02&?foo=%03&?foo=%04&?foo=%05&?foo=%06&?foo=%07&?foo=%08&?foo=%09&?foo=%0A&?foo=%0B&?foo=%0C&?foo=%0D&?foo=%0E&?foo=%0F&?foo=%10&?foo=%11&?foo=%12&?foo=%13&?foo=%14&?foo=%15&?foo=%16&?foo=%17&?foo=%18&?foo=%19&?foo=%1A&?foo=%1B&?foo=%1C&?foo=%1D&?foo=%1E&?foo=%1F&?foo=%20&?foo=%21&?foo=%22&?foo=%23&?foo=%24&?foo=%25&?foo=%26&?foo=%27&?foo=%28&?foo=%29&?foo=%2A&?foo=%2B&?foo=%2C&?foo=-&?foo=.&?foo=%2F&?foo=0&?foo=1&?foo=2&?foo=3&?foo=4&?foo=5&?foo=6&?foo=7&?foo=8&?foo=9&?foo=%3A&?foo=%3B&?foo=%3C&?foo=%3D&?foo=%3E&?foo=%3F&?foo=%40&?foo=A&?foo=B&?foo=C&?foo=D&?foo=E&?foo=F&?foo=G&?foo=H&?foo=I&?foo=J&?foo=K&?foo=L&?foo=M&?foo=N&?foo=O&?foo=P&?foo=Q&?foo=R&?foo=S&?foo=T&?foo=U&?foo=V&?foo=W&?foo=X&?foo=Y&?foo=Z&?foo=%5B&?foo=%5C&?foo=%5D&?foo=%5E&?foo=_&?foo=%60&?foo=a&?foo=b&?foo=c&?foo=d&?foo=e&?foo=f&?foo=g&?foo=h&?foo=i&?foo=j&?foo=k&?foo=l&?foo=m&?foo=n&?foo=o&?foo=p&?foo=q&?foo=r&?foo=s&?foo=t&?foo=u&?foo=v&?foo=w&?foo=x&?foo=y&?foo=z&?foo=%7B&?foo=%7C&?foo=%7D&?foo=%7E&?foo=%7F&?foo=%C2%80&?foo=%C2%81&?foo=%C2%82&?foo=%C2%83&?foo=%C2%84&?foo=%C2%85&?foo=%C2%86&?foo=%C2%87&?foo=%C2%88&?foo=%C2%89&?foo=%C2%8A&?foo=%C2%8B&?foo=%C2%8C&?foo=%C2%8D&?foo=%C2%8E&?foo=%C2%8F&?foo=%C2%90&?foo=%C2%91&?foo=%C2%92&?foo=%C2%93&?foo=%C2%94&?foo=%C2%95&?foo=%C2%96&?foo=%C2%97&?foo=%C2%98&?foo=%C2%99&?foo=%C2%9A&?foo=%C2%9B&?foo=%C2%9C&?foo=%C2%9D&?foo=%C2%9E&?foo=%C2%9F&?foo=%C2%A0&?foo=%C2%A1&?foo=%C2%A2&?foo=%C2%A3&?foo=%C2%A4&?foo=%C2%A5&?foo=%C2%A6&?foo=%C2%A7&?foo=%C2%A8&?foo=%C2%A9&?foo=%C2%AA&?foo=%C2%AB&?foo=%C2%AC&?foo=%C2%AD&?foo=%C2%AE&?foo=%C2%AF&?foo=%C2%B0&?foo=%C2%B1&?foo=%C2%B2&?foo=%C2%B3&?foo=%C2%B4&?foo=%C2%B5&?foo=%C2%B6&?foo=%C2%B7&?foo=%C2%B8&?foo=%C2%B9&?foo=%C2%BA&?foo=%C2%BB&?foo=%C2%BC&?foo=%C2%BD&?foo=%C2%BE&?foo=%C2%BF&?foo=%C3%80&?foo=%C3%81&?foo=%C3%82&?foo=%C3%83&?foo=%C3%84&?foo=%C3%85&?foo=%C3%86&?foo=%C3%87&?foo=%C3%88&?foo=%C3%89&?foo=%C3%8A&?foo=%C3%8B&?foo=%C3%8C&?foo=%C3%8D&?foo=%C3%8E&?foo=%C3%8F&?foo=%C3%90&?foo=%C3%91&?foo=%C3%92&?foo=%C3%93&?foo=%C3%94&?foo=%C3%95&?foo=%C3%96&?foo=%C3%97&?foo=%C3%98&?foo=%C3%99&?foo=%C3%9A&?foo=%C3%9B&?foo=%C3%9C&?foo=%C3%9D&?foo=%C3%9E&?foo=%C3%9F&?foo=%C3%A0&?foo=%C3%A1&?foo=%C3%A2&?foo=%C3%A3&?foo=%C3%A4&?foo=%C3%A5&?foo=%C3%A6&?foo=%C3%A7&?foo=%C3%A8&?foo=%C3%A9&?foo=%C3%AA&?foo=%C3%AB&?foo=%C3%AC&?foo=%C3%AD&?foo=%C3%AE&?foo=%C3%AF&?foo=%C3%B0&?foo=%C3%B1&?foo=%C3%B2&?foo=%C3%B3&?foo=%C3%B4&?foo=%C3%B5&?foo=%C3%B6&?foo=%C3%B7&?foo=%C3%B8&?foo=%C3%B9&?foo=%C3%BA&?foo=%C3%BB&?foo=%C3%BC&?foo=%C3%BD&?foo=%C3%BE&?foo=%C3%BF&?foo=%C4%80&?foo=%C4%81&?foo=%C4%82&?foo=%C4%83&?foo=%C4%84&?foo=%C4%85&?foo=%C4%86&?foo=%C4%87&?foo=%C4%88&?foo=%C4%89&?foo=%C4%8A&?foo=%C4%8B&?foo=%C4%8C&?foo=%C4%8D&?foo=%C4%8E&?foo=%C4%8F&?foo=%C4%90&?foo=%C4%91&?foo=%C4%92&?foo=%C4%93&?foo=%C4%94&?foo=%C4%95&?foo=%C4%96&?foo=%C4%97&?foo=%C4%98&?foo=%C4%99&?foo=%C4%9A&?foo=%C4%9B&?foo=%C4%9C&?foo=%C4%9D&?foo=%C4%9E&?foo=%C4%9F&?foo=%C4%A0&?foo=%C4%A1&?foo=%C4%A2&?foo=%C4%A3&?foo=%C4%A4&?foo=%C4%A5&?foo=%C4%A6&?foo=%C4%A7&?foo=%C4%A8&?foo=%C4%A9&?foo=%C4%AA&?foo=%C4%AB&?foo=%C4%AC&?foo=%C4%AD&?foo=%C4%AE&?foo=%C4%AF&?foo=%C4%B0&?foo=%C4%B1&?foo=%C4%B2&?foo=%C4%B3&?foo=%C4%B4&?foo=%C4%B5&?foo=%C4%B6&?foo=%C4%B7&?foo=%C4%B8&?foo=%C4%B9&?foo=%C4%BA&?foo=%C4%BB&?foo=%C4%BC&?foo=%C4%BD&?foo=%C4%BE&?foo=%C4%BF&?foo=%C5%80&?foo=%C5%81&?foo=%C5%82&?foo=%C5%83&?foo=%C5%84&?foo=%C5%85&?foo=%C5%86&?foo=%C5%87&?foo=%C5%88&?foo=%C5%89&?foo=%C5%8A&?foo=%C5%8B&?foo=%C5%8C&?foo=%C5%8D&?foo=%C5%8E&?foo=%C5%8F&?foo=%C5%90&?foo=%C5%91&?foo=%C5%92&?foo=%C5%93&?foo=%C5%94&?foo=%C5%95&?foo=%C5%96&?foo=%C5%97&?foo=%C5%98&?foo=%C5%99&?foo=%C5%9A&?foo=%C5%9B&?foo=%C5%9C&?foo=%C5%9D&?foo=%C5%9E&?foo=%C5%9F&?foo=%C5%A0&?foo=%C5%A1&?foo=%C5%A2&?foo=%C5%A3&?foo=%C5%A4&?foo=%C5%A5&?foo=%C5%A6&?foo=%C5%A7&?foo=%C5%A8&?foo=%C5%A9&?foo=%C5%AA&?foo=%C5%AB&?foo=%C5%AC&?foo=%C5%AD&?foo=%C5%AE&?foo=%C5%AF&?foo=%C5%B0&?foo=%C5%B1&?foo=%C5%B2&?foo=%C5%B3&?foo=%C5%B4&?foo=%C5%B5&?foo=%C5%B6&?foo=%C5%B7&?foo=%C5%B8&?foo=%C5%B9&?foo=%C5%BA&?foo=%C5%BB&?foo=%C5%BC&?foo=%C5%BD&?foo=%C5%BE&?foo=%C5%BF&?foo=%C6%80&?foo=%C6%81&?foo=%C6%82&?foo=%C6%83&?foo=%C6%84&?foo=%C6%85&?foo=%C6%86&?foo=%C6%87&?foo=%C6%88&?foo=%C6%89&?foo=%C6%8A&?foo=%C6%8B&?foo=%C6%8C&?foo=%C6%8D&?foo=%C6%8E&?foo=%C6%8F&?foo=%C6%90&?foo=%C6%91&?foo=%C6%92&?foo=%C6%93&?foo=%C6%94&?foo=%C6%95&?foo=%C6%96&?foo=%C6%97&?foo=%C6%98&?foo=%C6%99&?foo=%C6%9A&?foo=%C6%9B&?foo=%C6%9C&?foo=%C6%9D&?foo=%C6%9E&?foo=%C6%9F&?foo=%C6%A0&?foo=%C6%A1&?foo=%C6%A2&?foo=%C6%A3&?foo=%C6%A4&?foo=%C6%A5&?foo=%C6%A6&?foo=%C6%A7&?foo=%C6%A8&?foo=%C6%A9&?foo=%C6%AA&?foo=%C6%AB&?foo=%C6%AC&?foo=%C6%AD&?foo=%C6%AE&?foo=%C6%AF&?foo=%C6%B0&?foo=%C6%B1&?foo=%C6%B2&?foo=%C6%B3&?foo=%C6%B4&?foo=%C6%B5&?foo=%C6%B6&?foo=%C6%B7&?foo=%C6%B8&?foo=%C6%B9&?foo=%C6%BA&?foo=%C6%BB&?foo=%C6%BC&?foo=%C6%BD&?foo=%C6%BE&?foo=%C6%BF&?foo=%C7%80&?foo=%C7%81&?foo=%C7%82&?foo=%C7%83&?foo=%C7%84&?foo=%C7%85&?foo=%C7%86&?foo=%C7%87&?foo=%C7%88&?foo=%C7%89&?foo=%C7%8A&?foo=%C7%8B&?foo=%C7%8C&?foo=%C7%8D&?foo=%C7%8E&?foo=%C7%8F&?foo=%C7%90&?foo=%C7%91&?foo=%C7%92&?foo=%C7%93&?foo=%C7%94&?foo=%C7%95&?foo=%C7%96&?foo=%C7%97&?foo=%C7%98&?foo=%C7%99&?foo=%C7%9A&?foo=%C7%9B&?foo=%C7%9C&?foo=%C7%9D&?foo=%C7%9E&?foo=%C7%9F&?foo=%C7%A0&?foo=%C7%A1&?foo=%C7%A2&?foo=%C7%A3&?foo=%C7%A4&?foo=%C7%A5&?foo=%C7%A6&?foo=%C7%A7&?foo=%C7%A8&?foo=%C7%A9&?foo=%C7%AA&?foo=%C7%AB&?foo=%C7%AC&?foo=%C7%AD&?foo=%C7%AE&?foo=%C7%AF&?foo=%C7%B0&?foo=%C7%B1&?foo=%C7%B2&?foo=%C7%B3&?foo=%C7%B4&?foo=%C7%B5&?foo=%C7%B6&?foo=%C7%B7&?foo=%C7%B8&?foo=%C7%B9&?foo=%C7%BA&?foo=%C7%BB&?foo=%C7%BC&?foo=%C7%BD&?foo=%C7%BE&?foo=%C7%BF";

    @Test
    public void jerseyDoubleEncode() throws UnsupportedEncodingException {
        // check that jerseyContextualEncode(ourEncode(x)) == ourEncode(x)
        StringBuilder sb = new StringBuilder();
        for (char c = 0; c < 0x200; c++) {
            String s = String.valueOf(c);
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append("?foo=").append(ParamEncoder.encodeQueryParam(s));
        }
        Assert.assertEquals(JERSEY_DOUBLE_ENCODE_JERSEY_RESULT, sb.toString());
    }

    private static final String VERSION2_COMPATIBILITY_PATH_EXPECTED =
            "%00%01%02%03%04%05%06%07%08%09%0A%0B%0C%0D%0E%0F%10%11%12%13%14%15%16%17%18%19%1A%1B%1C%1D%1E%1F%20!%22%23$%25&'()*+,-.%2F0123456789:;%3C=%3E%3F@ABCDEFGHIJKLMNOPQRSTUVWXYZ_%60abcdefghijklmnopqrstuvwxyz%7B%7D~%7F%C2%80%C2%81%C2%82%C2%83%C2%84%C2%85%C2%86%C2%87%C2%88%C2%89%C2%8A%C2%8B%C2%8C%C2%8D%C2%8E%C2%8F%C2%90%C2%91%C2%92%C2%93%C2%94%C2%95%C2%96%C2%97%C2%98%C2%99%C2%9A%C2%9B%C2%9C%C2%9D%C2%9E%C2%9F%C2%A0%C2%A1%C2%A2%C2%A3%C2%A4%C2%A5%C2%A6%C2%A7%C2%A8%C2%A9%C2%AA%C2%AB%C2%AC%C2%AD%C2%AE%C2%AF%C2%B0%C2%B1%C2%B2%C2%B3%C2%B4%C2%B5%C2%B6%C2%B7%C2%B8%C2%B9%C2%BA%C2%BB%C2%BC%C2%BD%C2%BE%C2%BF%C3%80%C3%81%C3%82%C3%83%C3%84%C3%85%C3%86%C3%87%C3%88%C3%89%C3%8A%C3%8B%C3%8C%C3%8D%C3%8E%C3%8F%C3%90%C3%91%C3%92%C3%93%C3%94%C3%95%C3%96%C3%97%C3%98%C3%99%C3%9A%C3%9B%C3%9C%C3%9D%C3%9E%C3%9F%C3%A0%C3%A1%C3%A2%C3%A3%C3%A4%C3%A5%C3%A6%C3%A7%C3%A8%C3%A9%C3%AA%C3%AB%C3%AC%C3%AD%C3%AE%C3%AF%C3%B0%C3%B1%C3%B2%C3%B3%C3%B4%C3%B5%C3%B6%C3%B7%C3%B8%C3%B9%C3%BA%C3%BB%C3%BC%C3%BD%C3%BE%C3%BF%C4%80%C4%81%C4%82%C4%83%C4%84%C4%85%C4%86%C4%87%C4%88%C4%89%C4%8A%C4%8B%C4%8C%C4%8D%C4%8E%C4%8F%C4%90%C4%91%C4%92%C4%93%C4%94%C4%95%C4%96%C4%97%C4%98%C4%99%C4%9A%C4%9B%C4%9C%C4%9D%C4%9E%C4%9F%C4%A0%C4%A1%C4%A2%C4%A3%C4%A4%C4%A5%C4%A6%C4%A7%C4%A8%C4%A9%C4%AA%C4%AB%C4%AC%C4%AD%C4%AE%C4%AF%C4%B0%C4%B1%C4%B2%C4%B3%C4%B4%C4%B5%C4%B6%C4%B7%C4%B8%C4%B9%C4%BA%C4%BB%C4%BC%C4%BD%C4%BE%C4%BF%C5%80%C5%81%C5%82%C5%83%C5%84%C5%85%C5%86%C5%87%C5%88%C5%89%C5%8A%C5%8B%C5%8C%C5%8D%C5%8E%C5%8F%C5%90%C5%91%C5%92%C5%93%C5%94%C5%95%C5%96%C5%97%C5%98%C5%99%C5%9A%C5%9B%C5%9C%C5%9D%C5%9E%C5%9F%C5%A0%C5%A1%C5%A2%C5%A3%C5%A4%C5%A5%C5%A6%C5%A7%C5%A8%C5%A9%C5%AA%C5%AB%C5%AC%C5%AD%C5%AE%C5%AF%C5%B0%C5%B1%C5%B2%C5%B3%C5%B4%C5%B5%C5%B6%C5%B7%C5%B8%C5%B9%C5%BA%C5%BB%C5%BC%C5%BD%C5%BE%C5%BF%C6%80%C6%81%C6%82%C6%83%C6%84%C6%85%C6%86%C6%87%C6%88%C6%89%C6%8A%C6%8B%C6%8C%C6%8D%C6%8E%C6%8F%C6%90%C6%91%C6%92%C6%93%C6%94%C6%95%C6%96%C6%97%C6%98%C6%99%C6%9A%C6%9B%C6%9C%C6%9D%C6%9E%C6%9F%C6%A0%C6%A1%C6%A2%C6%A3%C6%A4%C6%A5%C6%A6%C6%A7%C6%A8%C6%A9%C6%AA%C6%AB%C6%AC%C6%AD%C6%AE%C6%AF%C6%B0%C6%B1%C6%B2%C6%B3%C6%B4%C6%B5%C6%B6%C6%B7%C6%B8%C6%B9%C6%BA%C6%BB%C6%BC%C6%BD%C6%BE%C6%BF%C7%80%C7%81%C7%82%C7%83%C7%84%C7%85%C7%86%C7%87%C7%88%C7%89%C7%8A%C7%8B%C7%8C%C7%8D%C7%8E%C7%8F%C7%90%C7%91%C7%92%C7%93%C7%94%C7%95%C7%96%C7%97%C7%98%C7%99%C7%9A%C7%9B%C7%9C%C7%9D%C7%9E%C7%9F%C7%A0%C7%A1%C7%A2%C7%A3%C7%A4%C7%A5%C7%A6%C7%A7%C7%A8%C7%A9%C7%AA%C7%AB%C7%AC%C7%AD%C7%AE%C7%AF%C7%B0%C7%B1%C7%B2%C7%B3%C7%B4%C7%B5%C7%B6%C7%B7%C7%B8%C7%B9%C7%BA%C7%BB%C7%BC%C7%BD%C7%BE%C7%BF";

    @Test
    public void version2CompatibilityPath() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        for (char c = 0; c < 0x200; c++) {
            // for some reason, the escaper used in version 2 escapes these, even though they're
            // allowed in a path.
            if ("[]\\^|".indexOf(c) != -1) {
                continue;
            }

            String s = String.valueOf(c);
            sb.append(ParamEncoder.encodePathParam(s));
        }
        Assert.assertEquals(VERSION2_COMPATIBILITY_PATH_EXPECTED, sb.toString());
    }
}
