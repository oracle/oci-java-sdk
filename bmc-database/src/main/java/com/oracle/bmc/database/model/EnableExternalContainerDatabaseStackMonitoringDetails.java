/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to enable Stack Monitoring on the external container database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnableExternalContainerDatabaseStackMonitoringDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class EnableExternalContainerDatabaseStackMonitoringDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"externalDatabaseConnectorId"})
    public EnableExternalContainerDatabaseStackMonitoringDetails(
            String externalDatabaseConnectorId) {
        super();
        this.externalDatabaseConnectorId = externalDatabaseConnectorId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
         * createExternalDatabaseConnectorDetails}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseConnectorId")
        private String externalDatabaseConnectorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
         * createExternalDatabaseConnectorDetails}.
         *
         * @param externalDatabaseConnectorId the value to set
         * @return this builder
         */
        public Builder externalDatabaseConnectorId(String externalDatabaseConnectorId) {
            this.externalDatabaseConnectorId = externalDatabaseConnectorId;
            this.__explicitlySet__.add("externalDatabaseConnectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableExternalContainerDatabaseStackMonitoringDetails build() {
            EnableExternalContainerDatabaseStackMonitoringDetails model =
                    new EnableExternalContainerDatabaseStackMonitoringDetails(
                            this.externalDatabaseConnectorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableExternalContainerDatabaseStackMonitoringDetails model) {
            if (model.wasPropertyExplicitlySet("externalDatabaseConnectorId")) {
                this.externalDatabaseConnectorId(model.getExternalDatabaseConnectorId());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
     * createExternalDatabaseConnectorDetails}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseConnectorId")
    private final String externalDatabaseConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
     * createExternalDatabaseConnectorDetails}.
     *
     * @return the value
     */
    public String getExternalDatabaseConnectorId() {
        return externalDatabaseConnectorId;
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
        sb.append("EnableExternalContainerDatabaseStackMonitoringDetails(");
        sb.append("super=").append(super.toString());
        sb.append("externalDatabaseConnectorId=")
                .append(String.valueOf(this.externalDatabaseConnectorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableExternalContainerDatabaseStackMonitoringDetails)) {
            return false;
        }

        EnableExternalContainerDatabaseStackMonitoringDetails other =
                (EnableExternalContainerDatabaseStackMonitoringDetails) o;
        return java.util.Objects.equals(
                        this.externalDatabaseConnectorId, other.externalDatabaseConnectorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.externalDatabaseConnectorId == null
                                ? 43
                                : this.externalDatabaseConnectorId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
