/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Service Role details object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ServiceRoleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServiceRoleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "roleArn",
        "servicePrivateEndpoint",
        "serviceType",
        "assumeRoleStatus",
        "awsNodes"
    })
    public ServiceRoleDetails(
            String roleArn,
            String servicePrivateEndpoint,
            ServiceType serviceType,
            AssumeRoleStatus assumeRoleStatus,
            java.util.List<AwsNodes> awsNodes) {
        super();
        this.roleArn = roleArn;
        this.servicePrivateEndpoint = servicePrivateEndpoint;
        this.serviceType = serviceType;
        this.assumeRoleStatus = assumeRoleStatus;
        this.awsNodes = awsNodes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Amazon resource name AWSof the IAM role. */
        @com.fasterxml.jackson.annotation.JsonProperty("roleArn")
        private String roleArn;

        /**
         * Amazon resource name AWSof the IAM role.
         *
         * @param roleArn the value to set
         * @return this builder
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            this.__explicitlySet__.add("roleArn");
            return this;
        }
        /** Private endpoint of the AWS service. */
        @com.fasterxml.jackson.annotation.JsonProperty("servicePrivateEndpoint")
        private String servicePrivateEndpoint;

        /**
         * Private endpoint of the AWS service.
         *
         * @param servicePrivateEndpoint the value to set
         * @return this builder
         */
        public Builder servicePrivateEndpoint(String servicePrivateEndpoint) {
            this.servicePrivateEndpoint = servicePrivateEndpoint;
            this.__explicitlySet__.add("servicePrivateEndpoint");
            return this;
        }
        /** Type of service. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private ServiceType serviceType;

        /**
         * Type of service.
         *
         * @param serviceType the value to set
         * @return this builder
         */
        public Builder serviceType(ServiceType serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /** Assume role status. */
        @com.fasterxml.jackson.annotation.JsonProperty("assumeRoleStatus")
        private AssumeRoleStatus assumeRoleStatus;

        /**
         * Assume role status.
         *
         * @param assumeRoleStatus the value to set
         * @return this builder
         */
        public Builder assumeRoleStatus(AssumeRoleStatus assumeRoleStatus) {
            this.assumeRoleStatus = assumeRoleStatus;
            this.__explicitlySet__.add("assumeRoleStatus");
            return this;
        }
        /**
         * List of all VMs where AWS Identity Connector is configured for Oracle DB Cloud VM
         * Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("awsNodes")
        private java.util.List<AwsNodes> awsNodes;

        /**
         * List of all VMs where AWS Identity Connector is configured for Oracle DB Cloud VM
         * Cluster.
         *
         * @param awsNodes the value to set
         * @return this builder
         */
        public Builder awsNodes(java.util.List<AwsNodes> awsNodes) {
            this.awsNodes = awsNodes;
            this.__explicitlySet__.add("awsNodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceRoleDetails build() {
            ServiceRoleDetails model =
                    new ServiceRoleDetails(
                            this.roleArn,
                            this.servicePrivateEndpoint,
                            this.serviceType,
                            this.assumeRoleStatus,
                            this.awsNodes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceRoleDetails model) {
            if (model.wasPropertyExplicitlySet("roleArn")) {
                this.roleArn(model.getRoleArn());
            }
            if (model.wasPropertyExplicitlySet("servicePrivateEndpoint")) {
                this.servicePrivateEndpoint(model.getServicePrivateEndpoint());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("assumeRoleStatus")) {
                this.assumeRoleStatus(model.getAssumeRoleStatus());
            }
            if (model.wasPropertyExplicitlySet("awsNodes")) {
                this.awsNodes(model.getAwsNodes());
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

    /** Amazon resource name AWSof the IAM role. */
    @com.fasterxml.jackson.annotation.JsonProperty("roleArn")
    private final String roleArn;

    /**
     * Amazon resource name AWSof the IAM role.
     *
     * @return the value
     */
    public String getRoleArn() {
        return roleArn;
    }

    /** Private endpoint of the AWS service. */
    @com.fasterxml.jackson.annotation.JsonProperty("servicePrivateEndpoint")
    private final String servicePrivateEndpoint;

    /**
     * Private endpoint of the AWS service.
     *
     * @return the value
     */
    public String getServicePrivateEndpoint() {
        return servicePrivateEndpoint;
    }

    /** Type of service. */
    public enum ServiceType implements com.oracle.bmc.http.internal.BmcEnum {
        Kms("KMS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServiceType.class);

        private final String value;
        private static java.util.Map<String, ServiceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceType v : ServiceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServiceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServiceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of service. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final ServiceType serviceType;

    /**
     * Type of service.
     *
     * @return the value
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /** Assume role status. */
    public enum AssumeRoleStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Connected("CONNECTED"),
        Disconnected("DISCONNECTED"),
        PartiallyConnected("PARTIALLY_CONNECTED"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssumeRoleStatus.class);

        private final String value;
        private static java.util.Map<String, AssumeRoleStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (AssumeRoleStatus v : AssumeRoleStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssumeRoleStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssumeRoleStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssumeRoleStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Assume role status. */
    @com.fasterxml.jackson.annotation.JsonProperty("assumeRoleStatus")
    private final AssumeRoleStatus assumeRoleStatus;

    /**
     * Assume role status.
     *
     * @return the value
     */
    public AssumeRoleStatus getAssumeRoleStatus() {
        return assumeRoleStatus;
    }

    /**
     * List of all VMs where AWS Identity Connector is configured for Oracle DB Cloud VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("awsNodes")
    private final java.util.List<AwsNodes> awsNodes;

    /**
     * List of all VMs where AWS Identity Connector is configured for Oracle DB Cloud VM Cluster.
     *
     * @return the value
     */
    public java.util.List<AwsNodes> getAwsNodes() {
        return awsNodes;
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
        sb.append("ServiceRoleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("roleArn=").append(String.valueOf(this.roleArn));
        sb.append(", servicePrivateEndpoint=").append(String.valueOf(this.servicePrivateEndpoint));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", assumeRoleStatus=").append(String.valueOf(this.assumeRoleStatus));
        sb.append(", awsNodes=").append(String.valueOf(this.awsNodes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceRoleDetails)) {
            return false;
        }

        ServiceRoleDetails other = (ServiceRoleDetails) o;
        return java.util.Objects.equals(this.roleArn, other.roleArn)
                && java.util.Objects.equals(
                        this.servicePrivateEndpoint, other.servicePrivateEndpoint)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.assumeRoleStatus, other.assumeRoleStatus)
                && java.util.Objects.equals(this.awsNodes, other.awsNodes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.roleArn == null ? 43 : this.roleArn.hashCode());
        result =
                (result * PRIME)
                        + (this.servicePrivateEndpoint == null
                                ? 43
                                : this.servicePrivateEndpoint.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result =
                (result * PRIME)
                        + (this.assumeRoleStatus == null ? 43 : this.assumeRoleStatus.hashCode());
        result = (result * PRIME) + (this.awsNodes == null ? 43 : this.awsNodes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
