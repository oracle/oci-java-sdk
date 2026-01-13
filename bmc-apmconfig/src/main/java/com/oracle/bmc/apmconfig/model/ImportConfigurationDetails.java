/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * Array of configuration items with dependencies to import. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configurationItems", "configurationMap"})
    public ImportConfigurationDetails(
            java.util.List<ExportImportConfigSummary> configurationItems,
            java.util.Map<String, String> configurationMap) {
        super();
        this.configurationItems = configurationItems;
        this.configurationMap = configurationMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of Configurations Details . */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationItems")
        private java.util.List<ExportImportConfigSummary> configurationItems;

        /**
         * A list of Configurations Details .
         *
         * @param configurationItems the value to set
         * @return this builder
         */
        public Builder configurationItems(
                java.util.List<ExportImportConfigSummary> configurationItems) {
            this.configurationItems = configurationItems;
            this.__explicitlySet__.add("configurationItems");
            return this;
        }
        /**
         * Simple key-value pair that has parameters related to the import process
         * (EnableOcidSubstitution, Skip, \u2026) and more. Example: {@code {"parameter-key":
         * "parameter-value"}} Supported parameters: \u2014 Enable the OCIDs in instructions to be
         * replaced, if set to "true" The Config Service replace any OCIDs it finds in the
         * instructions, if set to true the Config Service will replace. \u2014 Compartment Id we
         * want to import the configuration Items, if the compartment Id is not provided it will be
         * the default destination domain compartmentId.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationMap")
        private java.util.Map<String, String> configurationMap;

        /**
         * Simple key-value pair that has parameters related to the import process
         * (EnableOcidSubstitution, Skip, \u2026) and more. Example: {@code {"parameter-key":
         * "parameter-value"}} Supported parameters: \u2014 Enable the OCIDs in instructions to be
         * replaced, if set to "true" The Config Service replace any OCIDs it finds in the
         * instructions, if set to true the Config Service will replace. \u2014 Compartment Id we
         * want to import the configuration Items, if the compartment Id is not provided it will be
         * the default destination domain compartmentId.
         *
         * @param configurationMap the value to set
         * @return this builder
         */
        public Builder configurationMap(java.util.Map<String, String> configurationMap) {
            this.configurationMap = configurationMap;
            this.__explicitlySet__.add("configurationMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportConfigurationDetails build() {
            ImportConfigurationDetails model =
                    new ImportConfigurationDetails(this.configurationItems, this.configurationMap);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("configurationItems")) {
                this.configurationItems(model.getConfigurationItems());
            }
            if (model.wasPropertyExplicitlySet("configurationMap")) {
                this.configurationMap(model.getConfigurationMap());
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

    /** A list of Configurations Details . */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationItems")
    private final java.util.List<ExportImportConfigSummary> configurationItems;

    /**
     * A list of Configurations Details .
     *
     * @return the value
     */
    public java.util.List<ExportImportConfigSummary> getConfigurationItems() {
        return configurationItems;
    }

    /**
     * Simple key-value pair that has parameters related to the import process
     * (EnableOcidSubstitution, Skip, \u2026) and more. Example: {@code {"parameter-key":
     * "parameter-value"}} Supported parameters: \u2014 Enable the OCIDs in instructions to be
     * replaced, if set to "true" The Config Service replace any OCIDs it finds in the instructions,
     * if set to true the Config Service will replace. \u2014 Compartment Id we want to import the
     * configuration Items, if the compartment Id is not provided it will be the default destination
     * domain compartmentId.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationMap")
    private final java.util.Map<String, String> configurationMap;

    /**
     * Simple key-value pair that has parameters related to the import process
     * (EnableOcidSubstitution, Skip, \u2026) and more. Example: {@code {"parameter-key":
     * "parameter-value"}} Supported parameters: \u2014 Enable the OCIDs in instructions to be
     * replaced, if set to "true" The Config Service replace any OCIDs it finds in the instructions,
     * if set to true the Config Service will replace. \u2014 Compartment Id we want to import the
     * configuration Items, if the compartment Id is not provided it will be the default destination
     * domain compartmentId.
     *
     * @return the value
     */
    public java.util.Map<String, String> getConfigurationMap() {
        return configurationMap;
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
        sb.append("ImportConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("configurationItems=").append(String.valueOf(this.configurationItems));
        sb.append(", configurationMap=").append(String.valueOf(this.configurationMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportConfigurationDetails)) {
            return false;
        }

        ImportConfigurationDetails other = (ImportConfigurationDetails) o;
        return java.util.Objects.equals(this.configurationItems, other.configurationItems)
                && java.util.Objects.equals(this.configurationMap, other.configurationMap)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.configurationItems == null
                                ? 43
                                : this.configurationItems.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationMap == null ? 43 : this.configurationMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
