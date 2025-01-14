/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Event settings <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NotificationSettingsEventSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NotificationSettingsEventSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"eventId", "enabled"})
    public NotificationSettingsEventSettings(String eventId, Boolean enabled) {
        super();
        this.eventId = eventId;
        this.enabled = enabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * IDCS-generated event
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventId")
        private String eventId;

        /**
         * IDCS-generated event
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param eventId the value to set
         * @return this builder
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            this.__explicitlySet__.add("eventId");
            return this;
        }
        /**
         * Specify if notifications are enabled for the event
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enabled")
        private Boolean enabled;

        /**
         * Specify if notifications are enabled for the event
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param enabled the value to set
         * @return this builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            this.__explicitlySet__.add("enabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NotificationSettingsEventSettings build() {
            NotificationSettingsEventSettings model =
                    new NotificationSettingsEventSettings(this.eventId, this.enabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotificationSettingsEventSettings model) {
            if (model.wasPropertyExplicitlySet("eventId")) {
                this.eventId(model.getEventId());
            }
            if (model.wasPropertyExplicitlySet("enabled")) {
                this.enabled(model.getEnabled());
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

    /**
     * IDCS-generated event
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventId")
    private final String eventId;

    /**
     * IDCS-generated event
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Specify if notifications are enabled for the event
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    private final Boolean enabled;

    /**
     * Specify if notifications are enabled for the event
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getEnabled() {
        return enabled;
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
        sb.append("NotificationSettingsEventSettings(");
        sb.append("super=").append(super.toString());
        sb.append("eventId=").append(String.valueOf(this.eventId));
        sb.append(", enabled=").append(String.valueOf(this.enabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationSettingsEventSettings)) {
            return false;
        }

        NotificationSettingsEventSettings other = (NotificationSettingsEventSettings) o;
        return java.util.Objects.equals(this.eventId, other.eventId)
                && java.util.Objects.equals(this.enabled, other.enabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.eventId == null ? 43 : this.eventId.hashCode());
        result = (result * PRIME) + (this.enabled == null ? 43 : this.enabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
