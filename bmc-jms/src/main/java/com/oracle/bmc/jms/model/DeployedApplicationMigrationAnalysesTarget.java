/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The target describes the input data for deployed Java migration analyses. A target contains a
 * managed instance, deployed application installation Key, sourceJdkVersion, targetJdkVersion and
 * optional excludePackagePrefixes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeployedApplicationMigrationAnalysesTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeployedApplicationMigrationAnalysesTarget
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceId",
        "deployedApplicationInstallationKey",
        "sourceJdkVersion",
        "targetJdkVersion",
        "excludePackagePrefixes"
    })
    public DeployedApplicationMigrationAnalysesTarget(
            String managedInstanceId,
            String deployedApplicationInstallationKey,
            String sourceJdkVersion,
            String targetJdkVersion,
            java.util.List<String> excludePackagePrefixes) {
        super();
        this.managedInstanceId = managedInstanceId;
        this.deployedApplicationInstallationKey = deployedApplicationInstallationKey;
        this.sourceJdkVersion = sourceJdkVersion;
        this.targetJdkVersion = targetJdkVersion;
        this.excludePackagePrefixes = excludePackagePrefixes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the managed instance that hosts the application for which the Java migration
         * analyses was performed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The OCID of the managed instance that hosts the application for which the Java migration
         * analyses was performed.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * The unique key that identifies the deployed application's installation path that is to be
         * used for the Java migration analyses.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationInstallationKey")
        private String deployedApplicationInstallationKey;

        /**
         * The unique key that identifies the deployed application's installation path that is to be
         * used for the Java migration analyses.
         *
         * @param deployedApplicationInstallationKey the value to set
         * @return this builder
         */
        public Builder deployedApplicationInstallationKey(
                String deployedApplicationInstallationKey) {
            this.deployedApplicationInstallationKey = deployedApplicationInstallationKey;
            this.__explicitlySet__.add("deployedApplicationInstallationKey");
            return this;
        }
        /** The JDK version the application is currently running on. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceJdkVersion")
        private String sourceJdkVersion;

        /**
         * The JDK version the application is currently running on.
         *
         * @param sourceJdkVersion the value to set
         * @return this builder
         */
        public Builder sourceJdkVersion(String sourceJdkVersion) {
            this.sourceJdkVersion = sourceJdkVersion;
            this.__explicitlySet__.add("sourceJdkVersion");
            return this;
        }
        /**
         * The JDK version against which the migration analyses was performed to identify effort
         * required to move from source JDK.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
        private String targetJdkVersion;

        /**
         * The JDK version against which the migration analyses was performed to identify effort
         * required to move from source JDK.
         *
         * @param targetJdkVersion the value to set
         * @return this builder
         */
        public Builder targetJdkVersion(String targetJdkVersion) {
            this.targetJdkVersion = targetJdkVersion;
            this.__explicitlySet__.add("targetJdkVersion");
            return this;
        }
        /** Excludes the packages that starts with the prefix from the migration analyses result. */
        @com.fasterxml.jackson.annotation.JsonProperty("excludePackagePrefixes")
        private java.util.List<String> excludePackagePrefixes;

        /**
         * Excludes the packages that starts with the prefix from the migration analyses result.
         *
         * @param excludePackagePrefixes the value to set
         * @return this builder
         */
        public Builder excludePackagePrefixes(java.util.List<String> excludePackagePrefixes) {
            this.excludePackagePrefixes = excludePackagePrefixes;
            this.__explicitlySet__.add("excludePackagePrefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeployedApplicationMigrationAnalysesTarget build() {
            DeployedApplicationMigrationAnalysesTarget model =
                    new DeployedApplicationMigrationAnalysesTarget(
                            this.managedInstanceId,
                            this.deployedApplicationInstallationKey,
                            this.sourceJdkVersion,
                            this.targetJdkVersion,
                            this.excludePackagePrefixes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeployedApplicationMigrationAnalysesTarget model) {
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("deployedApplicationInstallationKey")) {
                this.deployedApplicationInstallationKey(
                        model.getDeployedApplicationInstallationKey());
            }
            if (model.wasPropertyExplicitlySet("sourceJdkVersion")) {
                this.sourceJdkVersion(model.getSourceJdkVersion());
            }
            if (model.wasPropertyExplicitlySet("targetJdkVersion")) {
                this.targetJdkVersion(model.getTargetJdkVersion());
            }
            if (model.wasPropertyExplicitlySet("excludePackagePrefixes")) {
                this.excludePackagePrefixes(model.getExcludePackagePrefixes());
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

    /**
     * The OCID of the managed instance that hosts the application for which the Java migration
     * analyses was performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The OCID of the managed instance that hosts the application for which the Java migration
     * analyses was performed.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The unique key that identifies the deployed application's installation path that is to be
     * used for the Java migration analyses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationInstallationKey")
    private final String deployedApplicationInstallationKey;

    /**
     * The unique key that identifies the deployed application's installation path that is to be
     * used for the Java migration analyses.
     *
     * @return the value
     */
    public String getDeployedApplicationInstallationKey() {
        return deployedApplicationInstallationKey;
    }

    /** The JDK version the application is currently running on. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceJdkVersion")
    private final String sourceJdkVersion;

    /**
     * The JDK version the application is currently running on.
     *
     * @return the value
     */
    public String getSourceJdkVersion() {
        return sourceJdkVersion;
    }

    /**
     * The JDK version against which the migration analyses was performed to identify effort
     * required to move from source JDK.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
    private final String targetJdkVersion;

    /**
     * The JDK version against which the migration analyses was performed to identify effort
     * required to move from source JDK.
     *
     * @return the value
     */
    public String getTargetJdkVersion() {
        return targetJdkVersion;
    }

    /** Excludes the packages that starts with the prefix from the migration analyses result. */
    @com.fasterxml.jackson.annotation.JsonProperty("excludePackagePrefixes")
    private final java.util.List<String> excludePackagePrefixes;

    /**
     * Excludes the packages that starts with the prefix from the migration analyses result.
     *
     * @return the value
     */
    public java.util.List<String> getExcludePackagePrefixes() {
        return excludePackagePrefixes;
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
        sb.append("DeployedApplicationMigrationAnalysesTarget(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", deployedApplicationInstallationKey=")
                .append(String.valueOf(this.deployedApplicationInstallationKey));
        sb.append(", sourceJdkVersion=").append(String.valueOf(this.sourceJdkVersion));
        sb.append(", targetJdkVersion=").append(String.valueOf(this.targetJdkVersion));
        sb.append(", excludePackagePrefixes=").append(String.valueOf(this.excludePackagePrefixes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployedApplicationMigrationAnalysesTarget)) {
            return false;
        }

        DeployedApplicationMigrationAnalysesTarget other =
                (DeployedApplicationMigrationAnalysesTarget) o;
        return java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(
                        this.deployedApplicationInstallationKey,
                        other.deployedApplicationInstallationKey)
                && java.util.Objects.equals(this.sourceJdkVersion, other.sourceJdkVersion)
                && java.util.Objects.equals(this.targetJdkVersion, other.targetJdkVersion)
                && java.util.Objects.equals(
                        this.excludePackagePrefixes, other.excludePackagePrefixes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.deployedApplicationInstallationKey == null
                                ? 43
                                : this.deployedApplicationInstallationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceJdkVersion == null ? 43 : this.sourceJdkVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetJdkVersion == null ? 43 : this.targetJdkVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.excludePackagePrefixes == null
                                ? 43
                                : this.excludePackagePrefixes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
