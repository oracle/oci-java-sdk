/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details gathered during the creation of the support ticket. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateIncident.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateIncident
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "ticket",
        "csi",
        "userGroupId",
        "problemType",
        "contacts",
        "referrer"
    })
    public CreateIncident(
            String compartmentId,
            CreateTicketDetails ticket,
            String csi,
            String userGroupId,
            ProblemType problemType,
            java.util.List<Contact> contacts,
            String referrer) {
        super();
        this.compartmentId = compartmentId;
        this.ticket = ticket;
        this.csi = csi;
        this.userGroupId = userGroupId;
        this.problemType = problemType;
        this.contacts = contacts;
        this.referrer = referrer;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("ticket")
        private CreateTicketDetails ticket;

        public Builder ticket(CreateTicketDetails ticket) {
            this.ticket = ticket;
            this.__explicitlySet__.add("ticket");
            return this;
        }
        /**
         * The Customer Support Identifier (CSI) number associated with the support account. The CSI
         * is optional for all support request types.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private String csi;

        /**
         * The Customer Support Identifier (CSI) number associated with the support account. The CSI
         * is optional for all support request types.
         *
         * @param csi the value to set
         * @return this builder
         */
        public Builder csi(String csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }
        /**
         * Technical support type ({@code TECH}) only: The identifier of the support request's user
         * group in My Oracle Cloud Support portal.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userGroupId")
        private String userGroupId;

        /**
         * Technical support type ({@code TECH}) only: The identifier of the support request's user
         * group in My Oracle Cloud Support portal.
         *
         * @param userGroupId the value to set
         * @return this builder
         */
        public Builder userGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            this.__explicitlySet__.add("userGroupId");
            return this;
        }
        /**
         * The kind of support ticket (type of support request). For information about {@code
         * ACCOUNT} support tickets, see [Creating a Billing Support
         * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
         * For information about {@code LIMIT} support tickets, see [Creating a Service Limit
         * Increase
         * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
         * For information about {@code TECH} support tickets, see [Creating a Technical Support
         * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        /**
         * The kind of support ticket (type of support request). For information about {@code
         * ACCOUNT} support tickets, see [Creating a Billing Support
         * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
         * For information about {@code LIMIT} support tickets, see [Creating a Service Limit
         * Increase
         * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
         * For information about {@code TECH} support tickets, see [Creating a Technical Support
         * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
         *
         * @param problemType the value to set
         * @return this builder
         */
        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }
        /** The list of contacts. */
        @com.fasterxml.jackson.annotation.JsonProperty("contacts")
        private java.util.List<Contact> contacts;

        /**
         * The list of contacts.
         *
         * @param contacts the value to set
         * @return this builder
         */
        public Builder contacts(java.util.List<Contact> contacts) {
            this.contacts = contacts;
            this.__explicitlySet__.add("contacts");
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

        public CreateIncident build() {
            CreateIncident model =
                    new CreateIncident(
                            this.compartmentId,
                            this.ticket,
                            this.csi,
                            this.userGroupId,
                            this.problemType,
                            this.contacts,
                            this.referrer);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIncident model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("ticket")) {
                this.ticket(model.getTicket());
            }
            if (model.wasPropertyExplicitlySet("csi")) {
                this.csi(model.getCsi());
            }
            if (model.wasPropertyExplicitlySet("userGroupId")) {
                this.userGroupId(model.getUserGroupId());
            }
            if (model.wasPropertyExplicitlySet("problemType")) {
                this.problemType(model.getProblemType());
            }
            if (model.wasPropertyExplicitlySet("contacts")) {
                this.contacts(model.getContacts());
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

    @com.fasterxml.jackson.annotation.JsonProperty("ticket")
    private final CreateTicketDetails ticket;

    public CreateTicketDetails getTicket() {
        return ticket;
    }

    /**
     * The Customer Support Identifier (CSI) number associated with the support account. The CSI is
     * optional for all support request types.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final String csi;

    /**
     * The Customer Support Identifier (CSI) number associated with the support account. The CSI is
     * optional for all support request types.
     *
     * @return the value
     */
    public String getCsi() {
        return csi;
    }

    /**
     * Technical support type ({@code TECH}) only: The identifier of the support request's user
     * group in My Oracle Cloud Support portal.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userGroupId")
    private final String userGroupId;

    /**
     * Technical support type ({@code TECH}) only: The identifier of the support request's user
     * group in My Oracle Cloud Support portal.
     *
     * @return the value
     */
    public String getUserGroupId() {
        return userGroupId;
    }

    /**
     * The kind of support ticket (type of support request). For information about {@code ACCOUNT}
     * support tickets, see [Creating a Billing Support
     * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
     * For information about {@code LIMIT} support tickets, see [Creating a Service Limit Increase
     * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
     * For information about {@code TECH} support tickets, see [Creating a Technical Support
     * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    /**
     * The kind of support ticket (type of support request). For information about {@code ACCOUNT}
     * support tickets, see [Creating a Billing Support
     * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
     * For information about {@code LIMIT} support tickets, see [Creating a Service Limit Increase
     * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
     * For information about {@code TECH} support tickets, see [Creating a Technical Support
     * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
     *
     * @return the value
     */
    public ProblemType getProblemType() {
        return problemType;
    }

    /** The list of contacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("contacts")
    private final java.util.List<Contact> contacts;

    /**
     * The list of contacts.
     *
     * @return the value
     */
    public java.util.List<Contact> getContacts() {
        return contacts;
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
        sb.append("CreateIncident(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", ticket=").append(String.valueOf(this.ticket));
        sb.append(", csi=").append(String.valueOf(this.csi));
        sb.append(", userGroupId=").append(String.valueOf(this.userGroupId));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
        sb.append(", contacts=").append(String.valueOf(this.contacts));
        sb.append(", referrer=").append(String.valueOf(this.referrer));
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
                && java.util.Objects.equals(this.userGroupId, other.userGroupId)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && java.util.Objects.equals(this.contacts, other.contacts)
                && java.util.Objects.equals(this.referrer, other.referrer)
                && super.equals(other);
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
        result = (result * PRIME) + (this.userGroupId == null ? 43 : this.userGroupId.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        result = (result * PRIME) + (this.contacts == null ? 43 : this.contacts.hashCode());
        result = (result * PRIME) + (this.referrer == null ? 43 : this.referrer.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
