/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Cloud Guard configuration details of a tenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Configuration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Configuration {
    @Deprecated
    @java.beans.ConstructorProperties({"reportingRegion", "status", "selfManageResources"})
    public Configuration(
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
         * Identifies if Oracle managed resources were created by customers
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selfManageResources")
        private Boolean selfManageResources;

        /**
         * Identifies if Oracle managed resources were created by customers
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

        public Configuration build() {
            Configuration __instance__ =
                    new Configuration(reportingRegion, status, selfManageResources);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Configuration o) {
            Builder copiedBuilder =
                    reportingRegion(o.getReportingRegion())
                            .status(o.getStatus())
                            .selfManageResources(o.getSelfManageResources());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Identifies if Oracle managed resources were created by customers
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selfManageResources")
    private final Boolean selfManageResources;

    /**
     * Identifies if Oracle managed resources were created by customers
     *
     * @return the value
     **/
    public Boolean getSelfManageResources() {
        return selfManageResources;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Configuration(");
        sb.append("reportingRegion=").append(String.valueOf(this.reportingRegion));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", selfManageResources=").append(String.valueOf(this.selfManageResources));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Configuration)) {
            return false;
        }

        Configuration other = (Configuration) o;
        return java.util.Objects.equals(this.reportingRegion, other.reportingRegion)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.selfManageResources, other.selfManageResources)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
