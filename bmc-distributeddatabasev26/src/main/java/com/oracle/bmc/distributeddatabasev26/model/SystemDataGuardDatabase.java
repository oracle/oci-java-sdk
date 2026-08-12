/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * System data guard shard database details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SystemDataGuardDatabase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SystemDataGuardDatabase
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"originalReplica", "dataGuardReplicas"})
    public SystemDataGuardDatabase(
            SystemDataGuardReplica originalReplica,
            java.util.List<SystemDataGuardReplica> dataGuardReplicas) {
        super();
        this.originalReplica = originalReplica;
        this.dataGuardReplicas = dataGuardReplicas;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("originalReplica")
        private SystemDataGuardReplica originalReplica;

        public Builder originalReplica(SystemDataGuardReplica originalReplica) {
            this.originalReplica = originalReplica;
            this.__explicitlySet__.add("originalReplica");
            return this;
        }
        /**
         * The system data guard replica details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataGuardReplicas")
        private java.util.List<SystemDataGuardReplica> dataGuardReplicas;

        /**
         * The system data guard replica details.
         * @param dataGuardReplicas the value to set
         * @return this builder
         **/
        public Builder dataGuardReplicas(java.util.List<SystemDataGuardReplica> dataGuardReplicas) {
            this.dataGuardReplicas = dataGuardReplicas;
            this.__explicitlySet__.add("dataGuardReplicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SystemDataGuardDatabase build() {
            SystemDataGuardDatabase model =
                    new SystemDataGuardDatabase(this.originalReplica, this.dataGuardReplicas);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SystemDataGuardDatabase model) {
            if (model.wasPropertyExplicitlySet("originalReplica")) {
                this.originalReplica(model.getOriginalReplica());
            }
            if (model.wasPropertyExplicitlySet("dataGuardReplicas")) {
                this.dataGuardReplicas(model.getDataGuardReplicas());
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

    @com.fasterxml.jackson.annotation.JsonProperty("originalReplica")
    private final SystemDataGuardReplica originalReplica;

    public SystemDataGuardReplica getOriginalReplica() {
        return originalReplica;
    }

    /**
     * The system data guard replica details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataGuardReplicas")
    private final java.util.List<SystemDataGuardReplica> dataGuardReplicas;

    /**
     * The system data guard replica details.
     * @return the value
     **/
    public java.util.List<SystemDataGuardReplica> getDataGuardReplicas() {
        return dataGuardReplicas;
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
        sb.append("SystemDataGuardDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("originalReplica=").append(String.valueOf(this.originalReplica));
        sb.append(", dataGuardReplicas=").append(String.valueOf(this.dataGuardReplicas));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SystemDataGuardDatabase)) {
            return false;
        }

        SystemDataGuardDatabase other = (SystemDataGuardDatabase) o;
        return java.util.Objects.equals(this.originalReplica, other.originalReplica)
                && java.util.Objects.equals(this.dataGuardReplicas, other.dataGuardReplicas)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.originalReplica == null ? 43 : this.originalReplica.hashCode());
        result =
                (result * PRIME)
                        + (this.dataGuardReplicas == null ? 43 : this.dataGuardReplicas.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
