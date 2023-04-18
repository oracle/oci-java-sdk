/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties to update a Channel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = UpdateChannelDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOsvcChannelDetails.class,
        name = "OSVC"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateOSSChannelDetails.class,
        name = "OSS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateAndroidChannelDetails.class,
        name = "ANDROID"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateMSTeamsChannelDetails.class,
        name = "MSTEAMS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateAppEventChannelDetails.class,
        name = "APPEVENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateWebChannelDetails.class,
        name = "WEB"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateIosChannelDetails.class,
        name = "IOS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateSlackChannelDetails.class,
        name = "SLACK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateServiceCloudChannelDetails.class,
        name = "SERVICECLOUD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateTwilioChannelDetails.class,
        name = "TWILIO"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateWebhookChannelDetails.class,
        name = "WEBHOOK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateApplicationChannelDetails.class,
        name = "APPLICATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateFacebookChannelDetails.class,
        name = "FACEBOOK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateCortanaChannelDetails.class,
        name = "CORTANA"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateChannelDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "sessionExpiryDurationInMilliseconds",
        "freeformTags",
        "definedTags"
    })
    protected UpdateChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.description = description;
        this.sessionExpiryDurationInMilliseconds = sessionExpiryDurationInMilliseconds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /**
     * The Channel's name. The name can contain only letters, numbers, periods, and underscores. The name must begin with a letter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The Channel's name. The name can contain only letters, numbers, periods, and underscores. The name must begin with a letter.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A short description of the Channel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the Channel.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The number of milliseconds before a session expires.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
    private final Long sessionExpiryDurationInMilliseconds;

    /**
     * The number of milliseconds before a session expires.
     * @return the value
     **/
    public Long getSessionExpiryDurationInMilliseconds() {
        return sessionExpiryDurationInMilliseconds;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateChannelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", sessionExpiryDurationInMilliseconds=")
                .append(String.valueOf(this.sessionExpiryDurationInMilliseconds));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateChannelDetails)) {
            return false;
        }

        UpdateChannelDetails other = (UpdateChannelDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.sessionExpiryDurationInMilliseconds,
                        other.sessionExpiryDurationInMilliseconds)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionExpiryDurationInMilliseconds == null
                                ? 43
                                : this.sessionExpiryDurationInMilliseconds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
