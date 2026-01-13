/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to update a private software source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatePrivateSoftwareSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "softwareSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatePrivateSoftwareSourceDetails extends UpdateSoftwareSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

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
        /** URL for the private software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * URL for the private software source.
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** URI of the GPG key for this software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyUrl")
        private String gpgKeyUrl;

        /**
         * URI of the GPG key for this software source.
         *
         * @param gpgKeyUrl the value to set
         * @return this builder
         */
        public Builder gpgKeyUrl(String gpgKeyUrl) {
            this.gpgKeyUrl = gpgKeyUrl;
            this.__explicitlySet__.add("gpgKeyUrl");
            return this;
        }
        /** Whether signature verification should be done for the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("isGpgCheckEnabled")
        private Boolean isGpgCheckEnabled;

        /**
         * Whether signature verification should be done for the software source.
         *
         * @param isGpgCheckEnabled the value to set
         * @return this builder
         */
        public Builder isGpgCheckEnabled(Boolean isGpgCheckEnabled) {
            this.isGpgCheckEnabled = isGpgCheckEnabled;
            this.__explicitlySet__.add("isGpgCheckEnabled");
            return this;
        }
        /** Whether SSL validation needs to be turned on */
        @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyEnabled")
        private Boolean isSslVerifyEnabled;

        /**
         * Whether SSL validation needs to be turned on
         *
         * @param isSslVerifyEnabled the value to set
         * @return this builder
         */
        public Builder isSslVerifyEnabled(Boolean isSslVerifyEnabled) {
            this.isSslVerifyEnabled = isSslVerifyEnabled;
            this.__explicitlySet__.add("isSslVerifyEnabled");
            return this;
        }
        /** Advanced repository options for the software source */
        @com.fasterxml.jackson.annotation.JsonProperty("advancedRepoOptions")
        private String advancedRepoOptions;

        /**
         * Advanced repository options for the software source
         *
         * @param advancedRepoOptions the value to set
         * @return this builder
         */
        public Builder advancedRepoOptions(String advancedRepoOptions) {
            this.advancedRepoOptions = advancedRepoOptions;
            this.__explicitlySet__.add("advancedRepoOptions");
            return this;
        }
        /** Whether this software source can be synced to a management station */
        @com.fasterxml.jackson.annotation.JsonProperty("isMirrorSyncAllowed")
        private Boolean isMirrorSyncAllowed;

        /**
         * Whether this software source can be synced to a management station
         *
         * @param isMirrorSyncAllowed the value to set
         * @return this builder
         */
        public Builder isMirrorSyncAllowed(Boolean isMirrorSyncAllowed) {
            this.isMirrorSyncAllowed = isMirrorSyncAllowed;
            this.__explicitlySet__.add("isMirrorSyncAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePrivateSoftwareSourceDetails build() {
            UpdatePrivateSoftwareSourceDetails model =
                    new UpdatePrivateSoftwareSourceDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.url,
                            this.gpgKeyUrl,
                            this.isGpgCheckEnabled,
                            this.isSslVerifyEnabled,
                            this.advancedRepoOptions,
                            this.isMirrorSyncAllowed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePrivateSoftwareSourceDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
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
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("gpgKeyUrl")) {
                this.gpgKeyUrl(model.getGpgKeyUrl());
            }
            if (model.wasPropertyExplicitlySet("isGpgCheckEnabled")) {
                this.isGpgCheckEnabled(model.getIsGpgCheckEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSslVerifyEnabled")) {
                this.isSslVerifyEnabled(model.getIsSslVerifyEnabled());
            }
            if (model.wasPropertyExplicitlySet("advancedRepoOptions")) {
                this.advancedRepoOptions(model.getAdvancedRepoOptions());
            }
            if (model.wasPropertyExplicitlySet("isMirrorSyncAllowed")) {
                this.isMirrorSyncAllowed(model.getIsMirrorSyncAllowed());
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
    public UpdatePrivateSoftwareSourceDetails(
            String compartmentId,
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String url,
            String gpgKeyUrl,
            Boolean isGpgCheckEnabled,
            Boolean isSslVerifyEnabled,
            String advancedRepoOptions,
            Boolean isMirrorSyncAllowed) {
        super(compartmentId, displayName, description, freeformTags, definedTags);
        this.url = url;
        this.gpgKeyUrl = gpgKeyUrl;
        this.isGpgCheckEnabled = isGpgCheckEnabled;
        this.isSslVerifyEnabled = isSslVerifyEnabled;
        this.advancedRepoOptions = advancedRepoOptions;
        this.isMirrorSyncAllowed = isMirrorSyncAllowed;
    }

    /** URL for the private software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * URL for the private software source.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** URI of the GPG key for this software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyUrl")
    private final String gpgKeyUrl;

    /**
     * URI of the GPG key for this software source.
     *
     * @return the value
     */
    public String getGpgKeyUrl() {
        return gpgKeyUrl;
    }

    /** Whether signature verification should be done for the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("isGpgCheckEnabled")
    private final Boolean isGpgCheckEnabled;

    /**
     * Whether signature verification should be done for the software source.
     *
     * @return the value
     */
    public Boolean getIsGpgCheckEnabled() {
        return isGpgCheckEnabled;
    }

    /** Whether SSL validation needs to be turned on */
    @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyEnabled")
    private final Boolean isSslVerifyEnabled;

    /**
     * Whether SSL validation needs to be turned on
     *
     * @return the value
     */
    public Boolean getIsSslVerifyEnabled() {
        return isSslVerifyEnabled;
    }

    /** Advanced repository options for the software source */
    @com.fasterxml.jackson.annotation.JsonProperty("advancedRepoOptions")
    private final String advancedRepoOptions;

    /**
     * Advanced repository options for the software source
     *
     * @return the value
     */
    public String getAdvancedRepoOptions() {
        return advancedRepoOptions;
    }

    /** Whether this software source can be synced to a management station */
    @com.fasterxml.jackson.annotation.JsonProperty("isMirrorSyncAllowed")
    private final Boolean isMirrorSyncAllowed;

    /**
     * Whether this software source can be synced to a management station
     *
     * @return the value
     */
    public Boolean getIsMirrorSyncAllowed() {
        return isMirrorSyncAllowed;
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
        sb.append("UpdatePrivateSoftwareSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", gpgKeyUrl=").append(String.valueOf(this.gpgKeyUrl));
        sb.append(", isGpgCheckEnabled=").append(String.valueOf(this.isGpgCheckEnabled));
        sb.append(", isSslVerifyEnabled=").append(String.valueOf(this.isSslVerifyEnabled));
        sb.append(", advancedRepoOptions=").append(String.valueOf(this.advancedRepoOptions));
        sb.append(", isMirrorSyncAllowed=").append(String.valueOf(this.isMirrorSyncAllowed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePrivateSoftwareSourceDetails)) {
            return false;
        }

        UpdatePrivateSoftwareSourceDetails other = (UpdatePrivateSoftwareSourceDetails) o;
        return java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.gpgKeyUrl, other.gpgKeyUrl)
                && java.util.Objects.equals(this.isGpgCheckEnabled, other.isGpgCheckEnabled)
                && java.util.Objects.equals(this.isSslVerifyEnabled, other.isSslVerifyEnabled)
                && java.util.Objects.equals(this.advancedRepoOptions, other.advancedRepoOptions)
                && java.util.Objects.equals(this.isMirrorSyncAllowed, other.isMirrorSyncAllowed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.gpgKeyUrl == null ? 43 : this.gpgKeyUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.isGpgCheckEnabled == null ? 43 : this.isGpgCheckEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isSslVerifyEnabled == null
                                ? 43
                                : this.isSslVerifyEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedRepoOptions == null
                                ? 43
                                : this.advancedRepoOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.isMirrorSyncAllowed == null
                                ? 43
                                : this.isMirrorSyncAllowed.hashCode());
        return result;
    }
}
