/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about added Cloud SQL capability
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CloudSqlDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CloudSqlDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
        private Long blockVolumeSizeInGBs;

        public Builder blockVolumeSizeInGBs(Long blockVolumeSizeInGBs) {
            this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
            this.__explicitlySet__.add("blockVolumeSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isKerberosMappedToDatabaseUsers")
        private Boolean isKerberosMappedToDatabaseUsers;

        public Builder isKerberosMappedToDatabaseUsers(Boolean isKerberosMappedToDatabaseUsers) {
            this.isKerberosMappedToDatabaseUsers = isKerberosMappedToDatabaseUsers;
            this.__explicitlySet__.add("isKerberosMappedToDatabaseUsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kerberosDetails")
        private java.util.List<KerberosDetails> kerberosDetails;

        public Builder kerberosDetails(java.util.List<KerberosDetails> kerberosDetails) {
            this.kerberosDetails = kerberosDetails;
            this.__explicitlySet__.add("kerberosDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudSqlDetails build() {
            CloudSqlDetails __instance__ =
                    new CloudSqlDetails(
                            shape,
                            blockVolumeSizeInGBs,
                            isKerberosMappedToDatabaseUsers,
                            ipAddress,
                            kerberosDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudSqlDetails o) {
            Builder copiedBuilder =
                    shape(o.getShape())
                            .blockVolumeSizeInGBs(o.getBlockVolumeSizeInGBs())
                            .isKerberosMappedToDatabaseUsers(o.getIsKerberosMappedToDatabaseUsers())
                            .ipAddress(o.getIpAddress())
                            .kerberosDetails(o.getKerberosDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Shape of the node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * The size of block volume in GB that needs to be attached to a given node.
     * All the necessary details needed for attachment are managed by service itself.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
    Long blockVolumeSizeInGBs;

    /**
     * Boolean flag specifying whether or not Kerberos principals are mapped
     * to database users.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isKerberosMappedToDatabaseUsers")
    Boolean isKerberosMappedToDatabaseUsers;

    /**
     * IP address of the Cloud SQL node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;

    /**
     * Details about the Kerberos principals.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kerberosDetails")
    java.util.List<KerberosDetails> kerberosDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
