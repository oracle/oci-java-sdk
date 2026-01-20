/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the support request being updated. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateIncident.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateIncident
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ticket", "problemType"})
    public UpdateIncident(UpdateTicketDetails ticket, ProblemType problemType) {
        super();
        this.ticket = ticket;
        this.problemType = problemType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("ticket")
        private UpdateTicketDetails ticket;

        public Builder ticket(UpdateTicketDetails ticket) {
            this.ticket = ticket;
            this.__explicitlySet__.add("ticket");
            return this;
        }
        /**
         * The kind of support request (type of support request). For information about {@code
         * ACCOUNT} support requests, see [Creating a Billing Support
         * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
         * For information about {@code LIMIT} support requests, see [Creating a Service Limit
         * Increase
         * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm). For
         * information about {@code TECH} support requests, see [Creating a Technical Support
         * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        /**
         * The kind of support request (type of support request). For information about {@code
         * ACCOUNT} support requests, see [Creating a Billing Support
         * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
         * For information about {@code LIMIT} support requests, see [Creating a Service Limit
         * Increase
         * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm). For
         * information about {@code TECH} support requests, see [Creating a Technical Support
         * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
         *
         * @param problemType the value to set
         * @return this builder
         */
        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIncident build() {
            UpdateIncident model = new UpdateIncident(this.ticket, this.problemType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIncident model) {
            if (model.wasPropertyExplicitlySet("ticket")) {
                this.ticket(model.getTicket());
            }
            if (model.wasPropertyExplicitlySet("problemType")) {
                this.problemType(model.getProblemType());
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

    @com.fasterxml.jackson.annotation.JsonProperty("ticket")
    private final UpdateTicketDetails ticket;

    public UpdateTicketDetails getTicket() {
        return ticket;
    }

    /**
     * The kind of support request (type of support request). For information about {@code ACCOUNT}
     * support requests, see [Creating a Billing Support
     * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm). For
     * information about {@code LIMIT} support requests, see [Creating a Service Limit Increase
     * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm). For
     * information about {@code TECH} support requests, see [Creating a Technical Support
     * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    /**
     * The kind of support request (type of support request). For information about {@code ACCOUNT}
     * support requests, see [Creating a Billing Support
     * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm). For
     * information about {@code LIMIT} support requests, see [Creating a Service Limit Increase
     * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm). For
     * information about {@code TECH} support requests, see [Creating a Technical Support
     * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
     *
     * @return the value
     */
    public ProblemType getProblemType() {
        return problemType;
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
        sb.append("UpdateIncident(");
        sb.append("super=").append(super.toString());
        sb.append("ticket=").append(String.valueOf(this.ticket));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIncident)) {
            return false;
        }

        UpdateIncident other = (UpdateIncident) o;
        return java.util.Objects.equals(this.ticket, other.ticket)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ticket == null ? 43 : this.ticket.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
