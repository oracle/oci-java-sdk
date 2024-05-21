/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public class BaseAnnouncementsPreferences
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "id",
        "isUnsubscribed",
        "timeCreated",
        "timeUpdated",
        "preferenceType",
        "preferredTimeZone"
    })
    protected BaseAnnouncementsPreferences(
            String compartmentId,
            String id,
            Boolean isUnsubscribed,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            BaseCreateAnnouncementsPreferencesDetails.PreferenceType preferenceType,
            String preferredTimeZone) {
        super();
        this.compartmentId = compartmentId;
        this.id = id;
        this.isUnsubscribed = isUnsubscribed;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.preferenceType = preferenceType;
        this.preferredTimeZone = preferredTimeZone;
    }

    /**
     * The OCID of the compartment for which the email preferences apply. Because announcements are
     * specific to a tenancy, specify the tenancy by providing the root compartment OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment for which the email preferences apply. Because announcements are
     * specific to a tenancy, specify the tenancy by providing the root compartment OCID.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The ID of the preferences.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of the preferences.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A Boolean value to indicate whether the specified compartment chooses to not to receive informational announcements by email.
     * (Manage preferences for receiving announcements by email by specifying the {@code preferenceType} attribute instead.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsubscribed")
    private final Boolean isUnsubscribed;

    /**
     * A Boolean value to indicate whether the specified compartment chooses to not to receive informational announcements by email.
     * (Manage preferences for receiving announcements by email by specifying the {@code preferenceType} attribute instead.)
     *
     * @return the value
     **/
    public Boolean getIsUnsubscribed() {
        return isUnsubscribed;
    }

    /**
     * When the preferences were set initially.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * When the preferences were set initially.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * When the preferences were last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * When the preferences were last updated.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The string representing the user's preference regarding receiving announcements by email.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferenceType")
    private final BaseCreateAnnouncementsPreferencesDetails.PreferenceType preferenceType;

    /**
     * The string representing the user's preference regarding receiving announcements by email.
     * @return the value
     **/
    public BaseCreateAnnouncementsPreferencesDetails.PreferenceType getPreferenceType() {
        return preferenceType;
    }

    /**
     * The time zone in which the user prefers to receive announcements. Specify the preference with a value that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example - America/Los_Angeles
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferredTimeZone")
    private final String preferredTimeZone;

    /**
     * The time zone in which the user prefers to receive announcements. Specify the preference with a value that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example - America/Los_Angeles
     * @return the value
     **/
    public String getPreferredTimeZone() {
        return preferredTimeZone;
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
        sb.append("BaseAnnouncementsPreferences(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", isUnsubscribed=").append(String.valueOf(this.isUnsubscribed));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", preferenceType=").append(String.valueOf(this.preferenceType));
        sb.append(", preferredTimeZone=").append(String.valueOf(this.preferredTimeZone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseAnnouncementsPreferences)) {
            return false;
        }

        BaseAnnouncementsPreferences other = (BaseAnnouncementsPreferences) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isUnsubscribed, other.isUnsubscribed)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.preferenceType, other.preferenceType)
                && java.util.Objects.equals(this.preferredTimeZone, other.preferredTimeZone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnsubscribed == null ? 43 : this.isUnsubscribed.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.preferenceType == null ? 43 : this.preferenceType.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredTimeZone == null ? 43 : this.preferredTimeZone.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
