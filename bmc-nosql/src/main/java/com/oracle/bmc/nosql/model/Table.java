/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Complete metadata about a table. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Table.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Table extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "tableLimits",
        "lifecycleState",
        "isAutoReclaimable",
        "timeOfExpiration",
        "lifecycleDetails",
        "schema",
        "ddlStatement",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Table(
            String id,
            String name,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            TableLimits tableLimits,
            LifecycleState lifecycleState,
            Boolean isAutoReclaimable,
            java.util.Date timeOfExpiration,
            String lifecycleDetails,
            Schema schema,
            String ddlStatement,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.name = name;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.tableLimits = tableLimits;
        this.lifecycleState = lifecycleState;
        this.isAutoReclaimable = isAutoReclaimable;
        this.timeOfExpiration = timeOfExpiration;
        this.lifecycleDetails = lifecycleDetails;
        this.schema = schema;
        this.ddlStatement = ddlStatement;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Human-friendly table name, immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Human-friendly table name, immutable.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Compartment Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The time the the table was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the table was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the the table's metadata was last updated. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the the table's metadata was last updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableLimits")
        private TableLimits tableLimits;

        public Builder tableLimits(TableLimits tableLimits) {
            this.tableLimits = tableLimits;
            this.__explicitlySet__.add("tableLimits");
            return this;
        }
        /** The state of a table. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of a table.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** True if this table can be reclaimed after an idle period. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoReclaimable")
        private Boolean isAutoReclaimable;

        /**
         * True if this table can be reclaimed after an idle period.
         *
         * @param isAutoReclaimable the value to set
         * @return this builder
         */
        public Builder isAutoReclaimable(Boolean isAutoReclaimable) {
            this.isAutoReclaimable = isAutoReclaimable;
            this.__explicitlySet__.add("isAutoReclaimable");
            return this;
        }
        /**
         * If lifecycleState is INACTIVE, indicates when this table will be automatically removed.
         * An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiration")
        private java.util.Date timeOfExpiration;

        /**
         * If lifecycleState is INACTIVE, indicates when this table will be automatically removed.
         * An RFC3339 formatted datetime string.
         *
         * @param timeOfExpiration the value to set
         * @return this builder
         */
        public Builder timeOfExpiration(java.util.Date timeOfExpiration) {
            this.timeOfExpiration = timeOfExpiration;
            this.__explicitlySet__.add("timeOfExpiration");
            return this;
        }
        /** A message describing the current state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private Schema schema;

        public Builder schema(Schema schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /** A DDL statement representing the schema. */
        @com.fasterxml.jackson.annotation.JsonProperty("ddlStatement")
        private String ddlStatement;

        /**
         * A DDL statement representing the schema.
         *
         * @param ddlStatement the value to set
         * @return this builder
         */
        public Builder ddlStatement(String ddlStatement) {
            this.ddlStatement = ddlStatement;
            this.__explicitlySet__.add("ddlStatement");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Read-only system tag. These predefined keys are scoped to namespaces. At present the only
         * supported namespace is {@code "orcl-cloud"}; and the only key in that namespace is {@code
         * "free-tier-retained"}. Example: {@code {"orcl-cloud"": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Read-only system tag. These predefined keys are scoped to namespaces. At present the only
         * supported namespace is {@code "orcl-cloud"}; and the only key in that namespace is {@code
         * "free-tier-retained"}. Example: {@code {"orcl-cloud"": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Table build() {
            Table model =
                    new Table(
                            this.id,
                            this.name,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.tableLimits,
                            this.lifecycleState,
                            this.isAutoReclaimable,
                            this.timeOfExpiration,
                            this.lifecycleDetails,
                            this.schema,
                            this.ddlStatement,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Table model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("tableLimits")) {
                this.tableLimits(model.getTableLimits());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isAutoReclaimable")) {
                this.isAutoReclaimable(model.getIsAutoReclaimable());
            }
            if (model.wasPropertyExplicitlySet("timeOfExpiration")) {
                this.timeOfExpiration(model.getTimeOfExpiration());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("ddlStatement")) {
                this.ddlStatement(model.getDdlStatement());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Unique identifier that is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Human-friendly table name, immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Human-friendly table name, immutable.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Compartment Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The time the the table was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the table was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the the table's metadata was last updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the the table's metadata was last updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tableLimits")
    private final TableLimits tableLimits;

    public TableLimits getTableLimits() {
        return tableLimits;
    }

    /** The state of a table. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The state of a table. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of a table.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** True if this table can be reclaimed after an idle period. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoReclaimable")
    private final Boolean isAutoReclaimable;

    /**
     * True if this table can be reclaimed after an idle period.
     *
     * @return the value
     */
    public Boolean getIsAutoReclaimable() {
        return isAutoReclaimable;
    }

    /**
     * If lifecycleState is INACTIVE, indicates when this table will be automatically removed. An
     * RFC3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiration")
    private final java.util.Date timeOfExpiration;

    /**
     * If lifecycleState is INACTIVE, indicates when this table will be automatically removed. An
     * RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeOfExpiration() {
        return timeOfExpiration;
    }

    /** A message describing the current state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final Schema schema;

    public Schema getSchema() {
        return schema;
    }

    /** A DDL statement representing the schema. */
    @com.fasterxml.jackson.annotation.JsonProperty("ddlStatement")
    private final String ddlStatement;

    /**
     * A DDL statement representing the schema.
     *
     * @return the value
     */
    public String getDdlStatement() {
        return ddlStatement;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Read-only system tag. These predefined keys are scoped to namespaces. At present the only
     * supported namespace is {@code "orcl-cloud"}; and the only key in that namespace is {@code
     * "free-tier-retained"}. Example: {@code {"orcl-cloud"": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Read-only system tag. These predefined keys are scoped to namespaces. At present the only
     * supported namespace is {@code "orcl-cloud"}; and the only key in that namespace is {@code
     * "free-tier-retained"}. Example: {@code {"orcl-cloud"": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Table(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", tableLimits=").append(String.valueOf(this.tableLimits));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isAutoReclaimable=").append(String.valueOf(this.isAutoReclaimable));
        sb.append(", timeOfExpiration=").append(String.valueOf(this.timeOfExpiration));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", ddlStatement=").append(String.valueOf(this.ddlStatement));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Table)) {
            return false;
        }

        Table other = (Table) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.tableLimits, other.tableLimits)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isAutoReclaimable, other.isAutoReclaimable)
                && java.util.Objects.equals(this.timeOfExpiration, other.timeOfExpiration)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.ddlStatement, other.ddlStatement)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.tableLimits == null ? 43 : this.tableLimits.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoReclaimable == null ? 43 : this.isAutoReclaimable.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfExpiration == null ? 43 : this.timeOfExpiration.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.ddlStatement == null ? 43 : this.ddlStatement.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
