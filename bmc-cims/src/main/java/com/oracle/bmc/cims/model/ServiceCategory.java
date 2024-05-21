/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Information about the support ticket classifier.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ServiceCategory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceCategory extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "name",
        "label",
        "description",
        "issueTypeList",
        "scope",
        "unit",
        "limitId"
    })
    public ServiceCategory(
            String key,
            String name,
            String label,
            String description,
            java.util.List<IssueType> issueTypeList,
            Scope scope,
            Unit unit,
            String limitId) {
        super();
        this.key = key;
        this.name = name;
        this.label = label;
        this.description = description;
        this.issueTypeList = issueTypeList;
        this.scope = scope;
        this.unit = unit;
        this.limitId = limitId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique ID that identifies a classifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique ID that identifies a classifier.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The name of the classifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the classifier.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The label for the classifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * The label for the classifier.
         * @param label the value to set
         * @return this builder
         **/
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * The text describing the classifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The text describing the classifier.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The list of issues.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issueTypeList")
        private java.util.List<IssueType> issueTypeList;

        /**
         * The list of issues.
         * @param issueTypeList the value to set
         * @return this builder
         **/
        public Builder issueTypeList(java.util.List<IssueType> issueTypeList) {
            this.issueTypeList = issueTypeList;
            this.__explicitlySet__.add("issueTypeList");
            return this;
        }
        /**
         * The scope of the incident.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Scope scope;

        /**
         * The scope of the incident.
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(Scope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * The unit to use to measure the service category or resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * The unit to use to measure the service category or resource.
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * The unique ID for the limit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitId")
        private String limitId;

        /**
         * The unique ID for the limit.
         * @param limitId the value to set
         * @return this builder
         **/
        public Builder limitId(String limitId) {
            this.limitId = limitId;
            this.__explicitlySet__.add("limitId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceCategory build() {
            ServiceCategory model =
                    new ServiceCategory(
                            this.key,
                            this.name,
                            this.label,
                            this.description,
                            this.issueTypeList,
                            this.scope,
                            this.unit,
                            this.limitId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceCategory model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("issueTypeList")) {
                this.issueTypeList(model.getIssueTypeList());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("limitId")) {
                this.limitId(model.getLimitId());
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
     * The unique ID that identifies a classifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique ID that identifies a classifier.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The name of the classifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the classifier.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The label for the classifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * The label for the classifier.
     * @return the value
     **/
    public String getLabel() {
        return label;
    }

    /**
     * The text describing the classifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The text describing the classifier.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The list of issues.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issueTypeList")
    private final java.util.List<IssueType> issueTypeList;

    /**
     * The list of issues.
     * @return the value
     **/
    public java.util.List<IssueType> getIssueTypeList() {
        return issueTypeList;
    }

    /**
     * The scope of the incident.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final Scope scope;

    /**
     * The scope of the incident.
     * @return the value
     **/
    public Scope getScope() {
        return scope;
    }

    /**
     * The unit to use to measure the service category or resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * The unit to use to measure the service category or resource.
     * @return the value
     **/
    public Unit getUnit() {
        return unit;
    }

    /**
     * The unique ID for the limit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitId")
    private final String limitId;

    /**
     * The unique ID for the limit.
     * @return the value
     **/
    public String getLimitId() {
        return limitId;
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
        sb.append("ServiceCategory(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", issueTypeList=").append(String.valueOf(this.issueTypeList));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", limitId=").append(String.valueOf(this.limitId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceCategory)) {
            return false;
        }

        ServiceCategory other = (ServiceCategory) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.issueTypeList, other.issueTypeList)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.limitId, other.limitId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.issueTypeList == null ? 43 : this.issueTypeList.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.limitId == null ? 43 : this.limitId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
