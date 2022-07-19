/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The details for updating a connection of the type {@code BITBUCKET_CLOUD_APP_PASSWORD}.
 * This type corresponds to a connection in Bitbucket Cloud that is authenticated with username and app password.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBitbucketCloudAppPasswordConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBitbucketCloudAppPasswordConnectionDetails
        extends UpdateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /**
         * Public Bitbucket Cloud Username in plain text(not more than 30 characters)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * Public Bitbucket Cloud Username in plain text(not more than 30 characters)
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * OCID of personal Bitbucket Cloud AppPassword saved in secret store
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appPassword")
        private String appPassword;

        /**
         * OCID of personal Bitbucket Cloud AppPassword saved in secret store
         * @param appPassword the value to set
         * @return this builder
         **/
        public Builder appPassword(String appPassword) {
            this.appPassword = appPassword;
            this.__explicitlySet__.add("appPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBitbucketCloudAppPasswordConnectionDetails build() {
            UpdateBitbucketCloudAppPasswordConnectionDetails __instance__ =
                    new UpdateBitbucketCloudAppPasswordConnectionDetails(
                            description,
                            displayName,
                            freeformTags,
                            definedTags,
                            username,
                            appPassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBitbucketCloudAppPasswordConnectionDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .username(o.getUsername())
                            .appPassword(o.getAppPassword());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public UpdateBitbucketCloudAppPasswordConnectionDetails(
            String description,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String username,
            String appPassword) {
        super(description, displayName, freeformTags, definedTags);
        this.username = username;
        this.appPassword = appPassword;
    }

    /**
     * Public Bitbucket Cloud Username in plain text(not more than 30 characters)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * Public Bitbucket Cloud Username in plain text(not more than 30 characters)
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * OCID of personal Bitbucket Cloud AppPassword saved in secret store
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appPassword")
    private final String appPassword;

    /**
     * OCID of personal Bitbucket Cloud AppPassword saved in secret store
     * @return the value
     **/
    public String getAppPassword() {
        return appPassword;
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
        sb.append("UpdateBitbucketCloudAppPasswordConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", appPassword=").append(String.valueOf(this.appPassword));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBitbucketCloudAppPasswordConnectionDetails)) {
            return false;
        }

        UpdateBitbucketCloudAppPasswordConnectionDetails other =
                (UpdateBitbucketCloudAppPasswordConnectionDetails) o;
        return java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.appPassword, other.appPassword)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.appPassword == null ? 43 : this.appPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
