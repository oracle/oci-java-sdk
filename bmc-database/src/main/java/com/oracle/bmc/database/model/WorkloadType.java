/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The number of consumed OCPUs, by database workload type.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkloadType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkloadType {
    @Deprecated
    @java.beans.ConstructorProperties({"atp", "adw"})
    public WorkloadType(Float atp, Float adw) {
        super();
        this.atp = atp;
        this.adw = adw;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The total number of OCPU cores in use for Autonomous Transaction Processing databases in the infrastructure instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("atp")
        private Float atp;

        /**
         * The total number of OCPU cores in use for Autonomous Transaction Processing databases in the infrastructure instance.
         * @param atp the value to set
         * @return this builder
         **/
        public Builder atp(Float atp) {
            this.atp = atp;
            this.__explicitlySet__.add("atp");
            return this;
        }
        /**
         * The total number of OCPU cores in use for Autonomous Data Warehouse databases in the infrastructure instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adw")
        private Float adw;

        /**
         * The total number of OCPU cores in use for Autonomous Data Warehouse databases in the infrastructure instance.
         * @param adw the value to set
         * @return this builder
         **/
        public Builder adw(Float adw) {
            this.adw = adw;
            this.__explicitlySet__.add("adw");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkloadType build() {
            WorkloadType __instance__ = new WorkloadType(atp, adw);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkloadType o) {
            Builder copiedBuilder = atp(o.getAtp()).adw(o.getAdw());

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
     * The total number of OCPU cores in use for Autonomous Transaction Processing databases in the infrastructure instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("atp")
    private final Float atp;

    /**
     * The total number of OCPU cores in use for Autonomous Transaction Processing databases in the infrastructure instance.
     * @return the value
     **/
    public Float getAtp() {
        return atp;
    }

    /**
     * The total number of OCPU cores in use for Autonomous Data Warehouse databases in the infrastructure instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adw")
    private final Float adw;

    /**
     * The total number of OCPU cores in use for Autonomous Data Warehouse databases in the infrastructure instance.
     * @return the value
     **/
    public Float getAdw() {
        return adw;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WorkloadType(");
        sb.append("atp=").append(String.valueOf(this.atp));
        sb.append(", adw=").append(String.valueOf(this.adw));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkloadType)) {
            return false;
        }

        WorkloadType other = (WorkloadType) o;
        return java.util.Objects.equals(this.atp, other.atp)
                && java.util.Objects.equals(this.adw, other.adw)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.atp == null ? 43 : this.atp.hashCode());
        result = (result * PRIME) + (this.adw == null ? 43 : this.adw.hashCode());
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
