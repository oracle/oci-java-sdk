/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details of Incident
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Incident.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Incident {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contactList")
        private ContactList contactList;

        public Builder contactList(ContactList contactList) {
            this.contactList = contactList;
            this.__explicitlySet__.add("contactList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyInformation")
        private TenancyInformation tenancyInformation;

        public Builder tenancyInformation(TenancyInformation tenancyInformation) {
            this.tenancyInformation = tenancyInformation;
            this.__explicitlySet__.add("tenancyInformation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ticket")
        private Ticket ticket;

        public Builder ticket(Ticket ticket) {
            this.ticket = ticket;
            this.__explicitlySet__.add("ticket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("incidentType")
        private IncidentType incidentType;

        public Builder incidentType(IncidentType incidentType) {
            this.incidentType = incidentType;
            this.__explicitlySet__.add("incidentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referrer")
        private String referrer;

        public Builder referrer(String referrer) {
            this.referrer = referrer;
            this.__explicitlySet__.add("referrer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Incident build() {
            Incident __instance__ =
                    new Incident(
                            key,
                            compartmentId,
                            contactList,
                            tenancyInformation,
                            ticket,
                            incidentType,
                            problemType,
                            referrer);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Incident o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .compartmentId(o.getCompartmentId())
                            .contactList(o.getContactList())
                            .tenancyInformation(o.getTenancyInformation())
                            .ticket(o.getTicket())
                            .incidentType(o.getIncidentType())
                            .problemType(o.getProblemType())
                            .referrer(o.getReferrer());

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
     * Unique ID that identifies an Incident
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Tenancy Ocid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    @com.fasterxml.jackson.annotation.JsonProperty("contactList")
    ContactList contactList;

    @com.fasterxml.jackson.annotation.JsonProperty("tenancyInformation")
    TenancyInformation tenancyInformation;

    @com.fasterxml.jackson.annotation.JsonProperty("ticket")
    Ticket ticket;

    @com.fasterxml.jackson.annotation.JsonProperty("incidentType")
    IncidentType incidentType;

    /**
     * States type of incident. eg: LIMIT, TECH
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    ProblemType problemType;

    /**
     * Referrer of the incident., its usually the URL for where the customer logged the incident
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    String referrer;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
