/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the support ticket.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IncidentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IncidentSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "compartmentId",
        "contactList",
        "tenancyInformation",
        "ticket",
        "incidentType",
        "problemType"
    })
    public IncidentSummary(
            String key,
            String compartmentId,
            ContactList contactList,
            TenancyInformation tenancyInformation,
            Ticket ticket,
            IncidentResourceType incidentType,
            ProblemType problemType) {
        super();
        this.key = key;
        this.compartmentId = compartmentId;
        this.contactList = contactList;
        this.tenancyInformation = tenancyInformation;
        this.ticket = ticket;
        this.incidentType = incidentType;
        this.problemType = problemType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier of the incident.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique identifier of the incident.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The OCID of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy.
         * @param compartmentId the value to set
         * @return this builder
         **/
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
        private IncidentResourceType incidentType;

        public Builder incidentType(IncidentResourceType incidentType) {
            this.incidentType = incidentType;
            this.__explicitlySet__.add("incidentType");
            return this;
        }
        /**
         * The kind of support ticket, such as a technical support request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        /**
         * The kind of support ticket, such as a technical support request.
         * @param problemType the value to set
         * @return this builder
         **/
        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IncidentSummary build() {
            IncidentSummary __instance__ =
                    new IncidentSummary(
                            key,
                            compartmentId,
                            contactList,
                            tenancyInformation,
                            ticket,
                            incidentType,
                            problemType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IncidentSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .compartmentId(o.getCompartmentId())
                            .contactList(o.getContactList())
                            .tenancyInformation(o.getTenancyInformation())
                            .ticket(o.getTicket())
                            .incidentType(o.getIncidentType())
                            .problemType(o.getProblemType());

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
     * Unique identifier of the incident.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique identifier of the incident.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contactList")
    private final ContactList contactList;

    public ContactList getContactList() {
        return contactList;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tenancyInformation")
    private final TenancyInformation tenancyInformation;

    public TenancyInformation getTenancyInformation() {
        return tenancyInformation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ticket")
    private final Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("incidentType")
    private final IncidentResourceType incidentType;

    public IncidentResourceType getIncidentType() {
        return incidentType;
    }

    /**
     * The kind of support ticket, such as a technical support request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    /**
     * The kind of support ticket, such as a technical support request.
     * @return the value
     **/
    public ProblemType getProblemType() {
        return problemType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IncidentSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", contactList=").append(String.valueOf(this.contactList));
        sb.append(", tenancyInformation=").append(String.valueOf(this.tenancyInformation));
        sb.append(", ticket=").append(String.valueOf(this.ticket));
        sb.append(", incidentType=").append(String.valueOf(this.incidentType));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncidentSummary)) {
            return false;
        }

        IncidentSummary other = (IncidentSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.contactList, other.contactList)
                && java.util.Objects.equals(this.tenancyInformation, other.tenancyInformation)
                && java.util.Objects.equals(this.ticket, other.ticket)
                && java.util.Objects.equals(this.incidentType, other.incidentType)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.contactList == null ? 43 : this.contactList.hashCode());
        result =
                (result * PRIME)
                        + (this.tenancyInformation == null
                                ? 43
                                : this.tenancyInformation.hashCode());
        result = (result * PRIME) + (this.ticket == null ? 43 : this.ticket.hashCode());
        result = (result * PRIME) + (this.incidentType == null ? 43 : this.incidentType.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
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
