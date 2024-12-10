/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public final class IncidentSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "compartmentId",
        "contactList",
        "tenancyInformation",
        "ticket",
        "incidentType",
        "userGroupId",
        "userGroupName",
        "primaryContactPartyId",
        "primaryContactPartyName",
        "isWritePermitted",
        "warnMessage",
        "problemType"
    })
    public IncidentSummary(
            String key,
            String compartmentId,
            ContactList contactList,
            TenancyInformation tenancyInformation,
            Ticket ticket,
            IncidentResourceType incidentType,
            String userGroupId,
            String userGroupName,
            String primaryContactPartyId,
            String primaryContactPartyName,
            Boolean isWritePermitted,
            String warnMessage,
            ProblemType problemType) {
        super();
        this.key = key;
        this.compartmentId = compartmentId;
        this.contactList = contactList;
        this.tenancyInformation = tenancyInformation;
        this.ticket = ticket;
        this.incidentType = incidentType;
        this.userGroupId = userGroupId;
        this.userGroupName = userGroupName;
        this.primaryContactPartyId = primaryContactPartyId;
        this.primaryContactPartyName = primaryContactPartyName;
        this.isWritePermitted = isWritePermitted;
        this.warnMessage = warnMessage;
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
         * Technical support type ({@code TECH}) only: The identifier of the support request's user group in My Oracle Cloud Support portal.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userGroupId")
        private String userGroupId;

        /**
         * Technical support type ({@code TECH}) only: The identifier of the support request's user group in My Oracle Cloud Support portal.
         *
         * @param userGroupId the value to set
         * @return this builder
         **/
        public Builder userGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            this.__explicitlySet__.add("userGroupId");
            return this;
        }
        /**
         * Technical support type ({@code TECH}) only: Name of the support request's user group in My Oracle Cloud Support portal.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userGroupName")
        private String userGroupName;

        /**
         * Technical support type ({@code TECH}) only: Name of the support request's user group in My Oracle Cloud Support portal.
         *
         * @param userGroupName the value to set
         * @return this builder
         **/
        public Builder userGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            this.__explicitlySet__.add("userGroupName");
            return this;
        }
        /**
         * Technical support type ({@code TECH}) only: The identifier of the support request's primary contact ({@code primaryContactPartyName}) in My Oracle Cloud Support portal.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryContactPartyId")
        private String primaryContactPartyId;

        /**
         * Technical support type ({@code TECH}) only: The identifier of the support request's primary contact ({@code primaryContactPartyName}) in My Oracle Cloud Support portal.
         *
         * @param primaryContactPartyId the value to set
         * @return this builder
         **/
        public Builder primaryContactPartyId(String primaryContactPartyId) {
            this.primaryContactPartyId = primaryContactPartyId;
            this.__explicitlySet__.add("primaryContactPartyId");
            return this;
        }
        /**
         * Technical support type ({@code TECH}) only: The name of the support request's primary contact in My Oracle Cloud Support portal.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryContactPartyName")
        private String primaryContactPartyName;

        /**
         * Technical support type ({@code TECH}) only: The name of the support request's primary contact in My Oracle Cloud Support portal.
         *
         * @param primaryContactPartyName the value to set
         * @return this builder
         **/
        public Builder primaryContactPartyName(String primaryContactPartyName) {
            this.primaryContactPartyName = primaryContactPartyName;
            this.__explicitlySet__.add("primaryContactPartyName");
            return this;
        }
        /**
         * Technical support type ({@code TECH}) only: Allows update of the support request in My Oracle Cloud Support portal,
         * when the user has write permission to the support request's user group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isWritePermitted")
        private Boolean isWritePermitted;

        /**
         * Technical support type ({@code TECH}) only: Allows update of the support request in My Oracle Cloud Support portal,
         * when the user has write permission to the support request's user group.
         *
         * @param isWritePermitted the value to set
         * @return this builder
         **/
        public Builder isWritePermitted(Boolean isWritePermitted) {
            this.isWritePermitted = isWritePermitted;
            this.__explicitlySet__.add("isWritePermitted");
            return this;
        }
        /**
         * Technical support type ({@code TECH}) only: Message indicating the user group ({@code userGroupId}) that was auto-selected for a new support request. This message appears when no user group was specified in the create request for a new technical support request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("warnMessage")
        private String warnMessage;

        /**
         * Technical support type ({@code TECH}) only: Message indicating the user group ({@code userGroupId}) that was auto-selected for a new support request. This message appears when no user group was specified in the create request for a new technical support request.
         *
         * @param warnMessage the value to set
         * @return this builder
         **/
        public Builder warnMessage(String warnMessage) {
            this.warnMessage = warnMessage;
            this.__explicitlySet__.add("warnMessage");
            return this;
        }
        /**
         * The kind of support ticket (type of support request).
         * For information about {@code ACCOUNT} support tickets, see
         * [Creating a Billing Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
         * For information about {@code LIMIT} support tickets, see
         * [Creating a Service Limit Increase Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
         * For information about {@code TECH} support tickets, see
         * [Creating a Technical Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        /**
         * The kind of support ticket (type of support request).
         * For information about {@code ACCOUNT} support tickets, see
         * [Creating a Billing Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
         * For information about {@code LIMIT} support tickets, see
         * [Creating a Service Limit Increase Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
         * For information about {@code TECH} support tickets, see
         * [Creating a Technical Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
         *
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
            IncidentSummary model =
                    new IncidentSummary(
                            this.key,
                            this.compartmentId,
                            this.contactList,
                            this.tenancyInformation,
                            this.ticket,
                            this.incidentType,
                            this.userGroupId,
                            this.userGroupName,
                            this.primaryContactPartyId,
                            this.primaryContactPartyName,
                            this.isWritePermitted,
                            this.warnMessage,
                            this.problemType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IncidentSummary model) {
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
            if (model.wasPropertyExplicitlySet("userGroupId")) {
                this.userGroupId(model.getUserGroupId());
            }
            if (model.wasPropertyExplicitlySet("userGroupName")) {
                this.userGroupName(model.getUserGroupName());
            }
            if (model.wasPropertyExplicitlySet("primaryContactPartyId")) {
                this.primaryContactPartyId(model.getPrimaryContactPartyId());
            }
            if (model.wasPropertyExplicitlySet("primaryContactPartyName")) {
                this.primaryContactPartyName(model.getPrimaryContactPartyName());
            }
            if (model.wasPropertyExplicitlySet("isWritePermitted")) {
                this.isWritePermitted(model.getIsWritePermitted());
            }
            if (model.wasPropertyExplicitlySet("warnMessage")) {
                this.warnMessage(model.getWarnMessage());
            }
            if (model.wasPropertyExplicitlySet("problemType")) {
                this.problemType(model.getProblemType());
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
     * Technical support type ({@code TECH}) only: The identifier of the support request's user group in My Oracle Cloud Support portal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userGroupId")
    private final String userGroupId;

    /**
     * Technical support type ({@code TECH}) only: The identifier of the support request's user group in My Oracle Cloud Support portal.
     *
     * @return the value
     **/
    public String getUserGroupId() {
        return userGroupId;
    }

    /**
     * Technical support type ({@code TECH}) only: Name of the support request's user group in My Oracle Cloud Support portal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userGroupName")
    private final String userGroupName;

    /**
     * Technical support type ({@code TECH}) only: Name of the support request's user group in My Oracle Cloud Support portal.
     *
     * @return the value
     **/
    public String getUserGroupName() {
        return userGroupName;
    }

    /**
     * Technical support type ({@code TECH}) only: The identifier of the support request's primary contact ({@code primaryContactPartyName}) in My Oracle Cloud Support portal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryContactPartyId")
    private final String primaryContactPartyId;

    /**
     * Technical support type ({@code TECH}) only: The identifier of the support request's primary contact ({@code primaryContactPartyName}) in My Oracle Cloud Support portal.
     *
     * @return the value
     **/
    public String getPrimaryContactPartyId() {
        return primaryContactPartyId;
    }

    /**
     * Technical support type ({@code TECH}) only: The name of the support request's primary contact in My Oracle Cloud Support portal.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryContactPartyName")
    private final String primaryContactPartyName;

    /**
     * Technical support type ({@code TECH}) only: The name of the support request's primary contact in My Oracle Cloud Support portal.
     *
     * @return the value
     **/
    public String getPrimaryContactPartyName() {
        return primaryContactPartyName;
    }

    /**
     * Technical support type ({@code TECH}) only: Allows update of the support request in My Oracle Cloud Support portal,
     * when the user has write permission to the support request's user group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isWritePermitted")
    private final Boolean isWritePermitted;

    /**
     * Technical support type ({@code TECH}) only: Allows update of the support request in My Oracle Cloud Support portal,
     * when the user has write permission to the support request's user group.
     *
     * @return the value
     **/
    public Boolean getIsWritePermitted() {
        return isWritePermitted;
    }

    /**
     * Technical support type ({@code TECH}) only: Message indicating the user group ({@code userGroupId}) that was auto-selected for a new support request. This message appears when no user group was specified in the create request for a new technical support request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warnMessage")
    private final String warnMessage;

    /**
     * Technical support type ({@code TECH}) only: Message indicating the user group ({@code userGroupId}) that was auto-selected for a new support request. This message appears when no user group was specified in the create request for a new technical support request.
     *
     * @return the value
     **/
    public String getWarnMessage() {
        return warnMessage;
    }

    /**
     * The kind of support ticket (type of support request).
     * For information about {@code ACCOUNT} support tickets, see
     * [Creating a Billing Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
     * For information about {@code LIMIT} support tickets, see
     * [Creating a Service Limit Increase Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
     * For information about {@code TECH} support tickets, see
     * [Creating a Technical Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    /**
     * The kind of support ticket (type of support request).
     * For information about {@code ACCOUNT} support tickets, see
     * [Creating a Billing Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
     * For information about {@code LIMIT} support tickets, see
     * [Creating a Service Limit Increase Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
     * For information about {@code TECH} support tickets, see
     * [Creating a Technical Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
     *
     * @return the value
     **/
    public ProblemType getProblemType() {
        return problemType;
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
        sb.append("IncidentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", contactList=").append(String.valueOf(this.contactList));
        sb.append(", tenancyInformation=").append(String.valueOf(this.tenancyInformation));
        sb.append(", ticket=").append(String.valueOf(this.ticket));
        sb.append(", incidentType=").append(String.valueOf(this.incidentType));
        sb.append(", userGroupId=").append(String.valueOf(this.userGroupId));
        sb.append(", userGroupName=").append(String.valueOf(this.userGroupName));
        sb.append(", primaryContactPartyId=").append(String.valueOf(this.primaryContactPartyId));
        sb.append(", primaryContactPartyName=")
                .append(String.valueOf(this.primaryContactPartyName));
        sb.append(", isWritePermitted=").append(String.valueOf(this.isWritePermitted));
        sb.append(", warnMessage=").append(String.valueOf(this.warnMessage));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
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
                && java.util.Objects.equals(this.userGroupId, other.userGroupId)
                && java.util.Objects.equals(this.userGroupName, other.userGroupName)
                && java.util.Objects.equals(this.primaryContactPartyId, other.primaryContactPartyId)
                && java.util.Objects.equals(
                        this.primaryContactPartyName, other.primaryContactPartyName)
                && java.util.Objects.equals(this.isWritePermitted, other.isWritePermitted)
                && java.util.Objects.equals(this.warnMessage, other.warnMessage)
                && java.util.Objects.equals(this.problemType, other.problemType)
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
        result = (result * PRIME) + (this.userGroupId == null ? 43 : this.userGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.userGroupName == null ? 43 : this.userGroupName.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryContactPartyId == null
                                ? 43
                                : this.primaryContactPartyId.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryContactPartyName == null
                                ? 43
                                : this.primaryContactPartyName.hashCode());
        result =
                (result * PRIME)
                        + (this.isWritePermitted == null ? 43 : this.isWritePermitted.hashCode());
        result = (result * PRIME) + (this.warnMessage == null ? 43 : this.warnMessage.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
