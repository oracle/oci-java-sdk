/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Contains the details for the Script SQL statements to execute on the database connection.
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
    builder = ExecuteSqlInputScriptDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteSqlInputScriptDetails extends ExecuteSqlInputDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Request payload version, returned as-is in the response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Request payload version, returned as-is in the response
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Client properties returned as-is in the response
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<java.util.Map<String, Object>> properties;

        /**
         * Client properties returned as-is in the response
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.List<java.util.Map<String, Object>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * The collection of scripts to execute.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scripts")
        private java.util.List<ExecuteSqlInputScriptSqlRequestDetails> scripts;

        /**
         * The collection of scripts to execute.
         * @param scripts the value to set
         * @return this builder
         **/
        public Builder scripts(java.util.List<ExecuteSqlInputScriptSqlRequestDetails> scripts) {
            this.scripts = scripts;
            this.__explicitlySet__.add("scripts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlInputScriptDetails build() {
            ExecuteSqlInputScriptDetails model =
                    new ExecuteSqlInputScriptDetails(this.version, this.properties, this.scripts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlInputScriptDetails model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("scripts")) {
                this.scripts(model.getScripts());
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

    @Deprecated
    public ExecuteSqlInputScriptDetails(
            String version,
            java.util.List<java.util.Map<String, Object>> properties,
            java.util.List<ExecuteSqlInputScriptSqlRequestDetails> scripts) {
        super();
        this.version = version;
        this.properties = properties;
        this.scripts = scripts;
    }

    /**
     * Request payload version, returned as-is in the response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Request payload version, returned as-is in the response
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Client properties returned as-is in the response
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<java.util.Map<String, Object>> properties;

    /**
     * Client properties returned as-is in the response
     * @return the value
     **/
    public java.util.List<java.util.Map<String, Object>> getProperties() {
        return properties;
    }

    /**
     * The collection of scripts to execute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scripts")
    private final java.util.List<ExecuteSqlInputScriptSqlRequestDetails> scripts;

    /**
     * The collection of scripts to execute.
     * @return the value
     **/
    public java.util.List<ExecuteSqlInputScriptSqlRequestDetails> getScripts() {
        return scripts;
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
        sb.append("ExecuteSqlInputScriptDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", scripts=").append(String.valueOf(this.scripts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlInputScriptDetails)) {
            return false;
        }

        ExecuteSqlInputScriptDetails other = (ExecuteSqlInputScriptDetails) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.scripts, other.scripts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.scripts == null ? 43 : this.scripts.hashCode());
        return result;
    }
}
