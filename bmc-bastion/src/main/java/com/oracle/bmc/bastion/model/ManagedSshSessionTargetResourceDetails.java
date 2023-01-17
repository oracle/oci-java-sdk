/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * Details about a managed SSH session for a target resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagedSshSessionTargetResourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sessionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedSshSessionTargetResourceDetails extends TargetResourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the user on the target resource operating system that the session uses for the connection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceOperatingSystemUserName")
        private String targetResourceOperatingSystemUserName;

        /**
         * The name of the user on the target resource operating system that the session uses for the connection.
         * @param targetResourceOperatingSystemUserName the value to set
         * @return this builder
         **/
        public Builder targetResourceOperatingSystemUserName(
                String targetResourceOperatingSystemUserName) {
            this.targetResourceOperatingSystemUserName = targetResourceOperatingSystemUserName;
            this.__explicitlySet__.add("targetResourceOperatingSystemUserName");
            return this;
        }
        /**
         * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        /**
         * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
         * @param targetResourceId the value to set
         * @return this builder
         **/
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }
        /**
         * The private IP address of the target resource that the session connects to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePrivateIpAddress")
        private String targetResourcePrivateIpAddress;

        /**
         * The private IP address of the target resource that the session connects to.
         * @param targetResourcePrivateIpAddress the value to set
         * @return this builder
         **/
        public Builder targetResourcePrivateIpAddress(String targetResourcePrivateIpAddress) {
            this.targetResourcePrivateIpAddress = targetResourcePrivateIpAddress;
            this.__explicitlySet__.add("targetResourcePrivateIpAddress");
            return this;
        }
        /**
         * The display name of the target Compute instance that the session connects to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDisplayName")
        private String targetResourceDisplayName;

        /**
         * The display name of the target Compute instance that the session connects to.
         * @param targetResourceDisplayName the value to set
         * @return this builder
         **/
        public Builder targetResourceDisplayName(String targetResourceDisplayName) {
            this.targetResourceDisplayName = targetResourceDisplayName;
            this.__explicitlySet__.add("targetResourceDisplayName");
            return this;
        }
        /**
         * The port number to connect to on the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePort")
        private Integer targetResourcePort;

        /**
         * The port number to connect to on the target resource.
         * @param targetResourcePort the value to set
         * @return this builder
         **/
        public Builder targetResourcePort(Integer targetResourcePort) {
            this.targetResourcePort = targetResourcePort;
            this.__explicitlySet__.add("targetResourcePort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedSshSessionTargetResourceDetails build() {
            ManagedSshSessionTargetResourceDetails model =
                    new ManagedSshSessionTargetResourceDetails(
                            this.targetResourceOperatingSystemUserName,
                            this.targetResourceId,
                            this.targetResourcePrivateIpAddress,
                            this.targetResourceDisplayName,
                            this.targetResourcePort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedSshSessionTargetResourceDetails model) {
            if (model.wasPropertyExplicitlySet("targetResourceOperatingSystemUserName")) {
                this.targetResourceOperatingSystemUserName(
                        model.getTargetResourceOperatingSystemUserName());
            }
            if (model.wasPropertyExplicitlySet("targetResourceId")) {
                this.targetResourceId(model.getTargetResourceId());
            }
            if (model.wasPropertyExplicitlySet("targetResourcePrivateIpAddress")) {
                this.targetResourcePrivateIpAddress(model.getTargetResourcePrivateIpAddress());
            }
            if (model.wasPropertyExplicitlySet("targetResourceDisplayName")) {
                this.targetResourceDisplayName(model.getTargetResourceDisplayName());
            }
            if (model.wasPropertyExplicitlySet("targetResourcePort")) {
                this.targetResourcePort(model.getTargetResourcePort());
            }
            return this;
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

    @Deprecated
    public ManagedSshSessionTargetResourceDetails(
            String targetResourceOperatingSystemUserName,
            String targetResourceId,
            String targetResourcePrivateIpAddress,
            String targetResourceDisplayName,
            Integer targetResourcePort) {
        super();
        this.targetResourceOperatingSystemUserName = targetResourceOperatingSystemUserName;
        this.targetResourceId = targetResourceId;
        this.targetResourcePrivateIpAddress = targetResourcePrivateIpAddress;
        this.targetResourceDisplayName = targetResourceDisplayName;
        this.targetResourcePort = targetResourcePort;
    }

    /**
     * The name of the user on the target resource operating system that the session uses for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceOperatingSystemUserName")
    private final String targetResourceOperatingSystemUserName;

    /**
     * The name of the user on the target resource operating system that the session uses for the connection.
     * @return the value
     **/
    public String getTargetResourceOperatingSystemUserName() {
        return targetResourceOperatingSystemUserName;
    }

    /**
     * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    private final String targetResourceId;

    /**
     * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
     * @return the value
     **/
    public String getTargetResourceId() {
        return targetResourceId;
    }

    /**
     * The private IP address of the target resource that the session connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePrivateIpAddress")
    private final String targetResourcePrivateIpAddress;

    /**
     * The private IP address of the target resource that the session connects to.
     * @return the value
     **/
    public String getTargetResourcePrivateIpAddress() {
        return targetResourcePrivateIpAddress;
    }

    /**
     * The display name of the target Compute instance that the session connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDisplayName")
    private final String targetResourceDisplayName;

    /**
     * The display name of the target Compute instance that the session connects to.
     * @return the value
     **/
    public String getTargetResourceDisplayName() {
        return targetResourceDisplayName;
    }

    /**
     * The port number to connect to on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePort")
    private final Integer targetResourcePort;

    /**
     * The port number to connect to on the target resource.
     * @return the value
     **/
    public Integer getTargetResourcePort() {
        return targetResourcePort;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ManagedSshSessionTargetResourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", targetResourceOperatingSystemUserName=")
                .append(String.valueOf(this.targetResourceOperatingSystemUserName));
        sb.append(", targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(", targetResourcePrivateIpAddress=")
                .append(String.valueOf(this.targetResourcePrivateIpAddress));
        sb.append(", targetResourceDisplayName=")
                .append(String.valueOf(this.targetResourceDisplayName));
        sb.append(", targetResourcePort=").append(String.valueOf(this.targetResourcePort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedSshSessionTargetResourceDetails)) {
            return false;
        }

        ManagedSshSessionTargetResourceDetails other = (ManagedSshSessionTargetResourceDetails) o;
        return java.util.Objects.equals(
                        this.targetResourceOperatingSystemUserName,
                        other.targetResourceOperatingSystemUserName)
                && java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(
                        this.targetResourcePrivateIpAddress, other.targetResourcePrivateIpAddress)
                && java.util.Objects.equals(
                        this.targetResourceDisplayName, other.targetResourceDisplayName)
                && java.util.Objects.equals(this.targetResourcePort, other.targetResourcePort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetResourceOperatingSystemUserName == null
                                ? 43
                                : this.targetResourceOperatingSystemUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourcePrivateIpAddress == null
                                ? 43
                                : this.targetResourcePrivateIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceDisplayName == null
                                ? 43
                                : this.targetResourceDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourcePort == null
                                ? 43
                                : this.targetResourcePort.hashCode());
        return result;
    }
}
