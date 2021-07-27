/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * The object that contains the announcement email preferences configured for the tenancy (root compartment).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
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
    defaultImpl = BaseAnnouncementsPreferences.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AnnouncementsPreferencesSummary.class,
        name = "AnnouncementsPreferencesSummary"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AnnouncementsPreferences.class,
        name = "AnnouncementsPreferences"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BaseAnnouncementsPreferences {

    /**
     * The OCID of the compartment for which the email preferences apply. Because announcements are
     * specific to a tenancy, specify the tenancy by providing the root compartment OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The ID of the preferences.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * A Boolean value to indicate whether the specified compartment chooses to not to receive informational announcements by email.
     * (Manage preferences for receiving announcements by email by specifying the {@code preferenceType} attribute instead.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsubscribed")
    Boolean isUnsubscribed;

    /**
     * When the preferences were set initially.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * When the preferences were last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The string representing the user's preference regarding receiving announcements by email.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferenceType")
    BaseCreateAnnouncementsPreferencesDetails.PreferenceType preferenceType;
}
