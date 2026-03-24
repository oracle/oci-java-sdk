/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Defines the OCI Database Tools Connection data source that the semantic model connects to. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDataSourceDatabaseToolsConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDataSourceDatabaseToolsConnectionDetails extends CreateDataSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Database Tools Connection for querying.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryingConnectionId")
        private String queryingConnectionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Database Tools Connection for querying.
         *
         * @param queryingConnectionId the value to set
         * @return this builder
         */
        public Builder queryingConnectionId(String queryingConnectionId) {
            this.queryingConnectionId = queryingConnectionId;
            this.__explicitlySet__.add("queryingConnectionId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Database Tools Connection for enrichment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enrichmentConnectionId")
        private String enrichmentConnectionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI Database Tools Connection for enrichment.
         *
         * @param enrichmentConnectionId the value to set
         * @return this builder
         */
        public Builder enrichmentConnectionId(String enrichmentConnectionId) {
            this.enrichmentConnectionId = enrichmentConnectionId;
            this.__explicitlySet__.add("enrichmentConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataSourceDatabaseToolsConnectionDetails build() {
            CreateDataSourceDatabaseToolsConnectionDetails model =
                    new CreateDataSourceDatabaseToolsConnectionDetails(
                            this.queryingConnectionId, this.enrichmentConnectionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataSourceDatabaseToolsConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("queryingConnectionId")) {
                this.queryingConnectionId(model.getQueryingConnectionId());
            }
            if (model.wasPropertyExplicitlySet("enrichmentConnectionId")) {
                this.enrichmentConnectionId(model.getEnrichmentConnectionId());
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

    @Deprecated
    public CreateDataSourceDatabaseToolsConnectionDetails(
            String queryingConnectionId, String enrichmentConnectionId) {
        super();
        this.queryingConnectionId = queryingConnectionId;
        this.enrichmentConnectionId = enrichmentConnectionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Database Tools Connection for querying.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryingConnectionId")
    private final String queryingConnectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Database Tools Connection for querying.
     *
     * @return the value
     */
    public String getQueryingConnectionId() {
        return queryingConnectionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Database Tools Connection for enrichment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enrichmentConnectionId")
    private final String enrichmentConnectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * Database Tools Connection for enrichment.
     *
     * @return the value
     */
    public String getEnrichmentConnectionId() {
        return enrichmentConnectionId;
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
        sb.append("CreateDataSourceDatabaseToolsConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", queryingConnectionId=").append(String.valueOf(this.queryingConnectionId));
        sb.append(", enrichmentConnectionId=").append(String.valueOf(this.enrichmentConnectionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataSourceDatabaseToolsConnectionDetails)) {
            return false;
        }

        CreateDataSourceDatabaseToolsConnectionDetails other =
                (CreateDataSourceDatabaseToolsConnectionDetails) o;
        return java.util.Objects.equals(this.queryingConnectionId, other.queryingConnectionId)
                && java.util.Objects.equals(
                        this.enrichmentConnectionId, other.enrichmentConnectionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.queryingConnectionId == null
                                ? 43
                                : this.queryingConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.enrichmentConnectionId == null
                                ? 43
                                : this.enrichmentConnectionId.hashCode());
        return result;
    }
}
