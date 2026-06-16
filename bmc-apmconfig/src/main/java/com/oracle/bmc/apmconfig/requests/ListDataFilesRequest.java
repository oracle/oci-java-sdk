/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.requests;

import com.oracle.bmc.apmconfig.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmconfig/ListDataFilesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDataFilesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class ListDataFilesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The APM Domain ID the request is intended for. */
    private String apmDomainId;

    /** The APM Domain ID the request is intended for. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** The type of the data file. */
    private String apmType;

    /** The type of the data file. */
    public String getApmType() {
        return apmType;
    }
    /**
     * A filter to return resources that match the specified name. Supports regular expressions to
     * filter data files.
     */
    private String name;

    /**
     * A filter to return resources that match the specified name. Supports regular expressions to
     * filter data files.
     */
    public String getName() {
        return name;
    }
    /**
     * Return data files with time 'timeLastModified' before the specified time, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-19T22:47:12.613Z}
     */
    private java.util.Date timeLastModifiedBefore;

    /**
     * Return data files with time 'timeLastModified' before the specified time, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-19T22:47:12.613Z}
     */
    public java.util.Date getTimeLastModifiedBefore() {
        return timeLastModifiedBefore;
    }
    /**
     * Return data files with the 'timeLastModified' after the specified time, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-19T22:47:12.613Z}
     */
    private java.util.Date timeLastModifiedAfter;

    /**
     * Return data files with the 'timeLastModified' after the specified time, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-19T22:47:12.613Z}
     */
    public java.util.Date getTimeLastModifiedAfter() {
        return timeLastModifiedAfter;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The maximum number of results per page, or items to return in a paginated "List" call. For
     * information on how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    private String page;

    /**
     * The maximum number of results per page, or items to return in a paginated "List" call. For
     * information on how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
     * displayName sort order is case-sensitive.
     */
    private com.oracle.bmc.apmconfig.model.SortOrders sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
     * displayName sort order is case-sensitive.
     */
    public com.oracle.bmc.apmconfig.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide one "sortBy" value. The default order for displayName,
     * timeCreated and timeUpdated is ascending. The displayName sort by is case-sensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one "sortBy" value. The default order for displayName,
     * timeCreated and timeUpdated is ascending. The displayName sort by is case-sensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("displayName"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort by. You can provide one "sortBy" value. The default order for displayName,
     * timeCreated and timeUpdated is ascending. The displayName sort by is case-sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A string containing a JSON-encoded object with metadata related to the uploaded file or
     * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
     */
    private String metadata;

    /**
     * A string containing a JSON-encoded object with metadata related to the uploaded file or
     * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
     */
    public String getMetadata() {
        return metadata;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDataFilesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM Domain ID the request is intended for. */
        private String apmDomainId = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /** The type of the data file. */
        private String apmType = null;

        /**
         * The type of the data file.
         *
         * @param apmType the value to set
         * @return this builder instance
         */
        public Builder apmType(String apmType) {
            this.apmType = apmType;
            return this;
        }

        /**
         * A filter to return resources that match the specified name. Supports regular expressions
         * to filter data files.
         */
        private String name = null;

        /**
         * A filter to return resources that match the specified name. Supports regular expressions
         * to filter data files.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Return data files with time 'timeLastModified' before the specified time, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-19T22:47:12.613Z}
         */
        private java.util.Date timeLastModifiedBefore = null;

        /**
         * Return data files with time 'timeLastModified' before the specified time, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-19T22:47:12.613Z}
         *
         * @param timeLastModifiedBefore the value to set
         * @return this builder instance
         */
        public Builder timeLastModifiedBefore(java.util.Date timeLastModifiedBefore) {
            this.timeLastModifiedBefore = timeLastModifiedBefore;
            return this;
        }

        /**
         * Return data files with the 'timeLastModified' after the specified time, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-19T22:47:12.613Z}
         */
        private java.util.Date timeLastModifiedAfter = null;

        /**
         * Return data files with the 'timeLastModified' after the specified time, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-19T22:47:12.613Z}
         *
         * @param timeLastModifiedAfter the value to set
         * @return this builder instance
         */
        public Builder timeLastModifiedAfter(java.util.Date timeLastModifiedAfter) {
            this.timeLastModifiedAfter = timeLastModifiedAfter;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The maximum number of results per page, or items to return in a paginated "List" call.
         * For information on how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         */
        private String page = null;

        /**
         * The maximum number of results per page, or items to return in a paginated "List" call.
         * For information on how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
         * displayName sort order is case-sensitive.
         */
        private com.oracle.bmc.apmconfig.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
         * displayName sort order is case-sensitive.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.apmconfig.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide one "sortBy" value. The default order for
         * displayName, timeCreated and timeUpdated is ascending. The displayName sort by is
         * case-sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one "sortBy" value. The default order for
         * displayName, timeCreated and timeUpdated is ascending. The displayName sort by is
         * case-sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A string containing a JSON-encoded object with metadata related to the uploaded file or
         * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
         */
        private String metadata = null;

        /**
         * A string containing a JSON-encoded object with metadata related to the uploaded file or
         * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
         *
         * @param metadata the value to set
         * @return this builder instance
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(ListDataFilesRequest o) {
            apmDomainId(o.getApmDomainId());
            apmType(o.getApmType());
            name(o.getName());
            timeLastModifiedBefore(o.getTimeLastModifiedBefore());
            timeLastModifiedAfter(o.getTimeLastModifiedAfter());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            metadata(o.getMetadata());
            opcRetryToken(o.getOpcRetryToken());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDataFilesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDataFilesRequest
         */
        public ListDataFilesRequest build() {
            ListDataFilesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDataFilesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDataFilesRequest
         */
        public ListDataFilesRequest buildWithoutInvocationCallback() {
            ListDataFilesRequest request = new ListDataFilesRequest();
            request.apmDomainId = apmDomainId;
            request.apmType = apmType;
            request.name = name;
            request.timeLastModifiedBefore = timeLastModifiedBefore;
            request.timeLastModifiedAfter = timeLastModifiedAfter;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.metadata = metadata;
            request.opcRetryToken = opcRetryToken;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new ListDataFilesRequest(apmDomainId, apmType, name, timeLastModifiedBefore,
            // timeLastModifiedAfter, limit, page, sortOrder, sortBy, metadata, opcRetryToken,
            // opcClientRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .apmType(apmType)
                .name(name)
                .timeLastModifiedBefore(timeLastModifiedBefore)
                .timeLastModifiedAfter(timeLastModifiedAfter)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .metadata(metadata)
                .opcRetryToken(opcRetryToken)
                .opcClientRequestId(opcClientRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",apmType=").append(String.valueOf(this.apmType));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",timeLastModifiedBefore=").append(String.valueOf(this.timeLastModifiedBefore));
        sb.append(",timeLastModifiedAfter=").append(String.valueOf(this.timeLastModifiedAfter));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",metadata=").append(String.valueOf(this.metadata));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDataFilesRequest)) {
            return false;
        }

        ListDataFilesRequest other = (ListDataFilesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.apmType, other.apmType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.timeLastModifiedBefore, other.timeLastModifiedBefore)
                && java.util.Objects.equals(this.timeLastModifiedAfter, other.timeLastModifiedAfter)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.apmType == null ? 43 : this.apmType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModifiedBefore == null
                                ? 43
                                : this.timeLastModifiedBefore.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModifiedAfter == null
                                ? 43
                                : this.timeLastModifiedAfter.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
