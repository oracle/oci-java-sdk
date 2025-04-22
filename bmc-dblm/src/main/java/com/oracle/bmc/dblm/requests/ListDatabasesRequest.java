/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.requests;

import com.oracle.bmc.dblm.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dblm/ListDatabasesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDatabasesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
public class ListDatabasesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.dblm.model.DblmVulnerability.LifecycleState lifecycleState;

    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.dblm.model.DblmVulnerability.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only database that match the given release version. */
    private String databaseRelease;

    /** A filter to return only database that match the given release version. */
    public String getDatabaseRelease() {
        return databaseRelease;
    }
    /** Filter by database type. Possible values Single Instance or RAC. */
    private DatabaseType databaseType;

    /** Filter by database type. Possible values Single Instance or RAC. */
    public enum DatabaseType implements com.oracle.bmc.http.internal.BmcEnum {
        Si("SI"),
        Rac("RAC"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseType> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseType v : DatabaseType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DatabaseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DatabaseType: " + key);
        }
    };

    /** Filter by database type. Possible values Single Instance or RAC. */
    public DatabaseType getDatabaseType() {
        return databaseType;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.dblm.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.dblm.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The field to sort by. */
    private SortBy sortBy;

    /** The field to sort by. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        Name("name"),
        ResourceType("resourceType"),
        Release("release"),
        SubscribedImage("subscribedImage"),
        PatchCompliance("patchCompliance"),
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

    /** The field to sort by. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** Subscribed image */
    private String imageId;

    /** Subscribed image */
    public String getImageId() {
        return imageId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only database that have given patchId as additional patch (drifter from
     * image version).
     */
    private Integer drifterPatchId;

    /**
     * A filter to return only database that have given patchId as additional patch (drifter from
     * image version).
     */
    public Integer getDrifterPatchId() {
        return drifterPatchId;
    }
    /** Filter databases by image compliance status. */
    private ImageCompliance imageCompliance;

    /** Filter databases by image compliance status. */
    public enum ImageCompliance implements com.oracle.bmc.http.internal.BmcEnum {
        NotSubscribed("NOT_SUBSCRIBED"),
        NotCompliantWithImages("NOT_COMPLIANT_WITH_IMAGES"),
        AllDatabases("ALL_DATABASES"),
        ;

        private final String value;
        private static java.util.Map<String, ImageCompliance> map;

        static {
            map = new java.util.HashMap<>();
            for (ImageCompliance v : ImageCompliance.values()) {
                map.put(v.getValue(), v);
            }
        }

        ImageCompliance(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImageCompliance create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ImageCompliance: " + key);
        }
    };

    /** Filter databases by image compliance status. */
    public ImageCompliance getImageCompliance() {
        return imageCompliance;
    }
    /**
     * Filter by one or more severity types. Possible values are critical, high, medium, low, info
     * and none.
     */
    private java.util.List<com.oracle.bmc.dblm.model.ResourcesSeverities> severityType;

    /**
     * Filter by one or more severity types. Possible values are critical, high, medium, low, info
     * and none.
     */
    public java.util.List<com.oracle.bmc.dblm.model.ResourcesSeverities> getSeverityType() {
        return severityType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDatabasesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.dblm.model.DblmVulnerability.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.dblm.model.DblmVulnerability.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only database that match the given release version. */
        private String databaseRelease = null;

        /**
         * A filter to return only database that match the given release version.
         *
         * @param databaseRelease the value to set
         * @return this builder instance
         */
        public Builder databaseRelease(String databaseRelease) {
            this.databaseRelease = databaseRelease;
            return this;
        }

        /** Filter by database type. Possible values Single Instance or RAC. */
        private DatabaseType databaseType = null;

        /**
         * Filter by database type. Possible values Single Instance or RAC.
         *
         * @param databaseType the value to set
         * @return this builder instance
         */
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
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
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.dblm.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.dblm.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The field to sort by. */
        private SortBy sortBy = null;

        /**
         * The field to sort by.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** Subscribed image */
        private String imageId = null;

        /**
         * Subscribed image
         *
         * @param imageId the value to set
         * @return this builder instance
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** A filter to return only resources that match the entire display name given. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only database that have given patchId as additional patch (drifter
         * from image version).
         */
        private Integer drifterPatchId = null;

        /**
         * A filter to return only database that have given patchId as additional patch (drifter
         * from image version).
         *
         * @param drifterPatchId the value to set
         * @return this builder instance
         */
        public Builder drifterPatchId(Integer drifterPatchId) {
            this.drifterPatchId = drifterPatchId;
            return this;
        }

        /** Filter databases by image compliance status. */
        private ImageCompliance imageCompliance = null;

        /**
         * Filter databases by image compliance status.
         *
         * @param imageCompliance the value to set
         * @return this builder instance
         */
        public Builder imageCompliance(ImageCompliance imageCompliance) {
            this.imageCompliance = imageCompliance;
            return this;
        }

        /**
         * Filter by one or more severity types. Possible values are critical, high, medium, low,
         * info and none.
         */
        private java.util.List<com.oracle.bmc.dblm.model.ResourcesSeverities> severityType = null;

        /**
         * Filter by one or more severity types. Possible values are critical, high, medium, low,
         * info and none.
         *
         * @param severityType the value to set
         * @return this builder instance
         */
        public Builder severityType(
                java.util.List<com.oracle.bmc.dblm.model.ResourcesSeverities> severityType) {
            this.severityType = severityType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more severity types. Possible values are critical,
         * high, medium, low, info and none.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder severityType(ResourcesSeverities singularValue) {
            return this.severityType(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListDatabasesRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            databaseRelease(o.getDatabaseRelease());
            databaseType(o.getDatabaseType());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            imageId(o.getImageId());
            opcRequestId(o.getOpcRequestId());
            displayName(o.getDisplayName());
            drifterPatchId(o.getDrifterPatchId());
            imageCompliance(o.getImageCompliance());
            severityType(o.getSeverityType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDatabasesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDatabasesRequest
         */
        public ListDatabasesRequest build() {
            ListDatabasesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDatabasesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDatabasesRequest
         */
        public ListDatabasesRequest buildWithoutInvocationCallback() {
            ListDatabasesRequest request = new ListDatabasesRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.databaseRelease = databaseRelease;
            request.databaseType = databaseType;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.imageId = imageId;
            request.opcRequestId = opcRequestId;
            request.displayName = displayName;
            request.drifterPatchId = drifterPatchId;
            request.imageCompliance = imageCompliance;
            request.severityType = severityType;
            return request;
            // new ListDatabasesRequest(compartmentId, lifecycleState, databaseRelease,
            // databaseType, limit, page, sortOrder, sortBy, imageId, opcRequestId, displayName,
            // drifterPatchId, imageCompliance, severityType);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .lifecycleState(lifecycleState)
                .databaseRelease(databaseRelease)
                .databaseType(databaseType)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .imageId(imageId)
                .opcRequestId(opcRequestId)
                .displayName(displayName)
                .drifterPatchId(drifterPatchId)
                .imageCompliance(imageCompliance)
                .severityType(severityType);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",databaseRelease=").append(String.valueOf(this.databaseRelease));
        sb.append(",databaseType=").append(String.valueOf(this.databaseType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",imageId=").append(String.valueOf(this.imageId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",drifterPatchId=").append(String.valueOf(this.drifterPatchId));
        sb.append(",imageCompliance=").append(String.valueOf(this.imageCompliance));
        sb.append(",severityType=").append(String.valueOf(this.severityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDatabasesRequest)) {
            return false;
        }

        ListDatabasesRequest other = (ListDatabasesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.databaseRelease, other.databaseRelease)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.drifterPatchId, other.drifterPatchId)
                && java.util.Objects.equals(this.imageCompliance, other.imageCompliance)
                && java.util.Objects.equals(this.severityType, other.severityType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseRelease == null ? 43 : this.databaseRelease.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.drifterPatchId == null ? 43 : this.drifterPatchId.hashCode());
        result =
                (result * PRIME)
                        + (this.imageCompliance == null ? 43 : this.imageCompliance.hashCode());
        result = (result * PRIME) + (this.severityType == null ? 43 : this.severityType.hashCode());
        return result;
    }
}
