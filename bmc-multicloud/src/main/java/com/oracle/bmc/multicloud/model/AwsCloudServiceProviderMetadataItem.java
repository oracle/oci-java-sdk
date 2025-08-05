/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * Aws Cloud Service Provider metadata item. <br>
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
        builder = AwsCloudServiceProviderMetadataItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "subscriptionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwsCloudServiceProviderMetadataItem extends CloudServiceProviderMetadataItem {
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
        /** AWS accountId that was used for creating this resource anchor resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("accountId")
        private String accountId;

        /**
         * AWS accountId that was used for creating this resource anchor resource.
         *
         * @param accountId the value to set
         * @return this builder
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            this.__explicitlySet__.add("accountId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwsCloudServiceProviderMetadataItem build() {
            AwsCloudServiceProviderMetadataItem model =
                    new AwsCloudServiceProviderMetadataItem(
                            this.region,
                            this.resourceAnchorName,
                            this.resourceAnchorUri,
                            this.accountId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwsCloudServiceProviderMetadataItem model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("resourceAnchorName")) {
                this.resourceAnchorName(model.getResourceAnchorName());
            }
            if (model.wasPropertyExplicitlySet("resourceAnchorUri")) {
                this.resourceAnchorUri(model.getResourceAnchorUri());
            }
            if (model.wasPropertyExplicitlySet("accountId")) {
                this.accountId(model.getAccountId());
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
    public AwsCloudServiceProviderMetadataItem(
            String region, String resourceAnchorName, String resourceAnchorUri, String accountId) {
        super(region, resourceAnchorName, resourceAnchorUri);
        this.accountId = accountId;
    }

    /** AWS accountId that was used for creating this resource anchor resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("accountId")
    private final String accountId;

    /**
     * AWS accountId that was used for creating this resource anchor resource.
     *
     * @return the value
     */
    public String getAccountId() {
        return accountId;
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
        sb.append("AwsCloudServiceProviderMetadataItem(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accountId=").append(String.valueOf(this.accountId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwsCloudServiceProviderMetadataItem)) {
            return false;
        }

        AwsCloudServiceProviderMetadataItem other = (AwsCloudServiceProviderMetadataItem) o;
        return java.util.Objects.equals(this.accountId, other.accountId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accountId == null ? 43 : this.accountId.hashCode());
        return result;
    }
}
