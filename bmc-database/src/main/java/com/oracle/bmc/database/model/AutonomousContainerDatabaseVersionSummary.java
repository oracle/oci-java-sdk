/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The supported Autonomous Database version. <br>
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
        builder = AutonomousContainerDatabaseVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousContainerDatabaseVersionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "details", "supportedApps"})
    public AutonomousContainerDatabaseVersionSummary(
            String version, String details, java.util.List<AppVersionSummary> supportedApps) {
        super();
        this.version = version;
        this.details = details;
        this.supportedApps = supportedApps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A valid Oracle Database version for provisioning an Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * A valid Oracle Database version for provisioning an Autonomous Container Database.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * A URL that points to a detailed description of the Autonomous Container Database version.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        /**
         * A URL that points to a detailed description of the Autonomous Container Database version.
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /** The list of applications supported for the given version. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedApps")
        private java.util.List<AppVersionSummary> supportedApps;

        /**
         * The list of applications supported for the given version.
         *
         * @param supportedApps the value to set
         * @return this builder
         */
        public Builder supportedApps(java.util.List<AppVersionSummary> supportedApps) {
            this.supportedApps = supportedApps;
            this.__explicitlySet__.add("supportedApps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousContainerDatabaseVersionSummary build() {
            AutonomousContainerDatabaseVersionSummary model =
                    new AutonomousContainerDatabaseVersionSummary(
                            this.version, this.details, this.supportedApps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousContainerDatabaseVersionSummary model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("supportedApps")) {
                this.supportedApps(model.getSupportedApps());
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

    /** A valid Oracle Database version for provisioning an Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * A valid Oracle Database version for provisioning an Autonomous Container Database.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** A URL that points to a detailed description of the Autonomous Container Database version. */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

    /**
     * A URL that points to a detailed description of the Autonomous Container Database version.
     *
     * @return the value
     */
    public String getDetails() {
        return details;
    }

    /** The list of applications supported for the given version. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedApps")
    private final java.util.List<AppVersionSummary> supportedApps;

    /**
     * The list of applications supported for the given version.
     *
     * @return the value
     */
    public java.util.List<AppVersionSummary> getSupportedApps() {
        return supportedApps;
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
        sb.append("AutonomousContainerDatabaseVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", supportedApps=").append(String.valueOf(this.supportedApps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousContainerDatabaseVersionSummary)) {
            return false;
        }

        AutonomousContainerDatabaseVersionSummary other =
                (AutonomousContainerDatabaseVersionSummary) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.supportedApps, other.supportedApps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedApps == null ? 43 : this.supportedApps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
