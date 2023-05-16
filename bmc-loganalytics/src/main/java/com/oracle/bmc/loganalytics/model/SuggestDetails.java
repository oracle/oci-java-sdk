/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Typeahead input. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SuggestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SuggestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "compartmentIdInSubtree",
        "queryString",
        "subSystem"
    })
    public SuggestDetails(
            String compartmentId,
            Boolean compartmentIdInSubtree,
            String queryString,
            SubSystemName subSystem) {
        super();
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.queryString = queryString;
        this.subSystem = subSystem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Flag to search all child compartments of the compartment Id specified in the
         * compartmentId query parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        /**
         * Flag to search all child compartments of the compartment Id specified in the
         * compartmentId query parameter.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }
        /** Query seeking suggestions for. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        /**
         * Query seeking suggestions for.
         *
         * @param queryString the value to set
         * @return this builder
         */
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            this.__explicitlySet__.add("queryString");
            return this;
        }
        /** Default subsystem to qualify fields with in the queryString if not specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
        private SubSystemName subSystem;

        /**
         * Default subsystem to qualify fields with in the queryString if not specified.
         *
         * @param subSystem the value to set
         * @return this builder
         */
        public Builder subSystem(SubSystemName subSystem) {
            this.subSystem = subSystem;
            this.__explicitlySet__.add("subSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuggestDetails build() {
            SuggestDetails model =
                    new SuggestDetails(
                            this.compartmentId,
                            this.compartmentIdInSubtree,
                            this.queryString,
                            this.subSystem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentIdInSubtree")) {
                this.compartmentIdInSubtree(model.getCompartmentIdInSubtree());
            }
            if (model.wasPropertyExplicitlySet("queryString")) {
                this.queryString(model.getQueryString());
            }
            if (model.wasPropertyExplicitlySet("subSystem")) {
                this.subSystem(model.getSubSystem());
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

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Flag to search all child compartments of the compartment Id specified in the compartmentId
     * query parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    private final Boolean compartmentIdInSubtree;

    /**
     * Flag to search all child compartments of the compartment Id specified in the compartmentId
     * query parameter.
     *
     * @return the value
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    /** Query seeking suggestions for. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    private final String queryString;

    /**
     * Query seeking suggestions for.
     *
     * @return the value
     */
    public String getQueryString() {
        return queryString;
    }

    /** Default subsystem to qualify fields with in the queryString if not specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    private final SubSystemName subSystem;

    /**
     * Default subsystem to qualify fields with in the queryString if not specified.
     *
     * @return the value
     */
    public SubSystemName getSubSystem() {
        return subSystem;
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
        sb.append("SuggestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(", queryString=").append(String.valueOf(this.queryString));
        sb.append(", subSystem=").append(String.valueOf(this.subSystem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestDetails)) {
            return false;
        }

        SuggestDetails other = (SuggestDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.subSystem, other.subSystem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.subSystem == null ? 43 : this.subSystem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
