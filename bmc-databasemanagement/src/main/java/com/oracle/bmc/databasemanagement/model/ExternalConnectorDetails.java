/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the external database connector used to connect to the external database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalConnectorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectorType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalConnectorDetails extends ConnectorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the external database connector.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectorId")
        private String databaseConnectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the external database connector.
         * @param databaseConnectorId the value to set
         * @return this builder
         **/
        public Builder databaseConnectorId(String databaseConnectorId) {
            this.databaseConnectorId = databaseConnectorId;
            this.__explicitlySet__.add("databaseConnectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalConnectorDetails build() {
            ExternalConnectorDetails model = new ExternalConnectorDetails(this.databaseConnectorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalConnectorDetails model) {
            if (model.wasPropertyExplicitlySet("databaseConnectorId")) {
                this.databaseConnectorId(model.getDatabaseConnectorId());
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

    @Deprecated
    public ExternalConnectorDetails(String databaseConnectorId) {
        super();
        this.databaseConnectorId = databaseConnectorId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the external database connector.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectorId")
    private final String databaseConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the external database connector.
     * @return the value
     **/
    public String getDatabaseConnectorId() {
        return databaseConnectorId;
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
        sb.append("ExternalConnectorDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseConnectorId=").append(String.valueOf(this.databaseConnectorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalConnectorDetails)) {
            return false;
        }

        ExternalConnectorDetails other = (ExternalConnectorDetails) o;
        return java.util.Objects.equals(this.databaseConnectorId, other.databaseConnectorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseConnectorId == null
                                ? 43
                                : this.databaseConnectorId.hashCode());
        return result;
    }
}
