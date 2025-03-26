/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Payload for creating an imported package
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateImportedPackageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateImportedPackageDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "currentPackageId",
        "parameterValues",
        "freeformTags",
        "definedTags"
    })
    public CreateImportedPackageDetails(
            String currentPackageId,
            java.util.Map<String, String> parameterValues,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.currentPackageId = currentPackageId;
        this.parameterValues = parameterValues;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ID of the package to import.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentPackageId")
        private String currentPackageId;

        /**
         * ID of the package to import.
         * @param currentPackageId the value to set
         * @return this builder
         **/
        public Builder currentPackageId(String currentPackageId) {
            this.currentPackageId = currentPackageId;
            this.__explicitlySet__.add("currentPackageId");
            return this;
        }
        /**
         * A list of parameter values to use when importing the given package. Must match those defined in the import contract.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterValues")
        private java.util.Map<String, String> parameterValues;

        /**
         * A list of parameter values to use when importing the given package. Must match those defined in the import contract.
         * @param parameterValues the value to set
         * @return this builder
         **/
        public Builder parameterValues(java.util.Map<String, String> parameterValues) {
            this.parameterValues = parameterValues;
            this.__explicitlySet__.add("parameterValues");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateImportedPackageDetails build() {
            CreateImportedPackageDetails model =
                    new CreateImportedPackageDetails(
                            this.currentPackageId,
                            this.parameterValues,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImportedPackageDetails model) {
            if (model.wasPropertyExplicitlySet("currentPackageId")) {
                this.currentPackageId(model.getCurrentPackageId());
            }
            if (model.wasPropertyExplicitlySet("parameterValues")) {
                this.parameterValues(model.getParameterValues());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * ID of the package to import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentPackageId")
    private final String currentPackageId;

    /**
     * ID of the package to import.
     * @return the value
     **/
    public String getCurrentPackageId() {
        return currentPackageId;
    }

    /**
     * A list of parameter values to use when importing the given package. Must match those defined in the import contract.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterValues")
    private final java.util.Map<String, String> parameterValues;

    /**
     * A list of parameter values to use when importing the given package. Must match those defined in the import contract.
     * @return the value
     **/
    public java.util.Map<String, String> getParameterValues() {
        return parameterValues;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateImportedPackageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("currentPackageId=").append(String.valueOf(this.currentPackageId));
        sb.append(", parameterValues=").append(String.valueOf(this.parameterValues));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateImportedPackageDetails)) {
            return false;
        }

        CreateImportedPackageDetails other = (CreateImportedPackageDetails) o;
        return java.util.Objects.equals(this.currentPackageId, other.currentPackageId)
                && java.util.Objects.equals(this.parameterValues, other.parameterValues)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.currentPackageId == null ? 43 : this.currentPackageId.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterValues == null ? 43 : this.parameterValues.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
