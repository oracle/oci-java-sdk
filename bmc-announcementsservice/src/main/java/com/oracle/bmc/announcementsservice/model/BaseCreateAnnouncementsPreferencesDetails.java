/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * The model for the parameters of announcement email preferences configured for the tenancy (root
 * compartment). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = BaseCreateAnnouncementsPreferencesDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateAnnouncementsPreferencesDetails.class,
            name = "CreateAnnouncementsPreferencesDetails"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateAnnouncementsPreferencesDetails.class,
            name = "UpdateAnnouncementsPreferencesDetails")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class BaseCreateAnnouncementsPreferencesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isUnsubscribed",
        "compartmentId",
        "preferenceType",
        "preferredTimeZone"
    })
    protected BaseCreateAnnouncementsPreferencesDetails(
            Boolean isUnsubscribed,
            String compartmentId,
            PreferenceType preferenceType,
            String preferredTimeZone) {
        super();
        this.isUnsubscribed = isUnsubscribed;
        this.compartmentId = compartmentId;
        this.preferenceType = preferenceType;
        this.preferredTimeZone = preferredTimeZone;
    }

    /**
     * A Boolean value to indicate whether the specified compartment chooses to not to receive
     * informational announcements by email. (Manage preferences for receiving announcements by
     * email by specifying the {@code preferenceType} attribute instead.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsubscribed")
    private final Boolean isUnsubscribed;

    /**
     * A Boolean value to indicate whether the specified compartment chooses to not to receive
     * informational announcements by email. (Manage preferences for receiving announcements by
     * email by specifying the {@code preferenceType} attribute instead.)
     *
     * @return the value
     */
    public Boolean getIsUnsubscribed() {
        return isUnsubscribed;
    }

    /**
     * The OCID of the compartment for which you want to manage announcement email preferences.
     * (Specify the tenancy by providing the root compartment OCID.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment for which you want to manage announcement email preferences.
     * (Specify the tenancy by providing the root compartment OCID.)
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The string representing the user's preference, whether to opt in to only required
     * announcements, to opt in to all announcements, including informational announcements, or to
     * opt out of all announcements.
     */
    public enum PreferenceType implements com.oracle.bmc.http.internal.BmcEnum {
        OptInTenantAnnouncements("OPT_IN_TENANT_ANNOUNCEMENTS"),
        OptInTenantAndInformationalAnnouncements("OPT_IN_TENANT_AND_INFORMATIONAL_ANNOUNCEMENTS"),
        OptOutAllAnnouncements("OPT_OUT_ALL_ANNOUNCEMENTS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PreferenceType.class);

        private final String value;
        private static java.util.Map<String, PreferenceType> map;

        static {
            map = new java.util.HashMap<>();
            for (PreferenceType v : PreferenceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PreferenceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PreferenceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PreferenceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The string representing the user's preference, whether to opt in to only required
     * announcements, to opt in to all announcements, including informational announcements, or to
     * opt out of all announcements.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferenceType")
    private final PreferenceType preferenceType;

    /**
     * The string representing the user's preference, whether to opt in to only required
     * announcements, to opt in to all announcements, including informational announcements, or to
     * opt out of all announcements.
     *
     * @return the value
     */
    public PreferenceType getPreferenceType() {
        return preferenceType;
    }

    /**
     * The time zone in which the user prefers to receive announcements. Specify the preference with
     * a value that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
     * America/Los_Angeles
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredTimeZone")
    private final String preferredTimeZone;

    /**
     * The time zone in which the user prefers to receive announcements. Specify the preference with
     * a value that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
     * America/Los_Angeles
     *
     * @return the value
     */
    public String getPreferredTimeZone() {
        return preferredTimeZone;
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
        sb.append("BaseCreateAnnouncementsPreferencesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isUnsubscribed=").append(String.valueOf(this.isUnsubscribed));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof BaseCreateAnnouncementsPreferencesDetails)) {
            return false;
        }

        BaseCreateAnnouncementsPreferencesDetails other =
                (BaseCreateAnnouncementsPreferencesDetails) o;
        return java.util.Objects.equals(this.isUnsubscribed, other.isUnsubscribed)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
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
                        + (this.isUnsubscribed == null ? 43 : this.isUnsubscribed.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
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
