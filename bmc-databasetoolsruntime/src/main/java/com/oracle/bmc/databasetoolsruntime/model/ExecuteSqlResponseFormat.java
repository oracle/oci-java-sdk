/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Specifies which major elements of the response are returned
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
    builder = ExecuteSqlResponseFormat.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteSqlResponseFormat
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resultSetMetaData",
        "statementInformation",
        "statementText",
        "binds",
        "result",
        "response"
    })
    public ExecuteSqlResponseFormat(
            Boolean resultSetMetaData,
            Boolean statementInformation,
            Boolean statementText,
            Boolean binds,
            Boolean result,
            Boolean response) {
        super();
        this.resultSetMetaData = resultSetMetaData;
        this.statementInformation = statementInformation;
        this.statementText = statementText;
        this.binds = binds;
        this.result = result;
        this.response = response;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Set to false to exclude result set metadata from response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resultSetMetaData")
        private Boolean resultSetMetaData;

        /**
         * Set to false to exclude result set metadata from response
         * @param resultSetMetaData the value to set
         * @return this builder
         **/
        public Builder resultSetMetaData(Boolean resultSetMetaData) {
            this.resultSetMetaData = resultSetMetaData;
            this.__explicitlySet__.add("resultSetMetaData");
            return this;
        }
        /**
         * Set to false to exclude statement information from response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statementInformation")
        private Boolean statementInformation;

        /**
         * Set to false to exclude statement information from response
         * @param statementInformation the value to set
         * @return this builder
         **/
        public Builder statementInformation(Boolean statementInformation) {
            this.statementInformation = statementInformation;
            this.__explicitlySet__.add("statementInformation");
            return this;
        }
        /**
         * Set to false to exclude statement text from response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statementText")
        private Boolean statementText;

        /**
         * Set to false to exclude statement text from response
         * @param statementText the value to set
         * @return this builder
         **/
        public Builder statementText(Boolean statementText) {
            this.statementText = statementText;
            this.__explicitlySet__.add("statementText");
            return this;
        }
        /**
         * Set to false to exclude binds from response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("binds")
        private Boolean binds;

        /**
         * Set to false to exclude binds from response
         * @param binds the value to set
         * @return this builder
         **/
        public Builder binds(Boolean binds) {
            this.binds = binds;
            this.__explicitlySet__.add("binds");
            return this;
        }
        /**
         * Set to false to exclude result from response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private Boolean result;

        /**
         * Set to false to exclude result from response
         * @param result the value to set
         * @return this builder
         **/
        public Builder result(Boolean result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }
        /**
         * Set to false to exclude response from response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("response")
        private Boolean response;

        /**
         * Set to false to exclude response from response
         * @param response the value to set
         * @return this builder
         **/
        public Builder response(Boolean response) {
            this.response = response;
            this.__explicitlySet__.add("response");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlResponseFormat build() {
            ExecuteSqlResponseFormat model =
                    new ExecuteSqlResponseFormat(
                            this.resultSetMetaData,
                            this.statementInformation,
                            this.statementText,
                            this.binds,
                            this.result,
                            this.response);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlResponseFormat model) {
            if (model.wasPropertyExplicitlySet("resultSetMetaData")) {
                this.resultSetMetaData(model.getResultSetMetaData());
            }
            if (model.wasPropertyExplicitlySet("statementInformation")) {
                this.statementInformation(model.getStatementInformation());
            }
            if (model.wasPropertyExplicitlySet("statementText")) {
                this.statementText(model.getStatementText());
            }
            if (model.wasPropertyExplicitlySet("binds")) {
                this.binds(model.getBinds());
            }
            if (model.wasPropertyExplicitlySet("result")) {
                this.result(model.getResult());
            }
            if (model.wasPropertyExplicitlySet("response")) {
                this.response(model.getResponse());
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
     * Set to false to exclude result set metadata from response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultSetMetaData")
    private final Boolean resultSetMetaData;

    /**
     * Set to false to exclude result set metadata from response
     * @return the value
     **/
    public Boolean getResultSetMetaData() {
        return resultSetMetaData;
    }

    /**
     * Set to false to exclude statement information from response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statementInformation")
    private final Boolean statementInformation;

    /**
     * Set to false to exclude statement information from response
     * @return the value
     **/
    public Boolean getStatementInformation() {
        return statementInformation;
    }

    /**
     * Set to false to exclude statement text from response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statementText")
    private final Boolean statementText;

    /**
     * Set to false to exclude statement text from response
     * @return the value
     **/
    public Boolean getStatementText() {
        return statementText;
    }

    /**
     * Set to false to exclude binds from response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("binds")
    private final Boolean binds;

    /**
     * Set to false to exclude binds from response
     * @return the value
     **/
    public Boolean getBinds() {
        return binds;
    }

    /**
     * Set to false to exclude result from response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final Boolean result;

    /**
     * Set to false to exclude result from response
     * @return the value
     **/
    public Boolean getResult() {
        return result;
    }

    /**
     * Set to false to exclude response from response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    private final Boolean response;

    /**
     * Set to false to exclude response from response
     * @return the value
     **/
    public Boolean getResponse() {
        return response;
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
        sb.append("ExecuteSqlResponseFormat(");
        sb.append("super=").append(super.toString());
        sb.append("resultSetMetaData=").append(String.valueOf(this.resultSetMetaData));
        sb.append(", statementInformation=").append(String.valueOf(this.statementInformation));
        sb.append(", statementText=").append(String.valueOf(this.statementText));
        sb.append(", binds=").append(String.valueOf(this.binds));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(", response=").append(String.valueOf(this.response));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlResponseFormat)) {
            return false;
        }

        ExecuteSqlResponseFormat other = (ExecuteSqlResponseFormat) o;
        return java.util.Objects.equals(this.resultSetMetaData, other.resultSetMetaData)
                && java.util.Objects.equals(this.statementInformation, other.statementInformation)
                && java.util.Objects.equals(this.statementText, other.statementText)
                && java.util.Objects.equals(this.binds, other.binds)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.response, other.response)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resultSetMetaData == null ? 43 : this.resultSetMetaData.hashCode());
        result =
                (result * PRIME)
                        + (this.statementInformation == null
                                ? 43
                                : this.statementInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.statementText == null ? 43 : this.statementText.hashCode());
        result = (result * PRIME) + (this.binds == null ? 43 : this.binds.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result = (result * PRIME) + (this.response == null ? 43 : this.response.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
