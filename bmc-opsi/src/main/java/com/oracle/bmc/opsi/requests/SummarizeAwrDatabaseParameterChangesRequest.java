/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseParameterChangesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeAwrDatabaseParameterChangesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeAwrDatabaseParameterChangesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Awr Hub identifier
     */
    private String awrHubId;

    /**
     * Unique Awr Hub identifier
     */
    public String getAwrHubId() {
        return awrHubId;
    }
    /**
     * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /awrHubs/{awrHubId}/awrDatabases
     *
     */
    private String awrSourceDatabaseIdentifier;

    /**
     * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /awrHubs/{awrHubId}/awrDatabases
     *
     */
    public String getAwrSourceDatabaseIdentifier() {
        return awrSourceDatabaseIdentifier;
    }
    /**
     * The required single value query parameter to filter the entity name.
     */
    private String name;

    /**
     * The required single value query parameter to filter the entity name.
     */
    public String getName() {
        return name;
    }
    /**
     * The optional single value query parameter to filter by database instance number.
     */
    private String instanceNumber;

    /**
     * The optional single value query parameter to filter by database instance number.
     */
    public String getInstanceNumber() {
        return instanceNumber;
    }
    /**
     * The optional greater than or equal to filter on the snapshot ID.
     *
     */
    private Integer beginSnapshotIdentifierGreaterThanOrEqualTo;

    /**
     * The optional greater than or equal to filter on the snapshot ID.
     *
     */
    public Integer getBeginSnapshotIdentifierGreaterThanOrEqualTo() {
        return beginSnapshotIdentifierGreaterThanOrEqualTo;
    }
    /**
     * The optional less than or equal to query parameter to filter the snapshot Identifier.
     *
     */
    private Integer endSnapshotIdentifierLessThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the snapshot Identifier.
     *
     */
    public Integer getEndSnapshotIdentifierLessThanOrEqualTo() {
        return endSnapshotIdentifierLessThanOrEqualTo;
    }
    /**
     * The optional greater than or equal to query parameter to filter the timestamp. The timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     *
     */
    private java.util.Date timeGreaterThanOrEqualTo;

    /**
     * The optional greater than or equal to query parameter to filter the timestamp. The timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     *
     */
    public java.util.Date getTimeGreaterThanOrEqualTo() {
        return timeGreaterThanOrEqualTo;
    }
    /**
     * The optional less than or equal to query parameter to filter the timestamp. The timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     *
     */
    private java.util.Date timeLessThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the timestamp. The timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     *
     */
    public java.util.Date getTimeLessThanOrEqualTo() {
        return timeLessThanOrEqualTo;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The option to sort the AWR database parameter change history data.
     */
    private SortBy sortBy;

    /**
     * The option to sort the AWR database parameter change history data.
     **/
    public enum SortBy {
        IsChanged("IS_CHANGED"),
        Name("NAME"),
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
     * The option to sort the AWR database parameter change history data.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public com.oracle.bmc.opsi.model.SortOrder getSortOrder() {
        return sortOrder;
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
                    SummarizeAwrDatabaseParameterChangesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Awr Hub identifier
         */
        private String awrHubId = null;

        /**
         * Unique Awr Hub identifier
         * @param awrHubId the value to set
         * @return this builder instance
         */
        public Builder awrHubId(String awrHubId) {
            this.awrHubId = awrHubId;
            return this;
        }

        /**
         * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /awrHubs/{awrHubId}/awrDatabases
         *
         */
        private String awrSourceDatabaseIdentifier = null;

        /**
         * The internal ID of the database. The internal ID of the database is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * It can be retrieved from the following endpoint:
         * /awrHubs/{awrHubId}/awrDatabases
         *
         * @param awrSourceDatabaseIdentifier the value to set
         * @return this builder instance
         */
        public Builder awrSourceDatabaseIdentifier(String awrSourceDatabaseIdentifier) {
            this.awrSourceDatabaseIdentifier = awrSourceDatabaseIdentifier;
            return this;
        }

        /**
         * The required single value query parameter to filter the entity name.
         */
        private String name = null;

        /**
         * The required single value query parameter to filter the entity name.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The optional single value query parameter to filter by database instance number.
         */
        private String instanceNumber = null;

        /**
         * The optional single value query parameter to filter by database instance number.
         * @param instanceNumber the value to set
         * @return this builder instance
         */
        public Builder instanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }

        /**
         * The optional greater than or equal to filter on the snapshot ID.
         *
         */
        private Integer beginSnapshotIdentifierGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to filter on the snapshot ID.
         *
         * @param beginSnapshotIdentifierGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder beginSnapshotIdentifierGreaterThanOrEqualTo(
                Integer beginSnapshotIdentifierGreaterThanOrEqualTo) {
            this.beginSnapshotIdentifierGreaterThanOrEqualTo =
                    beginSnapshotIdentifierGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The optional less than or equal to query parameter to filter the snapshot Identifier.
         *
         */
        private Integer endSnapshotIdentifierLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter the snapshot Identifier.
         *
         * @param endSnapshotIdentifierLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder endSnapshotIdentifierLessThanOrEqualTo(
                Integer endSnapshotIdentifierLessThanOrEqualTo) {
            this.endSnapshotIdentifierLessThanOrEqualTo = endSnapshotIdentifierLessThanOrEqualTo;
            return this;
        }

        /**
         * The optional greater than or equal to query parameter to filter the timestamp. The timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         *
         */
        private java.util.Date timeGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to query parameter to filter the timestamp. The timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         *
         * @param timeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeGreaterThanOrEqualTo(java.util.Date timeGreaterThanOrEqualTo) {
            this.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The optional less than or equal to query parameter to filter the timestamp. The timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         *
         */
        private java.util.Date timeLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter the timestamp. The timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         *
         * @param timeLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLessThanOrEqualTo(java.util.Date timeLessThanOrEqualTo) {
            this.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
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
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
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
         * The option to sort the AWR database parameter change history data.
         */
        private SortBy sortBy = null;

        /**
         * The option to sort the AWR database parameter change history data.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private com.oracle.bmc.opsi.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.opsi.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(SummarizeAwrDatabaseParameterChangesRequest o) {
            awrHubId(o.getAwrHubId());
            awrSourceDatabaseIdentifier(o.getAwrSourceDatabaseIdentifier());
            name(o.getName());
            instanceNumber(o.getInstanceNumber());
            beginSnapshotIdentifierGreaterThanOrEqualTo(
                    o.getBeginSnapshotIdentifierGreaterThanOrEqualTo());
            endSnapshotIdentifierLessThanOrEqualTo(o.getEndSnapshotIdentifierLessThanOrEqualTo());
            timeGreaterThanOrEqualTo(o.getTimeGreaterThanOrEqualTo());
            timeLessThanOrEqualTo(o.getTimeLessThanOrEqualTo());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeAwrDatabaseParameterChangesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeAwrDatabaseParameterChangesRequest
         */
        public SummarizeAwrDatabaseParameterChangesRequest build() {
            SummarizeAwrDatabaseParameterChangesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeAwrDatabaseParameterChangesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeAwrDatabaseParameterChangesRequest
         */
        public SummarizeAwrDatabaseParameterChangesRequest buildWithoutInvocationCallback() {
            SummarizeAwrDatabaseParameterChangesRequest request =
                    new SummarizeAwrDatabaseParameterChangesRequest();
            request.awrHubId = awrHubId;
            request.awrSourceDatabaseIdentifier = awrSourceDatabaseIdentifier;
            request.name = name;
            request.instanceNumber = instanceNumber;
            request.beginSnapshotIdentifierGreaterThanOrEqualTo =
                    beginSnapshotIdentifierGreaterThanOrEqualTo;
            request.endSnapshotIdentifierLessThanOrEqualTo = endSnapshotIdentifierLessThanOrEqualTo;
            request.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            request.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeAwrDatabaseParameterChangesRequest(awrHubId, awrSourceDatabaseIdentifier, name, instanceNumber, beginSnapshotIdentifierGreaterThanOrEqualTo, endSnapshotIdentifierLessThanOrEqualTo, timeGreaterThanOrEqualTo, timeLessThanOrEqualTo, page, limit, sortBy, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .awrHubId(awrHubId)
                .awrSourceDatabaseIdentifier(awrSourceDatabaseIdentifier)
                .name(name)
                .instanceNumber(instanceNumber)
                .beginSnapshotIdentifierGreaterThanOrEqualTo(
                        beginSnapshotIdentifierGreaterThanOrEqualTo)
                .endSnapshotIdentifierLessThanOrEqualTo(endSnapshotIdentifierLessThanOrEqualTo)
                .timeGreaterThanOrEqualTo(timeGreaterThanOrEqualTo)
                .timeLessThanOrEqualTo(timeLessThanOrEqualTo)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",awrHubId=").append(String.valueOf(this.awrHubId));
        sb.append(",awrSourceDatabaseIdentifier=")
                .append(String.valueOf(this.awrSourceDatabaseIdentifier));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(",beginSnapshotIdentifierGreaterThanOrEqualTo=")
                .append(String.valueOf(this.beginSnapshotIdentifierGreaterThanOrEqualTo));
        sb.append(",endSnapshotIdentifierLessThanOrEqualTo=")
                .append(String.valueOf(this.endSnapshotIdentifierLessThanOrEqualTo));
        sb.append(",timeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeGreaterThanOrEqualTo));
        sb.append(",timeLessThanOrEqualTo=").append(String.valueOf(this.timeLessThanOrEqualTo));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeAwrDatabaseParameterChangesRequest)) {
            return false;
        }

        SummarizeAwrDatabaseParameterChangesRequest other =
                (SummarizeAwrDatabaseParameterChangesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.awrHubId, other.awrHubId)
                && java.util.Objects.equals(
                        this.awrSourceDatabaseIdentifier, other.awrSourceDatabaseIdentifier)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(
                        this.beginSnapshotIdentifierGreaterThanOrEqualTo,
                        other.beginSnapshotIdentifierGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.endSnapshotIdentifierLessThanOrEqualTo,
                        other.endSnapshotIdentifierLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeGreaterThanOrEqualTo, other.timeGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeLessThanOrEqualTo, other.timeLessThanOrEqualTo)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.awrHubId == null ? 43 : this.awrHubId.hashCode());
        result =
                (result * PRIME)
                        + (this.awrSourceDatabaseIdentifier == null
                                ? 43
                                : this.awrSourceDatabaseIdentifier.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.beginSnapshotIdentifierGreaterThanOrEqualTo == null
                                ? 43
                                : this.beginSnapshotIdentifierGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.endSnapshotIdentifierLessThanOrEqualTo == null
                                ? 43
                                : this.endSnapshotIdentifierLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLessThanOrEqualTo == null
                                ? 43
                                : this.timeLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
