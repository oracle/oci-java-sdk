/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
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
public class UpdateChannelDetails {

    /**
     * A short description of the Channel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The number of milliseconds before a session expires.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
    Long sessionExpiryDurationInMilliseconds;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;
}
