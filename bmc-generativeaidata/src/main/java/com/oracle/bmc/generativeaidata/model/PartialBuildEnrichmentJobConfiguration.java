/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaidata.model;

/**
 * A PartialBuildEnrichmentJobConfiguration is an EnrichmentJobConfiguration [indicated by the first
 * item under {@code allOf}, which is a reference to EnrichmentJobConfiguration] that describes the
 * database schema that will be the scope of the enrichment job. As distinguished by
 * enrichmentJobType [with specific characteristics defined by the second item under {@code allOf}].
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PartialBuildEnrichmentJobConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "enrichmentJobType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PartialBuildEnrichmentJobConfiguration extends EnrichmentJobConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the DB Schema to be enriched */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * Name of the DB Schema to be enriched
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** Collection of the DatabaseObjects to be enriched for the given schema. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseObjects")
        private java.util.List<DatabaseObject> databaseObjects;

        /**
         * Collection of the DatabaseObjects to be enriched for the given schema.
         *
         * @param databaseObjects the value to set
         * @return this builder
         */
        public Builder databaseObjects(java.util.List<DatabaseObject> databaseObjects) {
            this.databaseObjects = databaseObjects;
            this.__explicitlySet__.add("databaseObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PartialBuildEnrichmentJobConfiguration build() {
            PartialBuildEnrichmentJobConfiguration model =
                    new PartialBuildEnrichmentJobConfiguration(
                            this.schemaName, this.databaseObjects);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PartialBuildEnrichmentJobConfiguration model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("databaseObjects")) {
                this.databaseObjects(model.getDatabaseObjects());
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
    public PartialBuildEnrichmentJobConfiguration(
            String schemaName, java.util.List<DatabaseObject> databaseObjects) {
        super();
        this.schemaName = schemaName;
        this.databaseObjects = databaseObjects;
    }

    /** Name of the DB Schema to be enriched */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * Name of the DB Schema to be enriched
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** Collection of the DatabaseObjects to be enriched for the given schema. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseObjects")
    private final java.util.List<DatabaseObject> databaseObjects;

    /**
     * Collection of the DatabaseObjects to be enriched for the given schema.
     *
     * @return the value
     */
    public java.util.List<DatabaseObject> getDatabaseObjects() {
        return databaseObjects;
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
        sb.append("PartialBuildEnrichmentJobConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", databaseObjects=").append(String.valueOf(this.databaseObjects));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PartialBuildEnrichmentJobConfiguration)) {
            return false;
        }

        PartialBuildEnrichmentJobConfiguration other = (PartialBuildEnrichmentJobConfiguration) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.databaseObjects, other.databaseObjects)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseObjects == null ? 43 : this.databaseObjects.hashCode());
        return result;
    }
}
