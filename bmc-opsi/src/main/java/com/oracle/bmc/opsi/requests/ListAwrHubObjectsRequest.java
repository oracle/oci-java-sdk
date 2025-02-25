/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAwrHubObjectsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAwrHubObjectsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListAwrHubObjectsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Awr Hub Source identifier
     */
    private String awrHubSourceId;

    /**
     * Unique Awr Hub Source identifier
     */
    public String getAwrHubSourceId() {
        return awrHubSourceId;
    }
    /**
     * The string to use for matching against the start of object names in a Awr Hub list objects query.
     */
    private String prefix;

    /**
     * The string to use for matching against the start of object names in a Awr Hub list objects query.
     */
    public String getPrefix() {
        return prefix;
    }
    /**
     * Object names returned by Awr Hub list objects query must be greater or equal to this parameter.
     */
    private String start;

    /**
     * Object names returned by Awr Hub list objects query must be greater or equal to this parameter.
     */
    public String getStart() {
        return start;
    }
    /**
     * Object names returned by Awr Hub list objects query must be strictly less than this parameter.
     */
    private String end;

    /**
     * Object names returned by Awr Hub list objects query must be strictly less than this parameter.
     */
    public String getEnd() {
        return end;
    }
    /**
     * When this parameter is set, only objects whose names do not contain the delimiter character
     * (after an optionally specified prefix) are returned in the Awr Hub list objects key of the response body.
     * Scanned objects whose names contain the delimiter have the part of their name up to the first
     * occurrence of the delimiter (including the optional prefix) returned as a set of prefixes.
     * Note that only '/' is a supported delimiter character at this time.
     *
     */
    private String delimiter;

    /**
     * When this parameter is set, only objects whose names do not contain the delimiter character
     * (after an optionally specified prefix) are returned in the Awr Hub list objects key of the response body.
     * Scanned objects whose names contain the delimiter have the part of their name up to the first
     * occurrence of the delimiter (including the optional prefix) returned as a set of prefixes.
     * Note that only '/' is a supported delimiter character at this time.
     *
     */
    public String getDelimiter() {
        return delimiter;
    }
    /**
     * Awr Hub Object name after which remaining objects are listed
     */
    private String startAfter;

    /**
     * Awr Hub Object name after which remaining objects are listed
     */
    public String getStartAfter() {
        return startAfter;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * By default all the fields are returned. Use this parameter to fetch specific fields 'size', 'etag', 'md5',
     * 'timeCreated', 'timeModified', 'storageTier' and 'archivalState' fields. List the names of those fields
     * in a comma-separated, case-insensitive list as the value of this parameter.
     * For example: 'name,etag,timeCreated,md5,timeModified,storageTier,archivalState'.
     *
     */
    private Fields fields;

    /**
     * By default all the fields are returned. Use this parameter to fetch specific fields 'size', 'etag', 'md5',
     * 'timeCreated', 'timeModified', 'storageTier' and 'archivalState' fields. List the names of those fields
     * in a comma-separated, case-insensitive list as the value of this parameter.
     * For example: 'name,etag,timeCreated,md5,timeModified,storageTier,archivalState'.
     *
     **/
    public enum Fields {
        Name("name"),
        Size("size"),
        Etag("etag"),
        TimeCreated("timeCreated"),
        Md5("md5"),
        ArchivalState("archivalState"),
        TimeModified("timeModified"),
        StorageTier("storageTier"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    /**
     * By default all the fields are returned. Use this parameter to fetch specific fields 'size', 'etag', 'md5',
     * 'timeCreated', 'timeModified', 'storageTier' and 'archivalState' fields. List the names of those fields
     * in a comma-separated, case-insensitive list as the value of this parameter.
     * For example: 'name,etag,timeCreated,md5,timeModified,storageTier,archivalState'.
     *
     */
    public Fields getFields() {
        return fields;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAwrHubObjectsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Awr Hub Source identifier
         */
        private String awrHubSourceId = null;

        /**
         * Unique Awr Hub Source identifier
         * @param awrHubSourceId the value to set
         * @return this builder instance
         */
        public Builder awrHubSourceId(String awrHubSourceId) {
            this.awrHubSourceId = awrHubSourceId;
            return this;
        }

        /**
         * The string to use for matching against the start of object names in a Awr Hub list objects query.
         */
        private String prefix = null;

        /**
         * The string to use for matching against the start of object names in a Awr Hub list objects query.
         * @param prefix the value to set
         * @return this builder instance
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Object names returned by Awr Hub list objects query must be greater or equal to this parameter.
         */
        private String start = null;

        /**
         * Object names returned by Awr Hub list objects query must be greater or equal to this parameter.
         * @param start the value to set
         * @return this builder instance
         */
        public Builder start(String start) {
            this.start = start;
            return this;
        }

        /**
         * Object names returned by Awr Hub list objects query must be strictly less than this parameter.
         */
        private String end = null;

        /**
         * Object names returned by Awr Hub list objects query must be strictly less than this parameter.
         * @param end the value to set
         * @return this builder instance
         */
        public Builder end(String end) {
            this.end = end;
            return this;
        }

        /**
         * When this parameter is set, only objects whose names do not contain the delimiter character
         * (after an optionally specified prefix) are returned in the Awr Hub list objects key of the response body.
         * Scanned objects whose names contain the delimiter have the part of their name up to the first
         * occurrence of the delimiter (including the optional prefix) returned as a set of prefixes.
         * Note that only '/' is a supported delimiter character at this time.
         *
         */
        private String delimiter = null;

        /**
         * When this parameter is set, only objects whose names do not contain the delimiter character
         * (after an optionally specified prefix) are returned in the Awr Hub list objects key of the response body.
         * Scanned objects whose names contain the delimiter have the part of their name up to the first
         * occurrence of the delimiter (including the optional prefix) returned as a set of prefixes.
         * Note that only '/' is a supported delimiter character at this time.
         *
         * @param delimiter the value to set
         * @return this builder instance
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        /**
         * Awr Hub Object name after which remaining objects are listed
         */
        private String startAfter = null;

        /**
         * Awr Hub Object name after which remaining objects are listed
         * @param startAfter the value to set
         * @return this builder instance
         */
        public Builder startAfter(String startAfter) {
            this.startAfter = startAfter;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * By default all the fields are returned. Use this parameter to fetch specific fields 'size', 'etag', 'md5',
         * 'timeCreated', 'timeModified', 'storageTier' and 'archivalState' fields. List the names of those fields
         * in a comma-separated, case-insensitive list as the value of this parameter.
         * For example: 'name,etag,timeCreated,md5,timeModified,storageTier,archivalState'.
         *
         */
        private Fields fields = null;

        /**
         * By default all the fields are returned. Use this parameter to fetch specific fields 'size', 'etag', 'md5',
         * 'timeCreated', 'timeModified', 'storageTier' and 'archivalState' fields. List the names of those fields
         * in a comma-separated, case-insensitive list as the value of this parameter.
         * For example: 'name,etag,timeCreated,md5,timeModified,storageTier,archivalState'.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(Fields fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListAwrHubObjectsRequest o) {
            awrHubSourceId(o.getAwrHubSourceId());
            prefix(o.getPrefix());
            start(o.getStart());
            end(o.getEnd());
            delimiter(o.getDelimiter());
            startAfter(o.getStartAfter());
            page(o.getPage());
            limit(o.getLimit());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAwrHubObjectsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAwrHubObjectsRequest
         */
        public ListAwrHubObjectsRequest build() {
            ListAwrHubObjectsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAwrHubObjectsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAwrHubObjectsRequest
         */
        public ListAwrHubObjectsRequest buildWithoutInvocationCallback() {
            ListAwrHubObjectsRequest request = new ListAwrHubObjectsRequest();
            request.awrHubSourceId = awrHubSourceId;
            request.prefix = prefix;
            request.start = start;
            request.end = end;
            request.delimiter = delimiter;
            request.startAfter = startAfter;
            request.page = page;
            request.limit = limit;
            request.fields = fields;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAwrHubObjectsRequest(awrHubSourceId, prefix, start, end, delimiter, startAfter, page, limit, fields, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .awrHubSourceId(awrHubSourceId)
                .prefix(prefix)
                .start(start)
                .end(end)
                .delimiter(delimiter)
                .startAfter(startAfter)
                .page(page)
                .limit(limit)
                .fields(fields)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",awrHubSourceId=").append(String.valueOf(this.awrHubSourceId));
        sb.append(",prefix=").append(String.valueOf(this.prefix));
        sb.append(",start=").append(String.valueOf(this.start));
        sb.append(",end=").append(String.valueOf(this.end));
        sb.append(",delimiter=").append(String.valueOf(this.delimiter));
        sb.append(",startAfter=").append(String.valueOf(this.startAfter));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAwrHubObjectsRequest)) {
            return false;
        }

        ListAwrHubObjectsRequest other = (ListAwrHubObjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.awrHubSourceId, other.awrHubSourceId)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.start, other.start)
                && java.util.Objects.equals(this.end, other.end)
                && java.util.Objects.equals(this.delimiter, other.delimiter)
                && java.util.Objects.equals(this.startAfter, other.startAfter)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.awrHubSourceId == null ? 43 : this.awrHubSourceId.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.start == null ? 43 : this.start.hashCode());
        result = (result * PRIME) + (this.end == null ? 43 : this.end.hashCode());
        result = (result * PRIME) + (this.delimiter == null ? 43 : this.delimiter.hashCode());
        result = (result * PRIME) + (this.startAfter == null ? 43 : this.startAfter.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
