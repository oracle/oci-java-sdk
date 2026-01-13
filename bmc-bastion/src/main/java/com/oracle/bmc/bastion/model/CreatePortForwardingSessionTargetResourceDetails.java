/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * Details about a port forwarding session for a target resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreatePortForwardingSessionTargetResourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sessionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePortForwardingSessionTargetResourceDetails
        extends CreateSessionTargetResourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the target resource (a Compute instance, for example)
         * that the session connects to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        /**
         * The unique identifier (OCID) of the target resource (a Compute instance, for example)
         * that the session connects to.
         *
         * @param targetResourceId the value to set
         * @return this builder
         */
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }
        /** The private IP address of the target resource that the session connects to. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePrivateIpAddress")
        private String targetResourcePrivateIpAddress;

        /**
         * The private IP address of the target resource that the session connects to.
         *
         * @param targetResourcePrivateIpAddress the value to set
         * @return this builder
         */
        public Builder targetResourcePrivateIpAddress(String targetResourcePrivateIpAddress) {
            this.targetResourcePrivateIpAddress = targetResourcePrivateIpAddress;
            this.__explicitlySet__.add("targetResourcePrivateIpAddress");
            return this;
        }
        /** The Fully Qualified Domain Name of the target resource that the session connects to. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceFqdn")
        private String targetResourceFqdn;

        /**
         * The Fully Qualified Domain Name of the target resource that the session connects to.
         *
         * @param targetResourceFqdn the value to set
         * @return this builder
         */
        public Builder targetResourceFqdn(String targetResourceFqdn) {
            this.targetResourceFqdn = targetResourceFqdn;
            this.__explicitlySet__.add("targetResourceFqdn");
            return this;
        }
        /** The port number to connect to on the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePort")
        private Integer targetResourcePort;

        /**
         * The port number to connect to on the target resource.
         *
         * @param targetResourcePort the value to set
         * @return this builder
         */
        public Builder targetResourcePort(Integer targetResourcePort) {
            this.targetResourcePort = targetResourcePort;
            this.__explicitlySet__.add("targetResourcePort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePortForwardingSessionTargetResourceDetails build() {
            CreatePortForwardingSessionTargetResourceDetails model =
                    new CreatePortForwardingSessionTargetResourceDetails(
                            this.targetResourceId,
                            this.targetResourcePrivateIpAddress,
                            this.targetResourceFqdn,
                            this.targetResourcePort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePortForwardingSessionTargetResourceDetails model) {
            if (model.wasPropertyExplicitlySet("targetResourceId")) {
                this.targetResourceId(model.getTargetResourceId());
            }
            if (model.wasPropertyExplicitlySet("targetResourcePrivateIpAddress")) {
                this.targetResourcePrivateIpAddress(model.getTargetResourcePrivateIpAddress());
            }
            if (model.wasPropertyExplicitlySet("targetResourceFqdn")) {
                this.targetResourceFqdn(model.getTargetResourceFqdn());
            }
            if (model.wasPropertyExplicitlySet("targetResourcePort")) {
                this.targetResourcePort(model.getTargetResourcePort());
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
    public CreatePortForwardingSessionTargetResourceDetails(
            String targetResourceId,
            String targetResourcePrivateIpAddress,
            String targetResourceFqdn,
            Integer targetResourcePort) {
        super();
        this.targetResourceId = targetResourceId;
        this.targetResourcePrivateIpAddress = targetResourcePrivateIpAddress;
        this.targetResourceFqdn = targetResourceFqdn;
        this.targetResourcePort = targetResourcePort;
    }

    /**
     * The unique identifier (OCID) of the target resource (a Compute instance, for example) that
     * the session connects to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    private final String targetResourceId;

    /**
     * The unique identifier (OCID) of the target resource (a Compute instance, for example) that
     * the session connects to.
     *
     * @return the value
     */
    public String getTargetResourceId() {
        return targetResourceId;
    }

    /** The private IP address of the target resource that the session connects to. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePrivateIpAddress")
    private final String targetResourcePrivateIpAddress;

    /**
     * The private IP address of the target resource that the session connects to.
     *
     * @return the value
     */
    public String getTargetResourcePrivateIpAddress() {
        return targetResourcePrivateIpAddress;
    }

    /** The Fully Qualified Domain Name of the target resource that the session connects to. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceFqdn")
    private final String targetResourceFqdn;

    /**
     * The Fully Qualified Domain Name of the target resource that the session connects to.
     *
     * @return the value
     */
    public String getTargetResourceFqdn() {
        return targetResourceFqdn;
    }

    /** The port number to connect to on the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePort")
    private final Integer targetResourcePort;

    /**
     * The port number to connect to on the target resource.
     *
     * @return the value
     */
    public Integer getTargetResourcePort() {
        return targetResourcePort;
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
        sb.append("CreatePortForwardingSessionTargetResourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(", targetResourcePrivateIpAddress=")
                .append(String.valueOf(this.targetResourcePrivateIpAddress));
        sb.append(", targetResourceFqdn=").append(String.valueOf(this.targetResourceFqdn));
        sb.append(", targetResourcePort=").append(String.valueOf(this.targetResourcePort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePortForwardingSessionTargetResourceDetails)) {
            return false;
        }

        CreatePortForwardingSessionTargetResourceDetails other =
                (CreatePortForwardingSessionTargetResourceDetails) o;
        return java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(
                        this.targetResourcePrivateIpAddress, other.targetResourcePrivateIpAddress)
                && java.util.Objects.equals(this.targetResourceFqdn, other.targetResourceFqdn)
                && java.util.Objects.equals(this.targetResourcePort, other.targetResourcePort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
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
                        + (this.targetResourceFqdn == null
                                ? 43
                                : this.targetResourceFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourcePort == null
                                ? 43
                                : this.targetResourcePort.hashCode());
        return result;
    }
}
