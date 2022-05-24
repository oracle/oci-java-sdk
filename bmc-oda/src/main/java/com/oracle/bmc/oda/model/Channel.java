/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties of a Channel.
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
    defaultImpl = Channel.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AppEventChannel.class,
        name = "APPEVENT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FacebookChannel.class,
        name = "FACEBOOK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = WebChannel.class, name = "WEB"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MSTeamsChannel.class,
        name = "MSTEAMS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TwilioChannel.class,
        name = "TWILIO"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OsvcChannel.class, name = "OSVC"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AndroidChannel.class,
        name = "ANDROID"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OSSChannel.class, name = "OSS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WebhookChannel.class,
        name = "WEBHOOK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ApplicationChannel.class,
        name = "APPLICATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SlackChannel.class, name = "SLACK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CortanaChannel.class,
        name = "CORTANA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ServiceCloudChannel.class,
        name = "SERVICECLOUD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = IosChannel.class, name = "IOS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TestChannel.class, name = "TEST")
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Channel {

    /**
     * Unique immutable identifier that was assigned when the Channel was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The Channel's name. The name can contain only letters, numbers, periods, and underscores. The name must begin with a letter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A short description of the Channel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The category of the Channel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    ChannelCategory category;

    /**
     * The number of milliseconds before a session expires.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
    Long sessionExpiryDurationInMilliseconds;

    /**
     * The Channel's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * When the resource was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * When the resource was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

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
