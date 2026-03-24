/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaidata.model;

/**
 * A DeltaRefreshEnrichmentJobConfiguration is an EnrichmentJobConfiguration [indicated by the first
 * item under {@code allOf}, which is a reference to EnrichmentJobConfiguration] that describes the
 * database schema that will be the scope of the enrichment job and the schedule on which the job
 * will run. As distinguished by enrichmentJobType [with specific characteristics defined by the
 * second item under {@code allOf}]. <br>
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
        builder = DeltaRefreshEnrichmentJobConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "enrichmentJobType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeltaRefreshEnrichmentJobConfiguration extends EnrichmentJobConfiguration {
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
        /** Schedule for occurrences of Delta Refresh jobs */
        @com.fasterxml.jackson.annotation.JsonProperty("deltaRefreshSchedule")
        private Object deltaRefreshSchedule;

        /**
         * Schedule for occurrences of Delta Refresh jobs
         *
         * @param deltaRefreshSchedule the value to set
         * @return this builder
         */
        public Builder deltaRefreshSchedule(Object deltaRefreshSchedule) {
            this.deltaRefreshSchedule = deltaRefreshSchedule;
            this.__explicitlySet__.add("deltaRefreshSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeltaRefreshEnrichmentJobConfiguration build() {
            DeltaRefreshEnrichmentJobConfiguration model =
                    new DeltaRefreshEnrichmentJobConfiguration(
                            this.schemaName, this.deltaRefreshSchedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeltaRefreshEnrichmentJobConfiguration model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("deltaRefreshSchedule")) {
                this.deltaRefreshSchedule(model.getDeltaRefreshSchedule());
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
    public DeltaRefreshEnrichmentJobConfiguration(String schemaName, Object deltaRefreshSchedule) {
        super();
        this.schemaName = schemaName;
        this.deltaRefreshSchedule = deltaRefreshSchedule;
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

    /** Schedule for occurrences of Delta Refresh jobs */
    @com.fasterxml.jackson.annotation.JsonProperty("deltaRefreshSchedule")
    private final Object deltaRefreshSchedule;

    /**
     * Schedule for occurrences of Delta Refresh jobs
     *
     * @return the value
     */
    public Object getDeltaRefreshSchedule() {
        return deltaRefreshSchedule;
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
        sb.append("DeltaRefreshEnrichmentJobConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", deltaRefreshSchedule=").append(String.valueOf(this.deltaRefreshSchedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeltaRefreshEnrichmentJobConfiguration)) {
            return false;
        }

        DeltaRefreshEnrichmentJobConfiguration other = (DeltaRefreshEnrichmentJobConfiguration) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.deltaRefreshSchedule, other.deltaRefreshSchedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.deltaRefreshSchedule == null
                                ? 43
                                : this.deltaRefreshSchedule.hashCode());
        return result;
    }
}
