/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a subsetting schema relation processed while extracting rows for processing a
 * subsetting rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubsettingRuleProcessingChainObjectSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubsettingRuleProcessingChainObjectSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "subsettingSchemaRelationKey",
        "parentSchemaName",
        "parentObjectName",
        "parentColumns",
        "childSchemaName",
        "childObjectName",
        "childColumns",
        "propagationImpact",
        "approximateRowCountBeforeSubsetting",
        "estimatedRowCountAfterSubsetting",
        "isEnabledForProcessing"
    })
    public SubsettingRuleProcessingChainObjectSummary(
            String key,
            String subsettingSchemaRelationKey,
            String parentSchemaName,
            String parentObjectName,
            java.util.List<String> parentColumns,
            String childSchemaName,
            String childObjectName,
            java.util.List<String> childColumns,
            PropagationImpact propagationImpact,
            Long approximateRowCountBeforeSubsetting,
            Long estimatedRowCountAfterSubsetting,
            Boolean isEnabledForProcessing) {
        super();
        this.key = key;
        this.subsettingSchemaRelationKey = subsettingSchemaRelationKey;
        this.parentSchemaName = parentSchemaName;
        this.parentObjectName = parentObjectName;
        this.parentColumns = parentColumns;
        this.childSchemaName = childSchemaName;
        this.childObjectName = childObjectName;
        this.childColumns = childColumns;
        this.propagationImpact = propagationImpact;
        this.approximateRowCountBeforeSubsetting = approximateRowCountBeforeSubsetting;
        this.estimatedRowCountAfterSubsetting = estimatedRowCountAfterSubsetting;
        this.isEnabledForProcessing = isEnabledForProcessing;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key that identifies a subsetting relation processed. The key is numeric and
         * unique within a processing order
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies a subsetting relation processed. The key is numeric and
         * unique within a processing order
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The unique key that identifies a subsetting relation. */
        @com.fasterxml.jackson.annotation.JsonProperty("subsettingSchemaRelationKey")
        private String subsettingSchemaRelationKey;

        /**
         * The unique key that identifies a subsetting relation.
         *
         * @param subsettingSchemaRelationKey the value to set
         * @return this builder
         */
        public Builder subsettingSchemaRelationKey(String subsettingSchemaRelationKey) {
            this.subsettingSchemaRelationKey = subsettingSchemaRelationKey;
            this.__explicitlySet__.add("subsettingSchemaRelationKey");
            return this;
        }
        /** The database schema that contains the parent subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("parentSchemaName")
        private String parentSchemaName;

        /**
         * The database schema that contains the parent subsetting table
         *
         * @param parentSchemaName the value to set
         * @return this builder
         */
        public Builder parentSchemaName(String parentSchemaName) {
            this.parentSchemaName = parentSchemaName;
            this.__explicitlySet__.add("parentSchemaName");
            return this;
        }
        /** The name of the parent subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("parentObjectName")
        private String parentObjectName;

        /**
         * The name of the parent subsetting table
         *
         * @param parentObjectName the value to set
         * @return this builder
         */
        public Builder parentObjectName(String parentObjectName) {
            this.parentObjectName = parentObjectName;
            this.__explicitlySet__.add("parentObjectName");
            return this;
        }
        /** Unique identifiers identifying the parents columns in the relation. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentColumns")
        private java.util.List<String> parentColumns;

        /**
         * Unique identifiers identifying the parents columns in the relation.
         *
         * @param parentColumns the value to set
         * @return this builder
         */
        public Builder parentColumns(java.util.List<String> parentColumns) {
            this.parentColumns = parentColumns;
            this.__explicitlySet__.add("parentColumns");
            return this;
        }
        /** The database schema that contains the child subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("childSchemaName")
        private String childSchemaName;

        /**
         * The database schema that contains the child subsetting table
         *
         * @param childSchemaName the value to set
         * @return this builder
         */
        public Builder childSchemaName(String childSchemaName) {
            this.childSchemaName = childSchemaName;
            this.__explicitlySet__.add("childSchemaName");
            return this;
        }
        /** The name of the child subsetting table */
        @com.fasterxml.jackson.annotation.JsonProperty("childObjectName")
        private String childObjectName;

        /**
         * The name of the child subsetting table
         *
         * @param childObjectName the value to set
         * @return this builder
         */
        public Builder childObjectName(String childObjectName) {
            this.childObjectName = childObjectName;
            this.__explicitlySet__.add("childObjectName");
            return this;
        }
        /** Unique identifiers identifying the child columns in the relation. */
        @com.fasterxml.jackson.annotation.JsonProperty("childColumns")
        private java.util.List<String> childColumns;

        /**
         * Unique identifiers identifying the child columns in the relation.
         *
         * @param childColumns the value to set
         * @return this builder
         */
        public Builder childColumns(java.util.List<String> childColumns) {
            this.childColumns = childColumns;
            this.__explicitlySet__.add("childColumns");
            return this;
        }
        /** The impact on the related table due to the processing of subsetting rule */
        @com.fasterxml.jackson.annotation.JsonProperty("propagationImpact")
        private PropagationImpact propagationImpact;

        /**
         * The impact on the related table due to the processing of subsetting rule
         *
         * @param propagationImpact the value to set
         * @return this builder
         */
        public Builder propagationImpact(PropagationImpact propagationImpact) {
            this.propagationImpact = propagationImpact;
            this.__explicitlySet__.add("propagationImpact");
            return this;
        }
        /** The approximate count of rows in the subsetting table before subsetting */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateRowCountBeforeSubsetting")
        private Long approximateRowCountBeforeSubsetting;

        /**
         * The approximate count of rows in the subsetting table before subsetting
         *
         * @param approximateRowCountBeforeSubsetting the value to set
         * @return this builder
         */
        public Builder approximateRowCountBeforeSubsetting(
                Long approximateRowCountBeforeSubsetting) {
            this.approximateRowCountBeforeSubsetting = approximateRowCountBeforeSubsetting;
            this.__explicitlySet__.add("approximateRowCountBeforeSubsetting");
            return this;
        }
        /** The estimated count of rows in the subsetting table after subsetting */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCountAfterSubsetting")
        private Long estimatedRowCountAfterSubsetting;

        /**
         * The estimated count of rows in the subsetting table after subsetting
         *
         * @param estimatedRowCountAfterSubsetting the value to set
         * @return this builder
         */
        public Builder estimatedRowCountAfterSubsetting(Long estimatedRowCountAfterSubsetting) {
            this.estimatedRowCountAfterSubsetting = estimatedRowCountAfterSubsetting;
            this.__explicitlySet__.add("estimatedRowCountAfterSubsetting");
            return this;
        }
        /** Indicates if this object/edge is enabled for processing */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabledForProcessing")
        private Boolean isEnabledForProcessing;

        /**
         * Indicates if this object/edge is enabled for processing
         *
         * @param isEnabledForProcessing the value to set
         * @return this builder
         */
        public Builder isEnabledForProcessing(Boolean isEnabledForProcessing) {
            this.isEnabledForProcessing = isEnabledForProcessing;
            this.__explicitlySet__.add("isEnabledForProcessing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubsettingRuleProcessingChainObjectSummary build() {
            SubsettingRuleProcessingChainObjectSummary model =
                    new SubsettingRuleProcessingChainObjectSummary(
                            this.key,
                            this.subsettingSchemaRelationKey,
                            this.parentSchemaName,
                            this.parentObjectName,
                            this.parentColumns,
                            this.childSchemaName,
                            this.childObjectName,
                            this.childColumns,
                            this.propagationImpact,
                            this.approximateRowCountBeforeSubsetting,
                            this.estimatedRowCountAfterSubsetting,
                            this.isEnabledForProcessing);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubsettingRuleProcessingChainObjectSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("subsettingSchemaRelationKey")) {
                this.subsettingSchemaRelationKey(model.getSubsettingSchemaRelationKey());
            }
            if (model.wasPropertyExplicitlySet("parentSchemaName")) {
                this.parentSchemaName(model.getParentSchemaName());
            }
            if (model.wasPropertyExplicitlySet("parentObjectName")) {
                this.parentObjectName(model.getParentObjectName());
            }
            if (model.wasPropertyExplicitlySet("parentColumns")) {
                this.parentColumns(model.getParentColumns());
            }
            if (model.wasPropertyExplicitlySet("childSchemaName")) {
                this.childSchemaName(model.getChildSchemaName());
            }
            if (model.wasPropertyExplicitlySet("childObjectName")) {
                this.childObjectName(model.getChildObjectName());
            }
            if (model.wasPropertyExplicitlySet("childColumns")) {
                this.childColumns(model.getChildColumns());
            }
            if (model.wasPropertyExplicitlySet("propagationImpact")) {
                this.propagationImpact(model.getPropagationImpact());
            }
            if (model.wasPropertyExplicitlySet("approximateRowCountBeforeSubsetting")) {
                this.approximateRowCountBeforeSubsetting(
                        model.getApproximateRowCountBeforeSubsetting());
            }
            if (model.wasPropertyExplicitlySet("estimatedRowCountAfterSubsetting")) {
                this.estimatedRowCountAfterSubsetting(model.getEstimatedRowCountAfterSubsetting());
            }
            if (model.wasPropertyExplicitlySet("isEnabledForProcessing")) {
                this.isEnabledForProcessing(model.getIsEnabledForProcessing());
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
     * The unique key that identifies a subsetting relation processed. The key is numeric and unique
     * within a processing order
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies a subsetting relation processed. The key is numeric and unique
     * within a processing order
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The unique key that identifies a subsetting relation. */
    @com.fasterxml.jackson.annotation.JsonProperty("subsettingSchemaRelationKey")
    private final String subsettingSchemaRelationKey;

    /**
     * The unique key that identifies a subsetting relation.
     *
     * @return the value
     */
    public String getSubsettingSchemaRelationKey() {
        return subsettingSchemaRelationKey;
    }

    /** The database schema that contains the parent subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("parentSchemaName")
    private final String parentSchemaName;

    /**
     * The database schema that contains the parent subsetting table
     *
     * @return the value
     */
    public String getParentSchemaName() {
        return parentSchemaName;
    }

    /** The name of the parent subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("parentObjectName")
    private final String parentObjectName;

    /**
     * The name of the parent subsetting table
     *
     * @return the value
     */
    public String getParentObjectName() {
        return parentObjectName;
    }

    /** Unique identifiers identifying the parents columns in the relation. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentColumns")
    private final java.util.List<String> parentColumns;

    /**
     * Unique identifiers identifying the parents columns in the relation.
     *
     * @return the value
     */
    public java.util.List<String> getParentColumns() {
        return parentColumns;
    }

    /** The database schema that contains the child subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("childSchemaName")
    private final String childSchemaName;

    /**
     * The database schema that contains the child subsetting table
     *
     * @return the value
     */
    public String getChildSchemaName() {
        return childSchemaName;
    }

    /** The name of the child subsetting table */
    @com.fasterxml.jackson.annotation.JsonProperty("childObjectName")
    private final String childObjectName;

    /**
     * The name of the child subsetting table
     *
     * @return the value
     */
    public String getChildObjectName() {
        return childObjectName;
    }

    /** Unique identifiers identifying the child columns in the relation. */
    @com.fasterxml.jackson.annotation.JsonProperty("childColumns")
    private final java.util.List<String> childColumns;

    /**
     * Unique identifiers identifying the child columns in the relation.
     *
     * @return the value
     */
    public java.util.List<String> getChildColumns() {
        return childColumns;
    }

    /** The impact on the related table due to the processing of subsetting rule */
    public enum PropagationImpact implements com.oracle.bmc.http.internal.BmcEnum {
        SubsetTable("SUBSET_TABLE"),
        ParentChildSubset("PARENT_CHILD_SUBSET"),
        ChildParentSubset("CHILD_PARENT_SUBSET"),
        Truncate("TRUNCATE"),
        Keep("KEEP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PropagationImpact.class);

        private final String value;
        private static java.util.Map<String, PropagationImpact> map;

        static {
            map = new java.util.HashMap<>();
            for (PropagationImpact v : PropagationImpact.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PropagationImpact(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PropagationImpact create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PropagationImpact', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The impact on the related table due to the processing of subsetting rule */
    @com.fasterxml.jackson.annotation.JsonProperty("propagationImpact")
    private final PropagationImpact propagationImpact;

    /**
     * The impact on the related table due to the processing of subsetting rule
     *
     * @return the value
     */
    public PropagationImpact getPropagationImpact() {
        return propagationImpact;
    }

    /** The approximate count of rows in the subsetting table before subsetting */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateRowCountBeforeSubsetting")
    private final Long approximateRowCountBeforeSubsetting;

    /**
     * The approximate count of rows in the subsetting table before subsetting
     *
     * @return the value
     */
    public Long getApproximateRowCountBeforeSubsetting() {
        return approximateRowCountBeforeSubsetting;
    }

    /** The estimated count of rows in the subsetting table after subsetting */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCountAfterSubsetting")
    private final Long estimatedRowCountAfterSubsetting;

    /**
     * The estimated count of rows in the subsetting table after subsetting
     *
     * @return the value
     */
    public Long getEstimatedRowCountAfterSubsetting() {
        return estimatedRowCountAfterSubsetting;
    }

    /** Indicates if this object/edge is enabled for processing */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabledForProcessing")
    private final Boolean isEnabledForProcessing;

    /**
     * Indicates if this object/edge is enabled for processing
     *
     * @return the value
     */
    public Boolean getIsEnabledForProcessing() {
        return isEnabledForProcessing;
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
        sb.append("SubsettingRuleProcessingChainObjectSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", subsettingSchemaRelationKey=")
                .append(String.valueOf(this.subsettingSchemaRelationKey));
        sb.append(", parentSchemaName=").append(String.valueOf(this.parentSchemaName));
        sb.append(", parentObjectName=").append(String.valueOf(this.parentObjectName));
        sb.append(", parentColumns=").append(String.valueOf(this.parentColumns));
        sb.append(", childSchemaName=").append(String.valueOf(this.childSchemaName));
        sb.append(", childObjectName=").append(String.valueOf(this.childObjectName));
        sb.append(", childColumns=").append(String.valueOf(this.childColumns));
        sb.append(", propagationImpact=").append(String.valueOf(this.propagationImpact));
        sb.append(", approximateRowCountBeforeSubsetting=")
                .append(String.valueOf(this.approximateRowCountBeforeSubsetting));
        sb.append(", estimatedRowCountAfterSubsetting=")
                .append(String.valueOf(this.estimatedRowCountAfterSubsetting));
        sb.append(", isEnabledForProcessing=").append(String.valueOf(this.isEnabledForProcessing));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubsettingRuleProcessingChainObjectSummary)) {
            return false;
        }

        SubsettingRuleProcessingChainObjectSummary other =
                (SubsettingRuleProcessingChainObjectSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(
                        this.subsettingSchemaRelationKey, other.subsettingSchemaRelationKey)
                && java.util.Objects.equals(this.parentSchemaName, other.parentSchemaName)
                && java.util.Objects.equals(this.parentObjectName, other.parentObjectName)
                && java.util.Objects.equals(this.parentColumns, other.parentColumns)
                && java.util.Objects.equals(this.childSchemaName, other.childSchemaName)
                && java.util.Objects.equals(this.childObjectName, other.childObjectName)
                && java.util.Objects.equals(this.childColumns, other.childColumns)
                && java.util.Objects.equals(this.propagationImpact, other.propagationImpact)
                && java.util.Objects.equals(
                        this.approximateRowCountBeforeSubsetting,
                        other.approximateRowCountBeforeSubsetting)
                && java.util.Objects.equals(
                        this.estimatedRowCountAfterSubsetting,
                        other.estimatedRowCountAfterSubsetting)
                && java.util.Objects.equals(
                        this.isEnabledForProcessing, other.isEnabledForProcessing)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.subsettingSchemaRelationKey == null
                                ? 43
                                : this.subsettingSchemaRelationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentSchemaName == null ? 43 : this.parentSchemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentObjectName == null ? 43 : this.parentObjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentColumns == null ? 43 : this.parentColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.childSchemaName == null ? 43 : this.childSchemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.childObjectName == null ? 43 : this.childObjectName.hashCode());
        result = (result * PRIME) + (this.childColumns == null ? 43 : this.childColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.propagationImpact == null ? 43 : this.propagationImpact.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateRowCountBeforeSubsetting == null
                                ? 43
                                : this.approximateRowCountBeforeSubsetting.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedRowCountAfterSubsetting == null
                                ? 43
                                : this.estimatedRowCountAfterSubsetting.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnabledForProcessing == null
                                ? 43
                                : this.isEnabledForProcessing.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
