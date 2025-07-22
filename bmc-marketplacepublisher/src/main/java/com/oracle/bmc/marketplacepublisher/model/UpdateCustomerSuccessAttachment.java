/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * customer success story attachment for the listing revision. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateCustomerSuccessAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "attachmentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCustomerSuccessAttachment extends UpdateListingRevisionAttachmentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
        /** Name of the customer */
        @com.fasterxml.jackson.annotation.JsonProperty("customerName")
        private String customerName;

        /**
         * Name of the customer
         *
         * @param customerName the value to set
         * @return this builder
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            this.__explicitlySet__.add("customerName");
            return this;
        }
        /** Optional url to success story */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Optional url to success story
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** List of product codes for success story */
        @com.fasterxml.jackson.annotation.JsonProperty("productCodes")
        private java.util.List<String> productCodes;

        /**
         * List of product codes for success story
         *
         * @param productCodes the value to set
         * @return this builder
         */
        public Builder productCodes(java.util.List<String> productCodes) {
            this.productCodes = productCodes;
            this.__explicitlySet__.add("productCodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCustomerSuccessAttachment build() {
            UpdateCustomerSuccessAttachment model =
                    new UpdateCustomerSuccessAttachment(
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.customerName,
                            this.url,
                            this.productCodes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCustomerSuccessAttachment model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("customerName")) {
                this.customerName(model.getCustomerName());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("productCodes")) {
                this.productCodes(model.getProductCodes());
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
    public UpdateCustomerSuccessAttachment(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String customerName,
            String url,
            java.util.List<String> productCodes) {
        super(displayName, description, freeformTags, definedTags);
        this.customerName = customerName;
        this.url = url;
        this.productCodes = productCodes;
    }

    /** Name of the customer */
    @com.fasterxml.jackson.annotation.JsonProperty("customerName")
    private final String customerName;

    /**
     * Name of the customer
     *
     * @return the value
     */
    public String getCustomerName() {
        return customerName;
    }

    /** Optional url to success story */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Optional url to success story
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** List of product codes for success story */
    @com.fasterxml.jackson.annotation.JsonProperty("productCodes")
    private final java.util.List<String> productCodes;

    /**
     * List of product codes for success story
     *
     * @return the value
     */
    public java.util.List<String> getProductCodes() {
        return productCodes;
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
        sb.append("UpdateCustomerSuccessAttachment(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", customerName=").append(String.valueOf(this.customerName));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", productCodes=").append(String.valueOf(this.productCodes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCustomerSuccessAttachment)) {
            return false;
        }

        UpdateCustomerSuccessAttachment other = (UpdateCustomerSuccessAttachment) o;
        return java.util.Objects.equals(this.customerName, other.customerName)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.productCodes, other.productCodes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.customerName == null ? 43 : this.customerName.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.productCodes == null ? 43 : this.productCodes.hashCode());
        return result;
    }
}
