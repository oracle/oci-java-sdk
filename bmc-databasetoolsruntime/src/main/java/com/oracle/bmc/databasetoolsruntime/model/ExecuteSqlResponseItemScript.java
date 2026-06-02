/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * A statement execution response for script type requests.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExecuteSqlResponseItemScript.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteSqlResponseItemScript
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "statementId",
        "statementType",
        "statementPos",
        "statementText",
        "error",
        "dbmsOutput",
        "properties",
        "responses",
        "results",
        "resultSetObject",
        "resultSet",
        "binds"
    })
    public ExecuteSqlResponseItemScript(
            Integer statementId,
            StatementType statementType,
            ExecuteSqlResponseItemStatementPos statementPos,
            String statementText,
            ExecuteSqlResponseItemError error,
            String dbmsOutput,
            ExecuteSqlResponseItemProperties properties,
            java.util.List<String> responses,
            java.util.List<Integer> results,
            ExecuteSqlOutputDispositionDetails resultSetObject,
            ExecuteSqlResponseItemResultSet resultSet,
            java.util.List<ExecuteSqlBind> binds) {
        super();
        this.statementId = statementId;
        this.statementType = statementType;
        this.statementPos = statementPos;
        this.statementText = statementText;
        this.error = error;
        this.dbmsOutput = dbmsOutput;
        this.properties = properties;
        this.responses = responses;
        this.results = results;
        this.resultSetObject = resultSetObject;
        this.resultSet = resultSet;
        this.binds = binds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The sequence number of the statement. Sequence number of the first statement is 1.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statementId")
        private Integer statementId;

        /**
         * The sequence number of the statement. Sequence number of the first statement is 1.
         * @param statementId the value to set
         * @return this builder
         **/
        public Builder statementId(Integer statementId) {
            this.statementId = statementId;
            this.__explicitlySet__.add("statementId");
            return this;
        }
        /**
         * The Statement type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statementType")
        private StatementType statementType;

        /**
         * The Statement type.
         * @param statementType the value to set
         * @return this builder
         **/
        public Builder statementType(StatementType statementType) {
            this.statementType = statementType;
            this.__explicitlySet__.add("statementType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statementPos")
        private ExecuteSqlResponseItemStatementPos statementPos;

        public Builder statementPos(ExecuteSqlResponseItemStatementPos statementPos) {
            this.statementPos = statementPos;
            this.__explicitlySet__.add("statementPos");
            return this;
        }
        /**
         * Text of statements executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statementText")
        private String statementText;

        /**
         * Text of statements executed.
         * @param statementText the value to set
         * @return this builder
         **/
        public Builder statementText(String statementText) {
            this.statementText = statementText;
            this.__explicitlySet__.add("statementText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private ExecuteSqlResponseItemError error;

        public Builder error(ExecuteSqlResponseItemError error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }
        /**
         * Output from DBMS_OUTPUT package. Server output must be enabled (e.g., SET SERVEROUTPUT ON).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbmsOutput")
        private String dbmsOutput;

        /**
         * Output from DBMS_OUTPUT package. Server output must be enabled (e.g., SET SERVEROUTPUT ON).
         * @param dbmsOutput the value to set
         * @return this builder
         **/
        public Builder dbmsOutput(String dbmsOutput) {
            this.dbmsOutput = dbmsOutput;
            this.__explicitlySet__.add("dbmsOutput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private ExecuteSqlResponseItemProperties properties;

        public Builder properties(ExecuteSqlResponseItemProperties properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * Responses generated when executing the statements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responses")
        private java.util.List<String> responses;

        /**
         * Responses generated when executing the statements.
         * @param responses the value to set
         * @return this builder
         **/
        public Builder responses(java.util.List<String> responses) {
            this.responses = responses;
            this.__explicitlySet__.add("responses");
            return this;
        }
        /**
         * Results generated when executing the statements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("results")
        private java.util.List<Integer> results;

        /**
         * Results generated when executing the statements.
         * @param results the value to set
         * @return this builder
         **/
        public Builder results(java.util.List<Integer> results) {
            this.results = results;
            this.__explicitlySet__.add("results");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultSetObject")
        private ExecuteSqlOutputDispositionDetails resultSetObject;

        public Builder resultSetObject(ExecuteSqlOutputDispositionDetails resultSetObject) {
            this.resultSetObject = resultSetObject;
            this.__explicitlySet__.add("resultSetObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultSet")
        private ExecuteSqlResponseItemResultSet resultSet;

        public Builder resultSet(ExecuteSqlResponseItemResultSet resultSet) {
            this.resultSet = resultSet;
            this.__explicitlySet__.add("resultSet");
            return this;
        }
        /**
         * Array of objects specifying the bind information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("binds")
        private java.util.List<ExecuteSqlBind> binds;

        /**
         * Array of objects specifying the bind information.
         * @param binds the value to set
         * @return this builder
         **/
        public Builder binds(java.util.List<ExecuteSqlBind> binds) {
            this.binds = binds;
            this.__explicitlySet__.add("binds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlResponseItemScript build() {
            ExecuteSqlResponseItemScript model =
                    new ExecuteSqlResponseItemScript(
                            this.statementId,
                            this.statementType,
                            this.statementPos,
                            this.statementText,
                            this.error,
                            this.dbmsOutput,
                            this.properties,
                            this.responses,
                            this.results,
                            this.resultSetObject,
                            this.resultSet,
                            this.binds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlResponseItemScript model) {
            if (model.wasPropertyExplicitlySet("statementId")) {
                this.statementId(model.getStatementId());
            }
            if (model.wasPropertyExplicitlySet("statementType")) {
                this.statementType(model.getStatementType());
            }
            if (model.wasPropertyExplicitlySet("statementPos")) {
                this.statementPos(model.getStatementPos());
            }
            if (model.wasPropertyExplicitlySet("statementText")) {
                this.statementText(model.getStatementText());
            }
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
            }
            if (model.wasPropertyExplicitlySet("dbmsOutput")) {
                this.dbmsOutput(model.getDbmsOutput());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("responses")) {
                this.responses(model.getResponses());
            }
            if (model.wasPropertyExplicitlySet("results")) {
                this.results(model.getResults());
            }
            if (model.wasPropertyExplicitlySet("resultSetObject")) {
                this.resultSetObject(model.getResultSetObject());
            }
            if (model.wasPropertyExplicitlySet("resultSet")) {
                this.resultSet(model.getResultSet());
            }
            if (model.wasPropertyExplicitlySet("binds")) {
                this.binds(model.getBinds());
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
     * The sequence number of the statement. Sequence number of the first statement is 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statementId")
    private final Integer statementId;

    /**
     * The sequence number of the statement. Sequence number of the first statement is 1.
     * @return the value
     **/
    public Integer getStatementId() {
        return statementId;
    }

    /**
     * The Statement type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statementType")
    private final StatementType statementType;

    /**
     * The Statement type.
     * @return the value
     **/
    public StatementType getStatementType() {
        return statementType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("statementPos")
    private final ExecuteSqlResponseItemStatementPos statementPos;

    public ExecuteSqlResponseItemStatementPos getStatementPos() {
        return statementPos;
    }

    /**
     * Text of statements executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statementText")
    private final String statementText;

    /**
     * Text of statements executed.
     * @return the value
     **/
    public String getStatementText() {
        return statementText;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final ExecuteSqlResponseItemError error;

    public ExecuteSqlResponseItemError getError() {
        return error;
    }

    /**
     * Output from DBMS_OUTPUT package. Server output must be enabled (e.g., SET SERVEROUTPUT ON).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbmsOutput")
    private final String dbmsOutput;

    /**
     * Output from DBMS_OUTPUT package. Server output must be enabled (e.g., SET SERVEROUTPUT ON).
     * @return the value
     **/
    public String getDbmsOutput() {
        return dbmsOutput;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final ExecuteSqlResponseItemProperties properties;

    public ExecuteSqlResponseItemProperties getProperties() {
        return properties;
    }

    /**
     * Responses generated when executing the statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responses")
    private final java.util.List<String> responses;

    /**
     * Responses generated when executing the statements.
     * @return the value
     **/
    public java.util.List<String> getResponses() {
        return responses;
    }

    /**
     * Results generated when executing the statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("results")
    private final java.util.List<Integer> results;

    /**
     * Results generated when executing the statements.
     * @return the value
     **/
    public java.util.List<Integer> getResults() {
        return results;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resultSetObject")
    private final ExecuteSqlOutputDispositionDetails resultSetObject;

    public ExecuteSqlOutputDispositionDetails getResultSetObject() {
        return resultSetObject;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resultSet")
    private final ExecuteSqlResponseItemResultSet resultSet;

    public ExecuteSqlResponseItemResultSet getResultSet() {
        return resultSet;
    }

    /**
     * Array of objects specifying the bind information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("binds")
    private final java.util.List<ExecuteSqlBind> binds;

    /**
     * Array of objects specifying the bind information.
     * @return the value
     **/
    public java.util.List<ExecuteSqlBind> getBinds() {
        return binds;
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
        sb.append("ExecuteSqlResponseItemScript(");
        sb.append("super=").append(super.toString());
        sb.append("statementId=").append(String.valueOf(this.statementId));
        sb.append(", statementType=").append(String.valueOf(this.statementType));
        sb.append(", statementPos=").append(String.valueOf(this.statementPos));
        sb.append(", statementText=").append(String.valueOf(this.statementText));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(", dbmsOutput=").append(String.valueOf(this.dbmsOutput));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", responses=").append(String.valueOf(this.responses));
        sb.append(", results=").append(String.valueOf(this.results));
        sb.append(", resultSetObject=").append(String.valueOf(this.resultSetObject));
        sb.append(", resultSet=").append(String.valueOf(this.resultSet));
        sb.append(", binds=").append(String.valueOf(this.binds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlResponseItemScript)) {
            return false;
        }

        ExecuteSqlResponseItemScript other = (ExecuteSqlResponseItemScript) o;
        return java.util.Objects.equals(this.statementId, other.statementId)
                && java.util.Objects.equals(this.statementType, other.statementType)
                && java.util.Objects.equals(this.statementPos, other.statementPos)
                && java.util.Objects.equals(this.statementText, other.statementText)
                && java.util.Objects.equals(this.error, other.error)
                && java.util.Objects.equals(this.dbmsOutput, other.dbmsOutput)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.responses, other.responses)
                && java.util.Objects.equals(this.results, other.results)
                && java.util.Objects.equals(this.resultSetObject, other.resultSetObject)
                && java.util.Objects.equals(this.resultSet, other.resultSet)
                && java.util.Objects.equals(this.binds, other.binds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statementId == null ? 43 : this.statementId.hashCode());
        result =
                (result * PRIME)
                        + (this.statementType == null ? 43 : this.statementType.hashCode());
        result = (result * PRIME) + (this.statementPos == null ? 43 : this.statementPos.hashCode());
        result =
                (result * PRIME)
                        + (this.statementText == null ? 43 : this.statementText.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result = (result * PRIME) + (this.dbmsOutput == null ? 43 : this.dbmsOutput.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.responses == null ? 43 : this.responses.hashCode());
        result = (result * PRIME) + (this.results == null ? 43 : this.results.hashCode());
        result =
                (result * PRIME)
                        + (this.resultSetObject == null ? 43 : this.resultSetObject.hashCode());
        result = (result * PRIME) + (this.resultSet == null ? 43 : this.resultSet.hashCode());
        result = (result * PRIME) + (this.binds == null ? 43 : this.binds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
