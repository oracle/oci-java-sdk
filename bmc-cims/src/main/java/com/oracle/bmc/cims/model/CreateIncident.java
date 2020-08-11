/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details gathered during the creation of the support ticket.
 * <p>
 **Caution:** Avoid using any confidential information when you supply string values using the API.
 *
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateIncident.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateIncident {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ticket")
        private CreateTicketDetails ticket;

        public Builder ticket(CreateTicketDetails ticket) {
            this.ticket = ticket;
            this.__explicitlySet__.add("ticket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private String csi;

        public Builder csi(String csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contacts")
        private java.util.List<Contact> contacts;

        public Builder contacts(java.util.List<Contact> contacts) {
            this.contacts = contacts;
            this.__explicitlySet__.add("contacts");
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

        public CreateIncident build() {
            CreateIncident __instance__ =
                    new CreateIncident(compartmentId, ticket, csi, problemType, contacts, referrer);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIncident o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .ticket(o.getTicket())
                            .csi(o.getCsi())
                            .problemType(o.getProblemType())
                            .contacts(o.getContacts())
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
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    @com.fasterxml.jackson.annotation.JsonProperty("ticket")
    CreateTicketDetails ticket;

    /**
     * The Customer Support Identifier number for the support account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    String csi;

    /**
     * The kind of support ticket, such as a technical issue request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    ProblemType problemType;

    /**
     * The list of contacts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contacts")
    java.util.List<Contact> contacts;

    /**
     * The incident referrer. This value is often the URL that the customer used when creating the support ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    String referrer;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
