/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDatabaseSoftwareImagesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDatabaseSoftwareImagesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListDatabaseSoftwareImagesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The maximum number of items to return per page. */
    private Integer limit;

    /** The maximum number of items to return per page. */
    public Integer getLimit() {
        return limit;
    }
    /** The pagination token to continue listing from. */
    private String page;

    /** The pagination token to continue listing from. */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive. Default order for PATCHSET is descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive. Default order for PATCHSET is descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
        Patchset("PATCHSET"),
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
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive. Default order for PATCHSET is descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** A filter to return only resources that match the given lifecycle state exactly. */
    private com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.LifecycleState
            lifecycleState;

    /** A filter to return only resources that match the given lifecycle state exactly. */
    public com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the entire display name given. The match is not
     * case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given. The match is not
     * case sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return only resources that match the given image type exactly. */
    private com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.ImageType imageType;

    /** A filter to return only resources that match the given image type exactly. */
    public com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.ImageType getImageType() {
        return imageType;
    }
    /** A filter to return only resources that match the given image shape family exactly. */
    private com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.ImageShapeFamily
            imageShapeFamily;

    /** A filter to return only resources that match the given image shape family exactly. */
    public com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.ImageShapeFamily
            getImageShapeFamily() {
        return imageShapeFamily;
    }
    /**
     * A filter to return only resources with {@code patchSet} greater than or equal to given value.
     */
    private String patchSetGreaterThanOrEqualTo;

    /**
     * A filter to return only resources with {@code patchSet} greater than or equal to given value.
     */
    public String getPatchSetGreaterThanOrEqualTo() {
        return patchSetGreaterThanOrEqualTo;
    }
    /**
     * The DB system [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * If provided, filters the results to the set of database versions which are supported for the
     * DB system.
     */
    private String dbSystemId;

    /**
     * The DB system [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * If provided, filters the results to the set of database versions which are supported for the
     * DB system.
     */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /**
     * If provided, filters the results to the set of database versions which are supported for
     * Upgrade.
     */
    private Boolean isUpgradeSupported;

    /**
     * If provided, filters the results to the set of database versions which are supported for
     * Upgrade.
     */
    public Boolean getIsUpgradeSupported() {
        return isUpgradeSupported;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDatabaseSoftwareImagesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The maximum number of items to return per page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The pagination token to continue listing from. */
        private String page = null;

        /**
         * The pagination token to continue listing from.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The
         * DISPLAYNAME sort order is case sensitive. Default order for PATCHSET is descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The
         * DISPLAYNAME sort order is case sensitive. Default order for PATCHSET is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** A filter to return only resources that match the given lifecycle state exactly. */
        private com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state exactly.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given. The match is
         * not case sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given. The match is
         * not case sensitive.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** A filter to return only resources that match the given image type exactly. */
        private com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.ImageType imageType =
                null;

        /**
         * A filter to return only resources that match the given image type exactly.
         *
         * @param imageType the value to set
         * @return this builder instance
         */
        public Builder imageType(
                com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.ImageType imageType) {
            this.imageType = imageType;
            return this;
        }

        /** A filter to return only resources that match the given image shape family exactly. */
        private com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.ImageShapeFamily
                imageShapeFamily = null;

        /**
         * A filter to return only resources that match the given image shape family exactly.
         *
         * @param imageShapeFamily the value to set
         * @return this builder instance
         */
        public Builder imageShapeFamily(
                com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.ImageShapeFamily
                        imageShapeFamily) {
            this.imageShapeFamily = imageShapeFamily;
            return this;
        }

        /**
         * A filter to return only resources with {@code patchSet} greater than or equal to given
         * value.
         */
        private String patchSetGreaterThanOrEqualTo = null;

        /**
         * A filter to return only resources with {@code patchSet} greater than or equal to given
         * value.
         *
         * @param patchSetGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder patchSetGreaterThanOrEqualTo(String patchSetGreaterThanOrEqualTo) {
            this.patchSetGreaterThanOrEqualTo = patchSetGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The DB system
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If
         * provided, filters the results to the set of database versions which are supported for the
         * DB system.
         */
        private String dbSystemId = null;

        /**
         * The DB system
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If
         * provided, filters the results to the set of database versions which are supported for the
         * DB system.
         *
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * If provided, filters the results to the set of database versions which are supported for
         * Upgrade.
         */
        private Boolean isUpgradeSupported = null;

        /**
         * If provided, filters the results to the set of database versions which are supported for
         * Upgrade.
         *
         * @param isUpgradeSupported the value to set
         * @return this builder instance
         */
        public Builder isUpgradeSupported(Boolean isUpgradeSupported) {
            this.isUpgradeSupported = isUpgradeSupported;
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
        public Builder copy(ListDatabaseSoftwareImagesRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            imageType(o.getImageType());
            imageShapeFamily(o.getImageShapeFamily());
            patchSetGreaterThanOrEqualTo(o.getPatchSetGreaterThanOrEqualTo());
            dbSystemId(o.getDbSystemId());
            isUpgradeSupported(o.getIsUpgradeSupported());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDatabaseSoftwareImagesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDatabaseSoftwareImagesRequest
         */
        public ListDatabaseSoftwareImagesRequest build() {
            ListDatabaseSoftwareImagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDatabaseSoftwareImagesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDatabaseSoftwareImagesRequest
         */
        public ListDatabaseSoftwareImagesRequest buildWithoutInvocationCallback() {
            ListDatabaseSoftwareImagesRequest request = new ListDatabaseSoftwareImagesRequest();
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.imageType = imageType;
            request.imageShapeFamily = imageShapeFamily;
            request.patchSetGreaterThanOrEqualTo = patchSetGreaterThanOrEqualTo;
            request.dbSystemId = dbSystemId;
            request.isUpgradeSupported = isUpgradeSupported;
            return request;
            // new ListDatabaseSoftwareImagesRequest(compartmentId, limit, page, sortBy, sortOrder,
            // lifecycleState, displayName, imageType, imageShapeFamily,
            // patchSetGreaterThanOrEqualTo, dbSystemId, isUpgradeSupported);
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
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .imageType(imageType)
                .imageShapeFamily(imageShapeFamily)
                .patchSetGreaterThanOrEqualTo(patchSetGreaterThanOrEqualTo)
                .dbSystemId(dbSystemId)
                .isUpgradeSupported(isUpgradeSupported);
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
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",imageType=").append(String.valueOf(this.imageType));
        sb.append(",imageShapeFamily=").append(String.valueOf(this.imageShapeFamily));
        sb.append(",patchSetGreaterThanOrEqualTo=")
                .append(String.valueOf(this.patchSetGreaterThanOrEqualTo));
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",isUpgradeSupported=").append(String.valueOf(this.isUpgradeSupported));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDatabaseSoftwareImagesRequest)) {
            return false;
        }

        ListDatabaseSoftwareImagesRequest other = (ListDatabaseSoftwareImagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.imageType, other.imageType)
                && java.util.Objects.equals(this.imageShapeFamily, other.imageShapeFamily)
                && java.util.Objects.equals(
                        this.patchSetGreaterThanOrEqualTo, other.patchSetGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.isUpgradeSupported, other.isUpgradeSupported);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.imageType == null ? 43 : this.imageType.hashCode());
        result =
                (result * PRIME)
                        + (this.imageShapeFamily == null ? 43 : this.imageShapeFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.patchSetGreaterThanOrEqualTo == null
                                ? 43
                                : this.patchSetGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.isUpgradeSupported == null
                                ? 43
                                : this.isUpgradeSupported.hashCode());
        return result;
    }
}
