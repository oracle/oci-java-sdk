/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The target describes the input data for Java migration analysis. A target contains a managed
 * instance, application Installation Key, sourceJdkVersion, and targetJdkVersion. <br>
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
        builder = JavaMigrationAnalysisTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaMigrationAnalysisTarget
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceId",
        "applicationInstallationKey",
        "sourceJdkVersion",
        "targetJdkVersion"
    })
    public JavaMigrationAnalysisTarget(
            String managedInstanceId,
            String applicationInstallationKey,
            String sourceJdkVersion,
            String targetJdkVersion) {
        super();
        this.managedInstanceId = managedInstanceId;
        this.applicationInstallationKey = applicationInstallationKey;
        this.sourceJdkVersion = sourceJdkVersion;
        this.targetJdkVersion = targetJdkVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the managed instance that hosts the application for which the Java migration
         * analysis was performed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The OCID of the managed instance that hosts the application for which the Java migration
         * analysis was performed.
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
         * The unique key that identifies the application's installation path that is to be used for
         * the Java migration analysis.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationKey")
        private String applicationInstallationKey;

        /**
         * The unique key that identifies the application's installation path that is to be used for
         * the Java migration analysis.
         *
         * @param applicationInstallationKey the value to set
         * @return this builder
         */
        public Builder applicationInstallationKey(String applicationInstallationKey) {
            this.applicationInstallationKey = applicationInstallationKey;
            this.__explicitlySet__.add("applicationInstallationKey");
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
         * The JDK version against which the migration analysis was performed to identify effort
         * required to move from source JDK.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
        private String targetJdkVersion;

        /**
         * The JDK version against which the migration analysis was performed to identify effort
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaMigrationAnalysisTarget build() {
            JavaMigrationAnalysisTarget model =
                    new JavaMigrationAnalysisTarget(
                            this.managedInstanceId,
                            this.applicationInstallationKey,
                            this.sourceJdkVersion,
                            this.targetJdkVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaMigrationAnalysisTarget model) {
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("applicationInstallationKey")) {
                this.applicationInstallationKey(model.getApplicationInstallationKey());
            }
            if (model.wasPropertyExplicitlySet("sourceJdkVersion")) {
                this.sourceJdkVersion(model.getSourceJdkVersion());
            }
            if (model.wasPropertyExplicitlySet("targetJdkVersion")) {
                this.targetJdkVersion(model.getTargetJdkVersion());
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
     * analysis was performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The OCID of the managed instance that hosts the application for which the Java migration
     * analysis was performed.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The unique key that identifies the application's installation path that is to be used for the
     * Java migration analysis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationKey")
    private final String applicationInstallationKey;

    /**
     * The unique key that identifies the application's installation path that is to be used for the
     * Java migration analysis.
     *
     * @return the value
     */
    public String getApplicationInstallationKey() {
        return applicationInstallationKey;
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
     * The JDK version against which the migration analysis was performed to identify effort
     * required to move from source JDK.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
    private final String targetJdkVersion;

    /**
     * The JDK version against which the migration analysis was performed to identify effort
     * required to move from source JDK.
     *
     * @return the value
     */
    public String getTargetJdkVersion() {
        return targetJdkVersion;
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
        sb.append("JavaMigrationAnalysisTarget(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", applicationInstallationKey=")
                .append(String.valueOf(this.applicationInstallationKey));
        sb.append(", sourceJdkVersion=").append(String.valueOf(this.sourceJdkVersion));
        sb.append(", targetJdkVersion=").append(String.valueOf(this.targetJdkVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaMigrationAnalysisTarget)) {
            return false;
        }

        JavaMigrationAnalysisTarget other = (JavaMigrationAnalysisTarget) o;
        return java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(
                        this.applicationInstallationKey, other.applicationInstallationKey)
                && java.util.Objects.equals(this.sourceJdkVersion, other.sourceJdkVersion)
                && java.util.Objects.equals(this.targetJdkVersion, other.targetJdkVersion)
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
                        + (this.applicationInstallationKey == null
                                ? 43
                                : this.applicationInstallationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceJdkVersion == null ? 43 : this.sourceJdkVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetJdkVersion == null ? 43 : this.targetJdkVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
