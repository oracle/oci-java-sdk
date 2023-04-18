/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties to update an Application channel. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateApplicationChannelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateApplicationChannelDetails extends UpdateChannelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
        private Long sessionExpiryDurationInMilliseconds;

        public Builder sessionExpiryDurationInMilliseconds(
                Long sessionExpiryDurationInMilliseconds) {
            this.sessionExpiryDurationInMilliseconds = sessionExpiryDurationInMilliseconds;
            this.__explicitlySet__.add("sessionExpiryDurationInMilliseconds");
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
        /** The URL to send response and error messages to. */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundUrl")
        private String outboundUrl;

        /**
         * The URL to send response and error messages to.
         *
         * @param outboundUrl the value to set
         * @return this builder
         */
        public Builder outboundUrl(String outboundUrl) {
            this.outboundUrl = outboundUrl;
            this.__explicitlySet__.add("outboundUrl");
            return this;
        }
        /** True if the user id in the AIC message should be treated as an authenticated user id. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAuthenticatedUserId")
        private Boolean isAuthenticatedUserId;

        /**
         * True if the user id in the AIC message should be treated as an authenticated user id.
         *
         * @param isAuthenticatedUserId the value to set
         * @return this builder
         */
        public Builder isAuthenticatedUserId(Boolean isAuthenticatedUserId) {
            this.isAuthenticatedUserId = isAuthenticatedUserId;
            this.__explicitlySet__.add("isAuthenticatedUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateApplicationChannelDetails build() {
            UpdateApplicationChannelDetails model =
                    new UpdateApplicationChannelDetails(
                            this.name,
                            this.description,
                            this.sessionExpiryDurationInMilliseconds,
                            this.freeformTags,
                            this.definedTags,
                            this.outboundUrl,
                            this.isAuthenticatedUserId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateApplicationChannelDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("sessionExpiryDurationInMilliseconds")) {
                this.sessionExpiryDurationInMilliseconds(
                        model.getSessionExpiryDurationInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("outboundUrl")) {
                this.outboundUrl(model.getOutboundUrl());
            }
            if (model.wasPropertyExplicitlySet("isAuthenticatedUserId")) {
                this.isAuthenticatedUserId(model.getIsAuthenticatedUserId());
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
    public UpdateApplicationChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String outboundUrl,
            Boolean isAuthenticatedUserId) {
        super(name, description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.outboundUrl = outboundUrl;
        this.isAuthenticatedUserId = isAuthenticatedUserId;
    }

    /** The URL to send response and error messages to. */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundUrl")
    private final String outboundUrl;

    /**
     * The URL to send response and error messages to.
     *
     * @return the value
     */
    public String getOutboundUrl() {
        return outboundUrl;
    }

    /** True if the user id in the AIC message should be treated as an authenticated user id. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAuthenticatedUserId")
    private final Boolean isAuthenticatedUserId;

    /**
     * True if the user id in the AIC message should be treated as an authenticated user id.
     *
     * @return the value
     */
    public Boolean getIsAuthenticatedUserId() {
        return isAuthenticatedUserId;
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
        sb.append("UpdateApplicationChannelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", outboundUrl=").append(String.valueOf(this.outboundUrl));
        sb.append(", isAuthenticatedUserId=").append(String.valueOf(this.isAuthenticatedUserId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateApplicationChannelDetails)) {
            return false;
        }

        UpdateApplicationChannelDetails other = (UpdateApplicationChannelDetails) o;
        return java.util.Objects.equals(this.outboundUrl, other.outboundUrl)
                && java.util.Objects.equals(this.isAuthenticatedUserId, other.isAuthenticatedUserId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.outboundUrl == null ? 43 : this.outboundUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.isAuthenticatedUserId == null
                                ? 43
                                : this.isAuthenticatedUserId.hashCode());
        return result;
    }
}
