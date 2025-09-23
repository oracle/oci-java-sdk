/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Information about a container in the cluster. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ContainerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "containerKey",
        "managedInstanceId",
        "displayName",
        "imageName",
        "namespace",
        "nodeName",
        "podName",
        "applicationKey",
        "applicationName",
        "jreKey",
        "javaVersion",
        "jreSecurityStatus",
        "timeStarted"
    })
    public ContainerSummary(
            String containerKey,
            String managedInstanceId,
            String displayName,
            String imageName,
            String namespace,
            String nodeName,
            String podName,
            String applicationKey,
            String applicationName,
            String jreKey,
            String javaVersion,
            JreSecurityStatus jreSecurityStatus,
            java.util.Date timeStarted) {
        super();
        this.containerKey = containerKey;
        this.managedInstanceId = managedInstanceId;
        this.displayName = displayName;
        this.imageName = imageName;
        this.namespace = namespace;
        this.nodeName = nodeName;
        this.podName = podName;
        this.applicationKey = applicationKey;
        this.applicationName = applicationName;
        this.jreKey = jreKey;
        this.javaVersion = javaVersion;
        this.jreSecurityStatus = jreSecurityStatus;
        this.timeStarted = timeStarted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerKey")
        private String containerKey;

        /**
         * Unique identifier for the container.
         *
         * @param containerKey the value to set
         * @return this builder
         */
        public Builder containerKey(String containerKey) {
            this.containerKey = containerKey;
            this.__explicitlySet__.add("containerKey");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated managed instance of type OCMA.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated managed instance of type OCMA.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /** The name of the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the container.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The container image name. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageName")
        private String imageName;

        /**
         * The container image name.
         *
         * @param imageName the value to set
         * @return this builder
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            this.__explicitlySet__.add("imageName");
            return this;
        }
        /** The namespace of the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace of the container.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The name of the node associated with the pod running this container. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
        private String nodeName;

        /**
         * The name of the node associated with the pod running this container.
         *
         * @param nodeName the value to set
         * @return this builder
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            this.__explicitlySet__.add("nodeName");
            return this;
        }
        /** The name of the pod running this container. */
        @com.fasterxml.jackson.annotation.JsonProperty("podName")
        private String podName;

        /**
         * The name of the pod running this container.
         *
         * @param podName the value to set
         * @return this builder
         */
        public Builder podName(String podName) {
            this.podName = podName;
            this.__explicitlySet__.add("podName");
            return this;
        }
        /** Unique key that identifies the application running in the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
        private String applicationKey;

        /**
         * Unique key that identifies the application running in the container.
         *
         * @param applicationKey the value to set
         * @return this builder
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            this.__explicitlySet__.add("applicationKey");
            return this;
        }
        /** The name of the application running in the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * The name of the application running in the container.
         *
         * @param applicationName the value to set
         * @return this builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }
        /**
         * Unique key that identifies the Java runtime used to run the application in the container.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jreKey")
        private String jreKey;

        /**
         * Unique key that identifies the Java runtime used to run the application in the container.
         *
         * @param jreKey the value to set
         * @return this builder
         */
        public Builder jreKey(String jreKey) {
            this.jreKey = jreKey;
            this.__explicitlySet__.add("jreKey");
            return this;
        }
        /** The Java runtime used to run the application in the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("javaVersion")
        private String javaVersion;

        /**
         * The Java runtime used to run the application in the container.
         *
         * @param javaVersion the value to set
         * @return this builder
         */
        public Builder javaVersion(String javaVersion) {
            this.javaVersion = javaVersion;
            this.__explicitlySet__.add("javaVersion");
            return this;
        }
        /** The security status of the Java runtime used to run the application in the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("jreSecurityStatus")
        private JreSecurityStatus jreSecurityStatus;

        /**
         * The security status of the Java runtime used to run the application in the container.
         *
         * @param jreSecurityStatus the value to set
         * @return this builder
         */
        public Builder jreSecurityStatus(JreSecurityStatus jreSecurityStatus) {
            this.jreSecurityStatus = jreSecurityStatus;
            this.__explicitlySet__.add("jreSecurityStatus");
            return this;
        }
        /** The start time of the container. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The start time of the container.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerSummary build() {
            ContainerSummary model =
                    new ContainerSummary(
                            this.containerKey,
                            this.managedInstanceId,
                            this.displayName,
                            this.imageName,
                            this.namespace,
                            this.nodeName,
                            this.podName,
                            this.applicationKey,
                            this.applicationName,
                            this.jreKey,
                            this.javaVersion,
                            this.jreSecurityStatus,
                            this.timeStarted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerSummary model) {
            if (model.wasPropertyExplicitlySet("containerKey")) {
                this.containerKey(model.getContainerKey());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("imageName")) {
                this.imageName(model.getImageName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("nodeName")) {
                this.nodeName(model.getNodeName());
            }
            if (model.wasPropertyExplicitlySet("podName")) {
                this.podName(model.getPodName());
            }
            if (model.wasPropertyExplicitlySet("applicationKey")) {
                this.applicationKey(model.getApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("jreKey")) {
                this.jreKey(model.getJreKey());
            }
            if (model.wasPropertyExplicitlySet("javaVersion")) {
                this.javaVersion(model.getJavaVersion());
            }
            if (model.wasPropertyExplicitlySet("jreSecurityStatus")) {
                this.jreSecurityStatus(model.getJreSecurityStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
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

    /** Unique identifier for the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerKey")
    private final String containerKey;

    /**
     * Unique identifier for the container.
     *
     * @return the value
     */
    public String getContainerKey() {
        return containerKey;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated managed instance of type OCMA.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated managed instance of type OCMA.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /** The name of the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the container.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The container image name. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageName")
    private final String imageName;

    /**
     * The container image name.
     *
     * @return the value
     */
    public String getImageName() {
        return imageName;
    }

    /** The namespace of the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace of the container.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The name of the node associated with the pod running this container. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    private final String nodeName;

    /**
     * The name of the node associated with the pod running this container.
     *
     * @return the value
     */
    public String getNodeName() {
        return nodeName;
    }

    /** The name of the pod running this container. */
    @com.fasterxml.jackson.annotation.JsonProperty("podName")
    private final String podName;

    /**
     * The name of the pod running this container.
     *
     * @return the value
     */
    public String getPodName() {
        return podName;
    }

    /** Unique key that identifies the application running in the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
    private final String applicationKey;

    /**
     * Unique key that identifies the application running in the container.
     *
     * @return the value
     */
    public String getApplicationKey() {
        return applicationKey;
    }

    /** The name of the application running in the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * The name of the application running in the container.
     *
     * @return the value
     */
    public String getApplicationName() {
        return applicationName;
    }

    /** Unique key that identifies the Java runtime used to run the application in the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("jreKey")
    private final String jreKey;

    /**
     * Unique key that identifies the Java runtime used to run the application in the container.
     *
     * @return the value
     */
    public String getJreKey() {
        return jreKey;
    }

    /** The Java runtime used to run the application in the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("javaVersion")
    private final String javaVersion;

    /**
     * The Java runtime used to run the application in the container.
     *
     * @return the value
     */
    public String getJavaVersion() {
        return javaVersion;
    }

    /** The security status of the Java runtime used to run the application in the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("jreSecurityStatus")
    private final JreSecurityStatus jreSecurityStatus;

    /**
     * The security status of the Java runtime used to run the application in the container.
     *
     * @return the value
     */
    public JreSecurityStatus getJreSecurityStatus() {
        return jreSecurityStatus;
    }

    /** The start time of the container. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The start time of the container.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
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
        sb.append("ContainerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("containerKey=").append(String.valueOf(this.containerKey));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", imageName=").append(String.valueOf(this.imageName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", nodeName=").append(String.valueOf(this.nodeName));
        sb.append(", podName=").append(String.valueOf(this.podName));
        sb.append(", applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", jreKey=").append(String.valueOf(this.jreKey));
        sb.append(", javaVersion=").append(String.valueOf(this.javaVersion));
        sb.append(", jreSecurityStatus=").append(String.valueOf(this.jreSecurityStatus));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerSummary)) {
            return false;
        }

        ContainerSummary other = (ContainerSummary) o;
        return java.util.Objects.equals(this.containerKey, other.containerKey)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.imageName, other.imageName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.nodeName, other.nodeName)
                && java.util.Objects.equals(this.podName, other.podName)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.jreKey, other.jreKey)
                && java.util.Objects.equals(this.javaVersion, other.javaVersion)
                && java.util.Objects.equals(this.jreSecurityStatus, other.jreSecurityStatus)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.containerKey == null ? 43 : this.containerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.imageName == null ? 43 : this.imageName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.nodeName == null ? 43 : this.nodeName.hashCode());
        result = (result * PRIME) + (this.podName == null ? 43 : this.podName.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result = (result * PRIME) + (this.jreKey == null ? 43 : this.jreKey.hashCode());
        result = (result * PRIME) + (this.javaVersion == null ? 43 : this.javaVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.jreSecurityStatus == null ? 43 : this.jreSecurityStatus.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
