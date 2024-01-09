/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Details of Sql content which needs to execute to collect Metric Extension data <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"scriptFileName", "content"})
    public SqlDetails(String scriptFileName, String content) {
        super();
        this.scriptFileName = scriptFileName;
        this.content = content;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If a script needs to be executed, then provide file name of the script */
        @com.fasterxml.jackson.annotation.JsonProperty("scriptFileName")
        private String scriptFileName;

        /**
         * If a script needs to be executed, then provide file name of the script
         *
         * @param scriptFileName the value to set
         * @return this builder
         */
        public Builder scriptFileName(String scriptFileName) {
            this.scriptFileName = scriptFileName;
            this.__explicitlySet__.add("scriptFileName");
            return this;
        }
        /** Sql statement or script file content as base64 encoded string */
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * Sql statement or script file content as base64 encoded string
         *
         * @param content the value to set
         * @return this builder
         */
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlDetails build() {
            SqlDetails model = new SqlDetails(this.scriptFileName, this.content);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlDetails model) {
            if (model.wasPropertyExplicitlySet("scriptFileName")) {
                this.scriptFileName(model.getScriptFileName());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
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

    /** If a script needs to be executed, then provide file name of the script */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptFileName")
    private final String scriptFileName;

    /**
     * If a script needs to be executed, then provide file name of the script
     *
     * @return the value
     */
    public String getScriptFileName() {
        return scriptFileName;
    }

    /** Sql statement or script file content as base64 encoded string */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * Sql statement or script file content as base64 encoded string
     *
     * @return the value
     */
    public String getContent() {
        return content;
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
        sb.append("SqlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("scriptFileName=").append(String.valueOf(this.scriptFileName));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlDetails)) {
            return false;
        }

        SqlDetails other = (SqlDetails) o;
        return java.util.Objects.equals(this.scriptFileName, other.scriptFileName)
                && java.util.Objects.equals(this.content, other.content)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.scriptFileName == null ? 43 : this.scriptFileName.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
