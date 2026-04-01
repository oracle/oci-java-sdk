/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Type containing information related to virtual machines on a particular host.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmVmSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmVmSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"active", "migrating", "total"})
    public OlvmVmSummary(Integer active, Integer migrating, Integer total) {
        super();
        this.active = active;
        this.migrating = migrating;
        this.total = total;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of virtual machines active on the host.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        private Integer active;

        /**
         * The number of virtual machines active on the host.
         * @param active the value to set
         * @return this builder
         **/
        public Builder active(Integer active) {
            this.active = active;
            this.__explicitlySet__.add("active");
            return this;
        }
        /**
         * The number of virtual machines migrating to or from the host.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("migrating")
        private Integer migrating;

        /**
         * The number of virtual machines migrating to or from the host.
         * @param migrating the value to set
         * @return this builder
         **/
        public Builder migrating(Integer migrating) {
            this.migrating = migrating;
            this.__explicitlySet__.add("migrating");
            return this;
        }
        /**
         * The number of virtual machines present on the host.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("total")
        private Integer total;

        /**
         * The number of virtual machines present on the host.
         * @param total the value to set
         * @return this builder
         **/
        public Builder total(Integer total) {
            this.total = total;
            this.__explicitlySet__.add("total");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmVmSummary build() {
            OlvmVmSummary model = new OlvmVmSummary(this.active, this.migrating, this.total);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmVmSummary model) {
            if (model.wasPropertyExplicitlySet("active")) {
                this.active(model.getActive());
            }
            if (model.wasPropertyExplicitlySet("migrating")) {
                this.migrating(model.getMigrating());
            }
            if (model.wasPropertyExplicitlySet("total")) {
                this.total(model.getTotal());
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
     * The number of virtual machines active on the host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    private final Integer active;

    /**
     * The number of virtual machines active on the host.
     * @return the value
     **/
    public Integer getActive() {
        return active;
    }

    /**
     * The number of virtual machines migrating to or from the host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("migrating")
    private final Integer migrating;

    /**
     * The number of virtual machines migrating to or from the host.
     * @return the value
     **/
    public Integer getMigrating() {
        return migrating;
    }

    /**
     * The number of virtual machines present on the host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    private final Integer total;

    /**
     * The number of virtual machines present on the host.
     * @return the value
     **/
    public Integer getTotal() {
        return total;
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
        sb.append("OlvmVmSummary(");
        sb.append("super=").append(super.toString());
        sb.append("active=").append(String.valueOf(this.active));
        sb.append(", migrating=").append(String.valueOf(this.migrating));
        sb.append(", total=").append(String.valueOf(this.total));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmVmSummary)) {
            return false;
        }

        OlvmVmSummary other = (OlvmVmSummary) o;
        return java.util.Objects.equals(this.active, other.active)
                && java.util.Objects.equals(this.migrating, other.migrating)
                && java.util.Objects.equals(this.total, other.total)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.active == null ? 43 : this.active.hashCode());
        result = (result * PRIME) + (this.migrating == null ? 43 : this.migrating.hashCode());
        result = (result * PRIME) + (this.total == null ? 43 : this.total.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
