/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the ticket created. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Ticket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Ticket extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ticketNumber",
        "severity",
        "resourceList",
        "title",
        "description",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails"
    })
    public Ticket(
            String ticketNumber,
            Severity severity,
            java.util.List<Resource> resourceList,
            String title,
            String description,
            Integer timeCreated,
            Integer timeUpdated,
            LifecycleState lifecycleState,
            LifecycleDetails lifecycleDetails) {
        super();
        this.ticketNumber = ticketNumber;
        this.severity = severity;
        this.resourceList = resourceList;
        this.title = title;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the ticket. */
        @com.fasterxml.jackson.annotation.JsonProperty("ticketNumber")
        private String ticketNumber;

        /**
         * Unique identifier for the ticket.
         *
         * @param ticketNumber the value to set
         * @return this builder
         */
        public Builder ticketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
            this.__explicitlySet__.add("ticketNumber");
            return this;
        }
        /** The severity assigned to the ticket. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The severity assigned to the ticket.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** The list of resources associated with the ticket. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceList")
        private java.util.List<Resource> resourceList;

        /**
         * The list of resources associated with the ticket.
         *
         * @param resourceList the value to set
         * @return this builder
         */
        public Builder resourceList(java.util.List<Resource> resourceList) {
            this.resourceList = resourceList;
            this.__explicitlySet__.add("resourceList");
            return this;
        }
        /** The title of the ticket. */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The title of the ticket.
         *
         * @param title the value to set
         * @return this builder
         */
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /** The description of the issue addressed in the ticket. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the issue addressed in the ticket.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The time when the ticket was created, in seconds since epoch time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private Integer timeCreated;

        /**
         * The time when the ticket was created, in seconds since epoch time.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(Integer timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when the ticket was updated, in seconds since epoch time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private Integer timeUpdated;

        /**
         * The time when the ticket was updated, in seconds since epoch time.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(Integer timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the ticket. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the ticket.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current {@code lifecycleState}. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * Additional information about the current {@code lifecycleState}.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Ticket build() {
            Ticket model =
                    new Ticket(
                            this.ticketNumber,
                            this.severity,
                            this.resourceList,
                            this.title,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Ticket model) {
            if (model.wasPropertyExplicitlySet("ticketNumber")) {
                this.ticketNumber(model.getTicketNumber());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("resourceList")) {
                this.resourceList(model.getResourceList());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** Unique identifier for the ticket. */
    @com.fasterxml.jackson.annotation.JsonProperty("ticketNumber")
    private final String ticketNumber;

    /**
     * Unique identifier for the ticket.
     *
     * @return the value
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /** The severity assigned to the ticket. */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        Highest("HIGHEST"),
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Severity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The severity assigned to the ticket. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The severity assigned to the ticket.
     *
     * @return the value
     */
    public Severity getSeverity() {
        return severity;
    }

    /** The list of resources associated with the ticket. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceList")
    private final java.util.List<Resource> resourceList;

    /**
     * The list of resources associated with the ticket.
     *
     * @return the value
     */
    public java.util.List<Resource> getResourceList() {
        return resourceList;
    }

    /** The title of the ticket. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The title of the ticket.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /** The description of the issue addressed in the ticket. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the issue addressed in the ticket.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The time when the ticket was created, in seconds since epoch time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final Integer timeCreated;

    /**
     * The time when the ticket was created, in seconds since epoch time.
     *
     * @return the value
     */
    public Integer getTimeCreated() {
        return timeCreated;
    }

    /** The time when the ticket was updated, in seconds since epoch time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final Integer timeUpdated;

    /**
     * The time when the ticket was updated, in seconds since epoch time.
     *
     * @return the value
     */
    public Integer getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the ticket. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the ticket.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current {@code lifecycleState}. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * Additional information about the current {@code lifecycleState}.
     *
     * @return the value
     */
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("Ticket(");
        sb.append("super=").append(super.toString());
        sb.append("ticketNumber=").append(String.valueOf(this.ticketNumber));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", resourceList=").append(String.valueOf(this.resourceList));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ticket)) {
            return false;
        }

        Ticket other = (Ticket) o;
        return java.util.Objects.equals(this.ticketNumber, other.ticketNumber)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.resourceList, other.resourceList)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ticketNumber == null ? 43 : this.ticketNumber.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.resourceList == null ? 43 : this.resourceList.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
