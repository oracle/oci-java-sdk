/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Update cloud guard configuration details for a tenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reportingRegion", "status", "selfManageResources"})
    public UpdateConfigurationDetails(
            String reportingRegion, CloudGuardStatus status, Boolean selfManageResources) {
        super();
        this.reportingRegion = reportingRegion;
        this.status = status;
        this.selfManageResources = selfManageResources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The reporting region value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reportingRegion")
        private String reportingRegion;

        /**
         * The reporting region value
         * @param reportingRegion the value to set
         * @return this builder
         **/
        public Builder reportingRegion(String reportingRegion) {
            this.reportingRegion = reportingRegion;
            this.__explicitlySet__.add("reportingRegion");
            return this;
        }
        /**
         * Status of Cloud Guard Tenant
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private CloudGuardStatus status;

        /**
         * Status of Cloud Guard Tenant
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(CloudGuardStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Identifies if Oracle managed resources will be created by customers.
         * If no value is specified false is the default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selfManageResources")
        private Boolean selfManageResources;

        /**
         * Identifies if Oracle managed resources will be created by customers.
         * If no value is specified false is the default.
         *
         * @param selfManageResources the value to set
         * @return this builder
         **/
        public Builder selfManageResources(Boolean selfManageResources) {
            this.selfManageResources = selfManageResources;
            this.__explicitlySet__.add("selfManageResources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConfigurationDetails build() {
            UpdateConfigurationDetails model =
                    new UpdateConfigurationDetails(
                            this.reportingRegion, this.status, this.selfManageResources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("reportingRegion")) {
                this.reportingRegion(model.getReportingRegion());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("selfManageResources")) {
                this.selfManageResources(model.getSelfManageResources());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The reporting region value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportingRegion")
    private final String reportingRegion;

    /**
     * The reporting region value
     * @return the value
     **/
    public String getReportingRegion() {
        return reportingRegion;
    }

    /**
     * Status of Cloud Guard Tenant
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final CloudGuardStatus status;

    /**
     * Status of Cloud Guard Tenant
     * @return the value
     **/
    public CloudGuardStatus getStatus() {
        return status;
    }

    /**
     * Identifies if Oracle managed resources will be created by customers.
     * If no value is specified false is the default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selfManageResources")
    private final Boolean selfManageResources;

    /**
     * Identifies if Oracle managed resources will be created by customers.
     * If no value is specified false is the default.
     *
     * @return the value
     **/
    public Boolean getSelfManageResources() {
        return selfManageResources;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("reportingRegion=").append(String.valueOf(this.reportingRegion));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", selfManageResources=").append(String.valueOf(this.selfManageResources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConfigurationDetails)) {
            return false;
        }

        UpdateConfigurationDetails other = (UpdateConfigurationDetails) o;
        return java.util.Objects.equals(this.reportingRegion, other.reportingRegion)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.selfManageResources, other.selfManageResources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.reportingRegion == null ? 43 : this.reportingRegion.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.selfManageResources == null
                                ? 43
                                : this.selfManageResources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
