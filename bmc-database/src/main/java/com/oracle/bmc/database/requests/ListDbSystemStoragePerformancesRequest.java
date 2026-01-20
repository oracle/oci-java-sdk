/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemStoragePerformancesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDbSystemStoragePerformancesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListDbSystemStoragePerformancesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The DB system storage management option. Used to list database versions available for that
     * storage manager. Valid values are {@code ASM} and {@code LVM}. * ASM specifies Oracle
     * Automatic Storage Management * LVM specifies logical volume manager, sometimes called logical
     * disk manager.
     */
    private com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement;

    /**
     * The DB system storage management option. Used to list database versions available for that
     * storage manager. Valid values are {@code ASM} and {@code LVM}. * ASM specifies Oracle
     * Automatic Storage Management * LVM specifies logical volume manager, sometimes called logical
     * disk manager.
     */
    public com.oracle.bmc.database.model.DbSystemOptions.StorageManagement getStorageManagement() {
        return storageManagement;
    }
    /** Optional. Filters the performance results by shape type. */
    private String shapeType;

    /** Optional. Filters the performance results by shape type. */
    public String getShapeType() {
        return shapeType;
    }
    /**
     * The database edition of quota
     * (STANDARD_EDITION/ENTERPRISE_EDITION/ENTERPRISE_EDITION_HIGH_PERFORMANCE/ENTERPRISE_EDITION_EXTREME_PERFORMANCE/ENTERPRISE_EDITION_DEVELOPER)
     */
    private DatabaseEdition databaseEdition;

    /**
     * The database edition of quota
     * (STANDARD_EDITION/ENTERPRISE_EDITION/ENTERPRISE_EDITION_HIGH_PERFORMANCE/ENTERPRISE_EDITION_EXTREME_PERFORMANCE/ENTERPRISE_EDITION_DEVELOPER)
     */
    public enum DatabaseEdition implements com.oracle.bmc.http.internal.BmcEnum {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),
        EnterpriseEditionDeveloper("ENTERPRISE_EDITION_DEVELOPER"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                map.put(v.getValue(), v);
            }
        }

        DatabaseEdition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseEdition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DatabaseEdition: " + key);
        }
    };

    /**
     * The database edition of quota
     * (STANDARD_EDITION/ENTERPRISE_EDITION/ENTERPRISE_EDITION_HIGH_PERFORMANCE/ENTERPRISE_EDITION_EXTREME_PERFORMANCE/ENTERPRISE_EDITION_DEVELOPER)
     */
    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDbSystemStoragePerformancesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The DB system storage management option. Used to list database versions available for
         * that storage manager. Valid values are {@code ASM} and {@code LVM}. * ASM specifies
         * Oracle Automatic Storage Management * LVM specifies logical volume manager, sometimes
         * called logical disk manager.
         */
        private com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement =
                null;

        /**
         * The DB system storage management option. Used to list database versions available for
         * that storage manager. Valid values are {@code ASM} and {@code LVM}. * ASM specifies
         * Oracle Automatic Storage Management * LVM specifies logical volume manager, sometimes
         * called logical disk manager.
         *
         * @param storageManagement the value to set
         * @return this builder instance
         */
        public Builder storageManagement(
                com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement) {
            this.storageManagement = storageManagement;
            return this;
        }

        /** Optional. Filters the performance results by shape type. */
        private String shapeType = null;

        /**
         * Optional. Filters the performance results by shape type.
         *
         * @param shapeType the value to set
         * @return this builder instance
         */
        public Builder shapeType(String shapeType) {
            this.shapeType = shapeType;
            return this;
        }

        /**
         * The database edition of quota
         * (STANDARD_EDITION/ENTERPRISE_EDITION/ENTERPRISE_EDITION_HIGH_PERFORMANCE/ENTERPRISE_EDITION_EXTREME_PERFORMANCE/ENTERPRISE_EDITION_DEVELOPER)
         */
        private DatabaseEdition databaseEdition = null;

        /**
         * The database edition of quota
         * (STANDARD_EDITION/ENTERPRISE_EDITION/ENTERPRISE_EDITION_HIGH_PERFORMANCE/ENTERPRISE_EDITION_EXTREME_PERFORMANCE/ENTERPRISE_EDITION_DEVELOPER)
         *
         * @param databaseEdition the value to set
         * @return this builder instance
         */
        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

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
        public Builder copy(ListDbSystemStoragePerformancesRequest o) {
            storageManagement(o.getStorageManagement());
            shapeType(o.getShapeType());
            databaseEdition(o.getDatabaseEdition());
            opcRequestId(o.getOpcRequestId());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDbSystemStoragePerformancesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDbSystemStoragePerformancesRequest
         */
        public ListDbSystemStoragePerformancesRequest build() {
            ListDbSystemStoragePerformancesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDbSystemStoragePerformancesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDbSystemStoragePerformancesRequest
         */
        public ListDbSystemStoragePerformancesRequest buildWithoutInvocationCallback() {
            ListDbSystemStoragePerformancesRequest request =
                    new ListDbSystemStoragePerformancesRequest();
            request.storageManagement = storageManagement;
            request.shapeType = shapeType;
            request.databaseEdition = databaseEdition;
            request.opcRequestId = opcRequestId;
            request.compartmentId = compartmentId;
            return request;
            // new ListDbSystemStoragePerformancesRequest(storageManagement, shapeType,
            // databaseEdition, opcRequestId, compartmentId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .storageManagement(storageManagement)
                .shapeType(shapeType)
                .databaseEdition(databaseEdition)
                .opcRequestId(opcRequestId)
                .compartmentId(compartmentId);
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
        sb.append(",storageManagement=").append(String.valueOf(this.storageManagement));
        sb.append(",shapeType=").append(String.valueOf(this.shapeType));
        sb.append(",databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDbSystemStoragePerformancesRequest)) {
            return false;
        }

        ListDbSystemStoragePerformancesRequest other = (ListDbSystemStoragePerformancesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.storageManagement, other.storageManagement)
                && java.util.Objects.equals(this.shapeType, other.shapeType)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.storageManagement == null ? 43 : this.storageManagement.hashCode());
        result = (result * PRIME) + (this.shapeType == null ? 43 : this.shapeType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        return result;
    }
}
