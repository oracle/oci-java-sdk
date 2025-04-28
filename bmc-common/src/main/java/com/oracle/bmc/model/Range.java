/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model;

import com.oracle.bmc.util.internal.StringUtils;

/**
 * Class specifying a range-request is being made. Request mostly follows
 * https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35, except only one range is
 * allowed. For the purposes of the SDK, three types of requests are supported:
 *
 * <ol>
 *   <li>Exact range (0-100): All bytes in the given range
 *   <li>Starts-at (100-): All bytes >= the start byte
 *   <li>Last (-100): The last X bytes
 * </ol>
 *
 * <p>Also used to represent the range returned by the server (including the full content length, if
 * known).
 */
public class Range {
    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Range.class);
    private static final String HEADER_VALUE_FORMAT = "bytes=%s-%s";
    private static final String START_ONLY_HEADER_VALUE_FORMAT = "bytes=%s-";
    private static final String END_ONLY_HEADER_VALUE_FORMAT = "bytes=-%s";
    /** The start byte, if given. */
    private final Long startByte;

    /** The end byte, if given. */
    private final Long endByte;

    /** The content length as returned by the server, or null if unknown. */
    private Long contentLength = null;

    // toString is used for header serialization by Jersey
    // TODO: register a provider that can serialize this class with Jersey
    @Override
    public String toString() {
        if (startByte != null && endByte != null) {
            return String.format(HEADER_VALUE_FORMAT, startByte, endByte);
        }
        if (startByte != null) {
            return String.format(START_ONLY_HEADER_VALUE_FORMAT, startByte);
        }
        if (endByte != null) {
            return String.format(END_ONLY_HEADER_VALUE_FORMAT, endByte);
        }
        LOG.error("Must provide start/end byte for range request: " + this);
        return "";
    }

    /**
     * Parse the "content-range" header per https://tools.ietf.org/html/rfc7233#section-4.2.
     *
     * <p>Note, this is only for successful responses (206). It does not handle 416 (range not
     * satisfiable).
     *
     * @param value The response header value.
     * @return A new Range header.
     */
    public static Range parse(String value) {
        LOG.debug("Attempting to parse range: {}", value);
        value = value.replace("bytes", "").trim();
        String[] parts = value.split("/");
        if (parts.length != 2) {
            throw new IllegalArgumentException(
                    "Must provide <range>/<length> format for range request: " + value);
        }
        String byteRangePart = parts[0];
        String contentLengthPart = parts[1];
        Long contentLength =
                contentLengthPart.equals("*") ? null : Long.parseLong(contentLengthPart);
        String[] byteValues = byteRangePart.split("-", -1); // include trailing empty strings
        if (byteValues.length != 2) {
            throw new IllegalArgumentException(
                    "Must provide <start>-<end> format for range request: " + value);
        }
        Long startByte = StringUtils.isBlank(byteValues[0]) ? null : Long.parseLong(byteValues[0]);
        Long endByte = StringUtils.isBlank(byteValues[1]) ? null : Long.parseLong(byteValues[1]);
        if (startByte == null && endByte == null) {
            throw new IllegalArgumentException(
                    "Must provide start/end byte for range request: " + value);
        }
        Range range = new Range(startByte, endByte);
        range.contentLength = contentLength;
        return range;
    }

    @java.beans.ConstructorProperties({"startByte", "endByte"})
    public Range(final Long startByte, final Long endByte) {
        this.startByte = startByte;
        this.endByte = endByte;
    }

    /** The start byte, if given. */
    public Long getStartByte() {
        return this.startByte;
    }

    /** The end byte, if given. */
    public Long getEndByte() {
        return this.endByte;
    }

    /** The content length as returned by the server, or null if unknown. */
    public Long getContentLength() {
        return this.contentLength;
    }
}
