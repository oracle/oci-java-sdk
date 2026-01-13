/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Parameters for all the helm stages passed for retrieving Helm Diff <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HelmDiffArgument.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HelmDiffArgument
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stageId",
        "helmArgSetValues",
        "helmArgStringValues",
        "valueArtifactContents",
        "helmStageContents"
    })
    public HelmDiffArgument(
            String stageId,
            HelmSetValueCollection helmArgSetValues,
            HelmSetValueCollection helmArgStringValues,
            ValueArtifactContentCollection valueArtifactContents,
            java.util.List<HelmStageContent> helmStageContents) {
        super();
        this.stageId = stageId;
        this.helmArgSetValues = helmArgSetValues;
        this.helmArgStringValues = helmArgStringValues;
        this.valueArtifactContents = valueArtifactContents;
        this.helmStageContents = helmStageContents;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Deploy Stage OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("stageId")
        private String stageId;

        /**
         * Deploy Stage OCID.
         *
         * @param stageId the value to set
         * @return this builder
         */
        public Builder stageId(String stageId) {
            this.stageId = stageId;
            this.__explicitlySet__.add("stageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("helmArgSetValues")
        private HelmSetValueCollection helmArgSetValues;

        public Builder helmArgSetValues(HelmSetValueCollection helmArgSetValues) {
            this.helmArgSetValues = helmArgSetValues;
            this.__explicitlySet__.add("helmArgSetValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("helmArgStringValues")
        private HelmSetValueCollection helmArgStringValues;

        public Builder helmArgStringValues(HelmSetValueCollection helmArgStringValues) {
            this.helmArgStringValues = helmArgStringValues;
            this.__explicitlySet__.add("helmArgStringValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueArtifactContents")
        private ValueArtifactContentCollection valueArtifactContents;

        public Builder valueArtifactContents(ValueArtifactContentCollection valueArtifactContents) {
            this.valueArtifactContents = valueArtifactContents;
            this.__explicitlySet__.add("valueArtifactContents");
            return this;
        }
        /** Stage specific values along with the helm chart injected by Shepherd */
        @com.fasterxml.jackson.annotation.JsonProperty("helmStageContents")
        private java.util.List<HelmStageContent> helmStageContents;

        /**
         * Stage specific values along with the helm chart injected by Shepherd
         *
         * @param helmStageContents the value to set
         * @return this builder
         */
        public Builder helmStageContents(java.util.List<HelmStageContent> helmStageContents) {
            this.helmStageContents = helmStageContents;
            this.__explicitlySet__.add("helmStageContents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HelmDiffArgument build() {
            HelmDiffArgument model =
                    new HelmDiffArgument(
                            this.stageId,
                            this.helmArgSetValues,
                            this.helmArgStringValues,
                            this.valueArtifactContents,
                            this.helmStageContents);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HelmDiffArgument model) {
            if (model.wasPropertyExplicitlySet("stageId")) {
                this.stageId(model.getStageId());
            }
            if (model.wasPropertyExplicitlySet("helmArgSetValues")) {
                this.helmArgSetValues(model.getHelmArgSetValues());
            }
            if (model.wasPropertyExplicitlySet("helmArgStringValues")) {
                this.helmArgStringValues(model.getHelmArgStringValues());
            }
            if (model.wasPropertyExplicitlySet("valueArtifactContents")) {
                this.valueArtifactContents(model.getValueArtifactContents());
            }
            if (model.wasPropertyExplicitlySet("helmStageContents")) {
                this.helmStageContents(model.getHelmStageContents());
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

    /** Deploy Stage OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("stageId")
    private final String stageId;

    /**
     * Deploy Stage OCID.
     *
     * @return the value
     */
    public String getStageId() {
        return stageId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("helmArgSetValues")
    private final HelmSetValueCollection helmArgSetValues;

    public HelmSetValueCollection getHelmArgSetValues() {
        return helmArgSetValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("helmArgStringValues")
    private final HelmSetValueCollection helmArgStringValues;

    public HelmSetValueCollection getHelmArgStringValues() {
        return helmArgStringValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("valueArtifactContents")
    private final ValueArtifactContentCollection valueArtifactContents;

    public ValueArtifactContentCollection getValueArtifactContents() {
        return valueArtifactContents;
    }

    /** Stage specific values along with the helm chart injected by Shepherd */
    @com.fasterxml.jackson.annotation.JsonProperty("helmStageContents")
    private final java.util.List<HelmStageContent> helmStageContents;

    /**
     * Stage specific values along with the helm chart injected by Shepherd
     *
     * @return the value
     */
    public java.util.List<HelmStageContent> getHelmStageContents() {
        return helmStageContents;
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
        sb.append("HelmDiffArgument(");
        sb.append("super=").append(super.toString());
        sb.append("stageId=").append(String.valueOf(this.stageId));
        sb.append(", helmArgSetValues=").append(String.valueOf(this.helmArgSetValues));
        sb.append(", helmArgStringValues=").append(String.valueOf(this.helmArgStringValues));
        sb.append(", valueArtifactContents=").append(String.valueOf(this.valueArtifactContents));
        sb.append(", helmStageContents=").append(String.valueOf(this.helmStageContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HelmDiffArgument)) {
            return false;
        }

        HelmDiffArgument other = (HelmDiffArgument) o;
        return java.util.Objects.equals(this.stageId, other.stageId)
                && java.util.Objects.equals(this.helmArgSetValues, other.helmArgSetValues)
                && java.util.Objects.equals(this.helmArgStringValues, other.helmArgStringValues)
                && java.util.Objects.equals(this.valueArtifactContents, other.valueArtifactContents)
                && java.util.Objects.equals(this.helmStageContents, other.helmStageContents)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stageId == null ? 43 : this.stageId.hashCode());
        result =
                (result * PRIME)
                        + (this.helmArgSetValues == null ? 43 : this.helmArgSetValues.hashCode());
        result =
                (result * PRIME)
                        + (this.helmArgStringValues == null
                                ? 43
                                : this.helmArgStringValues.hashCode());
        result =
                (result * PRIME)
                        + (this.valueArtifactContents == null
                                ? 43
                                : this.valueArtifactContents.hashCode());
        result =
                (result * PRIME)
                        + (this.helmStageContents == null ? 43 : this.helmStageContents.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
