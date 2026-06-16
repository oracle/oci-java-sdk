/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Result of a query request for a list of link features. Contains LinkFeature items. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LinkFeatureSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LinkFeatureSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "feature",
        "displayName",
        "description",
        "partnerServiceConsoleUrl",
        "userGuideUrl"
    })
    public LinkFeatureSummary(
            String feature,
            String displayName,
            String description,
            String partnerServiceConsoleUrl,
            String userGuideUrl) {
        super();
        this.feature = feature;
        this.displayName = displayName;
        this.description = description;
        this.partnerServiceConsoleUrl = partnerServiceConsoleUrl;
        this.userGuideUrl = userGuideUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The feature associated with this link. Default value is CORE. */
        @com.fasterxml.jackson.annotation.JsonProperty("feature")
        private String feature;

        /**
         * The feature associated with this link. Default value is CORE.
         *
         * @param feature the value to set
         * @return this builder
         */
        public Builder feature(String feature) {
            this.feature = feature;
            this.__explicitlySet__.add("feature");
            return this;
        }
        /** Display name of the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the feature.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the feature.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** ConsoleUrl of the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerServiceConsoleUrl")
        private String partnerServiceConsoleUrl;

        /**
         * ConsoleUrl of the feature.
         *
         * @param partnerServiceConsoleUrl the value to set
         * @return this builder
         */
        public Builder partnerServiceConsoleUrl(String partnerServiceConsoleUrl) {
            this.partnerServiceConsoleUrl = partnerServiceConsoleUrl;
            this.__explicitlySet__.add("partnerServiceConsoleUrl");
            return this;
        }
        /** UserGuideUrl of the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("userGuideUrl")
        private String userGuideUrl;

        /**
         * UserGuideUrl of the feature.
         *
         * @param userGuideUrl the value to set
         * @return this builder
         */
        public Builder userGuideUrl(String userGuideUrl) {
            this.userGuideUrl = userGuideUrl;
            this.__explicitlySet__.add("userGuideUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LinkFeatureSummary build() {
            LinkFeatureSummary model =
                    new LinkFeatureSummary(
                            this.feature,
                            this.displayName,
                            this.description,
                            this.partnerServiceConsoleUrl,
                            this.userGuideUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LinkFeatureSummary model) {
            if (model.wasPropertyExplicitlySet("feature")) {
                this.feature(model.getFeature());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("partnerServiceConsoleUrl")) {
                this.partnerServiceConsoleUrl(model.getPartnerServiceConsoleUrl());
            }
            if (model.wasPropertyExplicitlySet("userGuideUrl")) {
                this.userGuideUrl(model.getUserGuideUrl());
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

    /** The feature associated with this link. Default value is CORE. */
    @com.fasterxml.jackson.annotation.JsonProperty("feature")
    private final String feature;

    /**
     * The feature associated with this link. Default value is CORE.
     *
     * @return the value
     */
    public String getFeature() {
        return feature;
    }

    /** Display name of the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the feature.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the feature.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** ConsoleUrl of the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerServiceConsoleUrl")
    private final String partnerServiceConsoleUrl;

    /**
     * ConsoleUrl of the feature.
     *
     * @return the value
     */
    public String getPartnerServiceConsoleUrl() {
        return partnerServiceConsoleUrl;
    }

    /** UserGuideUrl of the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("userGuideUrl")
    private final String userGuideUrl;

    /**
     * UserGuideUrl of the feature.
     *
     * @return the value
     */
    public String getUserGuideUrl() {
        return userGuideUrl;
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
        sb.append("LinkFeatureSummary(");
        sb.append("super=").append(super.toString());
        sb.append("feature=").append(String.valueOf(this.feature));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", partnerServiceConsoleUrl=")
                .append(String.valueOf(this.partnerServiceConsoleUrl));
        sb.append(", userGuideUrl=").append(String.valueOf(this.userGuideUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkFeatureSummary)) {
            return false;
        }

        LinkFeatureSummary other = (LinkFeatureSummary) o;
        return java.util.Objects.equals(this.feature, other.feature)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.partnerServiceConsoleUrl, other.partnerServiceConsoleUrl)
                && java.util.Objects.equals(this.userGuideUrl, other.userGuideUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.feature == null ? 43 : this.feature.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerServiceConsoleUrl == null
                                ? 43
                                : this.partnerServiceConsoleUrl.hashCode());
        result = (result * PRIME) + (this.userGuideUrl == null ? 43 : this.userGuideUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
