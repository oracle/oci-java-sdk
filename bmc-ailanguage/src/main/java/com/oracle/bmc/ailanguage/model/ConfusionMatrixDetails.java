/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * confusion matrix details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfusionMatrixDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfusionMatrixDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"matrix"})
    public ConfusionMatrixDetails(java.util.Map<String, Double> matrix) {
        super();
        this.matrix = matrix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** confusion matrix data */
        @com.fasterxml.jackson.annotation.JsonProperty("matrix")
        private java.util.Map<String, Double> matrix;

        /**
         * confusion matrix data
         *
         * @param matrix the value to set
         * @return this builder
         */
        public Builder matrix(java.util.Map<String, Double> matrix) {
            this.matrix = matrix;
            this.__explicitlySet__.add("matrix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfusionMatrixDetails build() {
            ConfusionMatrixDetails model = new ConfusionMatrixDetails(this.matrix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfusionMatrixDetails model) {
            if (model.wasPropertyExplicitlySet("matrix")) {
                this.matrix(model.getMatrix());
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

    /** confusion matrix data */
    @com.fasterxml.jackson.annotation.JsonProperty("matrix")
    private final java.util.Map<String, Double> matrix;

    /**
     * confusion matrix data
     *
     * @return the value
     */
    public java.util.Map<String, Double> getMatrix() {
        return matrix;
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
        sb.append("ConfusionMatrixDetails(");
        sb.append("super=").append(super.toString());
        sb.append("matrix=").append(String.valueOf(this.matrix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfusionMatrixDetails)) {
            return false;
        }

        ConfusionMatrixDetails other = (ConfusionMatrixDetails) o;
        return java.util.Objects.equals(this.matrix, other.matrix) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.matrix == null ? 43 : this.matrix.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
