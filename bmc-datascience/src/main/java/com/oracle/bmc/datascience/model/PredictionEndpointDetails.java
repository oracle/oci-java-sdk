/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Prediction endpoint related information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PredictionEndpointDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PredictionEndpointDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"basePredictionUri", "predictionUris"})
    public PredictionEndpointDetails(
            String basePredictionUri, java.util.List<PredictionUri> predictionUris) {
        super();
        this.basePredictionUri = basePredictionUri;
        this.predictionUris = predictionUris;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Base URI of prediction router. */
        @com.fasterxml.jackson.annotation.JsonProperty("basePredictionUri")
        private String basePredictionUri;

        /**
         * Base URI of prediction router.
         *
         * @param basePredictionUri the value to set
         * @return this builder
         */
        public Builder basePredictionUri(String basePredictionUri) {
            this.basePredictionUri = basePredictionUri;
            this.__explicitlySet__.add("basePredictionUri");
            return this;
        }
        /** Array of all prediction URIs per use-case. */
        @com.fasterxml.jackson.annotation.JsonProperty("predictionUris")
        private java.util.List<PredictionUri> predictionUris;

        /**
         * Array of all prediction URIs per use-case.
         *
         * @param predictionUris the value to set
         * @return this builder
         */
        public Builder predictionUris(java.util.List<PredictionUri> predictionUris) {
            this.predictionUris = predictionUris;
            this.__explicitlySet__.add("predictionUris");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PredictionEndpointDetails build() {
            PredictionEndpointDetails model =
                    new PredictionEndpointDetails(this.basePredictionUri, this.predictionUris);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PredictionEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("basePredictionUri")) {
                this.basePredictionUri(model.getBasePredictionUri());
            }
            if (model.wasPropertyExplicitlySet("predictionUris")) {
                this.predictionUris(model.getPredictionUris());
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

    /** Base URI of prediction router. */
    @com.fasterxml.jackson.annotation.JsonProperty("basePredictionUri")
    private final String basePredictionUri;

    /**
     * Base URI of prediction router.
     *
     * @return the value
     */
    public String getBasePredictionUri() {
        return basePredictionUri;
    }

    /** Array of all prediction URIs per use-case. */
    @com.fasterxml.jackson.annotation.JsonProperty("predictionUris")
    private final java.util.List<PredictionUri> predictionUris;

    /**
     * Array of all prediction URIs per use-case.
     *
     * @return the value
     */
    public java.util.List<PredictionUri> getPredictionUris() {
        return predictionUris;
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
        sb.append("PredictionEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("basePredictionUri=").append(String.valueOf(this.basePredictionUri));
        sb.append(", predictionUris=").append(String.valueOf(this.predictionUris));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PredictionEndpointDetails)) {
            return false;
        }

        PredictionEndpointDetails other = (PredictionEndpointDetails) o;
        return java.util.Objects.equals(this.basePredictionUri, other.basePredictionUri)
                && java.util.Objects.equals(this.predictionUris, other.predictionUris)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.basePredictionUri == null ? 43 : this.basePredictionUri.hashCode());
        result =
                (result * PRIME)
                        + (this.predictionUris == null ? 43 : this.predictionUris.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
