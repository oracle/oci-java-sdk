/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateIncident.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateIncident {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "ticket",
        "csi",
        "problemType",
        "contacts",
        "referrer"
    })
    public CreateIncident(
            String compartmentId,
            CreateTicketDetails ticket,
            String csi,
            ProblemType problemType,
            java.util.List<Contact> contacts,
            String referrer) {
        super();
        this.compartmentId = compartmentId;
        this.ticket = ticket;
        this.csi = csi;
        this.problemType = problemType;
        this.contacts = contacts;
        this.referrer = referrer;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ticket")
    private final CreateTicketDetails ticket;

    public CreateTicketDetails getTicket() {
        return ticket;
    }

    /**
     * The Customer Support Identifier number for the support account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final String csi;

    public String getCsi() {
        return csi;
    }

    /**
     * The kind of support ticket, such as a technical issue request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    public ProblemType getProblemType() {
        return problemType;
    }

    /**
     * The list of contacts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contacts")
    private final java.util.List<Contact> contacts;

    public java.util.List<Contact> getContacts() {
        return contacts;
    }

    /**
     * The incident referrer. This value is often the URL that the customer used when creating the support ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    private final String referrer;

    public String getReferrer() {
        return referrer;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateIncident(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", ticket=").append(String.valueOf(this.ticket));
        sb.append(", csi=").append(String.valueOf(this.csi));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
        sb.append(", contacts=").append(String.valueOf(this.contacts));
        sb.append(", referrer=").append(String.valueOf(this.referrer));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIncident)) {
            return false;
        }

        CreateIncident other = (CreateIncident) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.ticket, other.ticket)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && java.util.Objects.equals(this.contacts, other.contacts)
                && java.util.Objects.equals(this.referrer, other.referrer)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.ticket == null ? 43 : this.ticket.hashCode());
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        result = (result * PRIME) + (this.contacts == null ? 43 : this.contacts.hashCode());
        result = (result * PRIME) + (this.referrer == null ? 43 : this.referrer.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
