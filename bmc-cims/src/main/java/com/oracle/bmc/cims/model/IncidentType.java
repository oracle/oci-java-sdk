/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the incident type object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IncidentType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IncidentType {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "label", "description", "classifierList"})
    public IncidentType(
            String id,
            String name,
            String label,
            String description,
            java.util.List<Classifier> classifierList) {
        super();
        this.id = id;
        this.name = name;
        this.label = label;
        this.description = description;
        this.classifierList = classifierList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the incident type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the incident type.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the incident type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the incident type.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The label associated with the incident type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * The label associated with the incident type.
         * @param label the value to set
         * @return this builder
         **/
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * The description of the incident type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the incident type.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The list of classifiers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classifierList")
        private java.util.List<Classifier> classifierList;

        /**
         * The list of classifiers.
         * @param classifierList the value to set
         * @return this builder
         **/
        public Builder classifierList(java.util.List<Classifier> classifierList) {
            this.classifierList = classifierList;
            this.__explicitlySet__.add("classifierList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IncidentType build() {
            IncidentType __instance__ =
                    new IncidentType(id, name, label, description, classifierList);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IncidentType o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .label(o.getLabel())
                            .description(o.getDescription())
                            .classifierList(o.getClassifierList());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Unique identifier for the incident type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the incident type.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the incident type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the incident type.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The label associated with the incident type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * The label associated with the incident type.
     * @return the value
     **/
    public String getLabel() {
        return label;
    }

    /**
     * The description of the incident type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the incident type.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The list of classifiers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classifierList")
    private final java.util.List<Classifier> classifierList;

    /**
     * The list of classifiers.
     * @return the value
     **/
    public java.util.List<Classifier> getClassifierList() {
        return classifierList;
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
        sb.append("IncidentType(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", classifierList=").append(String.valueOf(this.classifierList));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncidentType)) {
            return false;
        }

        IncidentType other = (IncidentType) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.classifierList, other.classifierList)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.classifierList == null ? 43 : this.classifierList.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
