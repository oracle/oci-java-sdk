/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListBackupsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListBackupsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListBackupsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     */
    private String databaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     */
    public String getDatabaseId() {
        return databaseId;
    }
    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    /**
     * The maximum number of items to return per page.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The pagination token to continue listing from.
     */
    private String page;

    /**
     * The pagination token to continue listing from.
     */
    public String getPage() {
        return page;
    }
    /**
     * If provided, filters the results to the set of database versions which are supported for the given shape family.
     */
    private ShapeFamily shapeFamily;

    /**
     * If provided, filters the results to the set of database versions which are supported for the given shape family.
     **/
    public enum ShapeFamily {
        Singlenode("SINGLENODE"),
        Yoda("YODA"),
        Virtualmachine("VIRTUALMACHINE"),
        Exadata("EXADATA"),
        Exacc("EXACC"),
        ExadbXs("EXADB_XS"),
        ;

        private final String value;
        private static java.util.Map<String, ShapeFamily> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeFamily v : ShapeFamily.values()) {
                map.put(v.getValue(), v);
            }
        }

        ShapeFamily(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeFamily create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ShapeFamily: " + key);
        }
    };

    /**
     * If provided, filters the results to the set of database versions which are supported for the given shape family.
     */
    public ShapeFamily getShapeFamily() {
        return shapeFamily;
    }
    /**
     * A filter to return only resources that match the given database version.
     */
    private String version;

    /**
     * A filter to return only resources that match the given database version.
     */
    public String getVersion() {
        return version;
    }
    /**
     * A filter to return only backups that matches with the given type of Backup.
     */
    private String type;

    /**
     * A filter to return only backups that matches with the given type of Backup.
     */
    public String getType() {
        return type;
    }
    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     */
    private com.oracle.bmc.database.model.BackupSummary.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     */
    public com.oracle.bmc.database.model.BackupSummary.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The start of date-time range of expiration for the long term backups to be fetched.
     */
    private java.util.Date timeExpiryScheduledGreaterThanOrEqualTo;

    /**
     * The start of date-time range of expiration for the long term backups to be fetched.
     */
    public java.util.Date getTimeExpiryScheduledGreaterThanOrEqualTo() {
        return timeExpiryScheduledGreaterThanOrEqualTo;
    }
    /**
     * The end of date-time range of expiration for the long term backups to be fetched.
     */
    private java.util.Date timeExpiryScheduledLessThan;

    /**
     * The end of date-time range of expiration for the long term backups to be fetched.
     */
    public java.util.Date getTimeExpiryScheduledLessThan() {
        return timeExpiryScheduledLessThan;
    }
    /**
     * A filter to return only resources that match the given backup destination type.
     */
    private String backupDestinationType;

    /**
     * A filter to return only resources that match the given backup destination type.
     */
    public String getBackupDestinationType() {
        return backupDestinationType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListBackupsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         */
        private String databaseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The maximum number of items to return per page.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token to continue listing from.
         */
        private String page = null;

        /**
         * The pagination token to continue listing from.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * If provided, filters the results to the set of database versions which are supported for the given shape family.
         */
        private ShapeFamily shapeFamily = null;

        /**
         * If provided, filters the results to the set of database versions which are supported for the given shape family.
         * @param shapeFamily the value to set
         * @return this builder instance
         */
        public Builder shapeFamily(ShapeFamily shapeFamily) {
            this.shapeFamily = shapeFamily;
            return this;
        }

        /**
         * A filter to return only resources that match the given database version.
         */
        private String version = null;

        /**
         * A filter to return only resources that match the given database version.
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * A filter to return only backups that matches with the given type of Backup.
         */
        private String type = null;

        /**
         * A filter to return only backups that matches with the given type of Backup.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state exactly.
         */
        private com.oracle.bmc.database.model.BackupSummary.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state exactly.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.database.model.BackupSummary.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The start of date-time range of expiration for the long term backups to be fetched.
         */
        private java.util.Date timeExpiryScheduledGreaterThanOrEqualTo = null;

        /**
         * The start of date-time range of expiration for the long term backups to be fetched.
         * @param timeExpiryScheduledGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeExpiryScheduledGreaterThanOrEqualTo(
                java.util.Date timeExpiryScheduledGreaterThanOrEqualTo) {
            this.timeExpiryScheduledGreaterThanOrEqualTo = timeExpiryScheduledGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The end of date-time range of expiration for the long term backups to be fetched.
         */
        private java.util.Date timeExpiryScheduledLessThan = null;

        /**
         * The end of date-time range of expiration for the long term backups to be fetched.
         * @param timeExpiryScheduledLessThan the value to set
         * @return this builder instance
         */
        public Builder timeExpiryScheduledLessThan(java.util.Date timeExpiryScheduledLessThan) {
            this.timeExpiryScheduledLessThan = timeExpiryScheduledLessThan;
            return this;
        }

        /**
         * A filter to return only resources that match the given backup destination type.
         */
        private String backupDestinationType = null;

        /**
         * A filter to return only resources that match the given backup destination type.
         * @param backupDestinationType the value to set
         * @return this builder instance
         */
        public Builder backupDestinationType(String backupDestinationType) {
            this.backupDestinationType = backupDestinationType;
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
        public Builder copy(ListBackupsRequest o) {
            databaseId(o.getDatabaseId());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            shapeFamily(o.getShapeFamily());
            version(o.getVersion());
            type(o.getType());
            lifecycleState(o.getLifecycleState());
            timeExpiryScheduledGreaterThanOrEqualTo(o.getTimeExpiryScheduledGreaterThanOrEqualTo());
            timeExpiryScheduledLessThan(o.getTimeExpiryScheduledLessThan());
            backupDestinationType(o.getBackupDestinationType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListBackupsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListBackupsRequest
         */
        public ListBackupsRequest build() {
            ListBackupsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListBackupsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListBackupsRequest
         */
        public ListBackupsRequest buildWithoutInvocationCallback() {
            ListBackupsRequest request = new ListBackupsRequest();
            request.databaseId = databaseId;
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.shapeFamily = shapeFamily;
            request.version = version;
            request.type = type;
            request.lifecycleState = lifecycleState;
            request.timeExpiryScheduledGreaterThanOrEqualTo =
                    timeExpiryScheduledGreaterThanOrEqualTo;
            request.timeExpiryScheduledLessThan = timeExpiryScheduledLessThan;
            request.backupDestinationType = backupDestinationType;
            return request;
            // new ListBackupsRequest(databaseId, compartmentId, limit, page, shapeFamily, version, type, lifecycleState, timeExpiryScheduledGreaterThanOrEqualTo, timeExpiryScheduledLessThan, backupDestinationType);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseId(databaseId)
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .shapeFamily(shapeFamily)
                .version(version)
                .type(type)
                .lifecycleState(lifecycleState)
                .timeExpiryScheduledGreaterThanOrEqualTo(timeExpiryScheduledGreaterThanOrEqualTo)
                .timeExpiryScheduledLessThan(timeExpiryScheduledLessThan)
                .backupDestinationType(backupDestinationType);
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
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",shapeFamily=").append(String.valueOf(this.shapeFamily));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeExpiryScheduledGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeExpiryScheduledGreaterThanOrEqualTo));
        sb.append(",timeExpiryScheduledLessThan=")
                .append(String.valueOf(this.timeExpiryScheduledLessThan));
        sb.append(",backupDestinationType=").append(String.valueOf(this.backupDestinationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListBackupsRequest)) {
            return false;
        }

        ListBackupsRequest other = (ListBackupsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.shapeFamily, other.shapeFamily)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.timeExpiryScheduledGreaterThanOrEqualTo,
                        other.timeExpiryScheduledGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeExpiryScheduledLessThan, other.timeExpiryScheduledLessThan)
                && java.util.Objects.equals(
                        this.backupDestinationType, other.backupDestinationType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.shapeFamily == null ? 43 : this.shapeFamily.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExpiryScheduledGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeExpiryScheduledGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExpiryScheduledLessThan == null
                                ? 43
                                : this.timeExpiryScheduledLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDestinationType == null
                                ? 43
                                : this.backupDestinationType.hashCode());
        return result;
    }
}
