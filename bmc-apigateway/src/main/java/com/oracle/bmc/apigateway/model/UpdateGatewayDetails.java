/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateGatewayDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateGatewayDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseCacheDetails")
        private ResponseCacheDetails responseCacheDetails;

        public Builder responseCacheDetails(ResponseCacheDetails responseCacheDetails) {
            this.responseCacheDetails = responseCacheDetails;
            this.__explicitlySet__.add("responseCacheDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("caBundles")
        private java.util.List<CaBundle> caBundles;

        public Builder caBundles(java.util.List<CaBundle> caBundles) {
            this.caBundles = caBundles;
            this.__explicitlySet__.add("caBundles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateGatewayDetails build() {
            UpdateGatewayDetails __instance__ =
                    new UpdateGatewayDetails(
                            displayName,
                            networkSecurityGroupIds,
                            certificateId,
                            responseCacheDetails,
                            freeformTags,
                            definedTags,
                            caBundles);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGatewayDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .networkSecurityGroupIds(o.getNetworkSecurityGroupIds())
                            .certificateId(o.getCertificateId())
                            .responseCacheDetails(o.getResponseCacheDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .caBundles(o.getCaBundles());

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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * An array of Network Security Groups OCIDs associated with this API Gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    java.util.List<String> networkSecurityGroupIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    String certificateId;

    @com.fasterxml.jackson.annotation.JsonProperty("responseCacheDetails")
    ResponseCacheDetails responseCacheDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * An array of CA bundles that should be used on the Gateway for TLS validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caBundles")
    java.util.List<CaBundle> caBundles;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
