/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of a Glue catalog used in the Iceberg connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GlueIcebergCatalogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "catalogType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GlueIcebergCatalogSummary extends IcebergCatalogSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The AWS Glue Catalog ID where Iceberg tables are registered. */
        @com.fasterxml.jackson.annotation.JsonProperty("glueId")
        private String glueId;

        /**
         * The AWS Glue Catalog ID where Iceberg tables are registered.
         *
         * @param glueId the value to set
         * @return this builder
         */
        public Builder glueId(String glueId) {
            this.glueId = glueId;
            this.__explicitlySet__.add("glueId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GlueIcebergCatalogSummary build() {
            GlueIcebergCatalogSummary model = new GlueIcebergCatalogSummary(this.glueId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GlueIcebergCatalogSummary model) {
            if (model.wasPropertyExplicitlySet("glueId")) {
                this.glueId(model.getGlueId());
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
    public GlueIcebergCatalogSummary(String glueId) {
        super();
        this.glueId = glueId;
    }

    /** The AWS Glue Catalog ID where Iceberg tables are registered. */
    @com.fasterxml.jackson.annotation.JsonProperty("glueId")
    private final String glueId;

    /**
     * The AWS Glue Catalog ID where Iceberg tables are registered.
     *
     * @return the value
     */
    public String getGlueId() {
        return glueId;
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
        sb.append("GlueIcebergCatalogSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", glueId=").append(String.valueOf(this.glueId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GlueIcebergCatalogSummary)) {
            return false;
        }

        GlueIcebergCatalogSummary other = (GlueIcebergCatalogSummary) o;
        return java.util.Objects.equals(this.glueId, other.glueId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.glueId == null ? 43 : this.glueId.hashCode());
        return result;
    }
}
