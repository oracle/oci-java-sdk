/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * Azure Cloud Service Provider metadata item. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AzureCloudServiceProviderMetadataItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "subscriptionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AzureCloudServiceProviderMetadataItem extends CloudServiceProviderMetadataItem {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceAnchorName")
        private String resourceAnchorName;

        public Builder resourceAnchorName(String resourceAnchorName) {
            this.resourceAnchorName = resourceAnchorName;
            this.__explicitlySet__.add("resourceAnchorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceAnchorUri")
        private String resourceAnchorUri;

        public Builder resourceAnchorUri(String resourceAnchorUri) {
            this.resourceAnchorUri = resourceAnchorUri;
            this.__explicitlySet__.add("resourceAnchorUri");
            return this;
        }
        /** Azure resource group that was used for creating this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Azure resource group that was used for creating this resource.
         *
         * @param resourceGroup the value to set
         * @return this builder
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }
        /** Azure subscription that was used for creating this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscription")
        private String subscription;

        /**
         * Azure subscription that was used for creating this resource.
         *
         * @param subscription the value to set
         * @return this builder
         */
        public Builder subscription(String subscription) {
            this.subscription = subscription;
            this.__explicitlySet__.add("subscription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AzureCloudServiceProviderMetadataItem build() {
            AzureCloudServiceProviderMetadataItem model =
                    new AzureCloudServiceProviderMetadataItem(
                            this.region,
                            this.resourceAnchorName,
                            this.resourceAnchorUri,
                            this.resourceGroup,
                            this.subscription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AzureCloudServiceProviderMetadataItem model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("resourceAnchorName")) {
                this.resourceAnchorName(model.getResourceAnchorName());
            }
            if (model.wasPropertyExplicitlySet("resourceAnchorUri")) {
                this.resourceAnchorUri(model.getResourceAnchorUri());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("subscription")) {
                this.subscription(model.getSubscription());
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
    public AzureCloudServiceProviderMetadataItem(
            String region,
            String resourceAnchorName,
            String resourceAnchorUri,
            String resourceGroup,
            String subscription) {
        super(region, resourceAnchorName, resourceAnchorUri);
        this.resourceGroup = resourceGroup;
        this.subscription = subscription;
    }

    /** Azure resource group that was used for creating this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Azure resource group that was used for creating this resource.
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /** Azure subscription that was used for creating this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscription")
    private final String subscription;

    /**
     * Azure subscription that was used for creating this resource.
     *
     * @return the value
     */
    public String getSubscription() {
        return subscription;
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
        sb.append("AzureCloudServiceProviderMetadataItem(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", subscription=").append(String.valueOf(this.subscription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AzureCloudServiceProviderMetadataItem)) {
            return false;
        }

        AzureCloudServiceProviderMetadataItem other = (AzureCloudServiceProviderMetadataItem) o;
        return java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.subscription, other.subscription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + (this.subscription == null ? 43 : this.subscription.hashCode());
        return result;
    }
}
