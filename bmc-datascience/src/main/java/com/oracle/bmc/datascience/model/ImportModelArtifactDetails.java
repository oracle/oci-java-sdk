/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details required for importing the artifact from service bucket
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImportModelArtifactDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImportModelArtifactDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"artifactImportDetails"})
    public ImportModelArtifactDetails(ArtifactImportDetails artifactImportDetails) {
        super();
        this.artifactImportDetails = artifactImportDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("artifactImportDetails")
        private ArtifactImportDetails artifactImportDetails;

        public Builder artifactImportDetails(ArtifactImportDetails artifactImportDetails) {
            this.artifactImportDetails = artifactImportDetails;
            this.__explicitlySet__.add("artifactImportDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportModelArtifactDetails build() {
            ImportModelArtifactDetails model =
                    new ImportModelArtifactDetails(this.artifactImportDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportModelArtifactDetails model) {
            if (model.wasPropertyExplicitlySet("artifactImportDetails")) {
                this.artifactImportDetails(model.getArtifactImportDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("artifactImportDetails")
    private final ArtifactImportDetails artifactImportDetails;

    public ArtifactImportDetails getArtifactImportDetails() {
        return artifactImportDetails;
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
        sb.append("ImportModelArtifactDetails(");
        sb.append("super=").append(super.toString());
        sb.append("artifactImportDetails=").append(String.valueOf(this.artifactImportDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportModelArtifactDetails)) {
            return false;
        }

        ImportModelArtifactDetails other = (ImportModelArtifactDetails) o;
        return java.util.Objects.equals(this.artifactImportDetails, other.artifactImportDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.artifactImportDetails == null
                                ? 43
                                : this.artifactImportDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
