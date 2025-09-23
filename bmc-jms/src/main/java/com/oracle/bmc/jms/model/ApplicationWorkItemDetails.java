/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The work item details with JFR related information. <br>
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
        builder = ApplicationWorkItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApplicationWorkItemDetails extends WorkItemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workItemType")
        private WorkItemType workItemType;

        public Builder workItemType(WorkItemType workItemType) {
            this.workItemType = workItemType;
            this.__explicitlySet__.add("workItemType");
            return this;
        }
        /** The unique key of the application of the JFR. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
        private String applicationKey;

        /**
         * The unique key of the application of the JFR.
         *
         * @param applicationKey the value to set
         * @return this builder
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            this.__explicitlySet__.add("applicationKey");
            return this;
        }
        /** The unique key of the application installation of the JFR. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationKey")
        private String applicationInstallationKey;

        /**
         * The unique key of the application installation of the JFR.
         *
         * @param applicationInstallationKey the value to set
         * @return this builder
         */
        public Builder applicationInstallationKey(String applicationInstallationKey) {
            this.applicationInstallationKey = applicationInstallationKey;
            this.__explicitlySet__.add("applicationInstallationKey");
            return this;
        }
        /** The application name. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * The application name.
         *
         * @param applicationName the value to set
         * @return this builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }
        /** The full path on which application installation was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationPath")
        private String applicationInstallationPath;

        /**
         * The full path on which application installation was detected.
         *
         * @param applicationInstallationPath the value to set
         * @return this builder
         */
        public Builder applicationInstallationPath(String applicationInstallationPath) {
            this.applicationInstallationPath = applicationInstallationPath;
            this.__explicitlySet__.add("applicationInstallationPath");
            return this;
        }
        /** The Object Storage namespace of the JFR upload result. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace of the JFR upload result.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The Object Storage bucket name of the JFR upload result. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The Object Storage bucket name of the JFR upload result.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The Object Storage object name of the JFR upload result. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The Object Storage object name of the JFR upload result.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("containerInfo")
        private ContainerSummary containerInfo;

        public Builder containerInfo(ContainerSummary containerInfo) {
            this.containerInfo = containerInfo;
            this.__explicitlySet__.add("containerInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationWorkItemDetails build() {
            ApplicationWorkItemDetails model =
                    new ApplicationWorkItemDetails(
                            this.workItemType,
                            this.applicationKey,
                            this.applicationInstallationKey,
                            this.applicationName,
                            this.applicationInstallationPath,
                            this.namespace,
                            this.bucketName,
                            this.objectName,
                            this.containerInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationWorkItemDetails model) {
            if (model.wasPropertyExplicitlySet("workItemType")) {
                this.workItemType(model.getWorkItemType());
            }
            if (model.wasPropertyExplicitlySet("applicationKey")) {
                this.applicationKey(model.getApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("applicationInstallationKey")) {
                this.applicationInstallationKey(model.getApplicationInstallationKey());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("applicationInstallationPath")) {
                this.applicationInstallationPath(model.getApplicationInstallationPath());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("containerInfo")) {
                this.containerInfo(model.getContainerInfo());
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
    public ApplicationWorkItemDetails(
            WorkItemType workItemType,
            String applicationKey,
            String applicationInstallationKey,
            String applicationName,
            String applicationInstallationPath,
            String namespace,
            String bucketName,
            String objectName,
            ContainerSummary containerInfo) {
        super(workItemType);
        this.applicationKey = applicationKey;
        this.applicationInstallationKey = applicationInstallationKey;
        this.applicationName = applicationName;
        this.applicationInstallationPath = applicationInstallationPath;
        this.namespace = namespace;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.containerInfo = containerInfo;
    }

    /** The unique key of the application of the JFR. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
    private final String applicationKey;

    /**
     * The unique key of the application of the JFR.
     *
     * @return the value
     */
    public String getApplicationKey() {
        return applicationKey;
    }

    /** The unique key of the application installation of the JFR. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationKey")
    private final String applicationInstallationKey;

    /**
     * The unique key of the application installation of the JFR.
     *
     * @return the value
     */
    public String getApplicationInstallationKey() {
        return applicationInstallationKey;
    }

    /** The application name. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * The application name.
     *
     * @return the value
     */
    public String getApplicationName() {
        return applicationName;
    }

    /** The full path on which application installation was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationPath")
    private final String applicationInstallationPath;

    /**
     * The full path on which application installation was detected.
     *
     * @return the value
     */
    public String getApplicationInstallationPath() {
        return applicationInstallationPath;
    }

    /** The Object Storage namespace of the JFR upload result. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace of the JFR upload result.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The Object Storage bucket name of the JFR upload result. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The Object Storage bucket name of the JFR upload result.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The Object Storage object name of the JFR upload result. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The Object Storage object name of the JFR upload result.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("containerInfo")
    private final ContainerSummary containerInfo;

    public ContainerSummary getContainerInfo() {
        return containerInfo;
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
        sb.append("ApplicationWorkItemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(", applicationInstallationKey=")
                .append(String.valueOf(this.applicationInstallationKey));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", applicationInstallationPath=")
                .append(String.valueOf(this.applicationInstallationPath));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", containerInfo=").append(String.valueOf(this.containerInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationWorkItemDetails)) {
            return false;
        }

        ApplicationWorkItemDetails other = (ApplicationWorkItemDetails) o;
        return java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(
                        this.applicationInstallationKey, other.applicationInstallationKey)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(
                        this.applicationInstallationPath, other.applicationInstallationPath)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.containerInfo, other.containerInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationInstallationKey == null
                                ? 43
                                : this.applicationInstallationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationInstallationPath == null
                                ? 43
                                : this.applicationInstallationPath.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.containerInfo == null ? 43 : this.containerInfo.hashCode());
        return result;
    }
}
