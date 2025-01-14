/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Failed maintenance notification for a cluster <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaintenanceNotificationFailure.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceNotificationFailure
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterIds", "tenantId", "errorCode", "errorDescription"})
    public MaintenanceNotificationFailure(
            java.util.List<String> clusterIds,
            String tenantId,
            String errorCode,
            String errorDescription) {
        super();
        this.clusterIds = clusterIds;
        this.tenantId = tenantId;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** IDs of clusters */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterIds")
        private java.util.List<String> clusterIds;

        /**
         * IDs of clusters
         *
         * @param clusterIds the value to set
         * @return this builder
         */
        public Builder clusterIds(java.util.List<String> clusterIds) {
            this.clusterIds = clusterIds;
            this.__explicitlySet__.add("clusterIds");
            return this;
        }
        /** Tenant ID of the cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * Tenant ID of the cluster
         *
         * @param tenantId the value to set
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /** Error Code */
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private String errorCode;

        /**
         * Error Code
         *
         * @param errorCode the value to set
         * @return this builder
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }
        /** Error Description */
        @com.fasterxml.jackson.annotation.JsonProperty("errorDescription")
        private String errorDescription;

        /**
         * Error Description
         *
         * @param errorDescription the value to set
         * @return this builder
         */
        public Builder errorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            this.__explicitlySet__.add("errorDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceNotificationFailure build() {
            MaintenanceNotificationFailure model =
                    new MaintenanceNotificationFailure(
                            this.clusterIds, this.tenantId, this.errorCode, this.errorDescription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceNotificationFailure model) {
            if (model.wasPropertyExplicitlySet("clusterIds")) {
                this.clusterIds(model.getClusterIds());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorDescription")) {
                this.errorDescription(model.getErrorDescription());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** IDs of clusters */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterIds")
    private final java.util.List<String> clusterIds;

    /**
     * IDs of clusters
     *
     * @return the value
     */
    public java.util.List<String> getClusterIds() {
        return clusterIds;
    }

    /** Tenant ID of the cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * Tenant ID of the cluster
     *
     * @return the value
     */
    public String getTenantId() {
        return tenantId;
    }

    /** Error Code */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

    /**
     * Error Code
     *
     * @return the value
     */
    public String getErrorCode() {
        return errorCode;
    }

    /** Error Description */
    @com.fasterxml.jackson.annotation.JsonProperty("errorDescription")
    private final String errorDescription;

    /**
     * Error Description
     *
     * @return the value
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MaintenanceNotificationFailure(");
        sb.append("super=").append(super.toString());
        sb.append("clusterIds=").append(String.valueOf(this.clusterIds));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorDescription=").append(String.valueOf(this.errorDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceNotificationFailure)) {
            return false;
        }

        MaintenanceNotificationFailure other = (MaintenanceNotificationFailure) o;
        return java.util.Objects.equals(this.clusterIds, other.clusterIds)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorDescription, other.errorDescription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterIds == null ? 43 : this.clusterIds.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result =
                (result * PRIME)
                        + (this.errorDescription == null ? 43 : this.errorDescription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
