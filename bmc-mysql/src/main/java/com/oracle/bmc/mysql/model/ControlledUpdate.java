/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The details of the last successfully processed controlled update action.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ControlledUpdate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ControlledUpdate extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetMysqlVersion", "targetDbInstances"})
    public ControlledUpdate(
            String targetMysqlVersion, ControlledUpdateTargetDbInstances targetDbInstances) {
        super();
        this.targetMysqlVersion = targetMysqlVersion;
        this.targetDbInstances = targetDbInstances;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The MySQL version to be applied to the selected instances.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetMysqlVersion")
        private String targetMysqlVersion;

        /**
         * The MySQL version to be applied to the selected instances.
         * @param targetMysqlVersion the value to set
         * @return this builder
         **/
        public Builder targetMysqlVersion(String targetMysqlVersion) {
            this.targetMysqlVersion = targetMysqlVersion;
            this.__explicitlySet__.add("targetMysqlVersion");
            return this;
        }
        /**
         * Defines the MySQL instances to be operated during a controlled update.
         *  - ALL_BUT_PRIMARY: Update all MySQL instances in a highly available DB System except the primary group member,
         *    without triggering a controlled failover.
         *  - PRIMARY_ONLY: Update the primary group member in a highly available DB System
         *    after a controlled failover (downtime is expected). This operation requires that the other
         *    MySQL instances have been previously updated using the ALL_BUT_PRIMARY option.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetDbInstances")
        private ControlledUpdateTargetDbInstances targetDbInstances;

        /**
         * Defines the MySQL instances to be operated during a controlled update.
         *  - ALL_BUT_PRIMARY: Update all MySQL instances in a highly available DB System except the primary group member,
         *    without triggering a controlled failover.
         *  - PRIMARY_ONLY: Update the primary group member in a highly available DB System
         *    after a controlled failover (downtime is expected). This operation requires that the other
         *    MySQL instances have been previously updated using the ALL_BUT_PRIMARY option.
         *
         * @param targetDbInstances the value to set
         * @return this builder
         **/
        public Builder targetDbInstances(ControlledUpdateTargetDbInstances targetDbInstances) {
            this.targetDbInstances = targetDbInstances;
            this.__explicitlySet__.add("targetDbInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ControlledUpdate build() {
            ControlledUpdate model =
                    new ControlledUpdate(this.targetMysqlVersion, this.targetDbInstances);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ControlledUpdate model) {
            if (model.wasPropertyExplicitlySet("targetMysqlVersion")) {
                this.targetMysqlVersion(model.getTargetMysqlVersion());
            }
            if (model.wasPropertyExplicitlySet("targetDbInstances")) {
                this.targetDbInstances(model.getTargetDbInstances());
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
     * The MySQL version to be applied to the selected instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetMysqlVersion")
    private final String targetMysqlVersion;

    /**
     * The MySQL version to be applied to the selected instances.
     * @return the value
     **/
    public String getTargetMysqlVersion() {
        return targetMysqlVersion;
    }

    /**
     * Defines the MySQL instances to be operated during a controlled update.
     *  - ALL_BUT_PRIMARY: Update all MySQL instances in a highly available DB System except the primary group member,
     *    without triggering a controlled failover.
     *  - PRIMARY_ONLY: Update the primary group member in a highly available DB System
     *    after a controlled failover (downtime is expected). This operation requires that the other
     *    MySQL instances have been previously updated using the ALL_BUT_PRIMARY option.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDbInstances")
    private final ControlledUpdateTargetDbInstances targetDbInstances;

    /**
     * Defines the MySQL instances to be operated during a controlled update.
     *  - ALL_BUT_PRIMARY: Update all MySQL instances in a highly available DB System except the primary group member,
     *    without triggering a controlled failover.
     *  - PRIMARY_ONLY: Update the primary group member in a highly available DB System
     *    after a controlled failover (downtime is expected). This operation requires that the other
     *    MySQL instances have been previously updated using the ALL_BUT_PRIMARY option.
     *
     * @return the value
     **/
    public ControlledUpdateTargetDbInstances getTargetDbInstances() {
        return targetDbInstances;
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
        sb.append("ControlledUpdate(");
        sb.append("super=").append(super.toString());
        sb.append("targetMysqlVersion=").append(String.valueOf(this.targetMysqlVersion));
        sb.append(", targetDbInstances=").append(String.valueOf(this.targetDbInstances));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ControlledUpdate)) {
            return false;
        }

        ControlledUpdate other = (ControlledUpdate) o;
        return java.util.Objects.equals(this.targetMysqlVersion, other.targetMysqlVersion)
                && java.util.Objects.equals(this.targetDbInstances, other.targetDbInstances)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetMysqlVersion == null
                                ? 43
                                : this.targetMysqlVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDbInstances == null ? 43 : this.targetDbInstances.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
