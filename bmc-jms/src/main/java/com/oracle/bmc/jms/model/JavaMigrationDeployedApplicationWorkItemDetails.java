/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The java migration work item details for deployed application analysis related information. <br>
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
        builder = JavaMigrationDeployedApplicationWorkItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaMigrationDeployedApplicationWorkItemDetails extends WorkItemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workItemType")
        private WorkItemType workItemType;

        public Builder workItemType(WorkItemType workItemType) {
            this.workItemType = workItemType;
            this.__explicitlySet__.add("workItemType");
            return this;
        }
        /** The unique key of the deployed application of the java migration analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationKey")
        private String deployedApplicationKey;

        /**
         * The unique key of the deployed application of the java migration analysis.
         *
         * @param deployedApplicationKey the value to set
         * @return this builder
         */
        public Builder deployedApplicationKey(String deployedApplicationKey) {
            this.deployedApplicationKey = deployedApplicationKey;
            this.__explicitlySet__.add("deployedApplicationKey");
            return this;
        }
        /**
         * The unique key of the deployed application installation of the java migration analysis.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationInstallationKey")
        private String deployedApplicationInstallationKey;

        /**
         * The unique key of the deployed application installation of the java migration analysis.
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
        /** The deployed application name. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationName")
        private String deployedApplicationName;

        /**
         * The deployed application name.
         *
         * @param deployedApplicationName the value to set
         * @return this builder
         */
        public Builder deployedApplicationName(String deployedApplicationName) {
            this.deployedApplicationName = deployedApplicationName;
            this.__explicitlySet__.add("deployedApplicationName");
            return this;
        }
        /** The full path on which deployed application installation was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationInstallationPath")
        private String deployedApplicationInstallationPath;

        /**
         * The full path on which deployed application installation was detected.
         *
         * @param deployedApplicationInstallationPath the value to set
         * @return this builder
         */
        public Builder deployedApplicationInstallationPath(
                String deployedApplicationInstallationPath) {
            this.deployedApplicationInstallationPath = deployedApplicationInstallationPath;
            this.__explicitlySet__.add("deployedApplicationInstallationPath");
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

        public JavaMigrationDeployedApplicationWorkItemDetails build() {
            JavaMigrationDeployedApplicationWorkItemDetails model =
                    new JavaMigrationDeployedApplicationWorkItemDetails(
                            this.workItemType,
                            this.deployedApplicationKey,
                            this.deployedApplicationInstallationKey,
                            this.deployedApplicationName,
                            this.deployedApplicationInstallationPath,
                            this.targetJdkVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaMigrationDeployedApplicationWorkItemDetails model) {
            if (model.wasPropertyExplicitlySet("workItemType")) {
                this.workItemType(model.getWorkItemType());
            }
            if (model.wasPropertyExplicitlySet("deployedApplicationKey")) {
                this.deployedApplicationKey(model.getDeployedApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("deployedApplicationInstallationKey")) {
                this.deployedApplicationInstallationKey(
                        model.getDeployedApplicationInstallationKey());
            }
            if (model.wasPropertyExplicitlySet("deployedApplicationName")) {
                this.deployedApplicationName(model.getDeployedApplicationName());
            }
            if (model.wasPropertyExplicitlySet("deployedApplicationInstallationPath")) {
                this.deployedApplicationInstallationPath(
                        model.getDeployedApplicationInstallationPath());
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

    @Deprecated
    public JavaMigrationDeployedApplicationWorkItemDetails(
            WorkItemType workItemType,
            String deployedApplicationKey,
            String deployedApplicationInstallationKey,
            String deployedApplicationName,
            String deployedApplicationInstallationPath,
            String targetJdkVersion) {
        super(workItemType);
        this.deployedApplicationKey = deployedApplicationKey;
        this.deployedApplicationInstallationKey = deployedApplicationInstallationKey;
        this.deployedApplicationName = deployedApplicationName;
        this.deployedApplicationInstallationPath = deployedApplicationInstallationPath;
        this.targetJdkVersion = targetJdkVersion;
    }

    /** The unique key of the deployed application of the java migration analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationKey")
    private final String deployedApplicationKey;

    /**
     * The unique key of the deployed application of the java migration analysis.
     *
     * @return the value
     */
    public String getDeployedApplicationKey() {
        return deployedApplicationKey;
    }

    /** The unique key of the deployed application installation of the java migration analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationInstallationKey")
    private final String deployedApplicationInstallationKey;

    /**
     * The unique key of the deployed application installation of the java migration analysis.
     *
     * @return the value
     */
    public String getDeployedApplicationInstallationKey() {
        return deployedApplicationInstallationKey;
    }

    /** The deployed application name. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationName")
    private final String deployedApplicationName;

    /**
     * The deployed application name.
     *
     * @return the value
     */
    public String getDeployedApplicationName() {
        return deployedApplicationName;
    }

    /** The full path on which deployed application installation was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployedApplicationInstallationPath")
    private final String deployedApplicationInstallationPath;

    /**
     * The full path on which deployed application installation was detected.
     *
     * @return the value
     */
    public String getDeployedApplicationInstallationPath() {
        return deployedApplicationInstallationPath;
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
        sb.append("JavaMigrationDeployedApplicationWorkItemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", deployedApplicationKey=").append(String.valueOf(this.deployedApplicationKey));
        sb.append(", deployedApplicationInstallationKey=")
                .append(String.valueOf(this.deployedApplicationInstallationKey));
        sb.append(", deployedApplicationName=")
                .append(String.valueOf(this.deployedApplicationName));
        sb.append(", deployedApplicationInstallationPath=")
                .append(String.valueOf(this.deployedApplicationInstallationPath));
        sb.append(", targetJdkVersion=").append(String.valueOf(this.targetJdkVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaMigrationDeployedApplicationWorkItemDetails)) {
            return false;
        }

        JavaMigrationDeployedApplicationWorkItemDetails other =
                (JavaMigrationDeployedApplicationWorkItemDetails) o;
        return java.util.Objects.equals(this.deployedApplicationKey, other.deployedApplicationKey)
                && java.util.Objects.equals(
                        this.deployedApplicationInstallationKey,
                        other.deployedApplicationInstallationKey)
                && java.util.Objects.equals(
                        this.deployedApplicationName, other.deployedApplicationName)
                && java.util.Objects.equals(
                        this.deployedApplicationInstallationPath,
                        other.deployedApplicationInstallationPath)
                && java.util.Objects.equals(this.targetJdkVersion, other.targetJdkVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deployedApplicationKey == null
                                ? 43
                                : this.deployedApplicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.deployedApplicationInstallationKey == null
                                ? 43
                                : this.deployedApplicationInstallationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.deployedApplicationName == null
                                ? 43
                                : this.deployedApplicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.deployedApplicationInstallationPath == null
                                ? 43
                                : this.deployedApplicationInstallationPath.hashCode());
        result =
                (result * PRIME)
                        + (this.targetJdkVersion == null ? 43 : this.targetJdkVersion.hashCode());
        return result;
    }
}
