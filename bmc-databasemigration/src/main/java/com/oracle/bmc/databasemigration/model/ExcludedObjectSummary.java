/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Excluded object summary line.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExcludedObjectSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExcludedObjectSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"owner", "object", "type", "reasonCategory", "sourceRule"})
    public ExcludedObjectSummary(
            String owner,
            String object,
            String type,
            ReasonKeywords reasonCategory,
            String sourceRule) {
        super();
        this.owner = owner;
        this.object = object;
        this.type = type;
        this.reasonCategory = reasonCategory;
        this.sourceRule = sourceRule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        public Builder object(String object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reasonCategory")
        private ReasonKeywords reasonCategory;

        public Builder reasonCategory(ReasonKeywords reasonCategory) {
            this.reasonCategory = reasonCategory;
            this.__explicitlySet__.add("reasonCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceRule")
        private String sourceRule;

        public Builder sourceRule(String sourceRule) {
            this.sourceRule = sourceRule;
            this.__explicitlySet__.add("sourceRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExcludedObjectSummary build() {
            ExcludedObjectSummary __instance__ =
                    new ExcludedObjectSummary(owner, object, type, reasonCategory, sourceRule);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExcludedObjectSummary o) {
            Builder copiedBuilder =
                    owner(o.getOwner())
                            .object(o.getObject())
                            .type(o.getType())
                            .reasonCategory(o.getReasonCategory())
                            .sourceRule(o.getSourceRule());

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
     * Database object owner.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    public String getOwner() {
        return owner;
    }

    /**
     * Database object name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    private final String object;

    public String getObject() {
        return object;
    }

    /**
     * Database object type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    public String getType() {
        return type;
    }

    /**
     * Reason category for object exclusion.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCategory")
    private final ReasonKeywords reasonCategory;

    public ReasonKeywords getReasonCategory() {
        return reasonCategory;
    }

    /**
     * Reason for exclusion.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRule")
    private final String sourceRule;

    public String getSourceRule() {
        return sourceRule;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExcludedObjectSummary(");
        sb.append("owner=").append(String.valueOf(this.owner));
        sb.append(", object=").append(String.valueOf(this.object));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", reasonCategory=").append(String.valueOf(this.reasonCategory));
        sb.append(", sourceRule=").append(String.valueOf(this.sourceRule));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExcludedObjectSummary)) {
            return false;
        }

        ExcludedObjectSummary other = (ExcludedObjectSummary) o;
        return java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.object, other.object)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.reasonCategory, other.reasonCategory)
                && java.util.Objects.equals(this.sourceRule, other.sourceRule)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.object == null ? 43 : this.object.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.reasonCategory == null ? 43 : this.reasonCategory.hashCode());
        result = (result * PRIME) + (this.sourceRule == null ? 43 : this.sourceRule.hashCode());
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
