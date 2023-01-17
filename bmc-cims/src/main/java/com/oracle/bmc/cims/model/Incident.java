/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details of about the incident object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Incident.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Incident extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "compartmentId",
        "contactList",
        "tenancyInformation",
        "ticket",
        "incidentType",
        "problemType",
        "referrer"
    })
    public Incident(
            String key,
            String compartmentId,
            ContactList contactList,
            TenancyInformation tenancyInformation,
            Ticket ticket,
            IncidentType incidentType,
            ProblemType problemType,
            String referrer) {
        super();
        this.key = key;
        this.compartmentId = compartmentId;
        this.contactList = contactList;
        this.tenancyInformation = tenancyInformation;
        this.ticket = ticket;
        this.incidentType = incidentType;
        this.problemType = problemType;
        this.referrer = referrer;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the support ticket. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique identifier for the support ticket.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The OCID of the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
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
        /** The kind of support ticket, such as a technical support request. */
        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        /**
         * The kind of support ticket, such as a technical support request.
         *
         * @param problemType the value to set
         * @return this builder
         */
        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }
        /**
         * The incident referrer. This value is often the URL that the customer used when creating
         * the support ticket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("referrer")
        private String referrer;

        /**
         * The incident referrer. This value is often the URL that the customer used when creating
         * the support ticket.
         *
         * @param referrer the value to set
         * @return this builder
         */
        public Builder referrer(String referrer) {
            this.referrer = referrer;
            this.__explicitlySet__.add("referrer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Incident build() {
            Incident model =
                    new Incident(
                            this.key,
                            this.compartmentId,
                            this.contactList,
                            this.tenancyInformation,
                            this.ticket,
                            this.incidentType,
                            this.problemType,
                            this.referrer);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Incident model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("contactList")) {
                this.contactList(model.getContactList());
            }
            if (model.wasPropertyExplicitlySet("tenancyInformation")) {
                this.tenancyInformation(model.getTenancyInformation());
            }
            if (model.wasPropertyExplicitlySet("ticket")) {
                this.ticket(model.getTicket());
            }
            if (model.wasPropertyExplicitlySet("incidentType")) {
                this.incidentType(model.getIncidentType());
            }
            if (model.wasPropertyExplicitlySet("problemType")) {
                this.problemType(model.getProblemType());
            }
            if (model.wasPropertyExplicitlySet("referrer")) {
                this.referrer(model.getReferrer());
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

    /** Unique identifier for the support ticket. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique identifier for the support ticket.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The OCID of the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy.
     *
     * @return the value
     */
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
    private final IncidentType incidentType;

    public IncidentType getIncidentType() {
        return incidentType;
    }

    /** The kind of support ticket, such as a technical support request. */
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    /**
     * The kind of support ticket, such as a technical support request.
     *
     * @return the value
     */
    public ProblemType getProblemType() {
        return problemType;
    }

    /**
     * The incident referrer. This value is often the URL that the customer used when creating the
     * support ticket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    private final String referrer;

    /**
     * The incident referrer. This value is often the URL that the customer used when creating the
     * support ticket.
     *
     * @return the value
     */
    public String getReferrer() {
        return referrer;
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
        sb.append("Incident(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", contactList=").append(String.valueOf(this.contactList));
        sb.append(", tenancyInformation=").append(String.valueOf(this.tenancyInformation));
        sb.append(", ticket=").append(String.valueOf(this.ticket));
        sb.append(", incidentType=").append(String.valueOf(this.incidentType));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
        sb.append(", referrer=").append(String.valueOf(this.referrer));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Incident)) {
            return false;
        }

        Incident other = (Incident) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.contactList, other.contactList)
                && java.util.Objects.equals(this.tenancyInformation, other.tenancyInformation)
                && java.util.Objects.equals(this.ticket, other.ticket)
                && java.util.Objects.equals(this.incidentType, other.incidentType)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && java.util.Objects.equals(this.referrer, other.referrer)
                && super.equals(other);
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
        result = (result * PRIME) + (this.referrer == null ? 43 : this.referrer.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
