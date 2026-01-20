/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseParametersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeAwrDatabaseParametersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeAwrDatabaseParametersRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Awr Hub identifier */
    private String awrHubId;

    /** Unique Awr Hub identifier */
    public String getAwrHubId() {
        return awrHubId;
    }
    /**
     * The internal ID of the database. The internal ID of the database is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabases
     */
    private String awrSourceDatabaseIdentifier;

    /**
     * The internal ID of the database. The internal ID of the database is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabases
     */
    public String getAwrSourceDatabaseIdentifier() {
        return awrSourceDatabaseIdentifier;
    }
    /** The optional single value query parameter to filter by database instance number. */
    private String instanceNumber;

    /** The optional single value query parameter to filter by database instance number. */
    public String getInstanceNumber() {
        return instanceNumber;
    }
    /** The optional greater than or equal to filter on the snapshot ID. */
    private Integer beginSnapshotIdentifierGreaterThanOrEqualTo;

    /** The optional greater than or equal to filter on the snapshot ID. */
    public Integer getBeginSnapshotIdentifierGreaterThanOrEqualTo() {
        return beginSnapshotIdentifierGreaterThanOrEqualTo;
    }
    /** The optional less than or equal to query parameter to filter the snapshot Identifier. */
    private Integer endSnapshotIdentifierLessThanOrEqualTo;

    /** The optional less than or equal to query parameter to filter the snapshot Identifier. */
    public Integer getEndSnapshotIdentifierLessThanOrEqualTo() {
        return endSnapshotIdentifierLessThanOrEqualTo;
    }
    /**
     * The optional greater than or equal to query parameter to filter the timestamp. The timestamp
     * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     */
    private java.util.Date timeGreaterThanOrEqualTo;

    /**
     * The optional greater than or equal to query parameter to filter the timestamp. The timestamp
     * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     */
    public java.util.Date getTimeGreaterThanOrEqualTo() {
        return timeGreaterThanOrEqualTo;
    }
    /**
     * The optional less than or equal to query parameter to filter the timestamp. The timestamp
     * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     */
    private java.util.Date timeLessThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the timestamp. The timestamp
     * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
     */
    public java.util.Date getTimeLessThanOrEqualTo() {
        return timeLessThanOrEqualTo;
    }
    /** The optional multiple value query parameter to filter the entity name. */
    private java.util.List<String> name;

    /** The optional multiple value query parameter to filter the entity name. */
    public java.util.List<String> getName() {
        return name;
    }
    /** The optional contains query parameter to filter the entity name by any part of the name. */
    private String nameContains;

    /** The optional contains query parameter to filter the entity name by any part of the name. */
    public String getNameContains() {
        return nameContains;
    }
    /** The optional query parameter to filter database parameters whose values were changed. */
    private ValueChanged valueChanged;

    /** The optional query parameter to filter database parameters whose values were changed. */
    public enum ValueChanged implements com.oracle.bmc.http.internal.BmcEnum {
        Y("Y"),
        N("N"),
        ;

        private final String value;
        private static java.util.Map<String, ValueChanged> map;

        static {
            map = new java.util.HashMap<>();
            for (ValueChanged v : ValueChanged.values()) {
                map.put(v.getValue(), v);
            }
        }

        ValueChanged(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueChanged create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ValueChanged: " + key);
        }
    };

    /** The optional query parameter to filter database parameters whose values were changed. */
    public ValueChanged getValueChanged() {
        return valueChanged;
    }
    /**
     * The optional query parameter to filter the database parameters that had the default value in
     * the last snapshot.
     */
    private ValueDefault valueDefault;

    /**
     * The optional query parameter to filter the database parameters that had the default value in
     * the last snapshot.
     */
    public enum ValueDefault implements com.oracle.bmc.http.internal.BmcEnum {
        True("TRUE"),
        False("FALSE"),
        ;

        private final String value;
        private static java.util.Map<String, ValueDefault> map;

        static {
            map = new java.util.HashMap<>();
            for (ValueDefault v : ValueDefault.values()) {
                map.put(v.getValue(), v);
            }
        }

        ValueDefault(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueDefault create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ValueDefault: " + key);
        }
    };

    /**
     * The optional query parameter to filter the database parameters that had the default value in
     * the last snapshot.
     */
    public ValueDefault getValueDefault() {
        return valueDefault;
    }
    /**
     * The optional query parameter to filter the database parameters that had a modified value in
     * the last snapshot.
     */
    private ValueModified valueModified;

    /**
     * The optional query parameter to filter the database parameters that had a modified value in
     * the last snapshot.
     */
    public enum ValueModified implements com.oracle.bmc.http.internal.BmcEnum {
        Modified("MODIFIED"),
        SystemMod("SYSTEM_MOD"),
        False("FALSE"),
        ;

        private final String value;
        private static java.util.Map<String, ValueModified> map;

        static {
            map = new java.util.HashMap<>();
            for (ValueModified v : ValueModified.values()) {
                map.put(v.getValue(), v);
            }
        }

        ValueModified(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueModified create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ValueModified: " + key);
        }
    };

    /**
     * The optional query parameter to filter the database parameters that had a modified value in
     * the last snapshot.
     */
    public ValueModified getValueModified() {
        return valueModified;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /** The option to sort the AWR database parameter change history data. */
    private SortBy sortBy;

    /** The option to sort the AWR database parameter change history data. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
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

    /** The option to sort the AWR database parameter change history data. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.opsi.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeAwrDatabaseParametersRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Awr Hub identifier */
        private String awrHubId = null;

        /**
         * Unique Awr Hub identifier
         *
         * @param awrHubId the value to set
         * @return this builder instance
         */
        public Builder awrHubId(String awrHubId) {
            this.awrHubId = awrHubId;
            return this;
        }

        /**
         * The internal ID of the database. The internal ID of the database is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabases
         */
        private String awrSourceDatabaseIdentifier = null;

        /**
         * The internal ID of the database. The internal ID of the database is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabases
         *
         * @param awrSourceDatabaseIdentifier the value to set
         * @return this builder instance
         */
        public Builder awrSourceDatabaseIdentifier(String awrSourceDatabaseIdentifier) {
            this.awrSourceDatabaseIdentifier = awrSourceDatabaseIdentifier;
            return this;
        }

        /** The optional single value query parameter to filter by database instance number. */
        private String instanceNumber = null;

        /**
         * The optional single value query parameter to filter by database instance number.
         *
         * @param instanceNumber the value to set
         * @return this builder instance
         */
        public Builder instanceNumber(String instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }

        /** The optional greater than or equal to filter on the snapshot ID. */
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

        /** The optional less than or equal to query parameter to filter the snapshot Identifier. */
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
         * The optional greater than or equal to query parameter to filter the timestamp. The
         * timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         */
        private java.util.Date timeGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to query parameter to filter the timestamp. The
         * timestamp format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         *
         * @param timeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeGreaterThanOrEqualTo(java.util.Date timeGreaterThanOrEqualTo) {
            this.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The optional less than or equal to query parameter to filter the timestamp. The timestamp
         * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         */
        private java.util.Date timeLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter the timestamp. The timestamp
         * format to be followed is: YYYY-MM-DDTHH:MM:SSZ, example 2020-12-03T19:00:53Z
         *
         * @param timeLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLessThanOrEqualTo(java.util.Date timeLessThanOrEqualTo) {
            this.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            return this;
        }

        /** The optional multiple value query parameter to filter the entity name. */
        private java.util.List<String> name = null;

        /**
         * The optional multiple value query parameter to filter the entity name.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(java.util.List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Singular setter. The optional multiple value query parameter to filter the entity name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder name(String singularValue) {
            return this.name(java.util.Arrays.asList(singularValue));
        }

        /**
         * The optional contains query parameter to filter the entity name by any part of the name.
         */
        private String nameContains = null;

        /**
         * The optional contains query parameter to filter the entity name by any part of the name.
         *
         * @param nameContains the value to set
         * @return this builder instance
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            return this;
        }

        /** The optional query parameter to filter database parameters whose values were changed. */
        private ValueChanged valueChanged = null;

        /**
         * The optional query parameter to filter database parameters whose values were changed.
         *
         * @param valueChanged the value to set
         * @return this builder instance
         */
        public Builder valueChanged(ValueChanged valueChanged) {
            this.valueChanged = valueChanged;
            return this;
        }

        /**
         * The optional query parameter to filter the database parameters that had the default value
         * in the last snapshot.
         */
        private ValueDefault valueDefault = null;

        /**
         * The optional query parameter to filter the database parameters that had the default value
         * in the last snapshot.
         *
         * @param valueDefault the value to set
         * @return this builder instance
         */
        public Builder valueDefault(ValueDefault valueDefault) {
            this.valueDefault = valueDefault;
            return this;
        }

        /**
         * The optional query parameter to filter the database parameters that had a modified value
         * in the last snapshot.
         */
        private ValueModified valueModified = null;

        /**
         * The optional query parameter to filter the database parameters that had a modified value
         * in the last snapshot.
         *
         * @param valueModified the value to set
         * @return this builder instance
         */
        public Builder valueModified(ValueModified valueModified) {
            this.valueModified = valueModified;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The option to sort the AWR database parameter change history data. */
        private SortBy sortBy = null;

        /**
         * The option to sort the AWR database parameter change history data.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(SummarizeAwrDatabaseParametersRequest o) {
            awrHubId(o.getAwrHubId());
            awrSourceDatabaseIdentifier(o.getAwrSourceDatabaseIdentifier());
            instanceNumber(o.getInstanceNumber());
            beginSnapshotIdentifierGreaterThanOrEqualTo(
                    o.getBeginSnapshotIdentifierGreaterThanOrEqualTo());
            endSnapshotIdentifierLessThanOrEqualTo(o.getEndSnapshotIdentifierLessThanOrEqualTo());
            timeGreaterThanOrEqualTo(o.getTimeGreaterThanOrEqualTo());
            timeLessThanOrEqualTo(o.getTimeLessThanOrEqualTo());
            name(o.getName());
            nameContains(o.getNameContains());
            valueChanged(o.getValueChanged());
            valueDefault(o.getValueDefault());
            valueModified(o.getValueModified());
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
         * Build the instance of SummarizeAwrDatabaseParametersRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeAwrDatabaseParametersRequest
         */
        public SummarizeAwrDatabaseParametersRequest build() {
            SummarizeAwrDatabaseParametersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeAwrDatabaseParametersRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeAwrDatabaseParametersRequest
         */
        public SummarizeAwrDatabaseParametersRequest buildWithoutInvocationCallback() {
            SummarizeAwrDatabaseParametersRequest request =
                    new SummarizeAwrDatabaseParametersRequest();
            request.awrHubId = awrHubId;
            request.awrSourceDatabaseIdentifier = awrSourceDatabaseIdentifier;
            request.instanceNumber = instanceNumber;
            request.beginSnapshotIdentifierGreaterThanOrEqualTo =
                    beginSnapshotIdentifierGreaterThanOrEqualTo;
            request.endSnapshotIdentifierLessThanOrEqualTo = endSnapshotIdentifierLessThanOrEqualTo;
            request.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            request.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            request.name = name;
            request.nameContains = nameContains;
            request.valueChanged = valueChanged;
            request.valueDefault = valueDefault;
            request.valueModified = valueModified;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeAwrDatabaseParametersRequest(awrHubId, awrSourceDatabaseIdentifier,
            // instanceNumber, beginSnapshotIdentifierGreaterThanOrEqualTo,
            // endSnapshotIdentifierLessThanOrEqualTo, timeGreaterThanOrEqualTo,
            // timeLessThanOrEqualTo, name, nameContains, valueChanged, valueDefault, valueModified,
            // page, limit, sortBy, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .awrHubId(awrHubId)
                .awrSourceDatabaseIdentifier(awrSourceDatabaseIdentifier)
                .instanceNumber(instanceNumber)
                .beginSnapshotIdentifierGreaterThanOrEqualTo(
                        beginSnapshotIdentifierGreaterThanOrEqualTo)
                .endSnapshotIdentifierLessThanOrEqualTo(endSnapshotIdentifierLessThanOrEqualTo)
                .timeGreaterThanOrEqualTo(timeGreaterThanOrEqualTo)
                .timeLessThanOrEqualTo(timeLessThanOrEqualTo)
                .name(name)
                .nameContains(nameContains)
                .valueChanged(valueChanged)
                .valueDefault(valueDefault)
                .valueModified(valueModified)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId);
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
        sb.append(",awrHubId=").append(String.valueOf(this.awrHubId));
        sb.append(",awrSourceDatabaseIdentifier=")
                .append(String.valueOf(this.awrSourceDatabaseIdentifier));
        sb.append(",instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(",beginSnapshotIdentifierGreaterThanOrEqualTo=")
                .append(String.valueOf(this.beginSnapshotIdentifierGreaterThanOrEqualTo));
        sb.append(",endSnapshotIdentifierLessThanOrEqualTo=")
                .append(String.valueOf(this.endSnapshotIdentifierLessThanOrEqualTo));
        sb.append(",timeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeGreaterThanOrEqualTo));
        sb.append(",timeLessThanOrEqualTo=").append(String.valueOf(this.timeLessThanOrEqualTo));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",nameContains=").append(String.valueOf(this.nameContains));
        sb.append(",valueChanged=").append(String.valueOf(this.valueChanged));
        sb.append(",valueDefault=").append(String.valueOf(this.valueDefault));
        sb.append(",valueModified=").append(String.valueOf(this.valueModified));
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
        if (!(o instanceof SummarizeAwrDatabaseParametersRequest)) {
            return false;
        }

        SummarizeAwrDatabaseParametersRequest other = (SummarizeAwrDatabaseParametersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.awrHubId, other.awrHubId)
                && java.util.Objects.equals(
                        this.awrSourceDatabaseIdentifier, other.awrSourceDatabaseIdentifier)
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
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.valueChanged, other.valueChanged)
                && java.util.Objects.equals(this.valueDefault, other.valueDefault)
                && java.util.Objects.equals(this.valueModified, other.valueModified)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result = (result * PRIME) + (this.valueChanged == null ? 43 : this.valueChanged.hashCode());
        result = (result * PRIME) + (this.valueDefault == null ? 43 : this.valueDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.valueModified == null ? 43 : this.valueModified.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
