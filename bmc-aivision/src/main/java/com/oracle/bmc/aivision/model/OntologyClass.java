/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Images and ImageObjects can be labeled with an OntologyClass.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OntologyClass.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OntologyClass extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "parentNames", "synonymNames"})
    public OntologyClass(
            String name, java.util.List<String> parentNames, java.util.List<String> synonymNames) {
        super();
        this.name = name;
        this.parentNames = parentNames;
        this.synonymNames = synonymNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The label name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The label name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The label parents.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentNames")
        private java.util.List<String> parentNames;

        /**
         * The label parents.
         * @param parentNames the value to set
         * @return this builder
         **/
        public Builder parentNames(java.util.List<String> parentNames) {
            this.parentNames = parentNames;
            this.__explicitlySet__.add("parentNames");
            return this;
        }
        /**
         * The label synonyms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("synonymNames")
        private java.util.List<String> synonymNames;

        /**
         * The label synonyms.
         * @param synonymNames the value to set
         * @return this builder
         **/
        public Builder synonymNames(java.util.List<String> synonymNames) {
            this.synonymNames = synonymNames;
            this.__explicitlySet__.add("synonymNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OntologyClass build() {
            OntologyClass model = new OntologyClass(this.name, this.parentNames, this.synonymNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyClass model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("parentNames")) {
                this.parentNames(model.getParentNames());
            }
            if (model.wasPropertyExplicitlySet("synonymNames")) {
                this.synonymNames(model.getSynonymNames());
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
     * The label name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The label name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The label parents.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentNames")
    private final java.util.List<String> parentNames;

    /**
     * The label parents.
     * @return the value
     **/
    public java.util.List<String> getParentNames() {
        return parentNames;
    }

    /**
     * The label synonyms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("synonymNames")
    private final java.util.List<String> synonymNames;

    /**
     * The label synonyms.
     * @return the value
     **/
    public java.util.List<String> getSynonymNames() {
        return synonymNames;
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
        sb.append("OntologyClass(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", parentNames=").append(String.valueOf(this.parentNames));
        sb.append(", synonymNames=").append(String.valueOf(this.synonymNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyClass)) {
            return false;
        }

        OntologyClass other = (OntologyClass) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.parentNames, other.parentNames)
                && java.util.Objects.equals(this.synonymNames, other.synonymNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.parentNames == null ? 43 : this.parentNames.hashCode());
        result = (result * PRIME) + (this.synonymNames == null ? 43 : this.synonymNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
