/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Deprecated. Source VNIC to destination subnet mapping for a compute instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeInstanceVnicMappingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeInstanceVnicMappingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceVnicId",
        "destinationSubnetId",
        "destinationPrimaryPrivateIpAddress",
        "destinationPrimaryPrivateIpHostnameLabel",
        "destinationNsgIdList"
    })
    public ComputeInstanceVnicMappingDetails(
            String sourceVnicId,
            String destinationSubnetId,
            String destinationPrimaryPrivateIpAddress,
            String destinationPrimaryPrivateIpHostnameLabel,
            java.util.List<String> destinationNsgIdList) {
        super();
        this.sourceVnicId = sourceVnicId;
        this.destinationSubnetId = destinationSubnetId;
        this.destinationPrimaryPrivateIpAddress = destinationPrimaryPrivateIpAddress;
        this.destinationPrimaryPrivateIpHostnameLabel = destinationPrimaryPrivateIpHostnameLabel;
        this.destinationNsgIdList = destinationNsgIdList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the VNIC.
         *
         * <p>Example: {@code ocid1.vnic.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVnicId")
        private String sourceVnicId;

        /**
         * The OCID of the VNIC.
         *
         * <p>Example: {@code ocid1.vnic.oc1..uniqueID}
         *
         * @param sourceVnicId the value to set
         * @return this builder
         */
        public Builder sourceVnicId(String sourceVnicId) {
            this.sourceVnicId = sourceVnicId;
            this.__explicitlySet__.add("sourceVnicId");
            return this;
        }
        /**
         * The OCID of the destination subnet to which this source VNIC should connect.
         *
         * <p>Example: {@code ocid1.subnet.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationSubnetId")
        private String destinationSubnetId;

        /**
         * The OCID of the destination subnet to which this source VNIC should connect.
         *
         * <p>Example: {@code ocid1.subnet.oc1..uniqueID}
         *
         * @param destinationSubnetId the value to set
         * @return this builder
         */
        public Builder destinationSubnetId(String destinationSubnetId) {
            this.destinationSubnetId = destinationSubnetId;
            this.__explicitlySet__.add("destinationSubnetId");
            return this;
        }
        /**
         * The primary private IP address to be assigned to the VNIC in the destination region. This
         * address must belong to the destination subnet.
         *
         * <p>Example: {@code 10.0.3.3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationPrimaryPrivateIpAddress")
        private String destinationPrimaryPrivateIpAddress;

        /**
         * The primary private IP address to be assigned to the VNIC in the destination region. This
         * address must belong to the destination subnet.
         *
         * <p>Example: {@code 10.0.3.3}
         *
         * @param destinationPrimaryPrivateIpAddress the value to set
         * @return this builder
         */
        public Builder destinationPrimaryPrivateIpAddress(
                String destinationPrimaryPrivateIpAddress) {
            this.destinationPrimaryPrivateIpAddress = destinationPrimaryPrivateIpAddress;
            this.__explicitlySet__.add("destinationPrimaryPrivateIpAddress");
            return this;
        }
        /**
         * The hostname label to be assigned in the destination subnet for the primary private IP of
         * the source VNIC. This label is the hostname portion of the private IP's fully qualified
         * domain name (FQDN) (for example, 'myhost1' in the FQDN
         * 'myhost1.subnet123.vcn1.oraclevcn.com').
         *
         * <p>Example: {@code myhost1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationPrimaryPrivateIpHostnameLabel")
        private String destinationPrimaryPrivateIpHostnameLabel;

        /**
         * The hostname label to be assigned in the destination subnet for the primary private IP of
         * the source VNIC. This label is the hostname portion of the private IP's fully qualified
         * domain name (FQDN) (for example, 'myhost1' in the FQDN
         * 'myhost1.subnet123.vcn1.oraclevcn.com').
         *
         * <p>Example: {@code myhost1}
         *
         * @param destinationPrimaryPrivateIpHostnameLabel the value to set
         * @return this builder
         */
        public Builder destinationPrimaryPrivateIpHostnameLabel(
                String destinationPrimaryPrivateIpHostnameLabel) {
            this.destinationPrimaryPrivateIpHostnameLabel =
                    destinationPrimaryPrivateIpHostnameLabel;
            this.__explicitlySet__.add("destinationPrimaryPrivateIpHostnameLabel");
            return this;
        }
        /**
         * A list of OCIDs of network security groups (NSG) in the destination region which should
         * be assigned to the source VNIC.
         *
         * <p>Example: {@code [ ocid1.networksecuritygroup.oc1..uniqueID,
         * ocid1.networksecuritygroup.oc1..uniqueID ]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationNsgIdList")
        private java.util.List<String> destinationNsgIdList;

        /**
         * A list of OCIDs of network security groups (NSG) in the destination region which should
         * be assigned to the source VNIC.
         *
         * <p>Example: {@code [ ocid1.networksecuritygroup.oc1..uniqueID,
         * ocid1.networksecuritygroup.oc1..uniqueID ]}
         *
         * @param destinationNsgIdList the value to set
         * @return this builder
         */
        public Builder destinationNsgIdList(java.util.List<String> destinationNsgIdList) {
            this.destinationNsgIdList = destinationNsgIdList;
            this.__explicitlySet__.add("destinationNsgIdList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceVnicMappingDetails build() {
            ComputeInstanceVnicMappingDetails model =
                    new ComputeInstanceVnicMappingDetails(
                            this.sourceVnicId,
                            this.destinationSubnetId,
                            this.destinationPrimaryPrivateIpAddress,
                            this.destinationPrimaryPrivateIpHostnameLabel,
                            this.destinationNsgIdList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceVnicMappingDetails model) {
            if (model.wasPropertyExplicitlySet("sourceVnicId")) {
                this.sourceVnicId(model.getSourceVnicId());
            }
            if (model.wasPropertyExplicitlySet("destinationSubnetId")) {
                this.destinationSubnetId(model.getDestinationSubnetId());
            }
            if (model.wasPropertyExplicitlySet("destinationPrimaryPrivateIpAddress")) {
                this.destinationPrimaryPrivateIpAddress(
                        model.getDestinationPrimaryPrivateIpAddress());
            }
            if (model.wasPropertyExplicitlySet("destinationPrimaryPrivateIpHostnameLabel")) {
                this.destinationPrimaryPrivateIpHostnameLabel(
                        model.getDestinationPrimaryPrivateIpHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("destinationNsgIdList")) {
                this.destinationNsgIdList(model.getDestinationNsgIdList());
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
     * The OCID of the VNIC.
     *
     * <p>Example: {@code ocid1.vnic.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVnicId")
    private final String sourceVnicId;

    /**
     * The OCID of the VNIC.
     *
     * <p>Example: {@code ocid1.vnic.oc1..uniqueID}
     *
     * @return the value
     */
    public String getSourceVnicId() {
        return sourceVnicId;
    }

    /**
     * The OCID of the destination subnet to which this source VNIC should connect.
     *
     * <p>Example: {@code ocid1.subnet.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationSubnetId")
    private final String destinationSubnetId;

    /**
     * The OCID of the destination subnet to which this source VNIC should connect.
     *
     * <p>Example: {@code ocid1.subnet.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationSubnetId() {
        return destinationSubnetId;
    }

    /**
     * The primary private IP address to be assigned to the VNIC in the destination region. This
     * address must belong to the destination subnet.
     *
     * <p>Example: {@code 10.0.3.3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationPrimaryPrivateIpAddress")
    private final String destinationPrimaryPrivateIpAddress;

    /**
     * The primary private IP address to be assigned to the VNIC in the destination region. This
     * address must belong to the destination subnet.
     *
     * <p>Example: {@code 10.0.3.3}
     *
     * @return the value
     */
    public String getDestinationPrimaryPrivateIpAddress() {
        return destinationPrimaryPrivateIpAddress;
    }

    /**
     * The hostname label to be assigned in the destination subnet for the primary private IP of the
     * source VNIC. This label is the hostname portion of the private IP's fully qualified domain
     * name (FQDN) (for example, 'myhost1' in the FQDN 'myhost1.subnet123.vcn1.oraclevcn.com').
     *
     * <p>Example: {@code myhost1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationPrimaryPrivateIpHostnameLabel")
    private final String destinationPrimaryPrivateIpHostnameLabel;

    /**
     * The hostname label to be assigned in the destination subnet for the primary private IP of the
     * source VNIC. This label is the hostname portion of the private IP's fully qualified domain
     * name (FQDN) (for example, 'myhost1' in the FQDN 'myhost1.subnet123.vcn1.oraclevcn.com').
     *
     * <p>Example: {@code myhost1}
     *
     * @return the value
     */
    public String getDestinationPrimaryPrivateIpHostnameLabel() {
        return destinationPrimaryPrivateIpHostnameLabel;
    }

    /**
     * A list of OCIDs of network security groups (NSG) in the destination region which should be
     * assigned to the source VNIC.
     *
     * <p>Example: {@code [ ocid1.networksecuritygroup.oc1..uniqueID,
     * ocid1.networksecuritygroup.oc1..uniqueID ]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationNsgIdList")
    private final java.util.List<String> destinationNsgIdList;

    /**
     * A list of OCIDs of network security groups (NSG) in the destination region which should be
     * assigned to the source VNIC.
     *
     * <p>Example: {@code [ ocid1.networksecuritygroup.oc1..uniqueID,
     * ocid1.networksecuritygroup.oc1..uniqueID ]}
     *
     * @return the value
     */
    public java.util.List<String> getDestinationNsgIdList() {
        return destinationNsgIdList;
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
        sb.append("ComputeInstanceVnicMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceVnicId=").append(String.valueOf(this.sourceVnicId));
        sb.append(", destinationSubnetId=").append(String.valueOf(this.destinationSubnetId));
        sb.append(", destinationPrimaryPrivateIpAddress=")
                .append(String.valueOf(this.destinationPrimaryPrivateIpAddress));
        sb.append(", destinationPrimaryPrivateIpHostnameLabel=")
                .append(String.valueOf(this.destinationPrimaryPrivateIpHostnameLabel));
        sb.append(", destinationNsgIdList=").append(String.valueOf(this.destinationNsgIdList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceVnicMappingDetails)) {
            return false;
        }

        ComputeInstanceVnicMappingDetails other = (ComputeInstanceVnicMappingDetails) o;
        return java.util.Objects.equals(this.sourceVnicId, other.sourceVnicId)
                && java.util.Objects.equals(this.destinationSubnetId, other.destinationSubnetId)
                && java.util.Objects.equals(
                        this.destinationPrimaryPrivateIpAddress,
                        other.destinationPrimaryPrivateIpAddress)
                && java.util.Objects.equals(
                        this.destinationPrimaryPrivateIpHostnameLabel,
                        other.destinationPrimaryPrivateIpHostnameLabel)
                && java.util.Objects.equals(this.destinationNsgIdList, other.destinationNsgIdList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceVnicId == null ? 43 : this.sourceVnicId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationSubnetId == null
                                ? 43
                                : this.destinationSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationPrimaryPrivateIpAddress == null
                                ? 43
                                : this.destinationPrimaryPrivateIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationPrimaryPrivateIpHostnameLabel == null
                                ? 43
                                : this.destinationPrimaryPrivateIpHostnameLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationNsgIdList == null
                                ? 43
                                : this.destinationNsgIdList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
