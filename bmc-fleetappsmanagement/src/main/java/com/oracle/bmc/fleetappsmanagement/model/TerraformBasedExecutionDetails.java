/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details for Terraform execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TerraformBasedExecutionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "executionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TerraformBasedExecutionDetails extends ExecutionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Catalog Id having terraform package. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * Catalog Id having terraform package.
         *
         * @param catalogId the value to set
         * @return this builder
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /** Catalog Id having config file. */
        @com.fasterxml.jackson.annotation.JsonProperty("configFile")
        private String configFile;

        /**
         * Catalog Id having config file.
         *
         * @param configFile the value to set
         * @return this builder
         */
        public Builder configFile(String configFile) {
            this.configFile = configFile;
            this.__explicitlySet__.add("configFile");
            return this;
        }
        /** OCID of the compartment to which the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
         *
         * @param targetCompartmentId the value to set
         * @return this builder
         */
        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }
        /** Is read output variable enabled */
        @com.fasterxml.jackson.annotation.JsonProperty("isReadOutputVariableEnabled")
        private Boolean isReadOutputVariableEnabled;

        /**
         * Is read output variable enabled
         *
         * @param isReadOutputVariableEnabled the value to set
         * @return this builder
         */
        public Builder isReadOutputVariableEnabled(Boolean isReadOutputVariableEnabled) {
            this.isReadOutputVariableEnabled = isReadOutputVariableEnabled;
            this.__explicitlySet__.add("isReadOutputVariableEnabled");
            return this;
        }
        /** The list of system variables. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemVariables")
        private java.util.List<String> systemVariables;

        /**
         * The list of system variables.
         *
         * @param systemVariables the value to set
         * @return this builder
         */
        public Builder systemVariables(java.util.List<String> systemVariables) {
            this.systemVariables = systemVariables;
            this.__explicitlySet__.add("systemVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TerraformBasedExecutionDetails build() {
            TerraformBasedExecutionDetails model =
                    new TerraformBasedExecutionDetails(
                            this.catalogId,
                            this.configFile,
                            this.targetCompartmentId,
                            this.isReadOutputVariableEnabled,
                            this.systemVariables);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TerraformBasedExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
            }
            if (model.wasPropertyExplicitlySet("configFile")) {
                this.configFile(model.getConfigFile());
            }
            if (model.wasPropertyExplicitlySet("targetCompartmentId")) {
                this.targetCompartmentId(model.getTargetCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isReadOutputVariableEnabled")) {
                this.isReadOutputVariableEnabled(model.getIsReadOutputVariableEnabled());
            }
            if (model.wasPropertyExplicitlySet("systemVariables")) {
                this.systemVariables(model.getSystemVariables());
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
    public TerraformBasedExecutionDetails(
            String catalogId,
            String configFile,
            String targetCompartmentId,
            Boolean isReadOutputVariableEnabled,
            java.util.List<String> systemVariables) {
        super();
        this.catalogId = catalogId;
        this.configFile = configFile;
        this.targetCompartmentId = targetCompartmentId;
        this.isReadOutputVariableEnabled = isReadOutputVariableEnabled;
        this.systemVariables = systemVariables;
    }

    /** Catalog Id having terraform package. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * Catalog Id having terraform package.
     *
     * @return the value
     */
    public String getCatalogId() {
        return catalogId;
    }

    /** Catalog Id having config file. */
    @com.fasterxml.jackson.annotation.JsonProperty("configFile")
    private final String configFile;

    /**
     * Catalog Id having config file.
     *
     * @return the value
     */
    public String getConfigFile() {
        return configFile;
    }

    /** OCID of the compartment to which the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
    private final String targetCompartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     *
     * @return the value
     */
    public String getTargetCompartmentId() {
        return targetCompartmentId;
    }

    /** Is read output variable enabled */
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOutputVariableEnabled")
    private final Boolean isReadOutputVariableEnabled;

    /**
     * Is read output variable enabled
     *
     * @return the value
     */
    public Boolean getIsReadOutputVariableEnabled() {
        return isReadOutputVariableEnabled;
    }

    /** The list of system variables. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemVariables")
    private final java.util.List<String> systemVariables;

    /**
     * The list of system variables.
     *
     * @return the value
     */
    public java.util.List<String> getSystemVariables() {
        return systemVariables;
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
        sb.append("TerraformBasedExecutionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", configFile=").append(String.valueOf(this.configFile));
        sb.append(", targetCompartmentId=").append(String.valueOf(this.targetCompartmentId));
        sb.append(", isReadOutputVariableEnabled=")
                .append(String.valueOf(this.isReadOutputVariableEnabled));
        sb.append(", systemVariables=").append(String.valueOf(this.systemVariables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TerraformBasedExecutionDetails)) {
            return false;
        }

        TerraformBasedExecutionDetails other = (TerraformBasedExecutionDetails) o;
        return java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.configFile, other.configFile)
                && java.util.Objects.equals(this.targetCompartmentId, other.targetCompartmentId)
                && java.util.Objects.equals(
                        this.isReadOutputVariableEnabled, other.isReadOutputVariableEnabled)
                && java.util.Objects.equals(this.systemVariables, other.systemVariables)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.configFile == null ? 43 : this.configFile.hashCode());
        result =
                (result * PRIME)
                        + (this.targetCompartmentId == null
                                ? 43
                                : this.targetCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isReadOutputVariableEnabled == null
                                ? 43
                                : this.isReadOutputVariableEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVariables == null ? 43 : this.systemVariables.hashCode());
        return result;
    }
}
