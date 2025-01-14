/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Oracle APEX Application Development is a low-code development platform that enables you to build
 * scalable, secure enterprise apps, with world-class features. Autonomous Database with the APEX
 * workload type is optimized to support APEX development. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutonomousDatabaseApex.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousDatabaseApex
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"apexVersion", "ordsVersion"})
    public AutonomousDatabaseApex(String apexVersion, String ordsVersion) {
        super();
        this.apexVersion = apexVersion;
        this.ordsVersion = ordsVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Oracle APEX Application Development version. */
        @com.fasterxml.jackson.annotation.JsonProperty("apexVersion")
        private String apexVersion;

        /**
         * The Oracle APEX Application Development version.
         *
         * @param apexVersion the value to set
         * @return this builder
         */
        public Builder apexVersion(String apexVersion) {
            this.apexVersion = apexVersion;
            this.__explicitlySet__.add("apexVersion");
            return this;
        }
        /** The Oracle REST Data Services (ORDS) version. */
        @com.fasterxml.jackson.annotation.JsonProperty("ordsVersion")
        private String ordsVersion;

        /**
         * The Oracle REST Data Services (ORDS) version.
         *
         * @param ordsVersion the value to set
         * @return this builder
         */
        public Builder ordsVersion(String ordsVersion) {
            this.ordsVersion = ordsVersion;
            this.__explicitlySet__.add("ordsVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseApex build() {
            AutonomousDatabaseApex model =
                    new AutonomousDatabaseApex(this.apexVersion, this.ordsVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseApex model) {
            if (model.wasPropertyExplicitlySet("apexVersion")) {
                this.apexVersion(model.getApexVersion());
            }
            if (model.wasPropertyExplicitlySet("ordsVersion")) {
                this.ordsVersion(model.getOrdsVersion());
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

    /** The Oracle APEX Application Development version. */
    @com.fasterxml.jackson.annotation.JsonProperty("apexVersion")
    private final String apexVersion;

    /**
     * The Oracle APEX Application Development version.
     *
     * @return the value
     */
    public String getApexVersion() {
        return apexVersion;
    }

    /** The Oracle REST Data Services (ORDS) version. */
    @com.fasterxml.jackson.annotation.JsonProperty("ordsVersion")
    private final String ordsVersion;

    /**
     * The Oracle REST Data Services (ORDS) version.
     *
     * @return the value
     */
    public String getOrdsVersion() {
        return ordsVersion;
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
        sb.append("AutonomousDatabaseApex(");
        sb.append("super=").append(super.toString());
        sb.append("apexVersion=").append(String.valueOf(this.apexVersion));
        sb.append(", ordsVersion=").append(String.valueOf(this.ordsVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseApex)) {
            return false;
        }

        AutonomousDatabaseApex other = (AutonomousDatabaseApex) o;
        return java.util.Objects.equals(this.apexVersion, other.apexVersion)
                && java.util.Objects.equals(this.ordsVersion, other.ordsVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.apexVersion == null ? 43 : this.apexVersion.hashCode());
        result = (result * PRIME) + (this.ordsVersion == null ? 43 : this.ordsVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
