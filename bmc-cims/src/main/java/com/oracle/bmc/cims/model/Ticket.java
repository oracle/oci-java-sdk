/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the ticket created.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Ticket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Ticket {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ticketNumber")
        private String ticketNumber;

        public Builder ticketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
            this.__explicitlySet__.add("ticketNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceList")
        private java.util.List<Resource> resourceList;

        public Builder resourceList(java.util.List<Resource> resourceList) {
            this.resourceList = resourceList;
            this.__explicitlySet__.add("resourceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private Integer timeCreated;

        public Builder timeCreated(Integer timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private Integer timeUpdated;

        public Builder timeUpdated(Integer timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Ticket build() {
            Ticket __instance__ =
                    new Ticket(
                            ticketNumber,
                            severity,
                            resourceList,
                            title,
                            description,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Ticket o) {
            Builder copiedBuilder =
                    ticketNumber(o.getTicketNumber())
                            .severity(o.getSeverity())
                            .resourceList(o.getResourceList())
                            .title(o.getTitle())
                            .description(o.getDescription())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ticketNumber")
    String ticketNumber;
    /**
     * The severity assigned to the ticket.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Severity {
        Highest("HIGHEST"),
        High("HIGH"),
        Medium("MEDIUM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The severity assigned to the ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    Severity severity;

    /**
     * The list of resources associated with the ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceList")
    java.util.List<Resource> resourceList;

    /**
     * The title of the ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    String title;

    /**
     * The description of the issue addressed in the ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The time when the ticket was created, in milliseconds since epoch time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    Integer timeCreated;

    /**
     * The time when the ticket was updated, in milliseconds since epoch time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    Integer timeUpdated;

    /**
     * The current state of the ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Additional information about the current {@code lifecycleState}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    LifecycleDetails lifecycleDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
