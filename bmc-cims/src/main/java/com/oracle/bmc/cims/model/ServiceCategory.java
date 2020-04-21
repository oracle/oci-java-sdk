/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Incident Classifier details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ServiceCategory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ServiceCategory {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issueTypeList")
        private java.util.List<IssueType> issueTypeList;

        public Builder issueTypeList(java.util.List<IssueType> issueTypeList) {
            this.issueTypeList = issueTypeList;
            this.__explicitlySet__.add("issueTypeList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Scope scope;

        public Builder scope(Scope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("limitId")
        private String limitId;

        public Builder limitId(String limitId) {
            this.limitId = limitId;
            this.__explicitlySet__.add("limitId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceCategory build() {
            ServiceCategory __instance__ =
                    new ServiceCategory(
                            key, name, label, description, issueTypeList, scope, unit, limitId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceCategory o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .name(o.getName())
                            .label(o.getLabel())
                            .description(o.getDescription())
                            .issueTypeList(o.getIssueTypeList())
                            .scope(o.getScope())
                            .unit(o.getUnit())
                            .limitId(o.getLimitId());

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

    /**
     * Unique ID that identifies a classifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Name of classifier. eg: LIMIT Increase
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Label of classifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    String label;

    /**
     * Description of classifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * List of Issues
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issueTypeList")
    java.util.List<IssueType> issueTypeList;

    /**
     * List of Scope
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    Scope scope;

    /**
     * List of Units
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    Unit unit;

    /**
     * Limit's unique id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitId")
    String limitId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
