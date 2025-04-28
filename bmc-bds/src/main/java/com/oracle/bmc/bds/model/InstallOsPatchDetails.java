/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Os patch details for installing a os patches to a cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstallOsPatchDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstallOsPatchDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"osPatchVersion", "clusterAdminPassword", "patchingConfigs"})
    public InstallOsPatchDetails(
            String osPatchVersion, String clusterAdminPassword, PatchingConfigs patchingConfigs) {
        super();
        this.osPatchVersion = osPatchVersion;
        this.clusterAdminPassword = clusterAdminPassword;
        this.patchingConfigs = patchingConfigs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The target os patch version. */
        @com.fasterxml.jackson.annotation.JsonProperty("osPatchVersion")
        private String osPatchVersion;

        /**
         * The target os patch version.
         *
         * @param osPatchVersion the value to set
         * @return this builder
         */
        public Builder osPatchVersion(String osPatchVersion) {
            this.osPatchVersion = osPatchVersion;
            this.__explicitlySet__.add("osPatchVersion");
            return this;
        }
        /** Base-64 encoded password for the cluster admin user. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster admin user.
         *
         * @param clusterAdminPassword the value to set
         * @return this builder
         */
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchingConfigs")
        private PatchingConfigs patchingConfigs;

        public Builder patchingConfigs(PatchingConfigs patchingConfigs) {
            this.patchingConfigs = patchingConfigs;
            this.__explicitlySet__.add("patchingConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstallOsPatchDetails build() {
            InstallOsPatchDetails model =
                    new InstallOsPatchDetails(
                            this.osPatchVersion, this.clusterAdminPassword, this.patchingConfigs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallOsPatchDetails model) {
            if (model.wasPropertyExplicitlySet("osPatchVersion")) {
                this.osPatchVersion(model.getOsPatchVersion());
            }
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("patchingConfigs")) {
                this.patchingConfigs(model.getPatchingConfigs());
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

    /** The target os patch version. */
    @com.fasterxml.jackson.annotation.JsonProperty("osPatchVersion")
    private final String osPatchVersion;

    /**
     * The target os patch version.
     *
     * @return the value
     */
    public String getOsPatchVersion() {
        return osPatchVersion;
    }

    /** Base-64 encoded password for the cluster admin user. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster admin user.
     *
     * @return the value
     */
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchingConfigs")
    private final PatchingConfigs patchingConfigs;

    public PatchingConfigs getPatchingConfigs() {
        return patchingConfigs;
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
        sb.append("InstallOsPatchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("osPatchVersion=").append(String.valueOf(this.osPatchVersion));
        sb.append(", clusterAdminPassword=").append("<redacted>");
        sb.append(", patchingConfigs=").append(String.valueOf(this.patchingConfigs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallOsPatchDetails)) {
            return false;
        }

        InstallOsPatchDetails other = (InstallOsPatchDetails) o;
        return java.util.Objects.equals(this.osPatchVersion, other.osPatchVersion)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.patchingConfigs, other.patchingConfigs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.osPatchVersion == null ? 43 : this.osPatchVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.patchingConfigs == null ? 43 : this.patchingConfigs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
