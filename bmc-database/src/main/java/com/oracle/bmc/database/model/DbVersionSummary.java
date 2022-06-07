/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Oracle Database software version.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbVersionSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "isLatestForMajorVersion",
        "supportsPdb",
        "isPreviewDbVersion",
        "isUpgradeSupported"
    })
    public DbVersionSummary(
            String version,
            Boolean isLatestForMajorVersion,
            Boolean supportsPdb,
            Boolean isPreviewDbVersion,
            Boolean isUpgradeSupported) {
        super();
        this.version = version;
        this.isLatestForMajorVersion = isLatestForMajorVersion;
        this.supportsPdb = supportsPdb;
        this.isPreviewDbVersion = isPreviewDbVersion;
        this.isUpgradeSupported = isUpgradeSupported;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLatestForMajorVersion")
        private Boolean isLatestForMajorVersion;

        public Builder isLatestForMajorVersion(Boolean isLatestForMajorVersion) {
            this.isLatestForMajorVersion = isLatestForMajorVersion;
            this.__explicitlySet__.add("isLatestForMajorVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportsPdb")
        private Boolean supportsPdb;

        public Builder supportsPdb(Boolean supportsPdb) {
            this.supportsPdb = supportsPdb;
            this.__explicitlySet__.add("supportsPdb");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPreviewDbVersion")
        private Boolean isPreviewDbVersion;

        public Builder isPreviewDbVersion(Boolean isPreviewDbVersion) {
            this.isPreviewDbVersion = isPreviewDbVersion;
            this.__explicitlySet__.add("isPreviewDbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUpgradeSupported")
        private Boolean isUpgradeSupported;

        public Builder isUpgradeSupported(Boolean isUpgradeSupported) {
            this.isUpgradeSupported = isUpgradeSupported;
            this.__explicitlySet__.add("isUpgradeSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbVersionSummary build() {
            DbVersionSummary __instance__ =
                    new DbVersionSummary(
                            version,
                            isLatestForMajorVersion,
                            supportsPdb,
                            isPreviewDbVersion,
                            isUpgradeSupported);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbVersionSummary o) {
            Builder copiedBuilder =
                    version(o.getVersion())
                            .isLatestForMajorVersion(o.getIsLatestForMajorVersion())
                            .supportsPdb(o.getSupportsPdb())
                            .isPreviewDbVersion(o.getIsPreviewDbVersion())
                            .isUpgradeSupported(o.getIsUpgradeSupported());

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
     * A valid Oracle Database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    public String getVersion() {
        return version;
    }

    /**
     * True if this version of the Oracle Database software is the latest version for a release.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLatestForMajorVersion")
    private final Boolean isLatestForMajorVersion;

    public Boolean getIsLatestForMajorVersion() {
        return isLatestForMajorVersion;
    }

    /**
     * True if this version of the Oracle Database software supports pluggable databases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportsPdb")
    private final Boolean supportsPdb;

    public Boolean getSupportsPdb() {
        return supportsPdb;
    }

    /**
     * True if this version of the Oracle Database software is the preview version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreviewDbVersion")
    private final Boolean isPreviewDbVersion;

    public Boolean getIsPreviewDbVersion() {
        return isPreviewDbVersion;
    }

    /**
     * True if this version of the Oracle Database software is supported for Upgrade.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUpgradeSupported")
    private final Boolean isUpgradeSupported;

    public Boolean getIsUpgradeSupported() {
        return isUpgradeSupported;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbVersionSummary(");
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", isLatestForMajorVersion=")
                .append(String.valueOf(this.isLatestForMajorVersion));
        sb.append(", supportsPdb=").append(String.valueOf(this.supportsPdb));
        sb.append(", isPreviewDbVersion=").append(String.valueOf(this.isPreviewDbVersion));
        sb.append(", isUpgradeSupported=").append(String.valueOf(this.isUpgradeSupported));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbVersionSummary)) {
            return false;
        }

        DbVersionSummary other = (DbVersionSummary) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.isLatestForMajorVersion, other.isLatestForMajorVersion)
                && java.util.Objects.equals(this.supportsPdb, other.supportsPdb)
                && java.util.Objects.equals(this.isPreviewDbVersion, other.isPreviewDbVersion)
                && java.util.Objects.equals(this.isUpgradeSupported, other.isUpgradeSupported)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.isLatestForMajorVersion == null
                                ? 43
                                : this.isLatestForMajorVersion.hashCode());
        result = (result * PRIME) + (this.supportsPdb == null ? 43 : this.supportsPdb.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreviewDbVersion == null
                                ? 43
                                : this.isPreviewDbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isUpgradeSupported == null
                                ? 43
                                : this.isUpgradeSupported.hashCode());
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
