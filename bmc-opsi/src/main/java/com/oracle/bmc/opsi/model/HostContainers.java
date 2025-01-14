/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Host Containers details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostContainers.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostContainers extends HostConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Container Id (full) */
        @com.fasterxml.jackson.annotation.JsonProperty("containerId")
        private String containerId;

        /**
         * Container Id (full)
         *
         * @param containerId the value to set
         * @return this builder
         */
        public Builder containerId(String containerId) {
            this.containerId = containerId;
            this.__explicitlySet__.add("containerId");
            return this;
        }
        /** Container Name */
        @com.fasterxml.jackson.annotation.JsonProperty("containerName")
        private String containerName;

        /**
         * Container Name
         *
         * @param containerName the value to set
         * @return this builder
         */
        public Builder containerName(String containerName) {
            this.containerName = containerName;
            this.__explicitlySet__.add("containerName");
            return this;
        }
        /** Container Image */
        @com.fasterxml.jackson.annotation.JsonProperty("containerImage")
        private String containerImage;

        /**
         * Container Image
         *
         * @param containerImage the value to set
         * @return this builder
         */
        public Builder containerImage(String containerImage) {
            this.containerImage = containerImage;
            this.__explicitlySet__.add("containerImage");
            return this;
        }
        /** Container Image Tag (version) */
        @com.fasterxml.jackson.annotation.JsonProperty("containerImageTag")
        private String containerImageTag;

        /**
         * Container Image Tag (version)
         *
         * @param containerImageTag the value to set
         * @return this builder
         */
        public Builder containerImageTag(String containerImageTag) {
            this.containerImageTag = containerImageTag;
            this.__explicitlySet__.add("containerImageTag");
            return this;
        }
        /** Container Image Digest */
        @com.fasterxml.jackson.annotation.JsonProperty("containerImageDigest")
        private String containerImageDigest;

        /**
         * Container Image Digest
         *
         * @param containerImageDigest the value to set
         * @return this builder
         */
        public Builder containerImageDigest(String containerImageDigest) {
            this.containerImageDigest = containerImageDigest;
            this.__explicitlySet__.add("containerImageDigest");
            return this;
        }
        /** Container open ports */
        @com.fasterxml.jackson.annotation.JsonProperty("containerPorts")
        private String containerPorts;

        /**
         * Container open ports
         *
         * @param containerPorts the value to set
         * @return this builder
         */
        public Builder containerPorts(String containerPorts) {
            this.containerPorts = containerPorts;
            this.__explicitlySet__.add("containerPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostContainers build() {
            HostContainers model =
                    new HostContainers(
                            this.timeCollected,
                            this.containerId,
                            this.containerName,
                            this.containerImage,
                            this.containerImageTag,
                            this.containerImageDigest,
                            this.containerPorts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostContainers model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("containerId")) {
                this.containerId(model.getContainerId());
            }
            if (model.wasPropertyExplicitlySet("containerName")) {
                this.containerName(model.getContainerName());
            }
            if (model.wasPropertyExplicitlySet("containerImage")) {
                this.containerImage(model.getContainerImage());
            }
            if (model.wasPropertyExplicitlySet("containerImageTag")) {
                this.containerImageTag(model.getContainerImageTag());
            }
            if (model.wasPropertyExplicitlySet("containerImageDigest")) {
                this.containerImageDigest(model.getContainerImageDigest());
            }
            if (model.wasPropertyExplicitlySet("containerPorts")) {
                this.containerPorts(model.getContainerPorts());
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
    public HostContainers(
            java.util.Date timeCollected,
            String containerId,
            String containerName,
            String containerImage,
            String containerImageTag,
            String containerImageDigest,
            String containerPorts) {
        super(timeCollected);
        this.containerId = containerId;
        this.containerName = containerName;
        this.containerImage = containerImage;
        this.containerImageTag = containerImageTag;
        this.containerImageDigest = containerImageDigest;
        this.containerPorts = containerPorts;
    }

    /** Container Id (full) */
    @com.fasterxml.jackson.annotation.JsonProperty("containerId")
    private final String containerId;

    /**
     * Container Id (full)
     *
     * @return the value
     */
    public String getContainerId() {
        return containerId;
    }

    /** Container Name */
    @com.fasterxml.jackson.annotation.JsonProperty("containerName")
    private final String containerName;

    /**
     * Container Name
     *
     * @return the value
     */
    public String getContainerName() {
        return containerName;
    }

    /** Container Image */
    @com.fasterxml.jackson.annotation.JsonProperty("containerImage")
    private final String containerImage;

    /**
     * Container Image
     *
     * @return the value
     */
    public String getContainerImage() {
        return containerImage;
    }

    /** Container Image Tag (version) */
    @com.fasterxml.jackson.annotation.JsonProperty("containerImageTag")
    private final String containerImageTag;

    /**
     * Container Image Tag (version)
     *
     * @return the value
     */
    public String getContainerImageTag() {
        return containerImageTag;
    }

    /** Container Image Digest */
    @com.fasterxml.jackson.annotation.JsonProperty("containerImageDigest")
    private final String containerImageDigest;

    /**
     * Container Image Digest
     *
     * @return the value
     */
    public String getContainerImageDigest() {
        return containerImageDigest;
    }

    /** Container open ports */
    @com.fasterxml.jackson.annotation.JsonProperty("containerPorts")
    private final String containerPorts;

    /**
     * Container open ports
     *
     * @return the value
     */
    public String getContainerPorts() {
        return containerPorts;
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
        sb.append("HostContainers(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", containerId=").append(String.valueOf(this.containerId));
        sb.append(", containerName=").append(String.valueOf(this.containerName));
        sb.append(", containerImage=").append(String.valueOf(this.containerImage));
        sb.append(", containerImageTag=").append(String.valueOf(this.containerImageTag));
        sb.append(", containerImageDigest=").append(String.valueOf(this.containerImageDigest));
        sb.append(", containerPorts=").append(String.valueOf(this.containerPorts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostContainers)) {
            return false;
        }

        HostContainers other = (HostContainers) o;
        return java.util.Objects.equals(this.containerId, other.containerId)
                && java.util.Objects.equals(this.containerName, other.containerName)
                && java.util.Objects.equals(this.containerImage, other.containerImage)
                && java.util.Objects.equals(this.containerImageTag, other.containerImageTag)
                && java.util.Objects.equals(this.containerImageDigest, other.containerImageDigest)
                && java.util.Objects.equals(this.containerPorts, other.containerPorts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.containerId == null ? 43 : this.containerId.hashCode());
        result =
                (result * PRIME)
                        + (this.containerName == null ? 43 : this.containerName.hashCode());
        result =
                (result * PRIME)
                        + (this.containerImage == null ? 43 : this.containerImage.hashCode());
        result =
                (result * PRIME)
                        + (this.containerImageTag == null ? 43 : this.containerImageTag.hashCode());
        result =
                (result * PRIME)
                        + (this.containerImageDigest == null
                                ? 43
                                : this.containerImageDigest.hashCode());
        result =
                (result * PRIME)
                        + (this.containerPorts == null ? 43 : this.containerPorts.hashCode());
        return result;
    }
}
