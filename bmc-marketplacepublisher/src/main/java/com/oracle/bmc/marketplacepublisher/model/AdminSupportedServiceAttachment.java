/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Supported service attachment for the listing revision. <br>
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
        builder = AdminSupportedServiceAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "attachmentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdminSupportedServiceAttachment extends AdminListingRevisionAttachment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingRevisionId")
        private String listingRevisionId;

        public Builder listingRevisionId(String listingRevisionId) {
            this.listingRevisionId = listingRevisionId;
            this.__explicitlySet__.add("listingRevisionId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private ListingRevisionAttachment.SourceType sourceType;

        public Builder sourceType(ListingRevisionAttachment.SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ListingRevisionAttachment.LifecycleState lifecycleState;

        public Builder lifecycleState(ListingRevisionAttachment.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Identifies whether the attachment is for Internal Oracle Users or external users as well.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOracleUsersOnly")
        private Boolean isOracleUsersOnly;

        /**
         * Identifies whether the attachment is for Internal Oracle Users or external users as well.
         *
         * @param isOracleUsersOnly the value to set
         * @return this builder
         */
        public Builder isOracleUsersOnly(Boolean isOracleUsersOnly) {
            this.isOracleUsersOnly = isOracleUsersOnly;
            this.__explicitlySet__.add("isOracleUsersOnly");
            return this;
        }
        /** Name of the service */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Name of the service
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** Optional url to service */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Optional url to service
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** Type of service */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private SupportedServiceAttachment.Type type;

        /**
         * Type of service
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(SupportedServiceAttachment.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** URL of the uploaded document. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
        private String contentUrl;

        /**
         * URL of the uploaded document.
         *
         * @param contentUrl the value to set
         * @return this builder
         */
        public Builder contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            this.__explicitlySet__.add("contentUrl");
            return this;
        }
        /** The MIME type of the uploaded data. */
        @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
        private String mimeType;

        /**
         * The MIME type of the uploaded data.
         *
         * @param mimeType the value to set
         * @return this builder
         */
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            this.__explicitlySet__.add("mimeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdminSupportedServiceAttachment build() {
            AdminSupportedServiceAttachment model =
                    new AdminSupportedServiceAttachment(
                            this.id,
                            this.compartmentId,
                            this.listingRevisionId,
                            this.displayName,
                            this.description,
                            this.sourceType,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.isOracleUsersOnly,
                            this.serviceName,
                            this.url,
                            this.type,
                            this.contentUrl,
                            this.mimeType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminSupportedServiceAttachment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("listingRevisionId")) {
                this.listingRevisionId(model.getListingRevisionId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("isOracleUsersOnly")) {
                this.isOracleUsersOnly(model.getIsOracleUsersOnly());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("contentUrl")) {
                this.contentUrl(model.getContentUrl());
            }
            if (model.wasPropertyExplicitlySet("mimeType")) {
                this.mimeType(model.getMimeType());
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
    public AdminSupportedServiceAttachment(
            String id,
            String compartmentId,
            String listingRevisionId,
            String displayName,
            String description,
            ListingRevisionAttachment.SourceType sourceType,
            ListingRevisionAttachment.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isOracleUsersOnly,
            String serviceName,
            String url,
            SupportedServiceAttachment.Type type,
            String contentUrl,
            String mimeType) {
        super(
                id,
                compartmentId,
                listingRevisionId,
                displayName,
                description,
                sourceType,
                lifecycleState,
                timeCreated,
                timeUpdated,
                freeformTags,
                definedTags,
                systemTags);
        this.isOracleUsersOnly = isOracleUsersOnly;
        this.serviceName = serviceName;
        this.url = url;
        this.type = type;
        this.contentUrl = contentUrl;
        this.mimeType = mimeType;
    }

    /** Identifies whether the attachment is for Internal Oracle Users or external users as well. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOracleUsersOnly")
    private final Boolean isOracleUsersOnly;

    /**
     * Identifies whether the attachment is for Internal Oracle Users or external users as well.
     *
     * @return the value
     */
    public Boolean getIsOracleUsersOnly() {
        return isOracleUsersOnly;
    }

    /** Name of the service */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Name of the service
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Optional url to service */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Optional url to service
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** Type of service */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final SupportedServiceAttachment.Type type;

    /**
     * Type of service
     *
     * @return the value
     */
    public SupportedServiceAttachment.Type getType() {
        return type;
    }

    /** URL of the uploaded document. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
    private final String contentUrl;

    /**
     * URL of the uploaded document.
     *
     * @return the value
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /** The MIME type of the uploaded data. */
    @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
    private final String mimeType;

    /**
     * The MIME type of the uploaded data.
     *
     * @return the value
     */
    public String getMimeType() {
        return mimeType;
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
        sb.append("AdminSupportedServiceAttachment(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isOracleUsersOnly=").append(String.valueOf(this.isOracleUsersOnly));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", contentUrl=").append(String.valueOf(this.contentUrl));
        sb.append(", mimeType=").append(String.valueOf(this.mimeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdminSupportedServiceAttachment)) {
            return false;
        }

        AdminSupportedServiceAttachment other = (AdminSupportedServiceAttachment) o;
        return java.util.Objects.equals(this.isOracleUsersOnly, other.isOracleUsersOnly)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.contentUrl, other.contentUrl)
                && java.util.Objects.equals(this.mimeType, other.mimeType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isOracleUsersOnly == null ? 43 : this.isOracleUsersOnly.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.contentUrl == null ? 43 : this.contentUrl.hashCode());
        result = (result * PRIME) + (this.mimeType == null ? 43 : this.mimeType.hashCode());
        return result;
    }
}
