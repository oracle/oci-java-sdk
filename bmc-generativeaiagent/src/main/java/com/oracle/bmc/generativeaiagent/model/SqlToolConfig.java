/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration for SQL Tool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlToolConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "toolConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlToolConfig extends ToolConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("iclExamples")
        private InputLocation iclExamples;

        public Builder iclExamples(InputLocation iclExamples) {
            this.iclExamples = iclExamples;
            this.__explicitlySet__.add("iclExamples");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSchema")
        private InputLocation databaseSchema;

        public Builder databaseSchema(InputLocation databaseSchema) {
            this.databaseSchema = databaseSchema;
            this.__explicitlySet__.add("databaseSchema");
            return this;
        }
        /** To enable/disable SQL execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableSqlExecution")
        private Boolean shouldEnableSqlExecution;

        /**
         * To enable/disable SQL execution.
         *
         * @param shouldEnableSqlExecution the value to set
         * @return this builder
         */
        public Builder shouldEnableSqlExecution(Boolean shouldEnableSqlExecution) {
            this.shouldEnableSqlExecution = shouldEnableSqlExecution;
            this.__explicitlySet__.add("shouldEnableSqlExecution");
            return this;
        }
        /** Dialect to be used for SQL generation. */
        @com.fasterxml.jackson.annotation.JsonProperty("dialect")
        private Dialect dialect;

        /**
         * Dialect to be used for SQL generation.
         *
         * @param dialect the value to set
         * @return this builder
         */
        public Builder dialect(Dialect dialect) {
            this.dialect = dialect;
            this.__explicitlySet__.add("dialect");
            return this;
        }
        /** Size of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelSize")
        private ModelSize modelSize;

        /**
         * Size of the model.
         *
         * @param modelSize the value to set
         * @return this builder
         */
        public Builder modelSize(ModelSize modelSize) {
            this.modelSize = modelSize;
            this.__explicitlySet__.add("modelSize");
            return this;
        }
        /** To enable/disable self correction. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableSelfCorrection")
        private Boolean shouldEnableSelfCorrection;

        /**
         * To enable/disable self correction.
         *
         * @param shouldEnableSelfCorrection the value to set
         * @return this builder
         */
        public Builder shouldEnableSelfCorrection(Boolean shouldEnableSelfCorrection) {
            this.shouldEnableSelfCorrection = shouldEnableSelfCorrection;
            this.__explicitlySet__.add("shouldEnableSelfCorrection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableAndColumnDescription")
        private InputLocation tableAndColumnDescription;

        public Builder tableAndColumnDescription(InputLocation tableAndColumnDescription) {
            this.tableAndColumnDescription = tableAndColumnDescription;
            this.__explicitlySet__.add("tableAndColumnDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("generationLlmCustomization")
        private LlmCustomization generationLlmCustomization;

        public Builder generationLlmCustomization(LlmCustomization generationLlmCustomization) {
            this.generationLlmCustomization = generationLlmCustomization;
            this.__explicitlySet__.add("generationLlmCustomization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnection")
        private DatabaseConnection databaseConnection;

        public Builder databaseConnection(DatabaseConnection databaseConnection) {
            this.databaseConnection = databaseConnection;
            this.__explicitlySet__.add("databaseConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlToolConfig build() {
            SqlToolConfig model =
                    new SqlToolConfig(
                            this.iclExamples,
                            this.databaseSchema,
                            this.shouldEnableSqlExecution,
                            this.dialect,
                            this.modelSize,
                            this.shouldEnableSelfCorrection,
                            this.tableAndColumnDescription,
                            this.generationLlmCustomization,
                            this.databaseConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlToolConfig model) {
            if (model.wasPropertyExplicitlySet("iclExamples")) {
                this.iclExamples(model.getIclExamples());
            }
            if (model.wasPropertyExplicitlySet("databaseSchema")) {
                this.databaseSchema(model.getDatabaseSchema());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableSqlExecution")) {
                this.shouldEnableSqlExecution(model.getShouldEnableSqlExecution());
            }
            if (model.wasPropertyExplicitlySet("dialect")) {
                this.dialect(model.getDialect());
            }
            if (model.wasPropertyExplicitlySet("modelSize")) {
                this.modelSize(model.getModelSize());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableSelfCorrection")) {
                this.shouldEnableSelfCorrection(model.getShouldEnableSelfCorrection());
            }
            if (model.wasPropertyExplicitlySet("tableAndColumnDescription")) {
                this.tableAndColumnDescription(model.getTableAndColumnDescription());
            }
            if (model.wasPropertyExplicitlySet("generationLlmCustomization")) {
                this.generationLlmCustomization(model.getGenerationLlmCustomization());
            }
            if (model.wasPropertyExplicitlySet("databaseConnection")) {
                this.databaseConnection(model.getDatabaseConnection());
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

    @Deprecated
    public SqlToolConfig(
            InputLocation iclExamples,
            InputLocation databaseSchema,
            Boolean shouldEnableSqlExecution,
            Dialect dialect,
            ModelSize modelSize,
            Boolean shouldEnableSelfCorrection,
            InputLocation tableAndColumnDescription,
            LlmCustomization generationLlmCustomization,
            DatabaseConnection databaseConnection) {
        super();
        this.iclExamples = iclExamples;
        this.databaseSchema = databaseSchema;
        this.shouldEnableSqlExecution = shouldEnableSqlExecution;
        this.dialect = dialect;
        this.modelSize = modelSize;
        this.shouldEnableSelfCorrection = shouldEnableSelfCorrection;
        this.tableAndColumnDescription = tableAndColumnDescription;
        this.generationLlmCustomization = generationLlmCustomization;
        this.databaseConnection = databaseConnection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("iclExamples")
    private final InputLocation iclExamples;

    public InputLocation getIclExamples() {
        return iclExamples;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseSchema")
    private final InputLocation databaseSchema;

    public InputLocation getDatabaseSchema() {
        return databaseSchema;
    }

    /** To enable/disable SQL execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableSqlExecution")
    private final Boolean shouldEnableSqlExecution;

    /**
     * To enable/disable SQL execution.
     *
     * @return the value
     */
    public Boolean getShouldEnableSqlExecution() {
        return shouldEnableSqlExecution;
    }

    /** Dialect to be used for SQL generation. */
    public enum Dialect implements com.oracle.bmc.http.internal.BmcEnum {
        SqlLite("SQL_LITE"),
        OracleSql("ORACLE_SQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Dialect.class);

        private final String value;
        private static java.util.Map<String, Dialect> map;

        static {
            map = new java.util.HashMap<>();
            for (Dialect v : Dialect.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Dialect(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Dialect create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Dialect', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Dialect to be used for SQL generation. */
    @com.fasterxml.jackson.annotation.JsonProperty("dialect")
    private final Dialect dialect;

    /**
     * Dialect to be used for SQL generation.
     *
     * @return the value
     */
    public Dialect getDialect() {
        return dialect;
    }

    /** Size of the model. */
    public enum ModelSize implements com.oracle.bmc.http.internal.BmcEnum {
        Small("SMALL"),
        Large("LARGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelSize.class);

        private final String value;
        private static java.util.Map<String, ModelSize> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelSize v : ModelSize.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelSize(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelSize create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelSize', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Size of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelSize")
    private final ModelSize modelSize;

    /**
     * Size of the model.
     *
     * @return the value
     */
    public ModelSize getModelSize() {
        return modelSize;
    }

    /** To enable/disable self correction. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableSelfCorrection")
    private final Boolean shouldEnableSelfCorrection;

    /**
     * To enable/disable self correction.
     *
     * @return the value
     */
    public Boolean getShouldEnableSelfCorrection() {
        return shouldEnableSelfCorrection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tableAndColumnDescription")
    private final InputLocation tableAndColumnDescription;

    public InputLocation getTableAndColumnDescription() {
        return tableAndColumnDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("generationLlmCustomization")
    private final LlmCustomization generationLlmCustomization;

    public LlmCustomization getGenerationLlmCustomization() {
        return generationLlmCustomization;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseConnection")
    private final DatabaseConnection databaseConnection;

    public DatabaseConnection getDatabaseConnection() {
        return databaseConnection;
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
        sb.append("SqlToolConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", iclExamples=").append(String.valueOf(this.iclExamples));
        sb.append(", databaseSchema=").append(String.valueOf(this.databaseSchema));
        sb.append(", shouldEnableSqlExecution=")
                .append(String.valueOf(this.shouldEnableSqlExecution));
        sb.append(", dialect=").append(String.valueOf(this.dialect));
        sb.append(", modelSize=").append(String.valueOf(this.modelSize));
        sb.append(", shouldEnableSelfCorrection=")
                .append(String.valueOf(this.shouldEnableSelfCorrection));
        sb.append(", tableAndColumnDescription=")
                .append(String.valueOf(this.tableAndColumnDescription));
        sb.append(", generationLlmCustomization=")
                .append(String.valueOf(this.generationLlmCustomization));
        sb.append(", databaseConnection=").append(String.valueOf(this.databaseConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlToolConfig)) {
            return false;
        }

        SqlToolConfig other = (SqlToolConfig) o;
        return java.util.Objects.equals(this.iclExamples, other.iclExamples)
                && java.util.Objects.equals(this.databaseSchema, other.databaseSchema)
                && java.util.Objects.equals(
                        this.shouldEnableSqlExecution, other.shouldEnableSqlExecution)
                && java.util.Objects.equals(this.dialect, other.dialect)
                && java.util.Objects.equals(this.modelSize, other.modelSize)
                && java.util.Objects.equals(
                        this.shouldEnableSelfCorrection, other.shouldEnableSelfCorrection)
                && java.util.Objects.equals(
                        this.tableAndColumnDescription, other.tableAndColumnDescription)
                && java.util.Objects.equals(
                        this.generationLlmCustomization, other.generationLlmCustomization)
                && java.util.Objects.equals(this.databaseConnection, other.databaseConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.iclExamples == null ? 43 : this.iclExamples.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSchema == null ? 43 : this.databaseSchema.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldEnableSqlExecution == null
                                ? 43
                                : this.shouldEnableSqlExecution.hashCode());
        result = (result * PRIME) + (this.dialect == null ? 43 : this.dialect.hashCode());
        result = (result * PRIME) + (this.modelSize == null ? 43 : this.modelSize.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldEnableSelfCorrection == null
                                ? 43
                                : this.shouldEnableSelfCorrection.hashCode());
        result =
                (result * PRIME)
                        + (this.tableAndColumnDescription == null
                                ? 43
                                : this.tableAndColumnDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.generationLlmCustomization == null
                                ? 43
                                : this.generationLlmCustomization.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseConnection == null
                                ? 43
                                : this.databaseConnection.hashCode());
        return result;
    }
}
