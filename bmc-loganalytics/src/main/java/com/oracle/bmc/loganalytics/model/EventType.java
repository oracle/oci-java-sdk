/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The event type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EventType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EventType extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "eventTypeName",
        "specVersion",
        "isEnabled",
        "isSystem",
        "timeUpdated"
    })
    public EventType(
            String eventTypeName,
            String specVersion,
            Boolean isEnabled,
            Boolean isSystem,
            java.util.Date timeUpdated) {
        super();
        this.eventTypeName = eventTypeName;
        this.specVersion = specVersion;
        this.isEnabled = isEnabled;
        this.isSystem = isSystem;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the event type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("eventTypeName")
        private String eventTypeName;

        /**
         * The name of the event type.
         * @param eventTypeName the value to set
         * @return this builder
         **/
        public Builder eventTypeName(String eventTypeName) {
            this.eventTypeName = eventTypeName;
            this.__explicitlySet__.add("eventTypeName");
            return this;
        }
        /**
         * The version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("specVersion")
        private String specVersion;

        /**
         * The version.
         * @param specVersion the value to set
         * @return this builder
         **/
        public Builder specVersion(String specVersion) {
            this.specVersion = specVersion;
            this.__explicitlySet__.add("specVersion");
            return this;
        }
        /**
         * A flag indicating whether or not the event type is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag indicating whether or not the event type is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * A flag indicating whether or not the event type is user defined.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * A flag indicating whether or not the event type is user defined.
         *
         * @param isSystem the value to set
         * @return this builder
         **/
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /**
         * The last updated time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last updated time.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EventType build() {
            EventType model =
                    new EventType(
                            this.eventTypeName,
                            this.specVersion,
                            this.isEnabled,
                            this.isSystem,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EventType model) {
            if (model.wasPropertyExplicitlySet("eventTypeName")) {
                this.eventTypeName(model.getEventTypeName());
            }
            if (model.wasPropertyExplicitlySet("specVersion")) {
                this.specVersion(model.getSpecVersion());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name of the event type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventTypeName")
    private final String eventTypeName;

    /**
     * The name of the event type.
     * @return the value
     **/
    public String getEventTypeName() {
        return eventTypeName;
    }

    /**
     * The version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("specVersion")
    private final String specVersion;

    /**
     * The version.
     * @return the value
     **/
    public String getSpecVersion() {
        return specVersion;
    }

    /**
     * A flag indicating whether or not the event type is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag indicating whether or not the event type is enabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * A flag indicating whether or not the event type is user defined.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * A flag indicating whether or not the event type is user defined.
     *
     * @return the value
     **/
    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The last updated time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last updated time.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("EventType(");
        sb.append("super=").append(super.toString());
        sb.append("eventTypeName=").append(String.valueOf(this.eventTypeName));
        sb.append(", specVersion=").append(String.valueOf(this.specVersion));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EventType)) {
            return false;
        }

        EventType other = (EventType) o;
        return java.util.Objects.equals(this.eventTypeName, other.eventTypeName)
                && java.util.Objects.equals(this.specVersion, other.specVersion)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.eventTypeName == null ? 43 : this.eventTypeName.hashCode());
        result = (result * PRIME) + (this.specVersion == null ? 43 : this.specVersion.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
